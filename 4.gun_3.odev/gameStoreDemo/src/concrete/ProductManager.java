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
				+ "Ýsimli oyunu satýn aldýnýz. - kartýnýzdan þu kadar para tahsil edilmiþtir:" + "-"
				+ product.getGamePrice() + "-" + " Kullanýlan kampanya:" + campaign.getCampaignName()
				+ "Satýn alan oyuncunun ismi ve soyismi :" + customer.getFirstName() + " " + customer.getLastName());

	}

	@Override
	public void toReturn(Product product, Customer customer) {
		System.out.println(
				"'" + product.getGameName() + "'" + " Ýsimli oyunu iade ettiniz. - Hesabýnýza iade edilen tutar:"
						+ product.getGamePrice() + " Oyunu iade eden oyuncunun ismi ve soyismi :"
						+ customer.getFirstName() + " " + customer.getLastName());

	}

}
