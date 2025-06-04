/* Niveau 3 : A l'aide d'une boucle, PRINT & SCANNER 
*Imiter un distributeur de banque qui s'arrête uniquement 
quand vous appuyez, terminer(0). Voici les commandes suivantes

0 - Terminer
1 - Retirer
2 - Afficher compte
3 - Déposer

vous avez droit à un découvert de maximum 500€
Vous ne pouvez déposer minimum 5€ et une somme divisible par 5 (vu que c'est des billets)
Vous pouvez retirer qu'en multiple de 10

 * Vous avez 2000€ sur votre compte
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Bienvenu sur votre compte bancaire, que puis-je faire pour vous :
 * (0)Quitter
 * (1)Retirer de l'argent
 * (2)Consulter votre solde
 * (3)Déposer de l'argent
 * 
 * 1
 * 
 * Combien voulez-vous retirer ?:
 * 500€
 * 
 * Opération acceptée : 500€ ont été retiré,
 *  voulez-vous autres-choses ?
 * (0)Quitter
 * (1)Retirer de l'argent
 * (2)Consulter votre solde
 * (3)Déposer de l'argent
 * 
 * 2
 * 
 * Vous avez actuellement 1500€ sur votre solde
 *  voulez-vous autres-choses ?
 * (0)Quitter
 * (1)Retirer de l'argent
 * (2)Consulter votre solde
 * (3)Déposer de l'argent
 * 
 * 3
 * 
 * Combien voulez-vous retirer ?:
 * 577€
 * 
 * Désolé vous ne pouvez déposer que des billets
 * Voulez-vous autres-choses ?
 * (0)Quitter
 * (1)Retirer de l'argent
 * (2)Consulter votre solde
 * (3)Déposer de l'argent
 * 
 * 0
 * 
 * Merci de votre visite, au revoir :) !
 */

import java.util.Scanner;
public class exo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int solde = 2000; boolean terminated = false; boolean first = true;
        String options = "\n0 | Quitter\n1 | Retirer de l'argent\n2 | Consulter votre solde\n3 | Déposer de l'argent";
        while(!terminated){
            if(first){
                System.out.println("Bienvenue sur votre compte bancaire, que puis-je faire pour vous ?"+ options);
                first = false;
            } else {
                System.out.println("Souhaitez-vous faire une autre opération ?"+ options);
            }
            int option = sc.nextInt();
            switch(option){

                case 0: terminated = true; break;
                case 1: System.out.println("Combien voulez-vous retirer ?");
                int retired = sc.nextInt();
                if (retired % 10 == 0) {
                    if((solde - retired) >= -500){
                        solde -= retired;
                    } else {System.out.println("Vous avez droit à un découvert de maximum 500 euros.");}
                } else {System.out.println("Vous pouvez retirer qu'en multiple de 10.");}
                break;
                case 2: System.out.println("Votre solde est à "+ solde +" euros.");
                break;
                case 3: System.out.println("Combien voulez-vous deposer ?");
                int deposit = sc.nextInt();
                if(deposit >= 5){
                    if(deposit % 5 == 0){
                        solde -= deposit;
                        } else {System.out.println("Vous ne pouvez déposer une somme divisible par 5.");}
                } else {System.out.println("Vous ne pouvez déposer minimum 5 euros.");}
                break;            
                default: String text="ERROR FATAL 404\nVeuillez vous adresser à l'accueil."; break;         
            }
        }
        System.out.println("Merci de votre visite et votre confiance, au revoir !");
        sc.close();
    }
}