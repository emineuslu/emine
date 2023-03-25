package eminework;

import com.sun.source.tree.NewArrayTree;

import java.util.Scanner;

public class EmineHomeWork_04 {
    public static void main(String[] args) {
      /* for(int i=1; i<=6; i++){
           for(int j=1; j<=6; j++){
               System.out.print("1");
           }
           System.out.println("1");
       }*/
       // System.out.println("------------------------------------");
     /*   for(int i=0; i<=6; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/
        // System.out.println("-------------------------------------------");

         /* for(int i=6; i<=6; i--){
              for(int j = 1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
          }*/

       /* for(int i=0; i<=6; i++){
            for(int j=0; j<=6; j++){
                System.out.println("1");        //(i)  koysak  1 12 123 1234 yatay yaza yaza ıner
                System.out.println("12");
                System.out.println("123");
                System.out.println(1234);
                System.out.println(12345);
                System.out.println(123456);
            }
            System.out.println();

        }
        System.out.println("--------------------------");

        for(int i=1; i<=6; i++){
            for(int j=;1 j<=;i j++){
                                                   //(i)  koysak  1 12 123 1234 yatay yaza yaza ıner

         }
           System.out.println(j);

        }


      /*  for(int i=6; 0<=i ; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

      //  System.out.println("-----------------------------");




       /* for(int i=1; i<=6; i++){
            for (int j=1; j<=i ; j++){

                System.out.print(i);      //yan yana yazsın dıye print()     eger burası 1 yerine i olursa 123456 yazar

            }
            System.out.println();           // alt alta olsun dıye println

        }
*/
      /*  for(int i=+1; i<=5; i++){
            for (int j=1; j<=i ; j++){

                System.out.print(j);      //yan yana yazsın dıye print()     eger burası 1 yerine i olursa 123456 yazar
                //System.out.print(i);
            }
            System.out.println();           // alt alta olsun dıye println

        }     ????????????    */


// ders 14 soru 6

       /* for (int i = 0,k=1; i <5 ; i++) {

            for (int j = 0; j <=i ; j++) {
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }*/


      //  System.out.println("---------------------------------");


     /*   for(int i=1; i<=-6; ++i) {

            for (int k = 0; k<=i; k++) {

                System.out.println();                  bu yontem olmadı bıraktım


                }for (int j = 0; j<=i; j++) {

                System.out.print(" *");
            }

        }
                 System.out.print("");*/


       /* Ders 14
        Örnek: Kullanıcıdan 0 ile 1000 arasında bir sayı isteyin. Kullanıcın
        girdiği sayı dahil . 0 dan başlayarak kullanıcının girdiği sayıya kadar
        tek ve çift tamsayıların toplamını ayrı ayrı ekrana yazdıran programı
        yazınız*/

      /*   Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen 0 ile 1000 arasında bir say giriniz");
         int sayi=scan.nextInt();
         int tekSayiToplami=0;
         int ciftSayiToplami=0;
         int i=0;
         while (i<=sayi) {
             if (i % 2 == 0) {
                 ciftSayiToplami += i;
             }
             i++;
         } System.out.println("ciftSayiToplami = " + ciftSayiToplami);

             System.out.println();

         int j=0;
         while(j<=sayi) {
             if (j % 2 != 0) {
                 tekSayiToplami += j;
             }
             j++;
         } System.out.println("tekSayiToplami = " + tekSayiToplami);

             System.out.println();*/



       /* Örnek: Kullanıcıdan taban ve kuvvet bilgilerini alarak ekrana sonucu
        yazdıran programı yazdırınız.(2 üzeri 4 =16) bu işlemleri sonuç 0
        olana kadar devam ettirin. Sonuç 0 ise programdan çıkış işlemi
        yaptırın*/

         Scanner scan=new Scanner(System.in);
        int taban=0;
        int kuvvet=0;
        int sonuc=1;
        System.out.println("lütfen bır taban sayısı gırınız ");
        taban=scan.nextInt();
        System.out.println("lütfen bır kuvvet degeri giriniz");
        kuvvet=scan.nextInt();
        sonuc=(int)Math.pow(taban,kuvvet);
        while(kuvvet>=0 && kuvvet<=10) {
                if (kuvvet == 0) {
                     System.out.println("sonuc = " + sonuc);
                     break;
              } else if (kuvvet == 1) {
                     System.out.println("sonuc = " + sonuc);
                     break;
              }else if(kuvvet==2){
                     System.out.println("sonuc = " + sonuc);
                     break;
              }else if(kuvvet==3){
                     System.out.println("sonuc = " + sonuc);
                     break;
              }else if(kuvvet==3) {
                    System.out.println("sonuc = " + sonuc);
                    break;
                }else if(kuvvet==4){
                    System.out.println("sonuc = " + sonuc);
                    break;
              }else if(kuvvet==5){
                    System.out.println("sonuc = " + sonuc);
                    break;
                }else if(kuvvet==6){
                    System.out.println("sonuc = " + sonuc);
                    break;
                }else if(kuvvet==7){
                    System.out.println("sonuc = " + sonuc);
                    break;
                }else if(kuvvet==8){
                    System.out.println("sonuc = " + sonuc);
                    break;
                }else if(kuvvet==9){
                    System.out.println("sonuc = " + sonuc);
                    break;
                }else if(kuvvet==10){
                    System.out.println("sonuc = " + sonuc);
                    break;
                }
        }


       /* Örnek: Şifre tanımlayın ve kullanıcıya ekrandan 5 defa şifreyi
        girmesini isteyin. Her bulamadığında şifre doğru değildir tekrar
        deneyin ikazı çıksın. Şifreyi bulursa «tebrikler şifre doğru» yazısı
        gösterildikten sonra programdan çıkış işlemi gerçekleşsin*/

        /* Scanner scan =new Scanner(System.in);
         String sifre="Melik";
         String tahmin="";
         int hak=5;
        System.out.println("Lütfen şifreyi giriniz. 5 defa deneme hakkınız vardır");

         while(1<=hak){
             tahmin=scan.nextLine();
             if(tahmin.equals(sifre)){
                 System.out.println("Tebrikler şifreyi bildiniz");
                 break;
             }else{
                 System.out.println("Şifre yanlış lütfen tekrar deneyiniz");
                 hak--;
             }
         }*/

       /* Örnek: Şifre tanımlayın ve kullanıcıya ekrandan 5 defa şifreyi
        girmesini isteyin. Şifreyi bulursa «tebrikler şifre doğru» yazısı
        gösterildikten sonra programdan çıkış işlemi gerçekleşsin.
        Her bulamadığında şifre doğru değildir ... hakkınız kalmıştır. Lütfen
        tekrar deneyin ikazı çıksın. Sonuncuda hakkınız kalmamıştır yazısı
        çıkarak programı sonlandırın.*/


     /*   Scanner scan =new Scanner(System.in);
        String sifre="Mina";
        String tahmin="";
        int hak=5;
        System.out.println("Lütfen şifreyi giriniz. 5 defa deneme hakkınız vardır");

        while(1<=hak){
            tahmin=scan.nextLine();
            if(tahmin.equals(sifre)) {
                System.out.println("Tebrikler şifreyi bildiniz");

            } else if(2<=hak){
                System.out.println("Şifre yanlış lütfen tekrar deneyiniz "+--hak+" hakkınız kaldı");
            } else{
            System.out.println("üzgünüz deneme hakkınız kalmadı");
            break;
            }}


           // while(0<hak){
             //   System.out.println("üzgünüz deneme hakkınız kalmadı");
               // break;}   */

       /* for(int i=1; i<=6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();

        }*/






















    }
}
