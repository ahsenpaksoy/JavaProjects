package HomeworkProjects;

import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {

        String hangiKahve;
        String sut;
        String seker;
        String sekerSayisi;
        String boyut;
        boolean gecerliSekerSayisi;
        boolean gecerliBoyut;
        boolean gecerliKahve;
        boolean gecerliSut;
        boolean gecerliSeker;


        Scanner input = new Scanner(System.in);

//------------

        do {
            System.out.println("Hangi kahveyi istersiniz? \n1.Türk Kahvesi \n2.Filtre Kahve \n3.Espresso");
            hangiKahve = input.nextLine();

            // Kahve seçiminin geçerli olup olmadığını kontrol et
            gecerliKahve = hangiKahve.equalsIgnoreCase("Türk Kahvesi") ||
                    hangiKahve.equalsIgnoreCase("Filtre Kahve") ||
                    hangiKahve.equalsIgnoreCase("Espresso");

            if (!gecerliKahve) {
                System.out.println("Hatalı tuşlama yaptınız. Lütfen geçerli bir kahve seçiniz.");
            }
        } while (!gecerliKahve);  // Eğer geçerli bir kahve seçilmemişse döngü devam eder

// Geçerli bir kahve seçildiğinde kahve hazırlanır
        System.out.println(hangiKahve.substring(0, 1).toUpperCase() + hangiKahve.substring(1).toLowerCase() + " hazırlanıyor...");
        System.out.println();

//------------
        System.out.println("Süt eklemek ister misiniz? (Evet veya Hayır olarak cevaplayınız.)");
        do {
            sut = input.next();
            gecerliSut = sut.equalsIgnoreCase("evet") || sut.equalsIgnoreCase("hayır");
            if (!gecerliSut) {
                System.out.println("Hatalı tuşlama yaptınız. Evet veya Hayır olarak cevaplayınız.");
            } else if (sut.equalsIgnoreCase("evet")) {
                System.out.println("Süt ekleniyor...");
            } else {
                System.out.println("Süt eklenmiyor.");
            }
        } while (!gecerliSut);
        System.out.println();

//----------

        do {
            System.out.println("Şeker eklemek ister misiniz? (Evet veya Hayır olarak cevaplayınız)");
            seker = input.next(); // Kullanıcıdan şeker isteyip istemediği bilgisi alınır

            gecerliSeker = seker.equalsIgnoreCase("evet") || seker.equalsIgnoreCase("hayır");
            if (!gecerliSeker) {
                System.out.println("Hatalı tuşlama yaptınız. (Evet veya Hayır olarak cevaplayınız.)");
            } else if (seker.equalsIgnoreCase("evet")) {
                System.out.println("Kaç adet şeker eklemek istersiniz?");

                // Şeker sayısı geçerli olana kadar döngü devam eder
                do {
                    sekerSayisi = input.next();

                    // Eğer kullanıcı sadece rakam girdi ise, kontrol devam eder
                    if (sekerSayisi.replaceAll("[^0-9]", "").length() == sekerSayisi.length()) {
                        Integer sekerSayisi1 = Integer.valueOf(sekerSayisi);
                        gecerliSekerSayisi = sekerSayisi1 >= 1 && sekerSayisi1 <= 10;

                        if (!gecerliSekerSayisi) {
                            System.out.println("Lütfen 1-10 arası şeker seçin!");
                        } else {
                            System.out.println(sekerSayisi1 + " şeker ekleniyor...");
                        }
                    } else {
                        System.out.println("Geçersiz giriş! Lütfen sadece rakam giriniz.");
                        gecerliSekerSayisi = false; // Yanlış giriş yapıldığında döngü tekrar eder
                    }
                } while (!gecerliSekerSayisi);
            } else {
                System.out.println("Şeker eklenmiyor.");
            }
        } while (!gecerliSeker);


        System.out.println();
//-----------------

        String dummy = input.nextLine();
//-----------------

        System.out.println("Kahvenizi hangi boyutta istersiniz? (Büyük boy-orta boy-küçük boy olarak giriniz.");

        do {
            boyut = input.nextLine();
            gecerliBoyut = boyut.equalsIgnoreCase("büyük boy") ||
                    boyut.equalsIgnoreCase("orta boy") ||
                    boyut.equalsIgnoreCase("küçük boy");
            if (!gecerliBoyut) {
                System.out.println("Geçersiz boyut. Lütfen büyük boy, orta boy, küçük boy şeklinde giriniz.");
            }
        }
        while (!gecerliBoyut);
        System.out.println();
        System.out.println("Kahveniz, " + hangiKahve.toUpperCase() + ", " + boyut.toUpperCase() + " olarak hazırlanıyor...");
        System.out.println("Afiyet olsun.☕");


    }
}