package net.javaguides.springboot.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "entranceMovs")
public class EntranceMov extends Mov {
    // Attributs
    // Faire cohincider avec le front

    @Column(name = "code")
    private String code;

    @Column(name = "label")
    private String label;

    @Column(name = "refType")
    private String refType;

    @Column(name = "ref")
    private int ref;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "weight")
    private float weight;

    @Column(name = "quantityTot")
    private int quantityTot;

    @Column(name = "weightTot")
    private float weightTot;

    @Column(name = "desc")
    private String desc;

    @Column(name = "state")
    private String state;

    // Constructeurs
    public EntranceMov() {

    }

    public EntranceMov(Date creDate, String creAut, Date movDate, String code, String label,
            String refType, int ref, int quantity, long weight, int quantityTot, long weightTot, String desc,
            String state) {
        super(creDate, creAut, movDate);
        this.code = code;
        this.label = label;
        this.refType = refType;
        this.ref = ref;
        this.quantity = quantity;
        this.weight = weight;
        this.quantityTot = quantityTot;
        this.weightTot = weightTot;
        this.desc = desc;
        this.state = state;
    }

    // Getters et setters
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getRefType() {
        return refType;
    }

    public void setRefType(String refType) {
        this.refType = refType;
    }

    public int getRef() {
        return ref;
    }

    public void setRef(int ref) {
        this.ref = ref;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantityTot() {
        return quantityTot;
    }

    public void setQuantityTot(int quantityTot) {
        this.quantityTot = quantityTot;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getWeightTot() {
        return weightTot;
    }

    public void setWeightTot(float weightTot) {
        this.weightTot = weightTot;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    // affichage
    @Override
    public String toString() {
        return "Mouvement d'entrée : {" + '\'' +
                "code" + code + '\'' +
                ", label" + label + '\'' +
                ", refType" + refType + '\'' +
                ", ref" + ref + '\'' +
                ", quantity" + quantity + '\'' +
                ", quantityTot" + quantityTot + '\'' +
                ", weight" + weight + '\'' +
                ", weightTot" + weightTot + '\'' +
                ", desc" + desc + '\'' +
                ", state" + state + '\'' +
                "}";
    }
}
