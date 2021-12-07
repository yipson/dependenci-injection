package guru.springframework.di.services;

/* Esta clase sera la que se use,
* asi no se haya configurado spring.profiles.active
* ya que que la anotacion @Profile cuenta con el valor default
*
* Esta anotacion fue llevada al package config/GreetingServiceConfig
* */
public class I18nSpanishService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
