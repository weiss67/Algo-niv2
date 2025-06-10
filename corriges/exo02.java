import java.util.Scanner;

public class exo02 {

    public static void main(String[]args) {

         boolean response=true;
        double price;
         double total=0.0;
        String commande="";
        String article="";
        int count=0;
        Scanner clavier = new Scanner(System.in);

        while(response){

            // Changer message de début si l'utilisateur veut recommencer

         if(count==0){
         System.out.println("Bonjour, que voulez vous acheter ? ");

         }else{

         System.out.println("Que voulez vous acheter ? ");

         }

         article=clavier.nextLine();

         System.out.println("Combien, ça côute ?");

         price=clavier.nextDouble();
         clavier.nextLine(); // Ajouter pour consommer le retour à la ligne après le nextDouble

          System.out.println("Voulez-vous acheter autre choses (true/false)?");        

         response=clavier.nextBoolean();
         clavier.nextLine();  // Ajouter pour consommer le retour à la ligne après le nextDouble
         count++;
         commande+="article n°"+count+": "+article+" "+price+"euros\n";
         total+=price;

        }

       System.out.println("Récapitulatif de votre commande :\n");
       System.out.println(commande);
       System.out.println("Total de votre commande : "+total+" euros");
       System.out.println("Voulez-vous supprimer un article de votre commande ? (true/false)");
       response=clavier.nextBoolean();
       clavier.nextLine();
       if(response){
           System.out.println("Quel article voulez-vous supprimer (numéro de la commande) ?");
           String articleASupprimer=clavier.nextLine();

           // Supprimer l'article de la commande grâce à la méthode replaceAll	
             commande=commande.replaceAll(".*°"+articleASupprimer+".*\n", ""); 

              // Afficher la commande mise à jour

             System.out.println("Voici votre commande mise à jour :\n");
               System.out.println(commande);
               
               /* Recalculer le total */
               //convertir la commande en tableau de lignes
               String[] lines = commande.split("\n");
               total = 0.0;

               /* Recalculer le total */
               for (String line : lines) {

                     // Vérifier si la ligne n'est pas vide

                     //Récupérer le prix de chaque article en parcourant le tableau, ligne par ligne    
                     // Vérifier si la ligne n'est pas vide   
                   if (!line.trim().isEmpty()) {
                       String[] parts = line.split(" ");
                       double itemPrice = Double.parseDouble(parts[parts.length - 1].replace("euros", ""));
                       total += itemPrice;
                   }
               }
           System.out.println("Total de votre commande après suppression : "+total+" euros");
         } else {
           System.out.println("Merci de votre visite, à bientôt !");

       }
       clavier.close();

    }
    
}
