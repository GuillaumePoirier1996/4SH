package net.javaguides.springboot.model;

import java.util.Date;

public class ExitMov extends Mov {
    // Attributs
    // Faire cohincider avec le front
    private String code;
    private String label;
    private String refType;
    private int ref;
    private int quantity;
    private long weight;
    private int quantityTot;
    private long weightTot;
    private String desc;
    private String state;
    private String apType;
    private String apRef;

    // Constructeurs
    public ExitMov() {

    }

    public ExitMov(String id, Date creDate, String creAut, Date movDate, String decPlace, String code, String label,
            String refType, int ref, int quantity, long weight, int quantityTot, long weightTot, String desc,
            String state, String apType, String apRef) {
        super(id, creDate, creAut, movDate, decPlace);
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
        this.apType = apType;
        this.apRef = apRef;
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

    public long getWeight() {
        return weight;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }

    public long getWeightTot() {
        return weightTot;
    }

    public void setWeightTot(long weightTot) {
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

    public String getApType() {
        return apType;
    }

    public void setApType(String apType) {
        this.apType = apType;
    }

    public String getApRef() {
        return apRef;
    }

    public void setApRef(String apRef) {
        this.apRef = apRef;
    }
}
