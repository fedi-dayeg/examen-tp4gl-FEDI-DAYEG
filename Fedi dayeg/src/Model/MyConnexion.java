/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author fedid
 */
public class MyConnexion {
    
     private String url = "jdbc:mysql://localhost:3306/examen";
    private String login = "root";
    private String pwd = "";


    private static MyConnexion instance;

    private static Connection connection;

    private MyConnexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url,login,pwd);
        }catch (SQLException ex){
            Logger.getLogger(MyConnexion.class.getName()).log(Level.SEVERE,null,ex);
            JOptionPane.showMessageDialog(null,"Serveur n'est pas demarrer! \n merci de lancer le serveur", "ERREUR de connection au serveur",JOptionPane.ERROR_MESSAGE);
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(MyConnexion.class.getName()).log(Level.SEVERE,null,ex);
            JOptionPane.showMessageDialog(null,"Serveur n'est pas demarrer! \n merci de lancer le serveur", "ERREUR de connection au serveur",JOptionPane.ERROR_MESSAGE);
        }

    }

    public static MyConnexion getInstance(){
        if (instance == null) {
            instance = new MyConnexion();
        }
        return instance;
    }

    public Connection getConnection(){
        return connection;
    }
    
}
