package service;

import model.Book;
import model.User;

import java.util.List;

public interface UserService{

    String createUser(List<User> users);

    List<User> findAllUsers(List<User>users);

    User findUserById(Long id, List<User> users);

    String removeUserByName(String name, List<User> users);

    void updateUser(Long id);//kaisil pole ozgorsun dep surap, oshogo jarasha ozgortuu

    void groupUsersByGender();

    String buyBooks(String name, List<Book>books);


}
