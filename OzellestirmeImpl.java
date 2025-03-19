public class OzellestirmeImpl implements Ozellestirme {
    @Override
    public void ozellestir(int yasProfili) {
        // Yaş profiline göre hız, müzik ve süre ayarlamaları
        if (yasProfili < 12) {
            System.out.println("Hız azaltıldı, çocuk müziği çalıyor, süre kısaltıldı.");
        } else if (yasProfili < 18) {
            System.out.println("Orta hız, pop müzik çalıyor, normal süre.");
        } else {
            System.out.println("Yüksek hız, rock müzik çalıyor, uzun süre.");
        }
    }
}