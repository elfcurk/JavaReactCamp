package Concrete;

import Abstracts.ICampaignService;
import Entities.Campaign;

public class CampaignManager implements ICampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("sisteme yeni kampanya eklendi");
		System.out.println("eklenen kampanyanin detaylari: ");
		System.out.println("kampanyanin adi: " + campaign.getCampaignName());
		System.out.println("kampanya bilgisi: " + campaign.getInformation());
		System.out.println("kampanya indirimi: " + campaign.getDiscount());
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("sistemden kampanya silindi");
		System.out.println("eklenen kampanyanin detaylari: ");
		System.out.println("kampanyanin adi: " + campaign.getCampaignName());
		System.out.println("kampanya bilgisi: " + campaign.getInformation());
		System.out.println("kampanya indirimi: " + campaign.getDiscount());

	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("sistemdeki kampanya güncellendi");
		System.out.println("eklenen kampanyanin detaylari: ");
		System.out.println("kampanyanin adi: " + campaign.getCampaignName());
		System.out.println("kampanya bilgisi: " + campaign.getInformation());
		System.out.println("kampanya indirimi: " + campaign.getDiscount());

	}

}
