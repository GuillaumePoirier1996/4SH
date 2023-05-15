package net.javaguides.springboot.model;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "movs")
public class Mov implements Serializable {
    // Attributs
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "creDate", nullable = false, updatable = false)
    private Date creDate;

    @Column(name = "creAut", nullable = false, updatable = false)
    private String creAut;

    @Column(name = "movDate", nullable = false, updatable = false)
    private Date movDate;

    @Column(name = "decPlace", nullable = false, updatable = false)
    private String decPlace = "RapidCargo CDG";

    // Constructeurs
    public Mov() {

    }

    public Mov(Date creDate, String creAut, Date movDate) {
        super();
        this.creDate = creDate;
        this.creAut = creAut;
        this.movDate = movDate;
    }

    // Getters et setters
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Date getCreDate() {
        return creDate;
    }

    public void setCreDate(Date creDate) {
        this.creDate = creDate;
    }

    public String getCreAut() {
        return creAut;
    }

    public void setCreAut(String creAut) {
        this.creAut = creAut;
    }

    public Date getMovDate() {
        return movDate;
    }

    public void setMovDate(Date movDate) {
        this.movDate = movDate;
    }

    public String getDecPlace() {
        return decPlace;
    }

    public void setDecPlace(String decPlace) {
        this.decPlace = decPlace;
    }

    // affichage
    @Override
    public String toString() {
        return "Mouvement :{" + '\'' +
                "id" + id + '\'' +
                ", Date de création" + creDate + '\'' +
                ", Auteur" + creAut + '\'' +
                ", Date du mouvement" + movDate + '\'' +
                ", Lieu de déclaration" + decPlace + '\'' +
                "}";
    }
}