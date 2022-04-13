import java.util.Scanner;

public class luas_segitiga {
    public static void main(String[] args){
        Double luas;
        int alas, tinggi;
        
        Scanner in=new Scanner(System.in);
        
        System.out.println("== Program hitung luas Segitiga ==");
        System.out.print("Input alas: ");
        alas = in.nextInt();
        System.out.print("Input tinggi: ");
        tinggi = in.nextInt();
        
        luas = Double.valueOf((alas * tinggi)/2);
        
        System.out.println("Luas = "+ luas);
        
    }
}