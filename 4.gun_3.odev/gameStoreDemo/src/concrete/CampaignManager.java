package concrete;

import abstracts.CampaignService;
import entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {

		System.out.println("'" + campaign.getCampaignName() + "'"
				+ " �simli efsane kampanya ba�ar�yla eklendi!  �ndirim oran�n�z: %" + campaign.getCampaignRate());

	}

	@Override
	public void delete(Campaign campaign) {

		System.out
				.println("'" + campaign.getCampaignName() + "'" + " �simli efsane kampanyam�z maalesef sona erdi :( ");

	}

	@Override
	public void update(Campaign campaign) {

		System.out.println(
				"'" + campaign.getCampaignName() + "'" + " �simli efsane kampanyam�z� sizler i�in g�ncelledik.");

	}

}
