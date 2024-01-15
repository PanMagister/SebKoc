import java.util.Scanner;
//1papier 2kamien 3nozyce
public class PetleAdv4 {
    public static void main(String[] args){
        int ppoints =0;
        int cpoints =0;
        while(ppoints<=3 || cpoints<=3){
            int computerPick = (int)(Math.random()*3)+1;
            System.out.println(computerPick);
            Scanner myScan = new Scanner(System.in);
            int player = myScan.nextInt();
            if(player==3 && computerPick==1){
                ppoints++;
            }
            else if(player==2 && computerPick==3){
                ppoints++;
            }
            else if(player==1 && computerPick==2){
                ppoints++;
            }
            else if(player==1 && computerPick==3){
                cpoints++;
            }
            else if(player==2 && computerPick==1){
                cpoints++;
            }
            else if(player==3 && computerPick==2){
                cpoints++;
            }
            if(player==3 && computerPick==1){
                ppoints++;
            }
            else if(player==2 && computerPick==3){
                ppoints++;
            }
            else if(player==1 && computerPick==2){
                ppoints++;
            }
            System.out.println(ppoints + " " + cpoints);
        }
        if(cpoints>ppoints){
            System.out.println("Konkuter wygrał");
        }
        else{
            System.out.println("Gracz wygrał");
        }
    }
}
