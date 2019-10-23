/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main1;

/**
 *
 * @author LENOVO
 */
public abstract class LivingThing {
   public abstract void walk(String nama); 
   public void breath(String nama){
       System.out.println("Bernafas");
   }
   public void eath(String nama){
       System.out.println("Makan");}
   
}
