package eCommerce.dataAcces.abstracts;

import java.util.List;

import eCommerce.entites.concretes.User;

public interface UserDao {
     void add(User user);
     void delete(User user);
     void update(User user);
    
     User getByMail(String email);
     User getMailAndPassword(String email, String password);
     
     List<User> getAll();
}
