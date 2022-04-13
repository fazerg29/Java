/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package belajargui;

/**
 *
 * @author fahle
 */
public class Ebook extends Buku{
    private String jenisEbook;
    private String statusEbook;
    private String namaratingEbook;
    private int ratingEbook;
    private int hargaEbook;
    
    public Ebook(String judulBuku,
            String pengarangBuku,
            String tahunterbitBuku,
            String kodeBuku,
            String jenisEbook,
            String statusEbook,
            int hargaEbook,
            int ratingEbook,
            String namaratingEbook){
        
            setJudulBuku(judulBuku);
            setKodeBuku(kodeBuku);
            setTahunTerbitBuku(tahunterbitBuku);
            setPengarangBuku (pengarangBuku);
            
            this.jenisEbook = jenisEbook;
            this.statusEbook = statusEbook;
            this.hargaEbook = hargaEbook;
            this.ratingEbook = ratingEbook;
            this.namaratingEbook = namaratingEbook;
    }
    
    public Ebook() {}
    
    
    public void setJenisEbook(String ajenisEbook) {
        this.jenisEbook = ajenisEbook;
    }
    public String getJenisEbook(){
        return jenisEbook;
    }
    
    public void setStatusEbook(String astatusEbook){
        this.statusEbook = astatusEbook;
    }
    public String getStatusEbook(){
        return statusEbook;
    }
    
    public void setHargaEbook(int ahargaEbook){
        this.hargaEbook = ahargaEbook;
    }
    public int getHargaEbook(){
        return hargaEbook;
    }
    
    public void setRatingEbook(int aratingEbook){
        this.ratingEbook = aratingEbook;
    }
    public int getRatingEbook(){
        return ratingEbook;
    }
    
    public void setNamaRatingEbook(String anamaratingEbook){
        this.namaratingEbook = anamaratingEbook;
    }
    
    public String getNamaRatingEbook(){
        if (getRatingEbook() <=10 && getRatingEbook() >=8) {
            this.namaratingEbook="Excellent";
        }else if (getRatingEbook() <8 && getRatingEbook() >=6) {
            this.namaratingEbook="Nice";
        }else if (getRatingEbook() <6 && getRatingEbook() >=4) {
            this.namaratingEbook="Cool";
        }else{
            this.namaratingEbook="Normal";
        }
        
        return namaratingEbook;
    }
      
}