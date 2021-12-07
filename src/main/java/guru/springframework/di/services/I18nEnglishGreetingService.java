package guru.springframework.di.services;

import org.springframework.context.annotation.Profile;

@Profile("EN")
public class I18nEnglishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello world - EN";
    }
}
