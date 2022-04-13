public class kotak{
    int panjang;
    int lebar;
    int tinggi;
    int volume;
 // pembuatan method hitung volume dengan jenis non void/ mengembalikan nilai.
    public int HitungVolume(){
            volume = panjang*lebar*tinggi;
            return volume;
        }
 //pembuatan method hitung volume denga jenis void/ tanpa mengembalikan data.
    public void TampilVolume(){
        System.out.println("Hasil Volume balok adalah " +panjang*lebar*tinggi);
        }
        public static void main(String[] args){
            kotak obj = new kotak();
            obj.panjang = 10;
            obj.lebar = 5;
            obj.tinggi = 4;
            
            //pemanggilan non void/dengan pengembalian data.
            System.out.println("Volume Balok adalah " +obj.HitungVolume() * 5);
            
            //pemanggilan non void/dengan pengembalian data.
            obj.TampilVolume();
    }
        
}
