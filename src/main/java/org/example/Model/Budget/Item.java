package org.example.Model.Budget;

public class Item {
    //Attributs
    private int idItem;
    private String libelle;
    private double montant;
    private int categorie;   // Relation : un item appartient à une catégorie

    // Constructeurs
    public Item() {}

    public Item(int idItem, String libelle, double montant, int categorie) {
        this.idItem = idItem;
        this.libelle = libelle;
        this.montant = montant;
        this.categorie = categorie;
    }

    // Getters & Setters
    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }


    public int getCategorie() {
        return categorie;
    }

    public void setCategorie(int categorie) {
        this.categorie = categorie;
    }

    @Override
    public String toString() {
        return "Item{" +
                "idItem=" + idItem +
                ", libelle='" + libelle + '\'' +
                ", montant=" + montant +
                ", categorie=" + categorie  +
                '}';
    }

}
