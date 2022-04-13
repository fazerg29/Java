/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dasar;

/**
 *
 * @author fahle
 */
public class Game {
    
    public static void main(String[] args){
        
        Player player = new Player();
        
        player.name= "Reza Fahlevy";
        player.speed = 50;
        player.healthPoin = 0;
        
        player.run();
                
        if (player.isDead()){
            System.out.println("Game Over!");
        }
    }
    
}
