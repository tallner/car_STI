package com.example.bilar;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

//import com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Empty;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


// Infrastructure As  Code

@RestController
public class BilarController {
    
    
    @Autowired
    private BilarRepository bilarRepository;
    
    @GetMapping(value="/", produces = MediaType.TEXT_PLAIN_VALUE)
    @CrossOrigin()
    public ResponseEntity<String> empty(){
        try {
            // Perform health check logic here
            return ResponseEntity.ok("version");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error checking health");
        }
    }

/* */
    @GetMapping(value="/car", produces = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin()
    public ResponseEntity<List<Bilar>> getall() {

        try {
            // Perform health check logic here
            var l = new ArrayList<Bilar>();
         /* */   for(Bilar b : bilarRepository.findAll())
            {
                l.add(b);
            }
         
            //return ResponseEntity.ok(l);
            return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(l);

        } catch (Exception e) {
            List<Bilar> emptyList = new ArrayList<Bilar>();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(emptyList);
        }

    }
/* */

    
}
