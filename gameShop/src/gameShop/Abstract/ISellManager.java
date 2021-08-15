package gameShop.Abstract;

import Entity.Game;
import Entity.User;

public interface ISellManager {
    public void sell(Game game, User user);

    public void refund(Game game, User user);
}