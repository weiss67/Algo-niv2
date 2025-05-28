/* EXO10 : Créer un quizz de 5 questions, chaque question à deux réponses au choix VRAI OU FAUX, à chaque fois que vous répondez juste à une question vous gagnez un point
 * 
 * Après avoir répondez à vos 5 questions, vous avez le résultat final sur 5.
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Question 1 : L'informatique a besoin des mathématiques ? (V/F)
 * 
 * V
 * 
 * Question 2 : L'Algèbre de Boole a été inventé par Steve Jobs ? (V/F)
 * 
 * F
 * 
 * Question 3 : En numération, la base de 10 va de 0 à 10 ? (V/F)
 * 
 * F
 * 
 * Question 4 : Une table de vérité retourne l'expression algébrique (V/F)
 * 
 * V
 * 
 * Question 5 : Git permet de stocker à distance son travail (V/F)
 * 
 * 
 * V
 * 
 * 
 * Résultat du QUIZZ, vous avez 5 point(s) / 5
 * 
*/

import java.util.Scanner; /* Importation de la bibliothèque Java Scanner */

public class exo10 { /* Nom de la classe */

    public static void main(String[] args) { /* Toujours le mettre pour tester votre code */

        /***--------  Début du code  -------------------****/
        boolean response; //  Déclaration d'une variable a de Type Entier */
        boolean goodresponse;
        int score = 0;
        String question="";
        int max=0;
        int i = 1;
          
        Scanner clavier = new Scanner(System.in); // Déclaration du scanner Instance de l'Objet Scanner 

        while(i<=5){

            switch(i){

                case 1:question="L'informatique a besoin des mathématiques (V/F)?"; goodresponse=true; break;
                case 2:question="L'Algèbre de Boole a été inventé par Steve Jobs ? (V/F)"; goodresponse=false; break;
                case 3:question="En numération, la base de 10 va de 0 à 10 ? (V/F)"; goodresponse=false; break;
                case 4:question="Une table de vérité retourne l'expression algébrique (V/F)"; goodresponse=true; break;
                case 5:question="Git permet de stocker à distance son travail (V/F)"; goodresponse=true; break;              
                
                default:
                      question="Aucun question"; goodresponse=false; break;         

            }
            
            System.out.println("Question "+i+" : "+question); /* Afficher votre instruction */
            
            response = clavier.nextBoolean();
            max=i;
            if(response == goodresponse){
                
                score++; // Incrémentation c'est la même chose que score = score + 1
                System.out.println(" Bonne réponse : +1 point :) "+ score +" / "+ i);  /* Afficher votre instruction */
                i++;
            }else{
                System.out.println(" Mauvaise réponse :  0 point :( "); /* Afficher votre instruction */
                i++;
            }
            
        }

        /**** Ca se Répète */
        System.out.println("Score total :"+score+"/"+ max); /* Afficher votre instruction */
             
        clavier.close();

      /***--------  Fin du code  -------------------****/
    }

}