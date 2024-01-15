public class Petle12 {
    public static void main(String[] args){
        int sum =0;
        for(int i=1;i<=30;i++) {
            sum += i / (31 - i);
            System.out.println(i +" "+(31-i));
        }
        System.out.println(sum);
    }
}
