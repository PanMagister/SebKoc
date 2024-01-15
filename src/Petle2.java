import java.util.Scanner;

public class Petle2 {
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        int dane = myScan.nextInt();
        String input = "f";
        String check ="t";
        while(!check.equalsIgnoreCase(input)) {
            System.out.println("Czy " + dane + " jest poprawne");
            input = (String)myScan.nextLine();
            input = input.toLowerCase();
            System.out.println(input);
        }
    }
}
