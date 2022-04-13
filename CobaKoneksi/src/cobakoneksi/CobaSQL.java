package cobakoneksi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class CobaSQL {
     Connection conn = null;
    String url = "jdbc:mysql://localhost/sewa_ruang56418043";
    String user = "root";
    String password = "";
    Statement st = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    public static void main(String[] args) {
        CobaSQL app = new CobaSQL();
        
        app.masukanData();
        app.showData(); }
    
public void masukanData() {
System.out.println("**MASUKKAN DATA**");
try {
conn = DriverManager.getConnection(url, user, password);
String query = "INSERT INTO ruangan(id_ruang, jenis_ruang, harga_sewa) VALUES(?,?,?)";
pst = conn.prepareStatement(query);

            for (int i = 1; i <= 10; i++) {
                pst.setInt(1, i);
                pst.setString(2, "ruangan-" + i);
                pst.setFloat(3, new Float(0.23 * i));
                pst.executeUpdate(); }

            System.out.println("==============================");
            System.out.println("**BERHASIL MASUKKAN DATA**");
            
        } catch (SQLException e) { System.out.println(e.getMessage());
        } finally {
    
            System.out.println("==============================");
try {
                if (pst != null) { pst.close(); }
                if (conn != null) { conn.close(); }
                
            } catch (SQLException e) { System.out.println(e.getMessage()); }
}
}

    public void showData() {
        
            System.out.println("**TAMPILKAN DATA**");
            System.out.println("==============================");
            System.out.println("id_ruang"+"\t"+"jenis_ruang"+"\t"+"\t"+"\t"+"harga_sewa");
            try {
                conn = DriverManager.getConnection(url, user, password);
                pst = conn.prepareStatement("SELECT * FROM ruangan");
                rs = pst.executeQuery();
                
                while (rs.next()) {
System.out.print(rs.getInt("id_ruang"));
System.out.print("\t"+"\t");
                System.out.print(rs.getString("jenis_ruang"));
                System.out.print("\t"+"\t");
                System.out.println(rs.getFloat("harga_sewa")); }
                
        } catch (SQLException e) { System.out.println(e.getMessage());
        } finally {

    System.out.println("==============================");
            try {
                if (rs != null) { rs.close();}
                if (pst != null) { pst.close(); }
    if (conn != null) { conn.close(); }

                } catch (SQLException e) { System.out.println(e.getMessage()); }
}
}
}