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
public class Livre {
    
    private int isbn;
    private String titre;
    private String maison_ed;
    private Date date_pub;
    private int orcid;

    public Livre() {
    }

    public Livre(int isbn, String titre, String maison_ed, Date date_pub, int orcid) {
        this.isbn = isbn;
        this.titre = titre;
        this.maison_ed = maison_ed;
        this.date_pub = date_pub;
        this.orcid = orcid;
    }

    public Livre(String titre, String maison_ed, Date date_pub, int orcid) {
        this.titre = titre;
        this.maison_ed = maison_ed;
        this.date_pub = date_pub;
        this.orcid = orcid;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getMaison_ed() {
        return maison_ed;
    }

    public void setMaison_ed(String maison_ed) {
        this.maison_ed = maison_ed;
    }

    public Date getDate_pub() {
        return date_pub;
    }

    public void setDate_pub(Date date_pub) {
        this.date_pub = date_pub;
    }

    public int getOrcid() {
        return orcid;
    }

    public void setOrcid(int orcid) {
        this.orcid = orcid;
    }
    
    
    
    
}
