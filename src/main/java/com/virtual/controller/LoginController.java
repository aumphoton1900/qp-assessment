package com.virtual.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login(Principal principal) {
        if (principal != null) {
        	//System.out.println(" >>>>>>>>  "+principal.getName());
            return "redirect:/home";
        }
        return "/login";
    }

}
