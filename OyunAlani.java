import java.util.ArrayList;
import java.util.List;

class OyunAlani {
    private List<Binis> binisler;
    private int yasProfili;
    private double gurultuSeviyesi;
    private double dolulukOrani;
    private double elektrikTuketimi;
    private double isiSeviyesi;

    public OyunAlani(int yasProfili) {
        this.binisler = new ArrayList<>();
        this.yasProfili = yasProfili;
        this.gurultuSeviyesi = 0.0;
        this.dolulukOrani = 0.0;
        this.elektrikTuketimi = 0.0;
        this.isiSeviyesi = 0.0;
    }

    public void binisEkle(Binis binis) {
        binisler.add(binis);
        ozellestir();
    }

    private void ozellestir() {
        // Yaş profiline göre hız, müzik ve süre ayarlamaları
        if (yasProfili < 12) {
            System.out.println("Hız azaltıldı, çocuk müziği çalıyor, süre kısaltıldı.");
        } else if (yasProfili < 18) {
            System.out.println("Orta hız, pop müzik çalıyor, normal süre.");
        } else {
            System.out.println("Yüksek hız, rock müzik çalıyor, uzun süre.");
        }
    }

    public void veriOlcum() {
        // Gürültü, doluluk, elektrik ve ısı ölçümleri
        this.gurultuSeviyesi = Math.random() * 100; // Örnek veri
        this.dolulukOrani = Math.random() * 100; // Örnek veri
        this.elektrikTuketimi = Math.random() * 100; // Örnek veri
        this.isiSeviyesi = Math.random() * 100; // Örnek veri

        System.out.println("Gürültü Seviyesi: " + gurultuSeviyesi);
        System.out.println("Doluluk Oranı: " + dolulukOrani);
        System.out.println("Elektrik Tüketimi: " + elektrikTuketimi);
        System.out.println("Isı Seviyesi: " + isiSeviyesi);
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
        ozellestir();
    }

    public double getGurultuSeviyesi() {
        return gurultuSeviyesi;
    }

    public double getDolulukOrani() {
        return dolulukOrani;
    }

    public double getElektrikTuketimi() {
        return elektrikTuketimi;
    }

    public double getIsiSeviyesi() {
        return isiSeviyesi;
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