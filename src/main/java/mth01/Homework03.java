package mth01;

import java.util.Scanner;

public class Homework03 {

    public static void main(String[] args) {

        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen bir cumle giriniz.");

        String word = input.nextLine();

        boolean space = word.replaceAll("[\\S]","").length()>0;

        if (space == true){

            System.out.println("Cumlede bosluk karakteri bulunmaktadir.");

        }

        if (space == false){

            System.out.println("Cumlede bosluk karakteri bulunmamaktadir.");

        }

    }

}
