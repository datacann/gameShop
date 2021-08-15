package Concrete;

import Entity.Campaign;
import Entity.Game;
import gameShop.Abstract.ICampaign;

public class CampaignManager implements ICampaign{

    @Override
    public void addCampaign(Game game, Campaign campaign, double discountPercent) {
        campaign.setDiscountPercent(discountPercent);
        game.setCampaign(campaign);
    }

    @Override
    public void updateCampaign(Game game, double discountPercent) {
        game.getCampaign().setDiscountPercent(discountPercent);
    }

    @Override
    public void deleteCampaign(Game game, Campaign campaign) {
        game.setCampaign(null);
    }
}