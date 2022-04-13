/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cobakoneksi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi2 {
public static void main(String args[]){
    Connection conn = null;
    try{
        System.out.println("Koneksi sedang berjalan...");
        
        String url = "jdbc:mysql://localhost/sewa_ruang56418043";
        String user = "root";
        String password = "";
        
        conn = DriverManager.getConnection(url, user, password);
        System.out.println("Koneksi Berhasil");
    } catch (SQLException e){
        System.out.println(e.getMessage());
    }
}
    
}
