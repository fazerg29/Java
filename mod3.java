import java.util.Scanner;
public class Jumlahmod3 {
    public static void main(String[] args) {
       Scanner masuk=new Scanner (System.in); 
       int a;
       int b;
       int jumlah;
      
      
      // Meminta user untuk input bilangan 1
        System.out.println("Bilangan 1:");
        
        // Simpan input user pada var a
        a=masuk.nextInt();
        
        //Meminta user untuk input bilangan 2
        System.out.println("Bilangan 2:");
        
        b=masuk.nextInt();
        
        
        //jumlahkan kedua bilangan dan simpan pd var jumlah
        jumlah=a+b;
        
        //Tampilkan kedua jumlah bilangan 
        System.out.println("Jumlah="+jumlah);
    }
}
