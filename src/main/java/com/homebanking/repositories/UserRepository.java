package com.homebanking.repositories;

import com.homebanking.entities.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/** Repositorio de prueba sin DB*/
@Repository
public class UserRepository {
    private List<User> users;
    public UserRepository(){
        users = new ArrayList<>();
        users.add(new User(null,"argento333@example.com","password123","Pepe Argento"));
        users.add(new User(null,"liome32@exmaple.com","messirve","Lionel Messi"));
        users.add(new User(null,"apple123@example.com","apple123","Steve Jobs"));
        users.add(new User(null,"sanmartin69@example.com","martin69","San Martin"));
    }

    public Long createUser(User user){
        users.add(user);
        long id=users.indexOf(user);
        user.setId(id);
        return id;
    }
    public User getById(Long id){
        User user=null;
        try{
            user=users.get(id.intValue());
        }catch(IndexOutOfBoundsException e){
            user=null;
        }
        return user;

    }
    public List<User> getUsers(){
        return users;
    }
}
