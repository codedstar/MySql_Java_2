/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cds2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author kwaku
 */

//        String url = "jdbc:mysql://localhost:3306/music";
//        String username = "root";
//        String password = "root";


public class AdminGenre {
    Connection conn;
    private String url;
    private String username;
    private String password;
    
    public AdminGenre( String url,String username,String password){
        this.url = url;
        this.username = username;
        this.password = password;
    }
    
    public String connet(){

        try{
            conn = DriverManager.getConnection(url,username,password);
            return "connection successful";
            
        }catch(SQLException exception){
            return "Error" + exception.getMessage();
        }
        
    }
    
    public String insertGenre(String genreName){
        try{
            // PreparedStatement way
            String query = "INSERT INTO genre(name) VALUES(?)";
            PreparedStatement pStmt = conn.prepareStatement(query);
            pStmt.setString(1, genreName);

            int pStmtRowsAffected = pStmt.executeUpdate();
            return pStmtRowsAffected + " row(s) inserted.";
            
        }catch(SQLException exception){
             return "Error" + exception.getMessage();
        }
    }
    
    public String readGenre(int id){
        try{
            // PreparedStatement way
            String query = "SELECT * FROM genre where (`id_genre` = ?) ";
            PreparedStatement pStmt = conn.prepareStatement(query);
            pStmt.setInt(1, id);
            
            ResultSet rs;            
            String genID, genName, text = "";

            
            rs = pStmt.executeQuery();
            while (rs.next()) {               // Position the cursor                  4 
            genID = rs.getString(1);        // Retrieve the first column value
            genName = rs.getString(2);      // Retrieve the first column value
            text = ("Genre id = " + genID +
             "\nGenre name = " + genName);
                                            // Print the column values
          }
            return text;
            
        }catch(SQLException exception){
             return "Error" + exception.getMessage();
        }
    }
    
    public String readGenreAll(){
        try{
            // PreparedStatement way
            String query = "SELECT * FROM genre ";
            PreparedStatement pStmt = conn.prepareStatement(query);
//            pStmt.setInt(1, id);
            
            ResultSet rs;            
            String genID, genName, text = "";

            
            rs = pStmt.executeQuery();
            while (rs.next()) {               // Position the cursor                  4 
            genID = rs.getString(1);        // Retrieve the first column value
            genName = rs.getString(2);      // Retrieve the first column value
            text += ("Genre id = " + genID +
             "  Genre name = " + genName + "\n");
                                            // Print the column values
          }
            return text;
            
        }catch(SQLException exception){
             return "Error" + exception.getMessage();
        }
    }
    
    public String updateGenre(String genreName, int id){
        try{
            // PreparedStatement way
            String query = "UPDATE `music`.`genre` SET `name` = ? WHERE (`id_genre` = ?)";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, genreName);
            statement.setInt(2, id);

            int rowsUpdated = statement.executeUpdate();
            return rowsUpdated + " row(s) updated successfully.";

            
        }catch(SQLException exception){
             return "Error" + exception.getMessage();
        }
    }
        
    public String deleteGenre(int id){
        try{
            // PreparedStatement way
            String query = "DELETE FROM `music`.`genre` WHERE (`id_genre` = ?)";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, id);
            int rowsDeleted = statement.executeUpdate();
            return rowsDeleted + " row(s) deleted successfully.";
            
        }catch(SQLException exception){
             return "Error" + exception.getMessage();
        }
    }
}
