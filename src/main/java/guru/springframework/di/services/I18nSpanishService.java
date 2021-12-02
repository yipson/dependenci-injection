package guru.springframework.di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/* Esta clase sera la que se use,
* asi no se haya configurado spring.profiles.active
* ya que que la anotacion @Profile cuenta con el valor default */
@Profile({"ES", "default"})
@Service("i18nService")
public class I18nSpanishService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
