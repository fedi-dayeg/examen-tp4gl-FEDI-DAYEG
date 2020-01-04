/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.Auteur;
import Model.Crud;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author fedid
 */
public class AuteurController implements IDAO<Auteur>{

    Crud crud = new Crud();
    
    @Override
    public boolean ajout(Auteur e) {
       String req = "INSERT INTO examen.auteur(sociale, nom, prenom, date_nec, date_dec) VALUES ('"+e.getNumSecurite()+"','"+e.getNom()+"','"+e.getPrenom()+"','"+e.getDate_naiss()+"','"+e.getDate_dec()+"')";
        return (crud.exeCreate(req));
    }

    @Override
    public ArrayList<Auteur> afficher() {
       try {
            ArrayList ALF = new ArrayList();
            String req = "SELECT * FROM examen.auteur ";
            ResultSet resultSet = crud.exeReader(req);
            while (resultSet.next()){
                Auteur auteur =new Auteur(resultSet.getInt(1),resultSet.getInt(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6));
                ALF.add(auteur);
            }
            return  ALF;
        }catch (SQLException e) {
            return null;
        }
    }

    @Override
    public boolean modifier(Auteur e, int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean supprimer(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
