package com.example.demo.model;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity
@Table(name="RDV")
public class RDV  implements Serializable {
    @Id
    Long id;
    Date date;
    String email;
    String Name;

    public RDV(Long id, Date date, String email, String name) {
        this.id = id;
        this.date = date;
        this.email = email;
        this.Name = name;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "RDV{" +
                "id=" + id +
                ", date=" + date +
                ", email='" + email + '\'' +
                ", Name='" + Name + '\'' +
                '}';
    }

    public RDV() {
    }

}
