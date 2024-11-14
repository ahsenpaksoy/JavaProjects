package mini_projects.CoffeeMachineApp;

import java.util.Scanner;
import java.util.Set;

public class KahveSecimi {

    Kahve kahve = new Kahve();
    Scanner scan = new Scanner(System.in);

    public void selectCoffee(){
        System.out.println();
        System.out.println("------------ COFFEE MACHINE READY TO ORDER --------------");
        System.out.println();

        do{
            System.out.println("Hangi kahveyi istersiniz? \n1.Türk Kahvesi \n2.Filtre Kahve \n3.Espresso");
            System.out.println("Seciminizi Yapin (1,2,3):");

            kahve.hangiKahve = scan.next().substring(0,1);
            if(kahve.hangiKahve.equals("1") ||kahve.hangiKahve.equals("2")|| kahve.hangiKahve.equals("3"))
                {
                    switch(kahve.hangiKahve.toString()) {
                        case "1" :{kahve.hangiKahve = "Türk kahvesi ";
                        break;}
                        case "2" :{kahve.hangiKahve = "Filtre kahvesi ";
                            break;}
                        case "3" :{kahve.hangiKahve = "Espresso kahvesi ";
                            break;}
                }

                    break;
                }

            else {
                    System.out.println("Seciminiz 1, 2 veya 3 olmalı...");
                }
            }
            while(true);

                System.out.println(kahve.hangiKahve.toString() + " hazirlaniyor...");
                System.out.println();
                isMilk(kahve);
                isSugar(kahve);
                selectBoyut(kahve);
                printInfo(kahve);

    }

    public void printInfo(Kahve kahve){
        switch (kahve.boyut){
            case "0":
                kahve.boyut ="Küçük boy ";
                break;
            case "1":
                kahve.boyut ="Orta boy ";
                break;
            case "2":
                kahve.boyut ="Büyük boy ";
                break;
        }
        System.out.println();
        System.out.println( kahve.boyut + " "+kahve.hangiKahve + " hazirdir. Afiyet olsun...");
    }

    public void isMilk(Kahve kahve){
        do {
            System.out.println("Süt eklemek ister misiniz? (Evet icin 1 veya Hayır 0 giriniz)");
            kahve.sut = scan.next();
            if (kahve.sut.equals("1")){
                System.out.println("Sut eklendi...");
                break;
            } else if (kahve.sut.equals("0")) {
                System.out.println("Sut eklenmedi...");
                break;
            }else {
                System.out.println("Hatali tuslama yaptiniz.0 veya 1 olarak cevaplayiniz.");
            }
        }while (true);
        System.out.println();
    }

    public void isSugar(Kahve kahve){
        Set<String> validValues = Set.of("0","1", "2", "3","4","5");
        do {
            System.out.println("Şeker eklemek ister misiniz? (0 ile 5 arası bir sayı giriniz, 0: şekersizi belirtir");
            kahve.kacSeker = scan.next();
            if(validValues.contains(kahve.kacSeker)) {
                break;
            }

            }
        while(true);
        System.out.println();
    }

    public void selectBoyut(Kahve kahve){
        Set<String> validValues = Set.of("0","1", "2");
        scan.nextLine();
        do {
            System.out.println("Kahvenizi hangi boyutta istersiniz? (küçük boy:0, orta boy:1 , Büyük boy:2 olarak giriniz.");

            kahve.boyut = scan.nextLine();

            if(validValues.contains(kahve.boyut)) {
                break;
            }


        }while (true);
    }




}












