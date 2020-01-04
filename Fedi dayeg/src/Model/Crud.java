/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fedid
 */
public class Crud {
    
     MyConnexion myConnexion = MyConnexion.getInstance();

    public boolean exeCreate( String sql) {
        try {
            Statement statement =myConnexion.getConnection().createStatement();
            statement.executeUpdate(sql);
            return  true;
        }catch (SQLException ex){
            return false;
        }
    }

    public boolean exeUpdate(String sql) {
        try {
            Statement statement = myConnexion.getConnection().createStatement();
            statement.executeUpdate(sql);
            return true;
        }catch (SQLException ex) {
            Logger.getLogger(Crud.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean exeDelete(String sql){
        try {
        Statement statement = myConnexion.getConnection().createStatement();
        statement.executeUpdate(sql);
        return true;
        }catch (SQLException ex) {
            return false;
        }
    }

    public ResultSet exeReader(String sql) {
        try {
            Statement statement = myConnexion.getConnection().createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery(sql);
            return resultSet;
        } catch (SQLException ex) {
            return null;
        }
    }
    
}
