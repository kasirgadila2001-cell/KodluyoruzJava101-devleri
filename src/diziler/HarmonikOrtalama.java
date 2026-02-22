package diziler;

public class HarmonikOrtalama {
    static void main(String[] args) {
        double toplam = 0, ort;
        double[] dizi = new double[] {2, 4, 6, 8};

        for(double harmonik : dizi){
            toplam += (1/harmonik);
        }
        ort = (dizi.length) / toplam;
        System.out.println(ort);
    }
}
