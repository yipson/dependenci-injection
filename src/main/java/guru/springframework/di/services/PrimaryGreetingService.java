package guru.springframework.di.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/*@Primary: esta anotacion me indica que va a ser
el Bean usado por defecto, si quien usa el service
no especifica un valor @Qualifier */
@Primary
@Service
public class PrimaryGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello WOrld - From the PRIMARY Bean";
    }
}
