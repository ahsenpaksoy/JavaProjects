package homework_projects;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class TasKagitMakas
{
    /* TASK:
        tas >makas
        makas >kagit
        kagit >tas

    Oncelikle kullanicidan secim alabilmek icin Scanner yapiyoruz.
    Ardindan main fonksiyonumuzda kullanicinin ve bilgisayarin puanlarini tanimliyoruz.
    While dongumuzun icerisinde kullanicidan aldigimiz secimi "secim" isimli degiskene atiyoruz.
    Bilgisayarin secimini ise Math.random methodunu kullanarak aliyoruz.
    Math.random()*3 diyerek bilgisayara 0 ile 3 arasinda bir rastgele sayi urettiriyoruz.
    Ve secimimiz ile bilgisayarin secimini karsilastirip sonuclarini yaziyoruz.
    En sonda da kullaniciya oyuna devam etmek isteyip istemedigini soruyoruz, eger istiyorsa
    dongumuz en bastan calisiyor, istemiyorsa da cikis yapiyor.

    */
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        ArrayList<String> arr = new ArrayList<>();
        arr.add("kagit");
        arr.add("makas");
        arr.add("tas");


        System.out.println(arr);
        int randomSayi;
        int hedef = 0;
        boolean control = false;

        // Hedef puan girişi için try-catch ekledik
        while (!control) {
            try {
                System.out.println("OYUNU BITIRMEK ICIN BIR HEDEF BELIRLEYINIZ.");
                hedef = scan.nextInt();  // Kullanıcının hedef girişi
                if (hedef <= 0) {
                    System.out.println("Lütfen pozitif bir sayı girin.");
                } else {
                    control = true;  // Geçerli bir giriş olduğunda döngüyü sonlandır
                }
            } catch (Exception e) {
                System.out.println("Geçersiz giriş! Lütfen pozitif bir sayı girin.");
                scan.next();  // Hatalı girişi temizlemek için
            }
        }

        int kullanici = 0;                                         //Kazandıkca sayaçlar artacak
        int bilgisayar = 0;
        while (true)
        {
            randomSayi = (int)(Math.random()*3 )+1 ;
            int secim = 0;
            boolean control2 = false;
            // Kullanıcıdan seçim alırken try-catch ekledik
            control2 = false;
            while (!control2) {
                try {
                    System.out.println("\n   kagıt  -> 1\n   makas  -> 2\n   tas    -> 3\nSeçiminizi yapın:");
                    secim = scan.nextInt();
                    if (secim < 1 || secim > 3) {
                        System.out.println("Geçersiz giriş. Lütfen 1, 2 veya 3 arasında bir seçim yapın.");
                    } else {
                        control2 = true;  // Geçerli bir giriş olduğunda döngüyü sonlandır
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Geçersiz giriş! Lütfen bir sayı girin.");
                    scan.next();  // Hatalı girişi temizlemek için
                }
            }

            if (secim == randomSayi) {
                System.out.println("SIZ: " + arr.get(secim - 1) + " - BİLGİSAYAR: " + arr.get(randomSayi - 1));
                System.out.println("Berabere");
            } else if ((secim == 1 && randomSayi == 3) || (secim == 2 && randomSayi == 1) || (secim == 3 && randomSayi == 2)) {
                System.out.println("SIZ: " + arr.get(secim - 1) + " - BİLGİSAYAR: " + arr.get(randomSayi - 1));
                System.out.println("1 puan aldınız");
                kullanici++;
            } else {
                System.out.println("SIZ: " + arr.get(secim - 1) + " - BİLGİSAYAR: " + arr.get(randomSayi - 1));
                System.out.println("Bilgisayar 1 puan aldı");
                bilgisayar++;
            }


            System.out.println("SİZ: " + kullanici + " - BİLGİSAYAR: " + bilgisayar);
            if (kullanici == hedef) {
                System.out.println("*** KAZANDINIZ ***");
            } else if (bilgisayar == hedef) {
                System.out.println("KAYBETTİNİZ");
            }

        }

    }
}