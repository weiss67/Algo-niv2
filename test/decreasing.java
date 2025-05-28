
import java.util.Scanner;

public class decreasing {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println();

        //Me faire une boucle qui compte de 30 - 0 décroissant
        int i = 0;
        //for(i = 0; i <= 30; i++) {
        // for(i = 30; i >= 0; i--) {
        for(i = sc.nextInt(); i >= 0; i--) {

            System.out.println(i);
        }

        System.out.println(i);
    }
}