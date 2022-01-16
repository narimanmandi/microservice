package com.javainuse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class SimpleController {

    @GetMapping("/user")
    public String index(Principal principal) {
        return principal.getName();
    }
}
