import java.util.Scanner;

public class Petle9 {
    public static void main(String[] args){
        Boolean koniec = false;
        Scanner myScan = new Scanner(System.in);
        int sum=0;
        do{
            int ab = myScan.nextInt();
            int bb = myScan.nextInt();
            sum = ab+bb;
            koniec = myScan.nextBoolean();
        }while(koniec!=true);
        System.out.println(sum);
    }
}
