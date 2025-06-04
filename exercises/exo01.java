/* Niveau 1 : A l'aide d'une boucle, PRINT & SCANNER 
*Créer un système de commande de restauration
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * 
 * Bonjour, votre commande est avec viande (true) ou vegetarien (false)
 * true
 * 
 * (CETTE QUESTION NE S'AFFICHE PAS SI VOUS AVEZ CHOISI FALSE A LA PREMIERE)
 * Votre steak vous le voulez saignant (true) ou à poing (false) ? 
 * false
 * 
 * 
 * Frites (true) ou riz (false)
 * true
 * 
 * 
 * Soda (true) ou eau gazeuse (false)
 * false
 * 
 * 
 * Merci poru votre commande, ça sera près dans 20min,
 * 
 * 
 * 
 */

import java.util.Scanner;

public class exo01 {
 
    public static void main(String[] args) { /* Toujours le mettre pour tester votre code */

        /***--------  Début du code  -------------------****/

        boolean response; //  Déclaration d'une variable a de Type Entier */
        boolean goodresponse;
        String question="";
        int max=0;
          
        Scanner clavier = new Scanner(System.in); // Déclaration du scanner Instance de l'Objet Scanner 

        for(int i=1; i<=4; i++){

            switch(i){

                case 1:question="Bonjour, votre commande est avec viande (true) ou vegetarien (false) ?"; goodresponse=true; break;
                case 2:question="Votre steak vous le voulez saignant (true) ou à poing (false) ?"; goodresponse=false; break;
                case 3:question="Frites (true) ou riz (false) ?"; goodresponse=false; break;
                case 4:question="Soda (true) ou eau gazeuse (false) ?"; goodresponse=true; break;            
                
                default:
                      question="Aucun question"; goodresponse=false; break;         

            }
            
            System.out.println("Question "+i+" : "+question); /* Afficher votre instruction */
            
            response = clavier.nextBoolean();
            
            if(i == 1 && response == !goodresponse){
                
                i++; // Incrémentation c'est la même chose que score = score + 1
                System.out.println("Ok pas de viande ");  /* Afficher votre instruction */
            }else{
                //System.out.println(" Mauvaise réponse :  0 point :( "); /* Afficher votre instruction */
            }

            max=i;
        
        }

                /**** Ca se Répète */

        System.out.println("Merci pour votre commande, ça sera prêt dans 20min."); /* Afficher votre instruction */
             

        clavier.close();

      /***--------  Fin du code  -------------------****/
    }

}