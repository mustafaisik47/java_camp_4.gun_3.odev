package abstracts;

import entities.Campaign;
import entities.Customer;
import entities.Product;

public interface ProductService {

	void toReturn(Product product, Customer customer);

	void buy(Product product, Campaign campaign, Customer customer);

}
