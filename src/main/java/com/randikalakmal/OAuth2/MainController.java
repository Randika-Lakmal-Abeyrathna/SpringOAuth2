package com.randikalakmal.OAuth2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping
    public String main(){
        return "Hello";
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

}
