import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.customer.service.CustomerService;

public class Main {

	public static void main(String[] args) {

		
		ApplicationContext appContext=new AnnotationConfigApplicationContext(AppContext.class);
		CustomerService custService = appContext.getBean("customerService", CustomerService.class);

		System.out.println(custService.findAll().get(0).getFirstName());

	}

}
