package mth02;

import java.util.Scanner;

public class Homework05 {

    public static void main(String[] args) {

         /*
        TASK :
        Kullanicidan  yasini ve kilosunu alaliniz
        18 yasindan kucuk ise kan bagisi yapamaz
        18 yasindan buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
        18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen yasinizi giriniz");

        int age = input.nextInt();

        System.out.println("Lutfen kilonuzu giriniz");

        double weight = input.nextDouble();

        if (age < 18 || weight < 50){

            System.out.println("Kan bagisi yapamaz");

        } else if (age > 18 && weight > 50) {

            System.out.println("Kan bagisi yapilabilir");

        } else {

            System.out.println("Tanimsiz veri");

        }

    }

}
