package Entities;

public class Campaign {
	private int id;
	private String campaignName;
	private String information;
	private int discount;

	public Campaign(int id, String campaignName, String information, int discount) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.information = information;
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

}
