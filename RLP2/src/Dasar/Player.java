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
public class Player {
    
    String name;
    int speed;
    int healthPoin;
    
    void run(){
        System.out.println(name+ " is running....");
        System.out.println("Speed:"+ speed);    
    }
    
    boolean isDead(){
        if(healthPoin <= 0){
            return true;
        }
        return false;
    }
    
}
