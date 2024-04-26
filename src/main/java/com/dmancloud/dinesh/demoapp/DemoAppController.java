package com.dmancloud.dinesh.demoapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoAppController {

    @GetMapping("/")
    public String hello(Model model) {
        model.addAttribute("message", "GitOps Ci/CD pipeline");
        return "index";
    }

    @GetMapping("/error")
    public String handleError() {
        return "error";
    }
}

