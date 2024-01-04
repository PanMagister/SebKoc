public class Zadanie18 {
    public static void main(String[] args){
        int liczbaAkcji = 600;
        double cenaAkcji = 21.77;
        double calosc = liczbaAkcji * cenaAkcji;
        double prowizja = calosc*0.02;
        double finalCalosc = calosc+prowizja;
        System.out.println(calosc + " " +prowizja + " " + finalCalosc);
    }
}
