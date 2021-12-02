package guru.springframework.di.controllers;

import guru.springframework.di.services.GreetingService;
import org.springframework.stereotype.Controller;

//Most preferred way to inject
@Controller
public class ConstructorInjectedController {
    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
