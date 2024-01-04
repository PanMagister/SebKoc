import java.util.Scanner;

public class Zadanie12 {
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        System.out.println("Podaj ilość litrów");
        int paliwo = myScan.nextInt();
        System.out.println("Podaj ilość kilometrów");
        int km = myScan.nextInt();
        double kmNaLitr = (double)km/(double)paliwo;
        System.out.println("Możesz przejechać " + kmNaLitr +" km na jednym Litrze");
    }
}
