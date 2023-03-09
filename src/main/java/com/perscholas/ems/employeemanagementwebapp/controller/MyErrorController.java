package com.perscholas.ems.employeemanagementwebapp.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyErrorController implements ErrorController {
//paths not found return custom 404 error thymeleaf template
    @RequestMapping("/error")
    public String handleError() {
        //do something like logging
        return "error";
    }
}
