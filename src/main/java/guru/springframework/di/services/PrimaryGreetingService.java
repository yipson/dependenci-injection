package guru.springframework.di.services;

/*@Primary: esta anotacion me indica que va a ser
el Bean usado por defecto, si quien usa el service
no especifica un valor @Qualifier

Anotacion llevada al package config/GreetingServiceConfig
*/

public class PrimaryGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello WOrld - From the PRIMARY Bean";
    }
}
