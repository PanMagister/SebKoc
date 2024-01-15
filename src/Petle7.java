import java.util.Scanner;

public class Petle7 {
    public static void main(String[] args){
        int suma = 0;
        Scanner myScan = new Scanner(System.in);
        for(int i=0;i<7;i++){
            suma +=myScan.nextInt();
        }
        System.out.println(suma);
    }
}
