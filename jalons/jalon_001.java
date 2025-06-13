import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

public class jalon_001 {
    public static void main(String[] args) {
        boolean relaunch = true;// relance le programme dès error 404
        Scanner clavier = new Scanner(System.in);
        while(relaunch){ //Relance si ERROR FATAL 404 enclenchée
            relaunch = false;
            try{
                boolean answer = true; boolean validated = false; int index = 0; 
                ArrayList<String> vols = new ArrayList<>(); // liste pour tous les vols
                String checkpseudo = "AIRMESS"; String checkmdp = "41RM3SS";

                while(!validated){
                    System.out.println("Identifiant");
                    String pseudo = clavier.nextLine();

                    System.out.println("Mot de passe");
                    String mdp = clavier.nextLine();
                    if ((mdp.equals(checkmdp)) && (pseudo.equals(checkpseudo))) {
                        validated = true;
                        while(answer){
                            System.out.println("Départ : [Ville/Pays]");
                            String departure = clavier.nextLine();

                            System.out.println("Arrivée : [Ville/Pays]");
                            String arrival = clavier.nextLine();

                            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
                            System.out.println("Date et heure de départ (format JJ/MM/AAAA HH:MM) : ");
                            String dh = clavier.nextLine();
                            LocalDateTime dateDepart = LocalDateTime.parse(dh, formatter);

                            LocalDateTime now = LocalDateTime.now();
                            long difference = ChronoUnit.DAYS.between(now, dateDepart);

                            System.out.println("Durée du vol : heures et minutes (format HH:MM)");
                            String addtime = clavier.nextLine();
                            String[] parts = addtime.split(":");
                            int heures = Integer.parseInt(parts[0]);
                            int minutes = Integer.parseInt(parts[1]);
                            LocalDateTime parsedDatePlus = dateDepart.plusHours(heures).plusMinutes(minutes);

                            System.out.println("Nombre de places :");
                            int seats = clavier.nextInt();

                            System.out.println("Prix initial du vol :");
                            double price = clavier.nextDouble();

                            if (seats >= 80 && seats <= 200){
                                if(seats >= 150){
                                    price *= 0.9;
                                    System.out.println("Réduction de 10% pour plus de 150 places disponibles.");
                                } else if (seats <= 100) {
                                    price *= 1.1;
                                    System.out.println("Augmentation de 10% pour moins de 100 places disponibles.");}
                            } else {
                                System.out.println("Minimum 80 places ou 200 places maximum.");}
                                
                            if (difference < 7) {
                                price *= 1.4;
                                System.out.println("Augmentation de 40% pour réservation au dessous de 7 jours.");
                            } else if (difference > 180) {
                                price *= 0.6;
                                System.out.println("Réduction de 40% pour réservation au dessus de 6 mois.");}
                            vols.add(index, departure+" | "+ arrival +" | "+ dateDepart +" | "+ parsedDatePlus +" | "+ price);
                            index = index + 1; // rajoute un index si boucle relancée.

                            System.out.println("Voulez-vous ajouter un autre vol (true/false)?");
                            if (clavier.hasNextBoolean()) {
                                answer = clavier.nextBoolean();
                                clavier.nextLine();
                            }
                        } //end while answer
                        System.out.println("Récapitulatif de vos vols :");
                        for (String item : vols) {
                            System.out.println("- " + item);
                        }
                    } else { System.out.println("Identifiant ou MDP incorrect, veuillez réessayer SVP.");}// end check mdp and pseudo
                }
            } catch (Exception e) {
                System.out.println("ERROR FATAL 404");
                relaunch = true;
            } // end try catch
        } 
    }// end du while
}