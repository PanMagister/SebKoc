import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args){
        System.out.println("Dej wymiary 1 pomieszczenia");
        Scanner myScan = new Scanner(System.in);
        int pomieszczenie1x =myScan.nextInt();
        int pomieszczenie1y =myScan.nextInt();
        int pomieszczenie1metraz = pomieszczenie1y *pomieszczenie1x;
        System.out.println("Dej wymiary 2 pomieszczenia");
        int pomieszczenie2x =myScan.nextInt();
        int pomieszczenie2y =myScan.nextInt();
        int pomieszczenie2metraz = pomieszczenie2y *pomieszczenie2x;
        System.out.println("Dej wymiary 3 pomieszczenia");
        int pomieszczenie3x =myScan.nextInt();
        int pomieszczenie3y =myScan.nextInt();
        int pomieszczenie3metraz = pomieszczenie3y *pomieszczenie3x;
        System.out.println("Dej wymiary 4 pomieszczenia");
        int pomieszczenie4x =myScan.nextInt();
        int pomieszczenie4y =myScan.nextInt();
        int pomieszczenie4metraz = pomieszczenie4y *pomieszczenie4x;
        int mieszkanieMetraz = pomieszczenie1metraz + pomieszczenie2metraz + pomieszczenie3metraz + pomieszczenie4metraz;

        System.out.println("Pomieszczenie 1 ma" + pomieszczenie1metraz + " m2. Pomieszczenie 2 ma" + pomieszczenie2metraz +
                " m2. Pomieszczenie 3 ma" + pomieszczenie3metraz + " m2. Pomieszczenie 4 ma" + pomieszczenie4metraz +
                "m2. Całość mieszkania ma "+ mieszkanieMetraz +"m2" );

    }
}

