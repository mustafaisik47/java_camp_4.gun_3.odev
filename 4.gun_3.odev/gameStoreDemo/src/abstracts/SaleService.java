package abstracts;

import entities.Campaign;
import entities.Customer;
import entities.Product;

public interface SaleService {
	void add(Customer customer, Product product, Campaign campaign);
}
