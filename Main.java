public class Main {
    public static void main(String[] args) {
        Ozellestirme ozellestirme = new OzellestirmeImpl();
        VeriOlcum veriOlcum = new VeriOlcumImpl();
        OyunAlani oyunAlani = new OyunAlani(10, ozellestirme, veriOlcum);

        Binis binis1 = new Binis("Çarpişan Arabalar");
        Binis binis2 = new Binis("Dönme Dolap");

        oyunAlani.binisEkle(binis1);
        oyunAlani.binisEkle(binis2);

        oyunAlani.veriOlcum();

        oyunAlani.setYasProfili(15);
        oyunAlani.veriOlcum();

        oyunAlani.setYasProfili(20);
        oyunAlani.veriOlcum();
    }
}