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
    
    @GetMapping(value="/car", produces = MediaType.TEXT_PLAIN_VALUE)
    @CrossOrigin()
    public ResponseEntity<List<Car>> getall() {

        try {
            var l = new ArrayList<Car>();
        
            l.add(new Car("Volvo", "XC70", "Blå", 2008,4));
            l.add(new Car("Volvo", "XC60", "Svart", 2015,4));
            l.add(new Car("Volvo", "240", "Röd", 1985,6));
            l.add(new Car("Renault", "Megane", "Svart", 2018,4));
            
            return ResponseEntity.ok(l);

        } catch (Exception e) {
            List<Car> emptyList = new ArrayList<Car>();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(emptyList);
        }

    }
    
}
