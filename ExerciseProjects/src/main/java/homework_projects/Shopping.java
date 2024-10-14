package HomeworkProjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {

        /* Basarili Market alış-veriş programı.
 *
 * 1. Adım: Ürünler ve fiyatları içeren listeleri oluşturunuz.
 *        No        Ürün         Fiyat
          ====     =======      =========
          00  Domates           2.10 TL
          01  Patates           3.20 TL
          02  Biber             1.50 TL
          03  Soğan          2.30 TL
          04  Havuç                 3.10 TL
          05  Elma                  1.20 TL
          06  Muz           1.90 TL
          07  Çilek            6.10 TL
          08  Kavun          4.30 TL
          09  Üzüm              2.70 TL
          10  Limon             0.50 TL

 * 2. Adım: Kullanıcının ürün nosuna göre listeden ürün seçmesini isteyiniz.
 * 3. Adım: Kaç kg satın almak istediğini sorunuz.
 * 4. Adım: Alınacak bu ürünü sepete ekleyiniz ve Sepeti yazdırınız.
 * 5. Başka bir ürün alıp almak istemediğini sorunuz.
 * 6. Eğer devam etmek istiyorsa yeniden ürün seçme kısmına yönlendiriniz.
 * 7. Eğer bitirmek istiyorsa ödemeyi kontrol edip para ustu hesaplayarak  programı bitirinzi.
 */

        /* Basarili Market alış-veriş programı.
 *
 * 1. Adım: Ürünler ve fiyatları içeren listeleri oluşturunuz.
 *        No        Ürün         Fiyat
          ====     =======      =========
          00  Domates           2.10 TL
          01  Patates           3.20 TL
          02  Biber             1.50 TL
          03  Soğan             2.30 TL
          04  Havuç             3.10 TL
          05  Elma              1.20 TL
          06  Muz               1.90 TL
          07  Çilek             6.10 TL
          08  Kavun             4.30 TL
          09  Üzüm              2.70 TL
          10  Limon             0.50 TL

 * 2. Adım: Kullanıcının ürün nosuna göre listeden ürün seçmesini isteyiniz.
 * 3. Adım: Kaç kg satın almak istediğini sorunuz.
 * 4. Adım: Alınacak bu ürünü sepete ekleyiniz ve Sepeti yazdırınız.
 * 5. Başka bir ürün alıp almak istemediğini sorunuz.
 * 6. Eğer devam etmek istiyorsa yeniden ürün seçme kısmına yönlendiriniz.
 * 7. Eğer bitirmek istiyorsa ödemeyi kontrol edip para ustu hesaplayarak  programı bitirinzi.
 */

        // Ürün ve fiyat bilgileri tablosu   ***printf***
        String[] urunlertbl = {"Domates", "Patates", "Biber", "Soğan", "Havuç", "Elma", "Muz", "Çilek", "Kavun", "Üzüm", "Limon"};
        double[] fiyatlartbl = {2.10, 3.20, 1.50, 2.30, 3.10, 1.20, 1.90, 6.10, 4.30, 2.70, 0.50};

        // Başlıkları yazdır
        System.out.printf("%-10s %-13s %-10s%n", "No", "Ürün", "Fiyat");
        System.out.println("====     =======      =========");

        // Ürün ve fiyatları döngüyle tablo formatında yazdır
        for (int i = 0; i < urunlertbl.length; i++) {
            System.out.printf("%02d       %-10s     %.2f TL%n", i, urunlertbl[i], fiyatlartbl[i]);
        }


        List<String> urunler = new ArrayList<>();
        urunler.add("Domates");
        urunler.add("Patates");
        urunler.add("Biber");
        urunler.add("Soğan");
        urunler.add("Havuç");
        urunler.add("Elma");
        urunler.add("Muz");
        urunler.add("Çilek");
        urunler.add("Kavun");
        urunler.add("Üzüm");
        urunler.add("Limon");

        List<Double> fiyatlar = new ArrayList<>();
        fiyatlar.add(2.10);
        fiyatlar.add(3.20);
        fiyatlar.add(1.50);
        fiyatlar.add(2.30);
        fiyatlar.add(3.10);
        fiyatlar.add(1.20);
        fiyatlar.add(1.90);
        fiyatlar.add(6.10);
        fiyatlar.add(4.30);
        fiyatlar.add(2.70);
        fiyatlar.add(0.50);


        Scanner input = new Scanner(System.in);
        double toplamBorc = 0;
        boolean devam;

        do {
            System.out.println("Seçmek istediğiniz ürünün numarasını giriniz. (0-" + (urunler.size() - 1) + ")");
            int alinacakUrun = input.nextInt();

            String alinacakUrunAdi = urunler.get(alinacakUrun);
            Double alinacakUrunFiyat = fiyatlar.get(alinacakUrun);
            System.out.println("Seçtiğiniz ürün: " + alinacakUrunAdi);

            System.out.println(urunler.get(alinacakUrun) + " den Kaç kilo almak istersiniz?");
            int alinacakKilo = input.nextInt();

            double urunTutari = alinacakUrunFiyat * alinacakKilo;
            toplamBorc += urunTutari;
            System.out.println("Bu ürün için ödeyeceğiniz tutar: " + urunTutari + " TL");

            System.out.println("Baska ürün almak ister misiniz? Evet/Hayır");
            String alisverisDevamMi = input.next();

            devam = alisverisDevamMi.equalsIgnoreCase("Evet");
        } while (devam);


        // Alışverişin sonu, toplam borç gösteriliyor
        System.out.printf("Alışverişinizin toplam borcu: %.2f TL%n", toplamBorc);

        // Ödeme kısmı
        System.out.println("Ne kadar ödeme yapmak istersiniz?");
        double odeme = input.nextDouble();

        if (odeme >= toplamBorc) {
            double paraUstu = odeme - toplamBorc;
            System.out.printf("Ödemeniz alındı. Para üstü: %.2f TL%n", paraUstu);
        } else {
            double eksikMiktar = toplamBorc - odeme;
            System.out.printf("Yetersiz ödeme. Eksik tutar: %.2f TL%n", eksikMiktar);
        }



    }

}
