/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.archers.repository;


import com.mycompany.archers.model.User;
import java.util.List;

/**
 *
 * @author ����
 */
public interface UserRepository {

    List<User> findAll();

    User update(User rab);

    User create(User rab);


    User save(User rab);

    void delete(User rab);
    
    User findUserByLogin(User user);
    

}
