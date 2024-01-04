import java.util.Scanner;

public class Zadanie13 {
    public static void main(String[] args){
        int ciastka = 40;
        int porcje = 10;
        int calNaPorcje = 300;
        int ciastkaWporcji = ciastka/porcje;
        int calNaCiastko = calNaPorcje/ciastkaWporcji;
        System.out.println("Ile ciastek zjadłeś ?");
        Scanner myScan = new Scanner(System.in);
        int ciastkazjedzone = myScan.nextInt();
        int calzjedzone = ciastkazjedzone*calNaCiastko;
        System.out.println("Zjadłeś " + calzjedzone +" kalori");
    }
}
