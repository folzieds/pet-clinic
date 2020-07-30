package com.phos.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Folarin on 30/07/2020
 */

@Controller
public class IndexController {

    @RequestMapping({"","/","index","index.html"})
    public String index(){
        return "index";
    }
}
