import java.util.Scanner;
public class havaSicikligınaGoreEtkinlikOnerme {
    public static void main(String[] args) {
         int heat;

         Scanner input = new Scanner(System.in);
         System.out.print("Sıcaklık Giriniz : ");
         heat = input.nextInt();

        if (heat < 5) {
            System.out.println("Kayak Yapabilirsniz  ");
            System.out.println("Kardan Adam Festivali’ne Gidin  ");
            System.out.println("Abant’ta Yürüyüş Yapın ");
            System.out.println( "Çıldır Gölü’nde Atlı Kızaklara Binin  ");
            System.out.println("Termal Merkezlere Gidin  "  );
        }else  if (heat <= 25){
        }
            if (heat <= 15) {
                System.out.println("Sinemaya Gidebilirsin ");
                System.out.println("Oyun Aktiviteleri ");
                System.out.println("Sakin Bir Yerde Kitap Okumak ");
                System.out.println("Tiyatroya Gidebilrsin ");

                if (heat >= 10) {
                    System.out.println("Pikniğe Gidebilirsiniz");
                    System.out.println("Ormanda Yürüyüş ");
                    System.out.println("Kafede Oturmak ");
                }
            }else{
                System.out.println("Yüzmeye Gidebilirsin ");
                System.out.println("Kamp Yapın");
                System.out.println("Bisiklete Binin");
                System.out.println("Köy Pazarlarını Gezin");
                System.out.println("Turlara Katılın");
        }
        }
}
