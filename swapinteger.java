public class x{
private int c;
public void swap (int a, int b){
    c=a;
    a=b;
    b=c;
    }
public static void main(String[] args){
    x myobj = new x();
    int a = 180;
    int b = 80;
    System.out.println("nilai a sebelum ditukar = "+a+" b= "+b);
    myobj.swap(a,b);
    System.out.println("nilai a setelah ditukar = "+b+" b= "+a);
    
    }
}