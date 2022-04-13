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
public class Buku {
   private String judulBuku;
   private String pengarangBuku;
   private String kodeBuku;
   private String tahunterbitBuku;
   
   public void setJudulBuku(String ajudulBuku) {
       this.judulBuku = ajudulBuku;   
   }
   public String getJudulBuku(){
       return judulBuku; 
   }
   public void setPengarangBuku(String apengarangBuku){
       this.pengarangBuku = apengarangBuku;
   }
   public String getPengarangBuku(){
       return pengarangBuku;
   }
   public void setKodeBuku(String akodeBuku){
       this.kodeBuku = akodeBuku;
   }
   public String getKodeBuku(){
       return kodeBuku;
   }
   public void setTahunTerbitBuku(String atahunterbitBuku){
       this.tahunterbitBuku = atahunterbitBuku;
   }
   public String getTahunTerbitBuku(){
       return tahunterbitBuku;
   }
}