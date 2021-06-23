package concrete;

import abstracts.CampaignService;
import entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {

		System.out.println("'" + campaign.getCampaignName() + "'"
				+ " Ýsimli efsane kampanya baþarýyla eklendi!  Ýndirim oranýnýz: %" + campaign.getCampaignRate());

	}

	@Override
	public void delete(Campaign campaign) {

		System.out
				.println("'" + campaign.getCampaignName() + "'" + " Ýsimli efsane kampanyamýz maalesef sona erdi :( ");

	}

	@Override
	public void update(Campaign campaign) {

		System.out.println(
				"'" + campaign.getCampaignName() + "'" + " Ýsimli efsane kampanyamýzý sizler için güncelledik.");

	}

}
