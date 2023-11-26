package com.example.springjenkins;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/omar")
public class TestRestController {

    @GetMapping("/hi")
    public String sayHi(){
        return "hi Omar";
    }
}
