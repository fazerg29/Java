public class Biodata {
    
    private String nama;
    private String npm;
    private String kelas;
    
    public Biodata (String nama, String npm, String kelas){
        
        this.nama=nama;
        
        this.npm=npm;
        
        this.kelas=kelas;
    }
    public String getName(){
        return this.nama;
    }

    public String getNpm(){
        return this.npm;
    }

    public String getKls(){
        return this.kelas;
    }
   
    public static void main(String[] args){
        
        Biodata bi=new Biodata("Jason","1271818","3DB01");
        
        
    System.out.println("Nama : "+bi.getName());
    System.out.println("Npm : "+bi.getNpm());
    System.out.println("Kelas : "+bi.getKls());
    }
}