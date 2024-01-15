import java.util.Scanner;

public class Petle1 {
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        int i = myScan.nextInt();
        while(10<i&&i<24){
            System.out.println("Liczba "+i+" znajduje sie w przedziale");
            i = myScan.nextInt();
        }
        System.out.println("Liczba "+i+" nie znajduje sie w przedziale");
    }
}
