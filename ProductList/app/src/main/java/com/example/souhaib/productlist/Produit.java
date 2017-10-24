package com.example.souhaib.productlist;

/**
 * Created by souhaib on 10/22/2017.
 */

public class Produit {

    private int id;
    private String designation;
    private String description;
    private int prix;
    private int quantity;

    public Produit(int id, String designation, String type, int prix, int quantite) {
        this.id = id;
        this.designation = designation;
        this.description = type;
        this.prix = prix;
        this.quantity = quantite;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String type) {
        this.description = type;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantite) {
        this.quantity = quantite;
    }
}
