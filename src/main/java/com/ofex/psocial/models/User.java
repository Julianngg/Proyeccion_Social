package com.ofex.psocial.models;

import jakarta.persistence.*;


@Entity
@Table(name = "users")
public class User {
    @Id
    private Long id;
    private String user_name;
    private String password;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_rol", nullable = false)
    private Rol id_rol;

    public User() {
    }

    public User(Long id, String user_name, String password, Rol id_rol) {
        this.id = id;
        this.user_name = user_name;
        this.password = password;
        this.id_rol = id_rol;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Rol getId_rol() {
        return id_rol;
    }

    public void setId_rol(Rol id_rol) {
        this.id_rol = id_rol;
    }
}
