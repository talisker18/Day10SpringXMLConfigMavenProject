package Day10.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Day10.models.Customer;

@Configuration
public class AppConfig {
	
	@Bean
	public Customer createCustomer() {
		Customer c = new Customer();
		c.setName("Joel Henz");
		return c;
	}

}
