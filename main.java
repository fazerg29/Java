public class main {
    public static void main(String[] args){
        boolean A = true, B = false; 
        
        boolean o_and = A && B;
        boolean o_or = A || B;
        boolean o_notA = !A;
        boolean o_notB = !B;
        
        System.out.println(A+" AND "+B+" => "+o_and);
        System.out.println(A+" OR "+B+" => "+o_or);
        System.out.println(" NOT "+A+" => "+o_notA);
        System.out.println(" NOT "+B+" => "+o_notB);
        
    }
}