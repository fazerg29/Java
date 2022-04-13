public class Candy {
    int jumlahCandy = 10;
    
    public void getJumlahCandy(){
        System.out.println("Jumlah Candy: " + jumlahCandy);
        
    }
    public void tambahCandy() {
        jumlahCandy = jumlahCandy + 1;
        System.out.println("jumlah Candy setelah ditambah: " + jumlahCandy);
    }
    public static void main (String[] args){
        Candy candyStrawberry = new Candy();
        
        candyStrawberry.getJumlahCandy();
        
        candyStrawberry.tambahCandy();
        
        candyStrawberry.getJumlahCandy();
    }
}