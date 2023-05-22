package mth02;

import java.util.Scanner;

public class Homework02 {

    public static void main(String[] args) {

         /*  TASK :
     *  Kullanicidan 3 tene pozitif  tam sayi alniz.
     *  bu uc sayinin ucgen olusturma durumunu kontrol ediniz
        eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz
        INFO :
         üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük, herhangi iki kenar farkı diger kenardan büyük olmali
         a+b>c>a-b
         a+c>b>a-c
         b+c>a>b-c
        a=b=c ise es kenar ucgen

     */

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen 3 adet tam sayi giriniz");

        double firstSide = input.nextDouble();
        double secondSide = input.nextDouble();
        double thirdSide = input.nextDouble();


        boolean triangleReq = (firstSide + secondSide > thirdSide && thirdSide > firstSide - secondSide) ||
                              (firstSide + thirdSide > secondSide && secondSide > firstSide - thirdSide) ||
                              (secondSide + thirdSide > firstSide && firstSide > secondSide - thirdSide);

        boolean eqSideTri = firstSide == secondSide && secondSide == thirdSide;
        boolean notCanBeUnderZero = firstSide < 0 || secondSide < 0 || thirdSide < 0;
        if (eqSideTri) {

            System.out.println("Bu bir eskenar ucgendir");

        } else if (triangleReq) {

            System.out.println("Bu bir ucgendir");

        } else if (notCanBeUnderZero) {

            System.out.println("Ucgen kenarlari sifirdan kucuk sayilari iceremez");

        } else {

            System.out.println("Bu bir ucgen degildir");

        }

    }

}
