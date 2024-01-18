package com.reactSpring.spring.testControllers;

import java.util.*;
import java.io.IOException;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class reactTryDataController {
    
    //mock db
    Map<String ,Object> obj=new HashMap<>();

    //just checking if the server works
    @GetMapping("/check")
    public String getMethodName() {
        return "hello";
    }
    
    
    /*
     * front end sends data in form of json which is then mapped to mydata objects
     * its added to hashmap as it is key value pair and will convert to json
     * then the entire entries are send along with the newly added entry
     */
    @PostMapping("/send")
    @ResponseBody
    public Object postMethodName(@RequestBody MyData myData) throws IOException, InterruptedException {

        System.out.println("===========\n"+myData.getName()+"\n=================");
        Map<String ,String> inside=new HashMap<>();
        inside.put("name",myData.getName());
        inside.put("email",myData.getEmail());
        inside.put("phone",myData.getPhone().toString());
        
        obj.put(myData.getId(),inside );
        return obj;
            
    }
    

    //when front end request all the entries then this method will send it in the form of json
    @GetMapping("/giveme")
    @ResponseBody
    public Object requestMethodName() {
        return obj;
    }
    //get

    //post

    //json structure trial (does not represent actual data)
    @GetMapping("/json")
    @ResponseBody
    public Object requestjson() {
        Map<String ,Object> map=new HashMap<>();
        Map<String ,String> inside=new HashMap<>();
        inside.put("name","sumedh");
        inside.put("lang","java");
        map.put("456373",inside);
        return map;
    }
    //

//post method
}
