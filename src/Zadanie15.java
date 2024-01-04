import java.util.Scanner;

public class Zadanie15 {
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        int cena = myScan.nextInt();
        double zysk = cena * 0.4; //0.4 marża
        System.out.println("Zysk wynosi " + zysk);
    }
}
