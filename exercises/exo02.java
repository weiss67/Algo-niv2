/* Niveau 2 : A l'aide d'une boucle, PRINT & SCANNER 
*Me faire un système de listing pour de vos courses alimentaires
Les afficher à la fin avec le coût total de vos courses
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Bonjour, que voulez vous acheter ? :
 * Farine
 * 
 * Combien, ça côute ?:
 * 1.45
 * 
 * Voulez-vous acheter autre choses (true/false)?
 * true
 * 
 * Que voulez vous acheter ?
 * Oeufs
 * 
 * Combien, ça côute ?:
 * 2.54
 * 
 * Voulez-vous acheter autre choses (true/false)?
 * true
 * 
 * Que voulez vous acheter ?
 * Lait
 * 
 * Combien, ça côute ?:
 * 1.30
 * 
    * Voulez-vous acheter autre choses (true/false)?
 * false
 * 
 * 
 * Récapitulatif de vos courses :
 * 
 * -Oeufs , 1.45 euros
 * -Farine , 2.54 euros
 * -Lait , 1.30 euros
 * 
 * Total de vos courses : 5,29€
 * 
 * 
 * 
 */

import java.util.ArrayList;
import java.util.Scanner;

public class exo02 {

    public static void main(String[] args) {

        boolean answer = true; String produit;
        boolean first = true; boolean validated = true;
        ArrayList<String> panel = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();
        double total = 0;
        int index = 0;
          
        Scanner clavier = new Scanner(System.in);

        while(validated){
            while(answer){
                if (first) {
                    System.out.println("Bonjour, que voulez vous acheter ?");
                    first = false;
                }else{
                    System.out.println("Que voulez vous acheter ?");
                }
                produit = clavier.nextLine();

                System.out.println("Combien, ça côute ?");
                double price = clavier.nextDouble();

                panel.add(index, index+" | "+produit+" | "+ price);
                prices.add(index, price);

                index = index + 1;
                total += price;

                System.out.println("Voulez-vous acheter autre choses (true/false)?");
                if (clavier.hasNextBoolean()) {
                    answer = clavier.nextBoolean();
                    clavier.nextLine();
                }
            }

            System.out.println("Récapitulatif de vos courses :");
            for (String item : panel) {
                System.out.println("- " + item);
            }
            System.out.println("Total de vos courses :"+ total +" euros.");
            
            System.out.println("Voulez-vous retirer une course ? (true/false)?");
            validated = clavier.nextBoolean();
            
            if (validated){
                System.out.println("Que voulez-vous retirer ?");
                int deleted = clavier.nextInt();
                panel.remove(deleted);
                total -= prices.get(deleted);
            }
        }

        System.out.println("Récapitulatif final de vos courses :");
        for (String item : panel) {
            System.out.println("- " + item);
        }

        clavier.close();
    }
    
}