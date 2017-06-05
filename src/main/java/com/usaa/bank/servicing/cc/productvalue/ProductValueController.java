package com.usaa.bank.servicing.cc.productvalue;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ProductValueController {

    @RequestMapping("/value")
    public String index() {
        return "Product Value calculation using Spring Boot!";
    }

}
