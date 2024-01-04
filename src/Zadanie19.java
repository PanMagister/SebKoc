public class Zadanie19 {
    public static void main(String[] args){
        int liczbaKonsumentow = 12467;
        double procentEnergetykow = 0.15;
        double procentEnergetykowCytrusowych = 0.64;
        double liczbaKupujuacych = liczbaKonsumentow * procentEnergetykow;
        double liczbaKupujacychCytrusowe = liczbaKupujuacych * procentEnergetykowCytrusowych;
        int NoramEnergyFianl = (int)liczbaKupujuacych;
        int CytrusEnergyFinal = (int)liczbaKupujacychCytrusowe;
        System.out.println(NoramEnergyFianl + " " + CytrusEnergyFinal);
    }
}
