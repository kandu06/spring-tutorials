import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.customer.repository.CustomerRepository;
import com.customer.repository.CustomerRepositoryImpl;
import com.customer.service.CustomerService;
import com.customer.service.CustomerServiceImpl;

@Configuration
@ComponentScan({"com.customer"})
public class AppContext {
	
	/*@Bean(name="customerService")
	public CustomerService getCustomerService(){
		CustomerServiceImpl service= new CustomerServiceImpl();
		service.setRepository(getCustomerRepository());
		return service;
	}

	@Bean(name="customerRepository")
	public CustomerRepository getCustomerRepository(){
		return new CustomerRepositoryImpl();
	}
	*/
}
