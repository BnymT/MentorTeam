package mth02;

import java.util.Scanner;

public class Homework01 {

    public static void main(String[] args) {

        /* TASK :
         * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
         *  dort islemden biri ile isleme koyup sonucun yazdiriniz
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen islem yapmak istediginiz 2 sayiyi giriniz");

        double number1 = input.nextDouble();
        double number2 = input.nextDouble();

        System.out.println("Lutfen asagidan yapmak istediginiz islemi seciniz\n1)Toplama\n2)Cikarma\n3)Carpma\n4)Bolme ");

        int number3 = input.nextInt();

        if (number3 == 1){

            System.out.println(number1 + number2);

        } else if (number3 == 2) {

            System.out.println(number1 - number2);

        } else if (number3 == 3) {

            System.out.println(number1 * number2);

        } else if (number3 == 4) {

            System.out.println(number1 / number2);

        } else {

            System.out.println("Yanlis numara girdiniz.");

        }

    }

}
