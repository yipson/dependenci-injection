package guru.springframework.di.controllers;

import guru.springframework.di.services.GreetingService;

//Least preferred way to inject
public class PropertyInjectionController {

    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
