package mth02;

import java.util.Scanner;

public class Homework03 {

    public static void main(String[] args) {

        /* TASK :
         *  Kullanicinin boyunu  m  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
        INFO :
        BMI = kilo(kg) /(boy*boy)(m)
        BMI <=20 oldukca zayifsiniz
        20<BMI<=25 Normal sinirlardasiniz
        25<BMI<=30 Sisman kategorisindesiniz
        30<BMI ==> Obez grubundasiniz.

         */

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen boyunuzu metre cinsinden giriniz");

        double height = input.nextDouble();

        System.out.println("Lutfen kilonuzu kilogram cinsinden giriniz");

        double weight = input.nextDouble();
        double BMICalculator = weight / (height * height);
        boolean normal = 20 < BMICalculator && BMICalculator <= 25;
        boolean fat = 25 < BMICalculator && BMICalculator <= 30;
        boolean obese = 30 < BMICalculator;

        if (obese) {

            System.out.println("Obez grunundasiniz");

        } else if (fat) {

            System.out.println("Sisman grubundasiniz");

        } else if (normal){

            System.out.println("Normal sinirlardasiniz");

        } else {

            System.out.println("Oldukca zayifsiniz");

        }

    }

}
