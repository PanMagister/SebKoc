import java.util.Scanner;

public class zadanieRoman2 {
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        String roman = myScan.nextLine()+"S";
        System.out.println(roman);
        int sum =0;
        while (roman.charAt(0)=='M' ){
            roman = roman.substring(1);
            sum+=1000;
        }

        if(roman.charAt(0)=='C' && roman.charAt(1)=='M'){
            roman = roman.substring(1);
            roman = roman.substring(1);
            if(roman.charAt(0)=='C' && roman.charAt(1)=='M'){
                throw new java.lang.Error("Nie ma takiej liczby");
            }
            sum+=900;
        }

        while (roman.charAt(0)=='D' ){
            roman = roman.substring(1);
            sum+=500;
        }

        if(roman.charAt(0)=='C' && roman.charAt(1)=='D'){
            roman = roman.substring(1);
            roman = roman.substring(1);
            if(roman.charAt(0)=='C' && roman.charAt(1)=='D'){
                throw new java.lang.Error("Nie ma takiej liczby");
            }
            sum+=400;
        }

        while (roman.charAt(0)=='C' ){
            roman = roman.substring(1);
            sum+=100;
        }

        if(roman.charAt(0)=='X' && roman.charAt(1)=='C'){
            roman = roman.substring(1);
            roman = roman.substring(1);
            if(roman.charAt(0)=='X' && roman.charAt(1)=='C'){
                throw new java.lang.Error("Nie ma takiej liczby");
            }
            sum+=90;
        }

        if(roman.charAt(0)=='L'){
            roman = roman.substring(1);
            sum+=50;
        }

        if(roman.charAt(0)=='X' && roman.charAt(1)=='L'){
            roman = roman.substring(1);
            roman = roman.substring(1);
            if(roman.charAt(0)=='X' && roman.charAt(1)=='L'){
                throw new java.lang.Error("Nie ma takiej liczby");
            }
            sum+=40;
        }

        while (roman.charAt(0)=='X' ){
            roman = roman.substring(1);
            sum+=10;
        }

        if(roman.charAt(0)=='I' && roman.charAt(1)=='X'){
            roman = roman.substring(1);
            roman = roman.substring(1);
            if(roman.charAt(0)=='I' && roman.charAt(1)=='X'){
                throw new java.lang.Error("Nie ma takiej liczby");
            }
            sum+=9;
        }

        if(roman.charAt(0)=='V'){
            roman = roman.substring(1);
            sum+=5;
        }
        if(roman.charAt(0)=='I' && roman.charAt(1)=='V'){
            roman = roman.substring(1);
            roman = roman.substring(1);
            if(roman.charAt(0)=='I' && roman.charAt(1)=='V'){
                throw new java.lang.Error("Nie ma takiej liczby");
            }
            sum+=4;
        }

        while (roman.charAt(0)=='I' ){
            roman = roman.substring(1);
            sum+=1;
        }
        if(roman.length()>2){
            throw new java.lang.Error("Nie ma takiej liczby");
        }

        System.out.println(sum);

    }
}
