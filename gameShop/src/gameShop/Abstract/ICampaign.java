package gameShop.Abstract;

import Entity.Campaign;
import Entity.Game;

public interface ICampaign {
    public void addCampaign(Game game, Campaign campaign, double discountPercent);

    public void updateCampaign(Game game, double discountPercent);

    public void deleteCampaign(Game game, Campaign campaign);
}