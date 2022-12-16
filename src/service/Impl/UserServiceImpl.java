package service.Impl;

import model.Book;
import model.User;
import service.UserService;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class UserServiceImpl implements UserService {
    List<User> users = new LinkedList<>();

    @Override
    public String createUser(List<User> users) {

        this.users = users;
        return "successfully created";
    }

    @Override
    public List<User> findAllUsers(List<User>users) {
        return users;
    }


    @Override
    public User findUserById(Long id, List<User> users) {
        List<User> result = new ArrayList<>();
        for (User user : users) {
            if (user.getId() == id)
                result.add(user);

        }

        return (User) result;
    }


    @Override
    public String removeUserByName(String name, List<User> users) {
        boolean isRemoved = false;
        Iterator<User> iterator = users.listIterator();
        while (iterator.hasNext()) {
            Long id = null;
            if (iterator.next().getId() == id) {
                iterator.remove();
                isRemoved = true;
            }
        }
        return isRemoved ? "Person Removed Successfully" : "Remove Failed!";
    }


    @Override
    public void updateUser(Long id) {

    }

    @Override
    public void groupUsersByGender() {

    }

    @Override
    public String buyBooks(String name, List<Book> books) {
        return null;
    }


    }


