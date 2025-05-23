import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
        System.out.println();

        Scanner sc = new Scanner(System.in);

        //Me faire un espèce de questionnaire tant que la réponse du 
        //questionnaire est mauvaise, il répète la question et dit mauvaise réponse.
        boolean awnser = false;

        while(!awnser) {

            System.out.println("Question à mettre ? (TRUE/FALSE)");
            awnser = sc.nextBoolean();
            if (!awnser){
                System.out.println("C'est faux !");
            }
        }
        System.out.println("Fécilitations");
        sc.close();
    }
}