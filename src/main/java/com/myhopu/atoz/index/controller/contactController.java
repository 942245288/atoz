package com.myhopu.atoz.index.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RequestMapping("/contact")
public class contactController {

    @RequestMapping("/")
    public String re_index() {
        return "contact.html";
    }
}