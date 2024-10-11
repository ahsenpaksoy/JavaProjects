package Homeworks;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class UserName {

    public static Scanner scan = new Scanner(System.in);
    public static Random rand = new Random();

    //Kullanici adlarını saklayacağımız liste
    public  static ArrayList<String> userNamesList = new ArrayList<>();


    //Kullanicidan isim alan, bosluklarini silen ve tüm harfleri küçülten method
    public static String userNameSpaceClearAndLower()
    {
        System.out.println("Kullanici adi belirleyiniz");
        return scan.nextLine().replaceAll(" ","").toLowerCase();
    }

    //Kullanici adi var mı kontrol eden method
    public static boolean isUserNameCntrl(String userName)
    {
        return userNamesList.contains(userName);
    }

    //Kullanici adina random sayi ekleyen method
    public  static String randomNumAdd(String userName)
    {
        int randomNum = rand.nextInt(1000);
        return userName+randomNum;
    }


    public static void main(String[] args) {

        /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
         *  1. Kullanicidan ismini isteyelim
         *  2. Kullanici adindaki bosluklari silelim.
         *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
         *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
         *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.

         */


        userNamesList.add("neslikara");
        userNamesList.add("neslikara12");
        userNamesList.add("neslikara34");
        String userName = userNameSpaceClearAndLower();  //kullanicidan isim al boşlukları sil, harfleri küçült ve getir
        if (isUserNameCntrl(userName))  // kullanici adi varsa random sayi ekle
        {
            String uniqueUserName = randomNumAdd(userName);
            userNamesList.add(uniqueUserName);
            System.out.println("Seçtiğiniz kullanici adi daha önce seçilmiş\nYeni kullanici adiniz "+uniqueUserName);
        }else
        {
            userNamesList.add(userName);
            System.out.println("Kullanici adiniz: "+userName);
        }

        // System.out.println(userNamesList); // Kontrol için





    }
}
