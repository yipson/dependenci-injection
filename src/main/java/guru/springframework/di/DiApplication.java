package guru.springframework.di;

import guru.springframework.di.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		String gretting = myController.sayHello();

		System.out.println(gretting);

	}

}
