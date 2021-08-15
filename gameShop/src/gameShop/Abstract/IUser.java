package gameShop.Abstract;

import java.util.ArrayList;

import Entity.User;

public interface IUser {
    public void addUser(User user, ArrayList<User> users);

    public void updateUser(User user);

    public void deleteUser(User user, ArrayList<User> users);

    public void register(User user);
}