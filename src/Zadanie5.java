public class Zadanie5 {
    public static void main(String[] args){
        int pomieszczenie1i2 = 3*4*2;
        int pomieszczenie3 = 2*3;
        int pomieszczenie4 = 2*2;
        System.out.println("Pomieszczenie 1 i 2 ma " + pomieszczenie1i2 + "m2");
        System.out.println("Pomieszczenie 3 ma " + pomieszczenie3 + "m2");
        System.out.println("Pomieszczenie 4 ma " + pomieszczenie4 + "m2");
        int wielkoscPomieszczenia = pomieszczenie3 + pomieszczenie1i2 + pomieszczenie4;
        System.out.println("Pomieszczenia mieszkania to " + wielkoscPomieszczenia + "m2");
    }
}
