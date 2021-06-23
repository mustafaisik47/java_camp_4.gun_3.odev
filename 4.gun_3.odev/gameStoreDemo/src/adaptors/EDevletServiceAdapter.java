package adaptors;

import abstracts.CustomerCheckService;
import entities.Customer;

public class EDevletServiceAdapter implements CustomerCheckService {

	@Override
	public boolean EDevletCheckSimulation(Customer customer) {
		return true;
	}

}
