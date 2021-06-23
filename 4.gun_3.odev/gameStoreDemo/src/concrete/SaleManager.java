package concrete;

import abstracts.SaleService;
import entities.Campaign;
import entities.Customer;
import entities.Product;

public class SaleManager implements SaleService {

	public void add(Customer customer, Product product, Campaign campaign) {
		System.out.println("'" + product.getGameName() + "'" + " Ýsimli oyunun satýþý" + "->>" + product.getGamePrice()
				+ "TL fiyatýyla " + "'" + campaign.getCampaignName() + "'"
				+ " Kampanyasýndna yararlanarak baþarýyla gerçekleþmiþtir. Ýyi günlerde kullanýn sayýn "
				+ customer.getFirstName() + " " + customer.getLastName());

	}

}
