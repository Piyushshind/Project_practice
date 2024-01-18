package com.reactSpring.spring.ControllerClasses;



import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.val;


@Controller
@RequestMapping("/get")
public class GetController {


    @Autowired
    private Mappping hashMap=new Mappping();
    
    /*
     * {
            name : "sumedh",
            price : 2,
            isTrue : false

        },
     */
    private Logger logger=LogManager.getLogger(GetController.class.getName());
    


    

    @GetMapping("/getAllExpense")
    @ResponseBody
    public Object getMethodName() {
        logger.info("logger get info",hashMap.getHashMap());

        return hashMap.getHashMap();
    }
    
    @GetMapping("/getExpense")
    @ResponseBody
    public Object getMethodName(@RequestBody HashMap<String,String> value) {
       // System.out.println("==============="+hashMap2.get("mockId")+"=================");
        
        if(hashMap.getHashMap().containsKey(value.get("id")))
            return hashMap.getHashMap().get(value.get("id"));
        else{
            HashMap<String,Object> insideMap= new HashMap<>();
            insideMap.put("error", "true");
            insideMap.put("value", "key not found");
            return insideMap;
        }
            
    }
    


}
