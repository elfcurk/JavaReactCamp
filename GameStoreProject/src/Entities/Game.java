package Entities;

public class Game {
	private int id;
	private String name;
	private String detail;
	private double unitPrice;
	private double discountAfterCampaign;
	private double unitPriceAfterDiscount;

	public Game(int id, String name, String detail, double unitPrice, double discountAfterCampaign,
			double unitPriceAfterDiscount) {
		super();
		this.id = id;
		this.name = name;
		this.detail = detail;
		this.unitPrice = unitPrice;
		this.discountAfterCampaign = discountAfterCampaign;
		this.unitPriceAfterDiscount = unitPriceAfterDiscount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getDiscountAfterCampaign() {
		return discountAfterCampaign;
	}

	public void setDiscountAfterCampaign(double discountAfterCampaign) {
		this.discountAfterCampaign = discountAfterCampaign;
	}

	public double getUnitPriceAfterDiscount() {
		return unitPriceAfterDiscount;
	}

	public void setUnitPriceAfterDiscount(double unitPriceAfterDiscount) {
		this.unitPriceAfterDiscount = unitPriceAfterDiscount;
	}

}
