import com.customer.service.CustomerService;
import com.customer.service.CustomerServiceImpl;

public class Main {

	public static void main(String[] args) {

		CustomerService custService = new CustomerServiceImpl();

		System.out.println(custService.findAll().get(0).getFirstName());

	}

}
