package com.reactSpring.spring.ControllerClasses;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.reactSpring.spring.ModelClasses.ExpenseData;

@Controller
@RequestMapping("/post")
public class PostController {
    
    GetController getController=new GetController();

    @Autowired
    private Mappping hashMap=new Mappping();

    @PostMapping("/addExpense")
    @ResponseBody
    public Object postExpense(@RequestBody ExpenseData expenseData){
        HashMap<String,Object> insider=new HashMap<>();
        insider.put("name",expenseData.getName());
        insider.put("payment", expenseData.getPayment());
        insider.put("price", expenseData.getPrice());
        insider.put("isTrue",expenseData.getIsTrue());

        hashMap.getHashMap().put(expenseData.getId(), insider);

        return hashMap.getHashMap();

    } 

}
