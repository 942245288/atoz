package com.myhopu.atoz.index.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/company")
public class companyController {

    @RequestMapping("/")
    public String re_index() {
        return "search.html";
    }
}