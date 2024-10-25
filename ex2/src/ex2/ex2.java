/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2;

import java.util.Scanner;
/**
 *
 * @author rim
 */
public class ex2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un verbe du premier groupe (termine par (er)) : ");
        String verbe = sc.nextLine().trim();
    
        if (!verbe.endsWith("er")) {
            System.out.println("Le verbe doit se terminer par 'er' .");
            return;
        }

        String racine = verbe.substring(0, verbe.length() - 2);
        
        // Affichage de la conjugaison au présent
        System.out.println("je " + racine + "e");
        System.out.println("tu " + racine + "es");
        System.out.println("il" + racine + "e");
        System.out.println("nous " + racine + "ons");
        System.out.println("vous " + racine + "ez");
        System.out.println("ils " + racine + "ent");

        sc.close();
    }
        
    }
    

