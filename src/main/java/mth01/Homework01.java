package mth01;

import java.util.Scanner;

public class Homework01 {

    public static void main(String[] args) {

        /* Question 1
         Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma
         ve cekme, çıkış işlemlerinin yapıldıgı bir ATM app. method create ediniz.
   */
        Scanner input = new Scanner(System.in);

        double balance = 1000;
        double deposit;
        double wdMoney;
        int enteredNumber;

        System.out.println("BT ATM'ye hosgeldiniz. Lütfen asagıdaki menuden yapmak istediginiz islemin numarasini seciniz");
        System.out.println("1) Bakiye Ogrenme\n2) Para Yatirma\n3) Para Cekme\n4) Cıkıs");

        enteredNumber = input.nextInt();
        // 1

        if (enteredNumber == 1){

            System.out.println("balance = " + balance);

        }

        // 2

        if (enteredNumber == 2){

            System.out.println("Lütfen yatirmak istediginiz miktari giriniz");

            deposit = input.nextInt();

            balance = balance + deposit;

            System.out.println("Para yatirma sonucu son bakiyeniz = " + balance);


        }

        // 3

        if (enteredNumber == 3){

            System.out.println("Lütfen cekmek istediginiz miktari giriniz");

            wdMoney = input.nextInt();

            if (wdMoney > balance){

                System.out.println("Yetersiz bakiye. Lutfen tekrar deneyiniz.");

            }

            if (wdMoney < balance) {

                balance = balance - wdMoney;

                System.out.println("Para cekme sonucu son bakiyeniz = " + balance);

            }

        }

        // 4

        if (enteredNumber == 4){

            System.out.println("Bizi tercih ettiginiz icin tesekkur ederiz :).");

        }

        if (enteredNumber > 4){

            System.out.println("Hatali giris yaptiniz lutfen tekrar deneyiniz");


        }

    }

}
