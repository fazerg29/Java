import java.util.Scanner;
public class tugasmod3 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int A,B, jumlah, kurang, kali, bagi, sisa;
        System.out.println("Bilangan 1: ");
        A=in.nextInt();
        System.out.println("Bilangan 2: ");
        B=in.nextInt();
        jumlah = A+B;
        kurang = A-B;
        kali = A*B;
        bagi = A/B;
        sisa = A%B;
        System.out.println(" ");
        System.out.println("Hasil Operator Aritmatika");
        System.out.println("===========================");
        System.out.println("Jumlah = "+jumlah);
        System.out.println("Kurang = "+kurang);
        System.out.println("Kali = "+kali);
        System.out.println("Bagi = "+bagi);
        System.out.println("Sisa = "+sisa);
        
    }
}