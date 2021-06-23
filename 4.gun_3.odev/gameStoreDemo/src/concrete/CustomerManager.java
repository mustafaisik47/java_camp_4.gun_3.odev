package concrete;

import abstracts.CustomerCheckService;
import abstracts.CustomerService;
import entities.Customer;

public class CustomerManager implements CustomerService {

	CustomerCheckService customerCheckService;

	public CustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	public CustomerManager() {
	}

	@Override
	public void add(Customer customer) {
		if (customerCheckService.EDevletCheckSimulation(customer) == true) {
			System.out.println("'" + customer.getFirstName() + " " + customer.getLastName() + "'"
					+ "isimli kiþi baþarýyla eklendi.");
		}
	}

	@Override
	public void delete(Customer customer) {
		System.out.println(
				"'" + customer.getFirstName() + " " + customer.getLastName() + "'" + " Ýsimli kayýtlý kiþi silindi.");
	}

	@Override
	public void update(Customer customer) {
		System.out.println("'" + customer.getFirstName() + " " + customer.getLastName() + "'"
				+ " Ýsimli kayýtlý kiþi güncellendi.");
	}

}
