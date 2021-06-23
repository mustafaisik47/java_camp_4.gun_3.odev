package concrete;

import abstracts.CampaignService;
import abstracts.ProductService;
import entities.Campaign;
import entities.Customer;
import entities.Product;

public class ProductManager implements ProductService {

	private CampaignService campaignService;

	public ProductManager(CampaignService campaignService) {
		this.campaignService = campaignService;
	}

	@Override
	public void buy(Product product, Campaign campaign, Customer customer) {

		System.out.println("'" + product.getGameName() + "'"
				+ "�simli oyunu sat�n ald�n�z. - kart�n�zdan �u kadar para tahsil edilmi�tir:" + "-"
				+ product.getGamePrice() + "-" + " Kullan�lan kampanya:" + campaign.getCampaignName()
				+ "Sat�n alan oyuncunun ismi ve soyismi :" + customer.getFirstName() + " " + customer.getLastName());

	}

	@Override
	public void toReturn(Product product, Customer customer) {
		System.out.println(
				"'" + product.getGameName() + "'" + " �simli oyunu iade ettiniz. - Hesab�n�za iade edilen tutar:"
						+ product.getGamePrice() + " Oyunu iade eden oyuncunun ismi ve soyismi :"
						+ customer.getFirstName() + " " + customer.getLastName());

	}

}
