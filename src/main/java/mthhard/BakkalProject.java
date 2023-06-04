package mthhard;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class BakkalProject {

    public static void main(String[] args) {

        /* TASK :

        Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
        Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
        Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
        Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.*
    Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
    Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
    Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
    Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
    Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
        for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
        ortalama kazançtan yüksekse o günleri return yap.
    Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
    for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
    ortalama kazançtan aşağıysa o günleri return yap.
*/

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        String days[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int index = 0;
        double dailyWages[] = new double[7];
        double dailyW = 0;

        do {
            System.out.println("This daily wage for " + days[index]);
            dailyW = input.nextDouble();
            dailyWages[index] = dailyW;
            index++;
        }while(index < 7);

        double avarage = avarageWageCalculating(dailyWages);
        System.out.println("Avarage wage is = " + df.format(avarage));

        System.out.println("The days of over the wage");
        System.out.println(getOverTheAvarageWage(days,dailyWages,dailyWages));


        System.out.println("The days of under the wage");
        System.out.println(getOverTheAvarageWage(days,dailyWages,dailyWages));
    }

    public static double avarageWageCalculating(double dailyWages[]){

        int j = 0;
        double toplam = 0;

        do {

            toplam += dailyWages[j];
            j++;
        }while (j < 7);

        return toplam/dailyWages.length;

    }

    private static String getOverTheAvarageWage(String[] days, double[] overTheWage, double[] dailyWage) {

        for (int i = 0; i < 7; i++) {

            if (overTheWage[i] > avarageWageCalculating(overTheWage)){

                System.out.println(days[i] + " : " + dailyWage[i]);

            }

        }

        return "";

    }

    private static String getUnderTheAvarageWage(String[] days, double[] underTheWage, double[] dailyWage) {

        for (int i = 0; i < 7; i++) {

            if (underTheWage[i] < avarageWageCalculating(underTheWage)){

                System.out.println(days[i] + " : " + dailyWage[i]);

            }

        }

        return "";

    }



}
