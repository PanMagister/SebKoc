import java.util.Scanner;

public class PetleAdv2 {
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        double liczbaOrg = myScan.nextInt();
        double dziennyPrz = (myScan.nextDouble()/100)+1;
        int dni = myScan.nextInt();
        while(liczbaOrg<2 || dziennyPrz <0 || dni<0){
            liczbaOrg = myScan.nextInt();
            dziennyPrz = (myScan.nextDouble()/100)+1;
            dni = myScan.nextInt();
        }
        for(int i=0;i<dni;i++) {
            liczbaOrg = liczbaOrg * dziennyPrz;
            System.out.println(liczbaOrg);
        }
    }
}
