import java.util.Scanner;

public class Zadanie20 {
    public static void main(String[] args){
        double szklankiCukru = 1.5;
        double szklankiMasla =1;
        double szklankiMaki = 2.75;
        int liczbaCiastek = 48;
        double szklankiCukruNaCiastko = szklankiCukru/liczbaCiastek;
        double szklankiMaslaNaCiastko = szklankiMasla/liczbaCiastek;
        double szklankiMakiNaCiastko = szklankiMaki/liczbaCiastek;
        System.out.println("Podaj ilosc ciastek:");
        Scanner myScan = new Scanner(System.in);
        int requestedCookies = myScan.nextInt();
        double neededsugar = szklankiCukruNaCiastko*requestedCookies;
        double neededButtor = szklankiMaslaNaCiastko * requestedCookies;
        double neededFlour = szklankiMakiNaCiastko * requestedCookies;
        System.out.println(neededsugar + " " + neededButtor + " " + neededFlour);
    }
}
