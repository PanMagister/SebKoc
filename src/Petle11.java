import java.util.Scanner;

public class Petle11 {
    public static void main(String[] args){
        int sum = 0;
        Scanner myScan = new Scanner(System.in);
        for(int i=0;i<10;i++){
            sum += myScan.nextInt();
        }
        System.out.println(sum);
    }
}
