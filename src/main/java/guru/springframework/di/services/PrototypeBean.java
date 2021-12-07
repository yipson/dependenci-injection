package guru.springframework.di.services;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//Scope prototype se instancia en tiempo de ejecucion
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class PrototypeBean {

    public PrototypeBean() {
        System.out.println("Creating a Prototype Bean!!!!!!!!!!");
    }

    public String getMyScope(){
        return "I'm a Singleton";
    }
}
