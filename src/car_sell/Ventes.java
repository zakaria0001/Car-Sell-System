package car_sell;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Zakaria Nabil
 */
public class Ventes implements Serializable {
    private String nom,numcin,marque,modele,annee;
    private String prix , kilometrage;
    private Date dateachat;

    public Ventes(String nom, String numcin,Date dateachat, String marque, String modele, String annee, String kilometrage ,String prix) {
        this.nom = nom;
        this.numcin = numcin;
        this.marque = marque;
        this.modele = modele;
        this.annee = annee;
        this.prix = prix;
        this.kilometrage = kilometrage;
        this.dateachat = dateachat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNumcin() {
        return numcin;
    }

    public void setNumcin(String numcin) {
        this.numcin = numcin;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }

    public String getKilometrage() {
        return kilometrage;
    }

    public void setKilometrage(String kilometrage) {
        this.kilometrage = kilometrage;
    }

    public Date getDateachat() {
        return dateachat;
    }

    public void setDateachat(Date dateachat) {
        this.dateachat = dateachat;
    }
    
    
}
