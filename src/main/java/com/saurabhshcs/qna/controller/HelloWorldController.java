package com.saurabhshcs.qna.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/helloWorld")
    String getMessage(){
        return "Hello World... let's code with Saurabh";
    }

}
