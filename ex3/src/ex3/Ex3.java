/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3;
import java.util.Scanner;
/**
 *
 * @author rim
 */
public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            String chaine = "";  
            int choix;
        do {
            System.out.println("Menu des operations sur la chaine :");
            System.out.println("1. Saisir une chaine de caracteres");
            System.out.println("2. Afficher la chaine saisie");
            System.out.println("3. Inverser la chaine");
            System.out.println("4. Compter le nombre de mots");
            System.out.println("5. Quitter");
            System.out.print("Faites votre choix : ");
    
            choix = sc.nextInt();
            sc.nextLine();  
            switch (choix) {
                case 1: 
                    System.out.print("Entrez une chaine de caracteres : ");
                    chaine = sc.nextLine();
                    System.out.println("Chaine saisie avec succes.");
                    pause();
                    break;
                case 2:
                    if (!chaine.isEmpty()) {
                        System.out.println("La chaîne saisie est : " + chaine);
                    } else {
                        System.out.println("Aucune chaîne n'a ete saisie.");
                    }
                    pause();
                    break;
                case 3:
                    if (!chaine.isEmpty()) {
                        String chaineInversee = new StringBuilder(chaine).reverse().toString();
                        System.out.println("Chaine inversee : " + chaineInversee);
                    } else {
                        System.out.println("Aucune chaine n'a ete saisie.");
                    }
                    pause();
                    break;
                case 4:
                    if (!chaine.isEmpty()) {
                        String[] mots = chaine.trim().split("\\s+");
                        int nombreDeMots = mots.length;
                        System.out.println("Nombre de mots dans la chaine : " + nombreDeMots);
                    } else {
                        System.out.println("Aucune chaine n'a ete saisie.");
                    }
                    pause();
                    break;
                case 5:
                    System.out.println("Merci d'avoir utilise ce programme.");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez reessayer.");
                    pause();
                    break;
            }
        } while (choix != 5);

        sc.close();
    }

    // Méthode pour faire une pause avant de revenir au menu
    public static void pause() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nFrappez une touche pour revenir au menu...");
        sc.nextLine();
    }
}
 
