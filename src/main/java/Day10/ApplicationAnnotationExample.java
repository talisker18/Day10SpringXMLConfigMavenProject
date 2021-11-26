package Day10;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Day10.ioc.AppConfig;
import Day10.models.Customer;

public class ApplicationAnnotationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Customer c = (Customer) context.getBean("createCustomer");
		System.out.println(c.getName());
		context.close();

	}

}
