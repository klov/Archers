/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.archers.repository;

import com.mycompany.archers.model.TypeUser;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.TypedQuery;


@Service("jpaTypeuserRepository")
@Transactional
@Repository
public class TypeUsersRepositoryImpl implements TypeUsersRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<TypeUser> findAll() {
        return em.createNamedQuery("Typeuser.findAll").getResultList();
    }

    @Override
    public List<TypeUser> findAllWithDetails() {
        return em.createNamedQuery("Typeuser.findAllWithDetail").getResultList();
    }

    @Override
    public TypeUser save(TypeUser typeuser) {
        if (typeuser.getId() == null) {
            em.persist(typeuser);
        } else {
            em.merge(typeuser);
        }
        return typeuser;
    }

    @Override
    public void delete(TypeUser typeuser) {
        TypeUser mergedDep = em.merge(typeuser);
        em.remove(mergedDep);
    }

    @Override
    public TypeUser update(TypeUser typeuser) {
        return em.merge(typeuser);
    }

    @Override
    public TypeUser create(TypeUser typeuser) {
        em.persist(typeuser);
        return typeuser;
    }

    @Override
    public TypeUser getTypeUserByName(String typeUser) {

        TypedQuery<TypeUser> query = em.createQuery("select u from Typeusers u where u.name=?1", TypeUser.class);
        query.setParameter(1, typeUser);
        try {
            return query.getSingleResult();
        } catch (NonUniqueResultException | NoResultException e) {
            return null;
        }

    }

}
