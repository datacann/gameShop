package gameShop.Abstract;

import Entity.User;

public interface ICitizenCheck {
    public boolean checkIfRealPerson(User user);
}