import java.util.Scanner;

public class Petle8 {
    public static void main(String[] args){
        int input=50;
        Scanner myScan = new Scanner(System.in);
        while(input*10>100){
            input=myScan.nextInt();
        }
    }
}
