import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        System.out.println("Podaj cenę produktu");
        double value = myScan.nextInt();
        double localTax = value * 0.02;
        double federalTax = value * 0.04;
        double finallValue = value-localTax-federalTax;
        System.out.println("Kwota po podatku wynosi: " + finallValue);

    }
}
