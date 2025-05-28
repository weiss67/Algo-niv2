import java.util.Random;
import java.util.Scanner;

public class generator {

    public static void main(String[] args) {
        System.out.println("");

        String question="";
        int i = 1;
        int n1 = 0, n2 = 0, n3 = 0;
        int u1 = 0, u2 = 0, u3 = 0;
        int d1 = 0, d2 = 0, d3 = 0;
        
        Scanner clavier = new Scanner(System.in);
        Random random = new Random();

        while(i<=3){
            int nombre = random.nextInt(49) + 1;
            int unites = nombre % 10;
            int dizaines = (nombre / 10) % 10;

            System.out.println("Nombres générés " + i + " : " + nombre + " (U/"+ unites +" | D/"+ dizaines +")");

            switch(i){

                case 1:n1 = nombre; u1 = unites; d1 = dizaines;break;
                case 2:n2 = nombre; u3 = unites; d2 = dizaines;break;
                case 3:n3 = nombre; u2 = unites; d3 = dizaines;break;
                
                default:
                      question="Erreur"; break;         

            }
            i++;
        } 

        System.out.println("Score total "+ n1 +"/"+ n2 +"/"+ n3);
             
        clavier.close();
    }

}
