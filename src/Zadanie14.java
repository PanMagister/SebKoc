import java.util.Scanner;

public class Zadanie14 {
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        System.out.println("podaj 3 wyniki");
        int wynik1 = myScan.nextInt();
        int wynik2 = myScan.nextInt();
        int wynik3 = myScan.nextInt();
        double srednia = (wynik1+wynik2+wynik3)/3;
        System.out.println(wynik1 + " " + wynik2 + " " + wynik3 + " " + srednia);
    }
}
