import java.util.Scanner;

public class Petle3 {
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        String ans = myScan.nextLine();
        while(!ans.equalsIgnoreCase("Tak")){
            ans = myScan.nextLine();
        }
    }
}
