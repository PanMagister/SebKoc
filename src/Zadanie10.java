import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args){
        String firstName, middleName, lastName;
        Scanner myScan = new Scanner(System.in);
        System.out.println("Podaj 1 imię");
        firstName = myScan.nextLine();
        System.out.println("Podaj 2 imię");
        middleName = myScan.nextLine();
        System.out.println("Podaj nazwisko");
        lastName = myScan.nextLine();
        char firstInitial, middleInitial, lastInitial;
        firstInitial = firstName.charAt(0);
        middleInitial = middleName.charAt(0);
        lastInitial = lastName.charAt(0);
        System.out.println(firstInitial + " " + middleInitial + " " + lastInitial);
    }
}
