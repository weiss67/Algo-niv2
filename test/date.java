import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class date {
    public static void main(String[] args) {
        System.out.println();
        // Current date and time
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Formatted Date-Time: " + now);

        // Define a formatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // Format the date-time
        String formattedDate = now.format(formatter);
        System.out.println("Formatted Date-Time: " + formattedDate);

        // Parse a string back to LocalDateTime
        String dateTimeString = "2025-05-21 14:30:00";
        LocalDateTime parsedDate = LocalDateTime.parse(dateTimeString, formatter);
        System.out.println("Parsed Date-Time: " + parsedDate);
    }
}