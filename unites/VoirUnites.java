import java.util.Random;
import java.util.Scanner;

public class VoirUnites {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int nombre = random.nextInt((10 - 1) + 1) + 1;
        System.out.println("Le chiffre aléatoire généré est : " + nombre);

        int unites = nombre % 10;
        int dizaines = (nombre / 10) % 10;

        System.out.println("L'unité du nombre " + nombre + " est : " + unites);
        System.out.println("Le dizaine du nombre " + nombre + " est : " + dizaines);

        scanner.close();
    }
}