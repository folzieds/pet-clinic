package com.phos.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Folarin on 02/08/2020
 */
@Controller
public class OwnerController {

    @RequestMapping({"/owners", "/owners/index" , "/owners/index.html"})
    public String listOwners(){

        return "owners/index";
    }
}
