package Concrete;

import Entity.User;
import gameShop.Abstract.ICitizenCheck;

public class CitizenCheckManager implements ICitizenCheck{

    @Override
    public boolean checkIfRealPerson(User user) {
        char[] nationalityId = user.getNationalityId().toCharArray();

        if(nationalityId.length == 11){
            return true;
        }
        else{return false;}
    }
}