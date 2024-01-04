import java.util.Locale;
import java.util.Scanner;

public class Zadanie16 {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Napisz swoje ulubione miasto:");
        String ulubioneMiasto = myScanner.nextLine();
        int wielkosc = ulubioneMiasto.length();
        String upper = ulubioneMiasto.toUpperCase();
        String lower = ulubioneMiasto.toLowerCase();
        char firstchar = ulubioneMiasto.charAt(0);
        System.out.println(wielkosc + " " + upper + " " + lower + " " + firstchar);
    }
}
