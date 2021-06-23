package entities;

public class Campaign {

	private String campaignName;
	private int campaignRate;

	public Campaign() {

	}

	public Campaign(String campaignName, int campaignRate) {
		super();
		this.campaignName = campaignName;
		this.campaignRate = campaignRate;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public int getCampaignRate() {
		return campaignRate;
	}

	public void setCampaignRate(int campaignRate) {
		this.campaignRate = campaignRate;
	}

}
