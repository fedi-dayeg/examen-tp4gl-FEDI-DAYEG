/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author fedid
 */
public class Auteur {
    
    private int ORCID;
    private int numSecurite;
    private String nom;
    private String prenom;
    private String date_dec;
    private String date_naiss;

    public Auteur() {
    }

    public Auteur(int ORCID, int numSecurite, String nom, String prenom, String date_dec, String date_naiss) {
        this.ORCID = ORCID;
        this.numSecurite = numSecurite;
        this.nom = nom;
        this.prenom = prenom;
        this.date_dec = date_dec;
        this.date_naiss = date_naiss;
    }

    public Auteur(int numSecurite, String nom, String prenom, String date_dec, String date_naiss) {
        this.numSecurite = numSecurite;
        this.nom = nom;
        this.prenom = prenom;
        this.date_dec = date_dec;
        this.date_naiss = date_naiss;
    }

    public int getORCID() {
        return ORCID;
    }

    public void setORCID(int ORCID) {
        this.ORCID = ORCID;
    }

    public int getNumSecurite() {
        return numSecurite;
    }

    public void setNumSecurite(int numSecurite) {
        this.numSecurite = numSecurite;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDate_dec() {
        return date_dec;
    }

    public void setDate_dec(String date_dec) {
        this.date_dec = date_dec;
    }

    public String getDate_naiss() {
        return date_naiss;
    }

    public void setDate_naiss(String date_naiss) {
        this.date_naiss = date_naiss;
    }
    
    
    
    
}
