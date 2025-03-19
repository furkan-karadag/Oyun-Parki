public class VeriOlcumImpl implements VeriOlcum {
    private double gurultuSeviyesi;
    private double dolulukOrani;
    private double elektrikTuketimi;
    private double isiSeviyesi;

    @Override
    public void olcumYap() {
        // Gürültü, doluluk, elektrik ve ısı ölçümleri
        this.gurultuSeviyesi = Math.random() * 100; // Örnek veri
        this.dolulukOrani = Math.random() * 100; // Örnek veri
        this.elektrikTuketimi = Math.random() * 100; // Örnek veri
        this.isiSeviyesi = Math.random() * 100; // Örnek veri

        System.out.println("Gürültü Seviyesi: " + gurultuSeviyesi);
        System.out.println("Doluluk Oranı: " + dolulukOrani);
        System.out.println("Elektrik Tüketimi: " + elektrikTuketimi);
        if (isiSeviyesi > 50) {
            System.out.println("Isı Seviyesi: " + isiSeviyesi + " Isı Seviyesi Yüksek Klimalar Çalışıyor...!");
        } else {
            System.out.println("Isı Seviyesi: " + isiSeviyesi);
        }
    }
}
