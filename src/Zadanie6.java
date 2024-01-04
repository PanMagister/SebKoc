public class Zadanie6 {
    public static void main(String[] args){
        int pomieszczenie1i2 = 3*4*2;
        int pomieszczenie3 = 2*3;
        int pomieszczenie4 = 2*2;
        int wielkoscPomieszczenia = pomieszczenie3 + pomieszczenie1i2 + pomieszczenie4;
        double srednia = wielkoscPomieszczenia /4;
        System.out.println("Na jedną osobę przypada " + srednia+ " m2");
    }
}
