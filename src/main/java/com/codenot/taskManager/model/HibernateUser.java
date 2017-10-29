package com.codenot.taskManager.model;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class HibernateUser {

    @Id
    @GeneratedValue
    @Column
    public int id_user;

    @Column
    public String email;
    @Column
    public String password;

}
