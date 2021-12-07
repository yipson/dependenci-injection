package guru.springframework.di.services;

import org.springframework.stereotype.Component;

//Scope singleton se instancia al levantar la aplicacion, es la configuracon por defecto
@Component
public class SingletonBean {

    public SingletonBean() {
        System.out.println("Creating a Singleton bean!!");
    }

    public String getMyScope(){
        return "I'm a Singleton";
    }
}
