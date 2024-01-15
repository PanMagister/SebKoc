import java.util.Scanner;

public class zadanieRoman {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int nr= myScanner.nextInt();
        String roman ="";
        System.out.println(nr);
        while(nr/1000>=1){
            roman+="M";
            nr-=1000;
        }
        System.out.println(nr);
        if(nr/900>=1){
            roman+="CM";
            nr-=900;
        }
        System.out.println(nr);
        while(nr/500>=1){
            roman+="D";
            nr-=500;
        }
        System.out.println(nr);
        if(nr/400>=1){
            roman+="CD";
            nr-=400;
        }
        System.out.println(nr);
        while(nr/100>=1){
            roman+="C";
            nr-=100;
        }
        System.out.println(nr);
        if(nr/90>=1){
            roman+="XC";
            nr-=90;
        }

        if(nr/50>=1){
            roman+="L";
            nr-=50;
        }

        if(nr/40>=1){
            roman+="XL";
            nr-=40;
        }

        while(nr/10>=1){
            roman+="X";
            nr-=10;
        }

        if(nr/9>=1){
            roman+="IX";
            nr-=9;
        }

        if(nr/5>=1){
            roman+="V";
            nr-=5;
        }

        if(nr/4>=1){
            roman+="IV";
            nr-=4;
        }
        System.out.println(nr);
        while(nr/1!=0){
            roman+="I";
            nr-=1;
        }
        System.out.println(roman);
        System.out.println(nr);

    }
}
