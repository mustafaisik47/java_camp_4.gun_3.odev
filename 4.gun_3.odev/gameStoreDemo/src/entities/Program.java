package entities;

import entities.Customer;
import abstracts.CustomerCheckService;
import concrete.CampaignManager;
import concrete.CustomerManager;
import concrete.SaleManager;
import entities.Campaign;
import entities.Product;

public class Program {

	public static void main(String[] args) {

		Customer customer1 = new Customer();
		customer1.setId(1);
		customer1.setFirstName("Mustafa");
		customer1.setLastName("IÞIK");
		customer1.setDateOfBirth("07.10.2004");
		customer1.setNationalityId("13111554789");

		CustomerManager customerManager = new CustomerManager();
		customerManager.add(customer1);
		customerManager.delete(customer1);
		customerManager.update(customer1);

		System.out.println("--------------------------------------");

		Product game1 = new Product();
		game1.setGameId(1);
		game1.setGameName("FÝFA-21");
		game1.setGamePrice(700);

		System.out.println("--------------------------------------");

		Campaign campaign1 = new Campaign();
		campaign1.setCampaignName("Yarý yýl tatil kampanyasý");
		campaign1.setCampaignRate(450);

		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.delete(campaign1);
		campaignManager.update(campaign1);

		System.out.println("--------------------------------------");

		SaleManager saleManager = new SaleManager();
		saleManager.add(customer1, game1, campaign1);
	}

}
