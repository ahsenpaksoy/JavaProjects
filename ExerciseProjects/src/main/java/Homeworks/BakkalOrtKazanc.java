package Homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BakkalOrtKazanc
{
    /* TASK :
     * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
     * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
     *
     * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
     * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
     * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
     * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
     * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
     *         for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     *         ortalama kazançtan yüksekse o günleri return yap.
     * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
     *         for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     *         ortalama kazançtan aşağıysa o günleri return yap.
     * */


    public static double getOrtalamaKazanc(ArrayList<Double> dailyearn)
    {
        double sum =0 ;
        for(double w: dailyearn)
        {
            sum=sum+w;
        }
        return  sum / dailyearn.size();
    }
    public static String getOrtalamaninUstundeKazancGünleri(ArrayList<Double> dailyEarn, ArrayList<String> dayName)
    {
        StringBuilder ortGoreGunler = new StringBuilder();
        for (int i = 0; i < dayName.size(); i++)
        {
            if (dailyEarn.get(i)>getOrtalamaKazanc(dailyEarn))
            {
                ortGoreGunler.append(dayName.get(i)).append(", ");
            }
        }
        if (ortGoreGunler.length() > 0) {
            ortGoreGunler.setLength(ortGoreGunler.length() - 2); // Son eklenen ", " karakterlerini kaldırır
        }
        return ortGoreGunler.toString();
    }

    public static String getOrtalamaninAltindaKazancGünleri(ArrayList<Double> dailyEarn, ArrayList<String> dayName)
    {
        StringBuilder ortGoreGunler = new StringBuilder();
        for (int i = 0; i < dayName.size(); i++)
        {
            if (dailyEarn.get(i)<getOrtalamaKazanc(dailyEarn))
            {
                ortGoreGunler.append(dayName.get(i)).append(", ");

            }
        }
        if (ortGoreGunler.length() > 0) {
            ortGoreGunler.setLength(ortGoreGunler.length() - 2); // Son eklenen ", " karakterlerini kaldırır
        }

        return ortGoreGunler.toString();
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        ArrayList<String> dayNames = new ArrayList<>(Arrays.asList("Pazartesi", "Sali", "Carsamba","Persembe", "Cuma", "Cumartesi", "Pazar"));
        ArrayList<Double> dailyEarn = new ArrayList<>();

        System.out.println("Haftanin hergunu icin kazancinizi tek tek giriniz.");

        int i=0;
        while(i<7)
        {
            System.out.println(dayNames.get(i)+" kazanci:");
            double earn = scan.nextDouble();
            dailyEarn.add(earn);
            i++;
        }
        // System.out.println(dayNames); //Kontrol için
        // System.out.println(dailyEarn);

        System.out.println("Ortalama kazanc: "+ getOrtalamaKazanc(dailyEarn));
        System.out.println("OrtalamaninUstundeKazancGünleri: "+getOrtalamaninUstundeKazancGünleri(dailyEarn, dayNames));
        System.out.println("OrtalamaninAltindaKazancGünleri: "+getOrtalamaninAltindaKazancGünleri(dailyEarn, dayNames));
    }
}
