package mth01;

import java.util.Scanner;

public class Homework05 {

    /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimedne oluşan ismi
         Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen adinizi ve soyadinizi giriniz.");

        String nameSurname = input.nextLine();

        char firstName = nameSurname.toUpperCase().split(" ")[0].charAt(0);

        char middleName = nameSurname.toUpperCase().split(" ")[1].charAt(0);

        char surname = nameSurname.toUpperCase().split(" ")[2].charAt(0);

        System.out.println(firstName + "." + middleName + "." + surname + ".");

    }

}
