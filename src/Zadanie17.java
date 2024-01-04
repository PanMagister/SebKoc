import java.util.Scanner;

public class Zadanie17 {
    public static void main(String[] args){
        double podatek = 0.0675;
        double napiwek = 0.2;
        System.out.println("Wprowadź kwotę");
        Scanner myScan = new Scanner(System.in);
        int kwota = myScan.nextInt();
        double kwotaPodatku = kwota*podatek;
        double kwotaNapiwku = kwota*napiwek;
        double calosc = kwota + kwotaNapiwku + kwotaPodatku;
        System.out.println(kwota + " " + kwotaPodatku + " " + kwotaNapiwku + " " +calosc);
    }
}
