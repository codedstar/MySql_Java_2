/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.kwaku.cdmenu;

/**
 *
 * @author kwaku
 */

import java.util.Scanner;
//import java.util.;

public class Cdmenu {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int option;
      
        do {
            // System.out.println("Menu:");
            System.out.println("1.- Insert Genre.");
            System.out.println("2.- Update Genre.");
            System.out.println("3.- Delete Genre.");
            System.out.println("4.- Get All Genre");
            System.out.println("5+.- Get All Genre");
            
                        
            
            
            option = input.nextInt();
//            }catch(java.util.InputMismatchException ex){}
            
            
           
        
            if (option == 1) {
            // Insert Genre method here...
            System.out.println("Insert Genre method here...");

            }else if (option == 2) {
            // Update Genre method here...
            System.out.println("Update Genre method here...");
                

            }else if (option == 3) {
            // Delete Genre method here...
            System.out.println("Delete Genre method here...");

            }else if (option == 4) {
            // Get All Genre method here...
            System.out.println("Get All Genre method here...");

            }
            else {
            // close connection and exit
            System.out.println("Exit");
             return;
            }
        } while (option != 0);
     
    }

    
}
