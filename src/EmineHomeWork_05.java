import java.util.Scanner;

public class EmineHomeWork_05 {
    public static void main(String[] args) {

      /*  Scanner scan = new Scanner(System.in);
        int bakiye = 2000;

        System.out.println("Bankamiza hosgeldiniz lutfen yapmak istediginiz  islemı tuslayınız.\n1-güncel bakiye\n2-para çekme\n3-para yatırma\n4-çıkış");

        int tercih = scan.nextInt();
        if (tercih == 1) {
            while (true) {
                if (islem == 1) {
                    System.out.println("Güncek bakiyeniz : 2000TL");
                    System.out.println("Ana menüye donmek için : 1 \nBir üst menüye dönmek için : 2  \n Kartınızı alıp çıkış yapmak için : 3  \ntuşlayınız.");
                }

                while (true) {
                    if (tercih == 1) {
                        continue;
                    } else if (tercih == 2) {
                        continue;
                    } else if (tercih == 3) {
                        System.out.println("Lütfen kartınızı bankamatikten almayı unutmayınız");
                        break;
                    } else {
                        System.out.println("Hatalı bir giris yaptınız");
                    }
                }
            }
        }*/
 /*  Scanner scan=new Scanner(System.in);
outerLoop:
while(true){
    System.out.println("Lütfen yapacagınız işlemi seçiniz : 1-Güncel hesap 2-para yatırma 3-para çekme 4-çıkış");
    int tercih=scan.nextInt();
    if(tercih==1){
        while(true){
            System.out.println("Güncel bakiye = 2000TL");
            System.out.println("işleme devam etmek için: 1 \n üst menüye çıkmak için : 2  \n kart iade için :  3  basınız");
            int tercih2=scan.nextInt();
            if(tercih2==1){
                continue;
            }else if(tercih2==2){
                break;
            }else if(tercih2==3){
                break outerLoop;
            }else{
                System.out.println("Hatalı islem");
                break;
            }

        }
    } if(tercih==2){
        while(true){
            System.out.println("Para yatırma");
            System.out.println("işleme devam etmek için: 1 \n üst menüye çıkmak için : 2  \n kart iade için :  3  basınız");
            int tercih2=scan.nextInt();
            if(tercih2==1){
                while(true){
                    System.out.println("yatırılacak miktarı secin \n1-100 \n2-500");
                    int tercih3=scan.nextInt();
                    if(tercih3==1) {
                        System.out.println("Güncel Bakiye = 2100tl");
                        break;
                    } else if(tercih3==2){
                            System.out.println("Güncel Bakiye =2500tl");
                            break;
                        }

                }
            }else if(tercih2==2){
                break;
            }else if(tercih2==3){
                break outerLoop;
            }else{
                System.out.println("Hatalı islem");
                break;
            }

        }
    } if(tercih==3){
        while(true){
            System.out.println("Para cekme");
            System.out.println("işleme devam etmek için: 1 \n üst menüye çıkmak için : 2  \n kart iade için :  3  basınız");
            int tercih2=scan.nextInt();
            if(tercih2==1){
                while(true){
                    System.out.println("cekilecek miktarı secin \n1-100 \n2-500");
                    int tercih3=scan.nextInt();
                    if(tercih3==1){
                        System.out.println("Güncel Bakiyeniz 1900tl");
                        break;
                    }else if (tercih3==2){
                        System.out.println("Güncel Bakiye 1500tl");
                        break;
                    }
                }
            }else if(tercih2==2){
                break;
            }else if(tercih2==3){
                break outerLoop;
            }else{
                System.out.println("Hatalı islem");
                break;
            }

        }
    } if(tercih==4){
        System.out.println("Yine bekleriz");
        break outerLoop;
    }

}*/
//0 ıle 100 dahıl 30-50 arasını yazdırmadan tum sayıları yazdıran formulu yazın

      /*  for (int i = 0; i <=100; i++) {
            if(i<30 && i<50) {
                continue;
            }
            System.out.println(i+" ");

        }





        for (int i = 0; i <=100; i++) {
            if(i%13==0) {
                continue;
            }
            System.out.println(i+" ");

        }*/




     /*   for (int i = 0; i <=100; i++) {
            if(i%13==0) {
                continue;
            }
            System.out.println(i+" ");*/












           age(2017);
           üslüSayiHesaplama(3,5);
           islem(5,2);
           dörtİslem(9,3,"*");


    }

    /**
     * 1.bir method yazın dogum yılınızı girdiginizde yasınızı versın.
     * @param birthyear
     */

    public static void age(int birthyear){
        int age=2023-birthyear;
        System.out.println("Melik'in yasi : "+age);
    }


    /**
     *  2.bir method yazın 2 sayı kabul etsin ve ilk sayıyı ikinci sayının üslü kuvveti yapıp sonuç versin
     */

     public static void üslüSayiHesaplama(int kuvvet , int taban){
           int sonuc=(int)Math.pow(taban,kuvvet);
           System.out.println(+taban+" sayısının "+kuvvet+" . kuvveti = "+sonuc);
       }


    /**
     * 3.bir method yazın 2 sayı kabul etsin cagırdıgımızda konsola islemin matematiksel görünümünü yazdırsın
     */

     public static void islem(int a,int b) {
        int sonuc=a+b;
         System.out.println(a+" + "+b+" = "+sonuc);
     }


    /**
     * 4.bir method yazın 3 parametreli olsun ilk ikisi isleme sokulacak sayıları ücüncü ise
     * yapılacak islemi belirlesin.sonucu versin
     */

     public static void dörtİslem(int x, int y, String islem){
         int sonuc=0;
         if(islem.equals("+"))
             sonuc=x+y;
         else if(islem.equals("-"))
             sonuc=x-y;
         else if(islem.equals("*"))
             sonuc=x*y;
         else if (islem.equals("/"))
             sonuc=x/y;
         System.out.println(x+islem+y+" = "+sonuc);


     }




}


