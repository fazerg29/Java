class kendaraan {
    String Merek,Jenis;
    int Kecepatan;
    
    void Melaju(int Kecepatan){
        this.Kecepatan = Kecepatan;
        System.out.println("======== MELAJU ========");
        System.out.println("Kecepatan "+Kecepatan+" Km/Jam");
    }
    void setAtribut(String Merek, String Jenis){
        this.Merek = Merek;
        this.Jenis = Jenis;
    }
    String getMerek(){
        return Merek;
    }
    String Jenis(){
        return Jenis;
    }
}
public class motor