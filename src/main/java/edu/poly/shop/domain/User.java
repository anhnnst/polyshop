package edu.poly.shop.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * User Entity class
 * Author: Nguyen Ngoc Anh - anhnnst@yahoo.com
 */
@Entity
@Table(name = "users")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "username", nullable = false, length = 60)
    private String username;
    @Column(name = "password", nullable = false, length = 20)
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
