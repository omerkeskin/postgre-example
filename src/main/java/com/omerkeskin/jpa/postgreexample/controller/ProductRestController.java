package com.omerkeskin.jpa.postgreexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("product-rest")
public class ProductRestController {

    @GetMapping("/all")
    String all() {
        return "Mercedes , Audi , BMW";
    }




}
