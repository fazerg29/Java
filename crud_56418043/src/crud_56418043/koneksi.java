
package crud_56418043;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class koneksi { 
    private Statement data = null;
    private Connection koneksi = null;

    private String Url = "jdbc:mysql://localhost:3306/gudang_56418043";
    private String DBUser = "root";
    private String DBPassword = "";

    public koneksi() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection(Url, DBUser, DBPassword);
            data = this.koneksi.createStatement();
            System.out.println("koneksi berhasil");
        }
        catch(Throwable ex){
            System.out.println("error : " + ex);
            System.exit(1);
        }
    }

    public Connection getConnection() {
        return koneksi;
    }

    public Statement getStatement() {
        return data;
    }
    
}
