package com.reactSpring.spring.ControllerClasses;
import java.util.*;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Component
@Getter
@Setter
public class Mappping {
    
    private HashMap<String,Object> hashMap=new HashMap<>();

    public Mappping(){
        HashMap<String,Object> insideMap= new HashMap<>();

        insideMap.put("name", "piyush");
        insideMap.put("payment", "offline");
        insideMap.put("price", 2);
        insideMap.put("isTrue","false");

        hashMap.put("mockId", insideMap);
    }


}
