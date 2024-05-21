package com.example.demo.model;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Entity


@SecondaryTables({@SecondaryTable(name="rdv",pkJoinColumns =@PrimaryKeyJoinColumn(name="email")) ,@SecondaryTable(name="files",pkJoinColumns =@PrimaryKeyJoinColumn(name="email"))})
public class User  implements Serializable {
    private Long id;
    private String Name;
    @Id
    private String email;
    private String phone;
    private String password;
    private Boolean active;
    @Enumerated(EnumType.STRING)
    private Role role;

    public User() {

    }

    public User(Long id, String name, String email, String phone, String password, Boolean active, Role role) {
        this.id = id;
        Name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.active = active;
        this.role = role;

    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", active=" + active +
                ", role=" + role +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
