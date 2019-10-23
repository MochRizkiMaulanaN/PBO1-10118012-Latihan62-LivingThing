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
public class Main1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Human h=new Human();
        h.setNama("Rizki");
        h.walk(h.getNama());
        h.breath(h.getNama());
        h.eath(h.getNama());
       
    }
    
}
