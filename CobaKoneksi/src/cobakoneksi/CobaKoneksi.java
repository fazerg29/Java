/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cobakoneksi;

/**
 *
 * @author fahle
 */
public class CobaKoneksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql jdbc.Driver");
        }  catch (final ClassNotFoundException ex){
            System.out.println("koneksi berhasil");
        }
    }
    
}
