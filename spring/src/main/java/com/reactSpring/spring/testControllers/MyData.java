package com.reactSpring.spring.testControllers;



import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/*
 * this class is a POJO class
 * the componenets of this class will be mapped to the json
 */
@Builder
@Getter
@Setter
public class MyData {
    
    private String id;

    private String name;

    private String email;

    private Integer phone;

}
