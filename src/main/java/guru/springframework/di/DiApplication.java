package guru.springframework.di;

import guru.springframework.di.config.DiConfiguration;
import guru.springframework.di.config.DiConstructorConfig;
import guru.springframework.di.controllers.*;
import guru.springframework.di.datasource.FakeDataSource;
import guru.springframework.di.services.PrototypeBean;
import guru.springframework.di.services.SingletonBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class DiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiApplication.class, args);

		PetController petController = ctx.getBean("petController", PetController.class);
		System.out.println("--- The Best Pet is ---");
		System.out.println(petController.whichPetIsTheBest());

		System.out.println("-------- I18n ---------------");
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayGreeting());

		System.out.println("-------- Primary Bean ---------------");
		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println(myController.sayHello());

		System.out.println("-------- Property ---------------");
		PropertyInjectionController propertyInjectionController = (PropertyInjectionController) ctx.getBean("propertyInjectionController");
		System.out.println(propertyInjectionController.getGreeting());

		System.out.println("-------- Setter ---------------");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("-------- Constructor ---------------");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());


		System.out.println("---------Bean Scopes----------");
		SingletonBean singletonBean1 = ctx.getBean(SingletonBean.class);
		System.out.println(singletonBean1.getMyScope());
		SingletonBean singletonBean2 = ctx.getBean(SingletonBean.class);
		System.out.println(singletonBean2.getMyScope());

		PrototypeBean prototypeBean1 = ctx.getBean(PrototypeBean.class);
		System.out.println(prototypeBean1.getMyScope());
		PrototypeBean prototypeBean2 = ctx.getBean(PrototypeBean.class);
		System.out.println(prototypeBean2.getMyScope());


		System.out.println("--------fake datasource----------");
		FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUsername());
		System.out.println(fakeDataSource.getPassword());
		System.out.println(fakeDataSource.getJdbcUrl());


		System.out.println("--------Configuration props bean----------");
		DiConfiguration diConfiguration = ctx.getBean(DiConfiguration.class);
		System.out.println(diConfiguration.getUsername());
		System.out.println(diConfiguration.getPassword());
		System.out.println(diConfiguration.getJdbcUrl());


		System.out.println("------- Constructor Binding -----------");
		DiConstructorConfig diConstructorConfig = ctx.getBean(DiConstructorConfig.class);
		System.out.println(diConstructorConfig.getUsername());
		System.out.println(diConstructorConfig.getPassword());
		System.out.println(diConstructorConfig.getJdbcUrl());


	}

}
