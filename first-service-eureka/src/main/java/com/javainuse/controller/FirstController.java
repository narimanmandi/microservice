package com.javainuse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;
import java.security.Principal;

@RestController
@RequestMapping("/employee")
public class FirstController {

    @GetMapping("/message")
    @RolesAllowed("User")
    public String test() {
        return "Hello JavaInUse Called in First Service";
    }

    @GetMapping("/user")
    @RolesAllowed("Admin")
    public String index(Principal principal) {
        return "Get User Id From First Service : " +  principal.getName();
    }
}
