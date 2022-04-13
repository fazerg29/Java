import java.io.*;
public class SelamatDatang{
    public static void main(String[] args){
        try{
            String nDepan;
            BufferedReader in = new
            BufferedReader( new InputStreamReader(System.in));
            System.out.print("Masukkan Nama Depan: ");
            nDepan = in.readLine();
            System.out.print("Masukkan Nama Belakang: ");
            String nBelakang = in.readLine();
            System.out.println();
            System.out.println("Welcome 2 Java World "+nDepan+" "+nBelakang);
            System.out.println("String ini tidak akan ditampilkan");
            }
        catch(Exception e){
        System.out.println(e);
        }
    }
}