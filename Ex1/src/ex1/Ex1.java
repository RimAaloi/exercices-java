/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1;


import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author rim
 */
public class Ex1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Saisir le nombre d'etudiants : ");
        int n = sc.nextInt();
        double[] notes = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Entrez la note de l'étudiant " + (i + 1) + " : ");
            notes[i] = sc.nextDouble();
        }
        //1. Triez et afficher la liste des notes. 
        Arrays.sort(notes);
        System.out.println("Notes triees : " + Arrays.toString(notes));
        // 2. Affichez la note moyenne.  
        double som = 0;
        for (double note : notes) {
            som = som + note;
        }
        double moy = som / n;
        System.out.println("La note moyenne est : " + moy);
        // 3. Affichez la note maximale et minimale.
        double max = notes[n - 1];
        double min = notes[0];
        System.out.println("La note maximale est : " + max);
        System.out.println("La note minimale est : " + min);
        
        
        // 4. Affichez le nombre d’étudiants ayant une note saisie par l’utilisateur
        System.out.print("Entrez une note pour verifier combien d'etudiants l'ont obtenue : ");
        double noteRecherchee = sc.nextDouble();
        int c = 0;
        for (double note : notes) {
            if (note == noteRecherchee) {
                c++;
            }
        }
        System.out.println("Nombre d'etudiants ayant la note " + noteRecherchee + " : " + c);
        
        sc.close();
    }
}
    
    
