package net.javaguides.springboot.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "movs")
public class Mov {
    // Attributs
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "creation_date")
    private Date creDate;

    @Column(name = "creation_author")
    private String creAut;

    @Column(name = "movement_date")
    private Date movDate;

    @Column(name = "declaration_place")
    private String decPlace;

    // Constructeurs
    public Mov() {

    }

    public Mov(String id, Date creDate, String creAut, Date movDate, String decPlace) {
        super();
        this.id = id;
        this.creDate = creDate;
        this.creAut = creAut;
        this.movDate = movDate;
        this.decPlace = decPlace;
    }

    // Getters et setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
}