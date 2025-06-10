
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class date_v2 {
    public static void main(String[] args) {


        // Format de base des dates YYYY-MM-DD
        // Exemple : 2025-05-21

        try{
        // Current date and time
        LocalDateTime now = LocalDateTime.now();

        // Define a formatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        // Print the current date and time
        
                System.out.println(now);



        // y: Année, m: Mois, d: Jour, h: Heure (24h), m: Minute, s: Seconde

        // Format the date-time
        String formattedDate = now.format(formatter);
        System.out.println("Date d'aujourd'hui format Francophone: " + formattedDate);

        // Parse a string back to LocalDateTime
        String dateTimeString = "09/06/2025 14:30:00";
        LocalDateTime parsedDate = LocalDateTime.parse(dateTimeString, formatter);
        LocalDateTime parsedDatePlus = parsedDate.plusYears(1);


        System.out.println("Conversion de date String en LocalDateTime: " + parsedDatePlus.format(formatter));

            Instant maintenant = Instant.now();

        System.out.println("Instant actuel: " + maintenant.getEpochSecond());

    }
        catch(DateTimeParseException e){
            System.out.println("Erreur de formatage de la date : ");
        }

         System.out.println("Continuer le code ! ");


    }
}
