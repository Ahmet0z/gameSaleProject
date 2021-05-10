package gameProject.Concrete;

import gameProject.Abstract.CampaignService;
import gameProject.Entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " adl� kampanya eklendi.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " adl� kampanya silindi.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " adl� kampanya g�ncellendi.");
		
	}

}
