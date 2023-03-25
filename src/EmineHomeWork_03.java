

import java.util.Scanner;

public class EmineHomeWork_03 {
    public static void main(String[] args) {

     /*  Scanner scan=new Scanner(System.in);
        for(int i=0;i<=20;i++){
            System.out.println("Merhaba Dünya");
        }*/

        //System.out.println("----------------------");
     /*  Scanner scan=new Scanner(System.in);
       for(int i=0; i<=100 ;i++){
           System.out.println(i+" ");
       }*/
       /* Scanner scan=new Scanner(System.in);
        for(int i=15; i<=100; i++){
            System.out.print(i+" ");
        }*/

        //Örnek: 0 dan 100 e kadar olan sayıları tersten ekrana yazdırın. (99
        //98 97 vs)
        //Ders 13


       /* Scanner scan=new Scanner(System.in);
        for(int i=100; i>=0; i--){
            System.out.print(i+" ");
        }*/

        // Örnek: 0 dan 100 e kadar olan çift sayıları ekrana yazdırın.

        /* for(int i=0; i<=100; i++){
             if(i%2==0){
                 System.out.print(i+" ");
             }

         }*/
        //Örnek: 0 dan 100 e kadar olan tek sayıları ekrana yazdırın
        /*for(int i=0; i<=100; i++){
            if(i%2==1){
                System.out.print(i+" ");
            }

      }*/
        //Örnek: 10 ile 1000 arasında olan 10 a tam bölünebilen tüm sayıları

           /*   for(int i=10; i<=1000; i++){
                  if(i%10==0){
                      System.out.print(i+" ");
                  }
              }*/
    /*    // Örnek: 6 faktöriyel’in sonucu nedir? (6!=6*5*4*3*2*1)


        int faktoriyel =1;
        for (int i = 1; i <= 6; i++) {
            faktoriyel *= i;
            System.out.println( "6! = " + faktoriyel);
        } */


       /* Örnek: 0 ile 20 arasındaki tüm sayılarının küpleri alarak ekrana
        yazdırın.
        0 0
        1 1
        2 8
        3 27
        4 vs
        Ders 13  */

      /*  for(int i=0; i<=20; i++){
            System.out.println(i+" ------> "+i*i*i);
        }*/

        //Örnek: 23 derece ile 50 derece arasında olan tüm Fahrenheit
        //değerlerini ekrana yazdırın. (C=(F-32) / 1.8)
        //Ders 13

          /*for(int i=23; i<=50; i++){
              System.out.println(i+" C ="+(i*1.8+32)+" F ");
          }*/

      /*  Örnek: Kullanıcıdan bir kelime alın ve kaç defa yazdırmak istediğini
        sorun . Kullanıcıdan aldığınız kelimeyi kullanıcının istediği kadar
        ekrana yazdırın.
        Ders 13*/

          /* Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir gezegen ismi giriniz");
        String planetName= scan.nextLine();
        System.out.println("Gezegen isminizin kac defa tekrarlanmasını istersiniz");
        int again= scan.nextInt();

              for(int i=1; i<=again; i++){
                  System.out.println(planetName);
              }*/
      /*  Örnek: Kullanıcıdan 0 ile 1000 arasında bir sayı isteyin. Kullanıcın
        girdiği sayı dahil . 0 dan başlayarak kullanıcının girdiği sayıya kadar
        olan tamsayıların toplamını ekrana yazdıran programı yazınız
            Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 0 ile 1000 arasında bir sayı giriniz");
        int sayi= scan.nextInt();


          int tamSayiToplami=0;

        for(int i=1; i<=sayi; i++){
           tamSayiToplami+=i;
            System.out.println("tamsayiToplami = +"+tamSayiToplami);

        } */

      /*   Scanner scan=new Scanner(System.in);
         System.out.println("Lütfen 0 ile 1000 arasında bir sayı giriniz");
              int sayi= scan.nextInt();
              int toplamcift=0;
              int toplamtek=0;

              for(int i=0; i<=sayi; i++){

                  if(i%2==0){
                      toplamcift+=i;
                      System.out.println("çift sayıların toplamı = "+toplamcift);
                  }else if(i%2==1){
                      toplamtek+=i;
                      System.out.println("tek sayıların toplamı = "+toplamtek);
                  }
        } */

      /*  örnek: Kullanıcıdan taban ve kuvvet bilgilerini alarak ekrana sonucu
        yazdıran programı yazdırınız.(2 üzeri 4 =16)
        Ders 13*/

       /* Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir taban  sayısı giriniz");
        double taban = scan.nextDouble();

        System.out.println("Lütfen bir kuvvet  sayısı giriniz");
        double kuvvet = scan.nextDouble();

        double sonuc;
        sonuc = Math.pow(taban, kuvvet);
        System.out.println(taban + " üzeri " + kuvvet + " = " + sonuc); */


        //Örnek: a dan z ye kadar olan harfleri ekrana yazdırın.
        //Ders 13

       /* for(char ch='a'; ch<='z'; ch++){
            System.out.print(ch+" ");
        }*/

        //Örnek: 9 sayısının çarpım tablosunu yazdırınız.
        //9 * 1 = 9
        //9 * 2 = 18
        //9 * 3 = 27
        //Ders 13

        /* for(int i=1 ; i<=10 ; i++){
             System.out.println("9 * " +i+" = " +9*i);
         } */
        //Örnek: Şifre tanımlayın ve kullanıcıya ekrandan 3 defa şifreyi
        //girmesini isteyin şifreyi bulursa «tebrikler şifre doğru» bulamaz ise
        //şifre yanlış ikazı versin.
        //Ders 13

       /* Scanner scan =new Scanner(System.in);
        String sifre="Melik";
        String tahmin="";

        System.out.println("Lütfen şifrenizi giriniz ( 3 defa hatalı girdiginiz taktirde kartınız bloke olacaktır)  :");

           for(int i=1; i<=3; i++){
               tahmin=scan.nextLine();
               if(tahmin.equals(sifre)){
                   System.out.println("Tebrikler. Sifreniz onaylandı...");

               }else{
                   System.out.println("Hatalı şifre girdiniz");
               }
           }*/

            /*Konsoldan sayı alarak bir sayı tahmin programı
               yazın. Nested if yapısı kullanın. Tahmin sayıdan
               küçük ama yakınsa(sayının yarı değerinden daha yakın) veya
               çok küçükse uygun bir mesaj versin. Tahmin sayıdan
               büyük, ancak yakın veya uzak ise buna uygun
               mesajlar versin. Elbette isabetli tahmin de bir tebrik
               mesajı yazdırın.(ev ödevi)*/

      /*  Scanner sscan = new Scanner(System.in);
        System.out.println("Lütfen 1 ile 10 arasında bir sayı tahmininde bulununuz");
        int tahmin = sscan.nextInt();
        int tutulan = 8;

        if (tahmin == tutulan) {
            System.out.println("Tebrikler bildiniz");
        }
        if (tahmin < tutulan) {
            if ((tutulan / 2) < tahmin) {
                System.out.println("Çok yaklastınız fakat tahmin kucuk, tekrar deneyiniz.");
            } else if (tahmin < (tutulan / 2)) {
                System.out.println("Üzgünüz tahmininiz daha da uzak bir ihtimaldir");
            } else if (tahmin > tutulan) {
                if ((tutulan * 2) < tahmin) {
                    System.out.println("Üzgünüz, tahmininiz cok buyuktur");
                } else if ((tutulan * 2) > tahmin) {
                    System.out.println("Çok yaklastınız fakat tahmin buyuk, tekrar deneyiniz.");
                }
            }


        }*/
     /*   Scanner scan=new Scanner(System.in);
        System.out.println("Otelimize Hosgeldiniz.Kacincı kata çıkmak istersiniz(1-2-3)");
        int kat=scan.nextInt();
        switch (kat){
            case 1:
                System.out.println("1. Kat: Resepsiyon-Güvenlik-Oda Hizmetleri");
                int kat1=scan.nextInt();
                switch (kat1){
                    case 1:
                        System.out.println("Resepsiyon:Tüm işleriniz icin bekleriz");
                        break;
                    case 2:
                        System.out.println("Güvenlik:Profesyonel bir hizmettir");
                        break;
                    case 3:
                        System.out.println("Oda Hizmetleri:temizlik ve tasima hizmetleri icin 101 dahili hattan ulasabilirsiniz");
                        break;
                    default:
                        System.out.println("Hatalı bir numara tuşladınız");

                }break;
            case 2:
                System.out.println("2.Kat: Yemekhane-Dinlenme Salonu-Room1-Room2\n\rLütfen bir oda seçiniz");
                int kat2=scan.nextInt();
                switch (kat2){
                    case 1:
                        System.out.println("Yemekhane : Kahvaltı 08-11\n\t Ögle yemegi 12-15\n\tAksam Yemegi 12-21");
                        break;
                    case 2:
                        System.out.println("Dinlenme salonu : 24 saatçay servisi ile hizmetinizdedir");
                        break;
                    case 3:
                        System.out.println("Ekonomik oda");
                        break;
                    case 4:
                        System.out.println("Ekonomik oda");
                        break;
                    default:
                        System.out.println("Hatalı bir numara tuşladınız");

                }break;
            case 3:
                System.out.println("3.Kat: Room3-Room4-Room5-Room6");
                int kat3 = scan.nextInt();
                switch (kat3){
                    case 1:
                        System.out.println("Room3 : Standart oda");
                        break;
                    case 2:
                        System.out.println("Room4 : Standart oda");
                        break;
                    case 3:
                        System.out.println("Room5 : Özel oda");
                        break;
                    case 4:
                        System.out.println("Romm6 : Özel oda");
                        break;
                    default:
                        System.out.println("Hatalı bir numara tuşladınız");

                }break;
            default:
                System.out.println("Hatalı bir numara tuşladınız");

        } */



      /*for(int i=0;i<=20;i++){
            System.out.println("Merhaba Dünya");                         FOR
        }*/

      /*     int i=0;
         while(i<=20){                                                   WHİLE
             System.out.println("Merhaba Dünya");
             i++;
         }  */
            /*  int i=0;
              do{                                                      // DO WHİLE
                  System.out.println("Merhaba Dünya");
                  i++;
              }while(i<=19); */


         /*  Scanner scan=new Scanner(System.in);
       for(int i=0; i<=100 ;i++){                                                FOR
           System.out.println(i+" ");
       }*/

        /*  int i=0;
          while(i<=100){
            System.out.println(i+" ");                                           WHİLE
            i++;
        } */

          /* int i=0;
           do{                                                                // DO WHİLE

               System.out.println(i+" ");
               i++;
           }while(i<=100);
           */
     //   System.out.println("----------------------------------------------------------------------------------------");
        /* Scanner scan=new Scanner(System.in);
             for(int i=15; i<=100; i++){                                 FOR
              System.out.print(i+" ");
             }*/
       /* int i=15;
        while(i<=100){                                                   WHİLE
            System.out.print(i+" ");
            i++;
        }*/


      /*  int i=15;
        do{                                                           // DO WHİLE
            System.out.println(i+" ");
            i++;
        }while(i<=100);*/
       // System.out.println("--------------------------------------------------------------------------------------");

         /* Scanner scan=new Scanner(System.in);
        for(int i=100; i>=0; i--){                                               FOR

            System.out.print(i+" ");
        }*/

      /*  int i=100;
        while(i>=0){
            System.out.print(i+" ");                                             WHİLE
            i--;
        } */

        /*int i=100;
        do{
            System.out.print(i+" ");                                          //DO WHİLE
            i--;
        }while(i>=0);*/
        //System.out.println("----------------------------------------------------------------------------------------");

           /* for(int i=0; i<=100; i++){                                        FOR
                   if(i%2==0){
                      System.out.print(i+" ");
                }  */

        /* int i=0;
         while(i<=100) {
             if (i % 2 == 0) {                                                  WHİLE
                 System.out.print(i+" ");
             }
            i++;
         }    */


         /* int i=0;
          do{                                                                //  DO WHİLE
              System.out.print(i+" ");
              i++;
          }while(i<=100);*/



       /*Örnek: 0 dan 100 e kadar olan tek sayıları ekrana yazdırın
        for(int i=0; i<=100; i++){
            if(i%2==1){                                                            FOR
                System.out.print(i+" ");
            }
      } */

        /*  int i=0;
          while(i<=100){
              if(i%2==1){
                  System.out.print(i+" ");                                        WHİLE
              }
              i++;
          }*/



     /*      int i=1;
           do{                                                                    //DO WHİLE
               System.out.print(i+" ");
               i+=2;
           }while(i<=100);
        System.out.println("---------------------------------------------------------------------------------------");*/

        //Örnek: 10 ile 1000 arasında olan 10 a tam bölünebilen tüm sayıları

           /*   for(int i=10; i<=1000; i++){
                  if(i%10==0){                                                    FOR
                      System.out.print(i+" ");
                  }
              }*/

        /* int i=10;                                                                WHİLE
         while(i<=1000){
             if(i%10==0) {
                 System.out.print(i + " ");
             }
             i++;
         }*/


      /*  int i=10;
        do{
            System.out.print(i+" ");                                            // DO WHİLE
            i+=10;
        }while(i<=1000);  */
        System.out.println("------------------------------------------------------------------------------------");


        // Örnek: 8  faktöriyel’in sonucu nedir? (8!=8*7*6*5*4*3*2*1)


      /*  int faktoriyel =1;
        for (int i = 1; i <= 8; i++) {                                             FOR
            faktoriyel *= i;
            System.out.print( "8! = " + faktoriyel);
        }  */


        /* int i=1 ,  faktoriyel=1;
         while(i<=8){
                                                                                  WHİLE
             faktoriyel*=i;
             System.out.println("8! = "+faktoriyel);
             i++;
         } */
       /* int i=1 , faktoriyel=1;
        do{                                                                      // DO WHİLE
            System.out.println("8! = "+faktoriyel);
            faktoriyel*=i; i++;
        }while(i<=8);  */
        System.out.println("-----------------------------------------------------------------------------");


      /*  Örnek: 0 ile 20 arasındaki 3 ün katı tüm sayılarının küpleri alarak ekrana
        yazdırın.
        0 0
        3 1
        6 8
        9 27
        12 vs
         */

      /*  for(int i=0; i<=20; i++){                                            FOR
            System.out.println(i+" ------> "+i*i*i);
        }*/


      /*  int i=0;
        while (i <= 20) {                                                     WHİLE
            System.out.println(i+" = "+i*i*i);
            i++;
        }*/

       /*   int i=0;
          do{                                                             //DO WHİLE
              System.out.println(i+" = "+i*i*i);
              i++;
          }while(i<=20);*/
        System.out.println("------------------------------------------------------------------");

        //Örnek: 23 derece ile 50 derece arasında olan tüm Fahrenheit
        //değerlerini ekrana yazdırın. (C=(F-32) / 1.8)
        //Ders 13

          /*for(int i=23; i<=50; i++){
              System.out.println(i+" C ="+(i*1.8+32)+" F ");                              FOR
          }*/

        /*  int i=23;
           while(i<=50){
               System.out.println(i+" C ="+(i*1.8+32)+" F ");                              WHİLE
            i++;
        }*/

         /*   int i=23;
            do{
                System.out.println(i+" C ="+(i*1.8+32)+" F ");                          //DO WHİLE
                i++;
            }while(i<=50); */
        System.out.println("-----------------------------------------------------------------------------");

 /*  Örnek: Kullanıcıdan bir kelime alın ve kaç defa yazdırmak istediğini
        sorun . Kullanıcıdan aldığınız kelimeyi kullanıcının istediği kadar
        ekrana yazdırın.

          Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir gezegen ismi giriniz");
        String planetName= scan.nextLine();
        System.out.println("Gezegen isminizin kac defa tekrarlanmasını istersiniz");
        int again= scan.nextInt();

             /* for(int i=1; i<=again; i++){
                  System.out.println(planetName);                                                FOR
              }*/

              /*  int i=1;
                while(i<=again){                                                                 WHİLE
                    System.out.println(planetName);
                    i++;
                }*/

              /*     int i=1;
                   do {                                                                       //DO WHİLE
                       System.out.println(planetName);
                       i++;
                   }while (i<=again);  */

        System.out.println("---------------------------------------------------------------------------------");

 /*  Örnek: Kullanıcıdan 0 ile 1000 arasında bir sayı isteyin. Kullanıcın
        girdiği sayı dahil . 0 dan başlayarak kullanıcının girdiği sayıya kadar
        olan tamsayıların toplamını ekrana yazdıran programı yazınız*/

        /*    Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 0 ile 1000 arasında bir sayı giriniz");
        int sayi= scan.nextInt();*/

         // int tamSayiToplami=0;

       /* for(int i=1; i<=sayi; i++){                                                      FOR
           tamSayiToplami+=i;
            System.out.println("tamsayiToplami = +"+tamSayiToplami);
       } */

           /*int i=1 , tamSayiToplami=0;
           while(i<=sayi){                                                                WHİLE
               System.out.println("tamsayiToplami = +"+tamSayiToplami);
               i++;  tamSayiToplami+=i;
           }*/

          /* int i=1 , tamSayiToplami=0;
           do{
               System.out.println("tamsayiToplami = +"+tamSayiToplami);                 //DO WHİLE
               i++; tamSayiToplami+=i;
           }while(i<=sayi);  */

       // System.out.println("---------------------------------------------------------");

     /*   Scanner scan =new Scanner(System.in)
        int sayi1 =0;
        int sayi2 =0;
        int toplam=sayi1+sayi2;
              while(toplam!=25){
                  System.out.println("Lütfen tekrar 2 sayı giriniz");
                  sayi1=scan.nextInt();
                  sayi2=scan.nextInt();
                   toplam=sayi1+sayi2;
                  System.out.println("toplam = " + toplam);
              }  */





    }

}