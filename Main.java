public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello, World!");
        OyunAlani oyunAlani = new OyunAlani(12);
        Binis binis1 = new Binis("Çarpışan Arabalar");
        Binis binis2 = new Binis("Dönme Dolap");
        oyunAlani.binisEkle(binis1);
        oyunAlani.veriOlcum();
        
        oyunAlani.binisEkle(binis2);
        oyunAlani.veriOlcum();

        // oyunAlani.setYasProfili(15);
        // oyunAlani.veriOlcum();
    }
}