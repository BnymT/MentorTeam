package mthhard;

import java.util.Scanner;

public class Homework01 {

    public static void main(String[] args) {

      /*
  1. Basit bir Kahve makinesi oluşturun.    3 çeşit kahvemiz olsun.
  2. Sistem şu soruyu sorsun: "Hangi Kahveyi istersiniz?"
  3.Bu soru ile birlikte kullanıcı kahve bilgilerini görsün.
   Örn:
  Hangi Kahveyi İstersiniz?
  1.Türk kahvesi
  2.Filtre Kahve
  3.Espresso
        String hangiKahve oluşturun ve var olan kahvelerden birini yazınız.
         (örn: Türk Kahvesi,  ya da türk kahvesi.  --->  Büyük- küçük harf duyarlı olmaması için String methodu kullanın.)
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Which coffee do you want?\n1.Turkish Coffee\n2.Filter Coffee\n3.Espresso");

        String whichCoffee = input.nextLine();
        String turkishCoffee = "Turkish Coffee";
        String filterCoffee = "Filter Coffee";
        String espresso = "Espresso";


        /*
                                                                                     todo 1. Koşul bölümü
        Eğer kahve Türk kahvesi ise, konsola = Türk kahvesi hazırlanıyor. yazsın.(Dümdüz Türk kahvesi yazmayın.
         String hangiKahve'yi çağırın!!)
        Eğer filtre kahve ise,   konsola = Filtre kahve hazırlanıyor.  yazsın.     (String hangiKahve'yi kullanın !)
        Eğer Espresso ise, konsola =  Espresso hazırlanıyor...   yazsın.  (String hangiKahve'yi kullanın !)
        Eğer yanlış harf girerseniz, konsola = Hatalı tuşlama yaptınız. yazsın. (Hatalı tuslamadan sonra kod
        calısmaya devam edecektir, o konuyu daha görmediniz bu yüzden bastan baslatın.)
        Sistem bize şu soruyu sorsun: "Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız):
         "   Konsolda aynen böyle  yazmalı. Parantez içi de konsolda olsun.
       String sut olusturun.
                                                                           todo 2.Koşul Bölümü
       eğer String sut,  evet   e eşitse,konsola, Süt ekleniyor... yazısı gelsin.
        --(Büyük küçük harf duyarlı olmaması için String methodu kullanın. Olması gereken ihtimaller:
         Evet, EVET, EvEt,EVEt vs.
      eğer String sut, hayır a eşit ise, konsola , Süt eklenmiyor  yazısı gelsin.
                                                                                     todo ----------------------------------
                                                                                     todo ----------------------------------
        Sistem bize "Şeker ister misiniz ? (Evet veya hayır cevabını veriniz) : " şeklinde bir soru sorsun.
        (Büyük küçük harf duyarlılıgı olmaması için string method kullanın.
        String seker oluşturunuz.

         todo 3.Koşul Bölümü
        todo if(){
        Eğer String seker   Evet e eşitse ,  sistem bize "Kaç şeker olsun?" sorusunu sormalı.
        Sorunun altına int kacSeker  oluşturunuz.
        Şeker sayısını giriniz.
        Ve konsola   şunu yazdırınız örnek: 5 şeker ekleniyor.  (ipucu: Bu kodların heosi if bloğunun içerisinde olacak)
        todo }
        todo else{
    Eğer String şeker  hayır 'a eşitse, sistem bize "Şeker eklenmiyor" cevabını versin.
            ONEMLİ !! =   bir int girdisinden sonra String girdisi yapacaksak,araya boş bir nextLine
            koymamız gerekiyor. (String bosKod = sc.nextLine();    )  dummy kod ekleyiniz.
                                                                                     */

        if (whichCoffee.equalsIgnoreCase(turkishCoffee)) {

            System.out.println(whichCoffee + " getting ready...");

        } else if (whichCoffee.equalsIgnoreCase(filterCoffee)) {

            System.out.println(whichCoffee + " getting ready...");

        } else if (whichCoffee.equalsIgnoreCase(espresso)) {

            System.out.println(whichCoffee + " getting ready...");

        } else {

            System.out.println("Invalid entry.");

        }

        System.out.println("Would you like us to add milk? (Please enter Yes or No.)");

        String milk = input.next();

        if (milk.equalsIgnoreCase("yes")) {

            System.out.println("Milk is adding...");

        } else if (milk.equalsIgnoreCase("no")) {

            System.out.println("Milk isn't adding...");

        } else {

            System.out.println("Invalid entry.");

        }

        System.out.println("Would you like us to add Sugar? (Please enter Yes or No.)");

        String sugar = input.next();

        if (sugar.equalsIgnoreCase("yes")) {

            System.out.println("How much sugar do you want?");

            int sugarQuantity =input.nextInt();

            System.out.println(sugarQuantity + " sugar/s is/are adding...");

        } else if (sugar.equalsIgnoreCase("no")) {

            System.out.println("Sugar isn't adding...");

        } else {

            System.out.println("Invalid entry.");

        }

        System.out.println("Which size do you want? (Please entry like Tall - Medium - Small.)");

        String size = input.next();

        if (size.equalsIgnoreCase("Tall")) {

            System.out.println("Your coffee is being prepared in" + size + "size");

        } else if (size.equalsIgnoreCase("Medium")) {

            System.out.println("Your coffee is being prepared in" + size + "size");

        } else if (size.equalsIgnoreCase("Small")) {

            System.out.println("Your coffee is being prepared in" + size + "size");

        } else {

            System.out.println("Invalid entry.");

        }

        System.out.println("Your " + whichCoffee + " " + size + " is ready");


        /*

  Sistem bize "Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.) :   sorusunu sorsun.
  (büyük küçük harf duyarlılıgı olmamalı. yani kullanıcı büyük boy veya BüYüK Boy girdiginde kabul etmeli.
  String boyut oluşturun...
                                                   todo 4.Koşul Bölümü
        eğer String boyut Büyük boy' a eşitse =  Kahveniz büyük boy hazırlanıyor.
        (Büyük boy kısmını String boyut'u kullanarak yazalım= "Kahveniz" + boyut + "hazırlanıyor.")
        Eğer String boyut  Orta Boy'a eşitse = Kahveniz orta boy hazırlanıyor.. ("Kahveniz" + boyut + "hazırlanıyor.)
        Eğer String boyut  Küçük boy'a eşitse = Kahveniz küçük boy hazırlanıyor.    yazsın.
        ("Kahveniz" + boyut + "hazırlanıyor.)
                    //todo  SONUÇ BÖLÜMÜ
                    Siparişlerimizi verdik. Son hali görmek istiyoruz.
                    konsola şunu yazdırın örnek :
        Türk Kahvesi orta boy hazırdır. Afiyet olsun !!! (Türk kahvesi için String hangiKahveyi kullanın.
         orta boy için de String boyut ' u kullanın.)
        todo Açıklama :
       Projeyi bilerek biraz zor hazırladık. Üzerinde fazla fazla kafa yormanız ve "grupça çalışmanız için"
       böyle düzenledik. Yapamayan arkadaşlar kesinlikle canlarını sıkmasın.
       Size çok zor gelebilir. Ancak adım adım ilerlerseniz, grup ile çözerseniz ve yazdığım notları tamamen
        uygularsanız halledebilirsiniz. Öğrenmediğiniz hiçbir şey yok. Sadece biraz karışık.
       HERKESE KOLAY GELSİN !! :)
                 */

    }

}