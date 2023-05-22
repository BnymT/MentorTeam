package mth01;

import java.util.Scanner;

public class Homework04 {

    public static void main(String[] args) {

     /* TASK :
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       */

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen adinizi ve soyadinizi giriniz");

        String nameSurname = input.nextLine();

        String name = nameSurname.split(" ")[0];

        String surname = nameSurname.split(" ")[1];

        System.out.println("Ad --> " + name);

        System.out.println("Soyad --> " + surname);


    }

}
