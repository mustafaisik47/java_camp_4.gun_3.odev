package concrete;

import abstracts.SaleService;
import entities.Campaign;
import entities.Customer;
import entities.Product;

public class SaleManager implements SaleService {

	public void add(Customer customer, Product product, Campaign campaign) {
		System.out.println("'" + product.getGameName() + "'" + " �simli oyunun sat���" + "->>" + product.getGamePrice()
				+ "TL fiyat�yla " + "'" + campaign.getCampaignName() + "'"
				+ " Kampanyas�ndna yararlanarak ba�ar�yla ger�ekle�mi�tir. �yi g�nlerde kullan�n say�n "
				+ customer.getFirstName() + " " + customer.getLastName());

	}

}
