/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;

/**
 *
 * @author fedid
 */
public interface IDAO<T> {
    
     public boolean ajout(T e);
    public ArrayList<T>afficher();
    public boolean modifier(T e, int id);
    public boolean supprimer (int id);
    
}
