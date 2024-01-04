import java.util.Scanner;

public class Zadanie21 {
    public static void main(String[] args){
        int kwotaPoczatkowa;
        double kwotaKoncowa;
        double rocznaStopa;
        int iloscDoliczen;
        int lata;

        Scanner myScan = new Scanner(System.in);
        System.out.println("Podaj kwotę początkową:");
        kwotaPoczatkowa = myScan.nextInt();
        System.out.println("Podaj roczną stopę oprocentowania:");
        rocznaStopa = myScan.nextDouble();
        System.out.println("Podaj ilosc doliczen:");
        iloscDoliczen = myScan.nextInt();
        System.out.println("Podaj ilość lat:");
        lata = myScan.nextInt();

        double kwotaA = 1+(rocznaStopa/iloscDoliczen);
        double kwotaB = kwotaA;
        double exc = Math.pow(kwotaA,iloscDoliczen*lata);
        kwotaKoncowa = kwotaPoczatkowa*exc;
        System.out.println(kwotaKoncowa);
    }
}
