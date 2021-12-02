package guru.springframework.di.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello(){

        System.out.println("Hello World1");

        return "hi";
    }
}
