import java.util.ArrayList;
import java.util.List;

public class OyunAlani {
    private List<Binis> binisler;
    private int yasProfili;
    private Ozellestirme ozellestirme;
    private VeriOlcum veriOlcum;

    public OyunAlani(int yasProfili, Ozellestirme ozellestirme, VeriOlcum veriOlcum) {
        this.binisler = new ArrayList<>();
        this.yasProfili = yasProfili;
        this.ozellestirme = ozellestirme;
        this.veriOlcum = veriOlcum;
    }

    public void binisEkle(Binis binis) {
        binisler.add(binis);
        ozellestirme.ozellestir(yasProfili);
    }

    public void veriOlcum() {
        veriOlcum.olcumYap();
    }

    // Getter ve Setter metodları
    public List<Binis> getBinisler() {
        return binisler;
    }

    public int getYasProfili() {
        return yasProfili;
    }

    public void setYasProfili(int yasProfili) {
        this.yasProfili = yasProfili;
        ozellestirme.ozellestir(yasProfili);
    }
}

class Binis {
    private String isim;

    public Binis(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }
}