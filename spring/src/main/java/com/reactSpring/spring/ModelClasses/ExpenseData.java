package com.reactSpring.spring.ModelClasses;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class ExpenseData {

    private String id;

    private String name;

    private Integer price;

    private String isTrue;

    private String payment;

}
