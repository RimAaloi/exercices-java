/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex4;
import java.util.Scanner;
/**
 *
 * @author rim
 */
public class Ex4 {

    public static void main(String[] args) {
        // TODO code application logic here
                Scanner sc = new Scanner(System.in);
        System.out.print("Entrez une ligne de texte (max 100 caracteres) : ");
        String ch = sc.nextLine().toLowerCase();  
       
        int[] nb_occurrences = new int[26];
        
           for (int i = 0; i < ch.length(); i++) {
            char caractere = ch.charAt(i);
            if (caractere >= 'a' && caractere <= 'z') {
                nb_occurrences[caractere - 'a']++; 
            }
        }
        System.out.println("La chaine \"" + ch + "\" contient : ");
        for (int i = 0; i < 26; i++) {
            if (nb_occurrences[i] > 0) {
                char lettre = (char) (i + 'A');  
                System.out.println(nb_occurrences[i] + " fois la lettre '" + lettre + "'");
            }
        }
        sc.close();
    }
}
  