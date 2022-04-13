/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bangundatar;

/**
 *
 * @author fahle
 */
public class Segitiga {
   int alas;
   int tinggi;

    public Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
   
    
   public float luas(){
       return this.alas * this.tinggi;
   }
}
