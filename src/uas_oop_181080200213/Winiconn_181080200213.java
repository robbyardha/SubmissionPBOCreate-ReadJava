/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas_oop_181080200213;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.ini4j.Ini;
import org.ini4j.Wini;

/**
 *
 * @author ROBBY
 */
public class Winiconn_181080200213 {
    private Connection conn;
    public Winiconn_181080200213(){
        koneksi();
    }
    
    public Connection getConnection(){
        return conn;
    }
    public void setConnection (String Db, String user, String password){
        try {
            if (conn!=null) {
                conn.close();
            }
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(Db,user,password);
        } catch (ClassNotFoundException | SQLException ex) {
            String connectMsg = "Cant Connect Database" + ex.getMessage() + " " + ex.getLocalizedMessage();
            JOptionPane.showMessageDialog(null, connectMsg);
        }
    }
    private Connection koneksi(){
        String name_file = "C:/conndatabase.ini";
        //String name_file = "src/uas_oop_181080200213/conndatabase.ini";
        try {
            Ini fileini = new Ini (new File(name_file));
            String server = fileini.get("SETTING", "server");
            String port = fileini.get("SETTING", "port");
            String database = fileini.get("SETTING", "database");
            String user = fileini.get("SETTING", "user");
            String password = fileini.get("SETTING", "password");
            String settingdatabase = "jdbc:postgresql://" + server + ":" + port + "/" + database;
            
           try {        
                if (conn != null){
                    conn.close();
                }
                Class.forName("org.postgresql.Driver");            
                conn = DriverManager.getConnection(settingdatabase, user, password);
            } catch(ClassNotFoundException | SQLException ex) {
                String connectMsg = "Tidak dapat connect ke database: "+ ex.getMessage() + " " + ex.getLocalizedMessage();
                JOptionPane.showMessageDialog(null, connectMsg);
            }
        
        } catch (IOException err_file){
            JOptionPane.showMessageDialog(null, err_file);
        }               
        return conn;
    }
    public static void main(String args[]){
        Connpsql_181080200213 con = new Connpsql_181080200213();
        if(con.conn==null){
            JOptionPane.showMessageDialog(null,"cant connect database");
        }else{
            JOptionPane.showMessageDialog(null,"Connect To Database");
        }
    }
}
