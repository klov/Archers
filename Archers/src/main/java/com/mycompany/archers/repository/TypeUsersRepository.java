/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.archers.repository;



import com.mycompany.archers.model.TypeUser;
import java.util.List;


/**
 *
 * @author ����
 */
public interface TypeUsersRepository   {
    List<TypeUser> findAll();

    TypeUser update(TypeUser typeuser);

    TypeUser create(TypeUser typeuser);

    List<TypeUser> findAllWithDetails();

    TypeUser save(TypeUser typeuser);

    void delete(TypeUser typeuser);
    
     TypeUser getTypeUserByName(String typeUser);
    
}
