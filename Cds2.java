/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cds2;

/**
 *
 * @author abdulmac
 */
public class Cds2 {

    public static void main(String[] args) {

        AdminGenre adminGenre = new AdminGenre("jdbc:mysql://localhost:3306/music","root","root1234#");
        System.out.println(adminGenre.connet());
        
//        System.out.println(adminGenre.insertGenre("fresh genre"));
        
        System.out.println(adminGenre.readGenreAll());
        
//         System.out.println(adminGenre.updateGenre("another fresh genre", 6));
         
//         System.out.println(adminGenre.deleteGenre(6));
    }
}
