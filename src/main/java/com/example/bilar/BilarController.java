package com.example.bilar;

import java.util.ArrayList;
import java.util.List;

//import com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Empty;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


// Infrastructure As  Code

@RestController
public class BilarController {
    
    @GetMapping(value="/")
    @CrossOrigin()
    public String empty(){
        return "version";
    }

    

    @GetMapping(value="/car")
    @CrossOrigin()
    public List<Car> getall() {
        var l = new ArrayList<Car>();
        
        
        l.add(new Car("Volvo", "XC70", "Blå", 2008,4));
        l.add(new Car("Volvo", "XC60", "Svart", 2015,4));
        l.add(new Car("Volvo", "240", "Röd", 1985,6));
        l.add(new Car("Renault", "Megane", "Svart", 2018,4));
        return l;
        
    }
    
}
