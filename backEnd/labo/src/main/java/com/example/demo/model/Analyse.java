package com.example.demo.model;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@SecondaryTable(name="rdv",pkJoinColumns =@PrimaryKeyJoinColumn(name="Name"))
public class Analyse  implements Serializable {


    private Long id;
    @Id
    private String Name;
    private String Caracterstiques;
    private String Prix;




    public Analyse (Long id, String name, String Caracterstiques, String Prix ){
        this.id = id;
        this.Name = name;
        this.Caracterstiques = Caracterstiques;

        this.Prix= Prix;
    }

    public Analyse () {

    }

    @Override
    public String toString() {
        return "Analyse{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", Caracterstiques='" + Caracterstiques + '\'' +
                ", Prix='" + Prix+ '\'' +
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

    public String getCaracterstiques() {
        return Caracterstiques;
    }

    public void setCaracterstiques(String Caracterstiques) {
        this.Caracterstiques = Caracterstiques;
    }

    public String getPrix() {
        return Prix;
    }

    public void setPrix(String prix) {
        Prix = prix;
    }
}
