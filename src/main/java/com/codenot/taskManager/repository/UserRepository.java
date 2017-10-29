package com.codenot.taskManager.repository;

import com.codenot.taskManager.model.HibernateUser;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<HibernateUser, Integer> {

//    @PersistenceContext
//    private EntityManager entityManger;

//    public List<HibernateUser> findAll() {
//        return entityManger.createQuery("from HibernateUser").getResultList();
//    }

}
