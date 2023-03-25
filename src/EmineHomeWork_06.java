import java.util.Scanner;

public class EmineHomeWork_06 {
    /**
     * 1.  Create a method that returns the name of the day based on the given number to the method
     *
     * */


  /*  public static void main(String[] args) {

        System.out.println("nameOfDay(5) = " + nameOfDay(5));

    }
    public static String nameOfDay(int number) {
        String name = "";
        switch (number) {
            case 1:
                name+="pazartesi";
                break;
            case 2:
                name += "salı";
                break;
            case 3:
                name += "carsamba";
                break;
            case 4:
                name += "persembe";
                break;
            case 5:
                name += "cuma";
                break;
            case 6:
                name += "cumartesi";
                break;
            case 7:
                name += "pazar";
                break;
            default:
                name += "Invalid";
        }
          return "Day Name : "+name;
    }*/

 /*   public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayı giriniz :");
        int sayi=scan.nextInt();
        System.out.println("basamakSayisi = " + basamakSayisi(sayi));
    }

    /**
     * Kullanıcıdan alınan sayının kaç basamaklı olduğunu bulan metodu yazınız
     */
      /*   public static int basamakSayisi(int sayi){

             int basamakSayisi=0;
             while (sayi!=0){
                 sayi/=10;
                 basamakSayisi++;
             }
             return basamakSayisi;
         }*/


 /*   public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 2 sayı giriniz");
        int sayi= scan.nextInt();
        int ussu=scan.nextInt();
        System.out.println(sayi+" ^ "+ussu+" = "+usAlma(sayi,ussu));

    }
    /**
     * Kullanıcı dan 2 sayı alın. İlk sayı taban, ikinci sayı ise üs olsun mathPow metodu oluşturun işlemler bu metodun
     * içerisinde yapılsın. (Math sınıfının pow metodunu siz yapacaksınız)
     * Math.pow(2,3)=8
     * mathPow(2,3)=8
     */
        /* public static int usAlma(int sayi , int ussu){
             int sonuc=1;
             int i;
             for(i=0; i<ussu; i++){
             sonuc*=sayi;
             }
             return sonuc;
         }*/


    /**
     * 100 ile 999 arasındaki tüm Armstrong sayılarını yazdıran bir program yazın. Sayının her
     * basamağının küplerinin toplamı sayının kendisine eşitse bu sayı Armstrong sayısı olarak
     * adlandırılır.
     */

  /*  public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir terim giriniz: ");
        int n=scan.nextInt();
        fibonacciDeger(n);
    }  */

    /**
     * Kullanıcı tarafından girilen n terimli Fibonacci dizisini yazdıran bir program yazın: 0 1 1 2 3 5
     * 8 13 24
      */
  /*  public static int fibonacciDeger(int n){
        //int fibonacciDeger=0;
        if(n==0 || n==1)
           // return 1;
        // int fibonacciDeger=1;
            int deger = fibonacciDeger(n - 1) + fibonacciDeger(n - 2);

        return deger;

    }  */

 /*   public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen 1. sayiyi giriniz: ");
        int sayi1=scan.nextInt();
        System.out.println("lütfen 2. sayiyi giriniz: ");
        int sayi2=scan.nextInt();
        System.out.println("En buyuk ortak bolen : "+ebob(sayi1,sayi2));
    } */

    /**
     * Kullanıcıdan 2 sayı alın ve bu iki sayının en büyük ortak bölenini ekrana yazdırın. 1 ile 7
     * sonuc 1, 6-12(6)
      */  /*   public static int ebob(int sayi1 ,int sayi2){
          int ebob=1;
          for(int i=1; i<sayi1; i++){
              if(sayi1 % i== 0  &&  sayi2 % i== 0) {
                  ebob = i;
              }
          }
          return ebob;
    }*/


    /**
     *     Kullanıcıdan satır sayısı alan ve bu satır sayısına göre * (yıldızlar) lardan üçgen oluşturan metodu
     *      yazınız? yildizUcgeni(3)
     *        *
     *       * *
     *      * * *
      */


             public static void main(String[] args) {

                 Scanner scan=new Scanner(System.in);
                 System.out.println("lütfen satir sayisi giriniz: ");
                 int satir=scan.nextInt();

                 System.out.println(yildizSatirsayisi(satir));
             }


             public static int yildizSatirsayisi(int satir) {

                  int yildizSatirSayisi;
                 for (int i = satir; i > 0; i--) {
                 }
                 for (int j = 1; j < satir; j++) {
                     System.out.println(" ");

                 }for(int k=(satir+1)-i; k<0; k++){
                     System.out.println("* ");
                 }
                 return yildizSatirSayisi;
             }

}









