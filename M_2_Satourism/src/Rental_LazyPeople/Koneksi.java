/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rental_LazyPeople;

/**
 *
 * @author mamaf
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Koneksi {
    private String url= "jdbc:mysql://localhost:3306/aplikasi";
    private String username = "root";
    private String password = "";
    private Connection con;
    
    public void connect(){
        try{
            con = DriverManager.getConnection(url, username, password);
            System.out.print("Koneksi Berhasil");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public Connection getCon(){
        return con;
    }
}
