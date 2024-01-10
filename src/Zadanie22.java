import java.util.Scanner;
public class Zadanie22 {
    public static void main(String[] args){
        int akcje = 1000;
        double cena = 33.92;
        double cenaProwizji = akcje*cena*0.02;
        double cenaAkcji = akcje*cena;
        double cenaKoncowa = cenaAkcji+cenaProwizji;
        Scaner myScanner = new Scanner(System.in);
        double zysk = myScanner.nextDouble();
        System.out.println(cenaKoncowa + " "+ cenaAkcji + " "+ cenaProwizji + " "+ zysk);

    }
}
