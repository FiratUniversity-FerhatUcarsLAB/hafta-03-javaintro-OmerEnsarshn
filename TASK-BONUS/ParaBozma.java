import java.util.Scanner;

public class ParaBozma {
    public static void main(String[] args) {

        // 1. Kullanıcıdan giriş almak için Scanner nesnesi oluşturuluyor.
        Scanner girdi = new Scanner(System.in);

        // Toplam miktarı tutacak değişken (tam sayı olarak alıyoruz, kuruşları şimdilik ihmal ediyoruz)
        int toplamPara;

        System.out.println("Lutfen bozdurmak istediginiz tam TL miktarini giriniz (Orn: 278):");
        toplamPara = girdi.nextInt(); // Kullanıcıdan tam sayı (int) değeri okuduk

        // Bozdurma işlemi için başlangıçta toplam parayı tutacak bir yedek değişken (mevcutMiktar)
        int mevcutMiktar = toplamPara;
        int adet; // Her banknottan kaç adet olduğunu tutacak değişken

        System.out.println("\n--- SONUC: " + toplamPara + " TL Bozdurma ---");
        System.out.println("Toplam para, asagidaki banknot ve madeni paralara ayrilmistir:");

        // Banknotları büyükten küçüğe doğru, sırayla bozduruyoruz:

        // 100 TL Banknotları
        adet = mevcutMiktar / 100; // Kaç tane 100 TL olduğunu buluruz
        if (adet > 0) {
            System.out.println(adet + " x 100 TL");
        }
        mevcutMiktar = mevcutMiktar % 100; // 100'lükleri çıkarınca kalan parayı buluruz (Mod alma işlemi)

        // 50 TL Banknotları
        adet = mevcutMiktar / 50; // Kalan miktarda kaç tane 50 TL olduğunu buluruz
        if (adet > 0) {
            System.out.println(adet + " x 50 TL");
        }
        mevcutMiktar = mevcutMiktar % 50; // Kalan paranın 50'likleri çıkarılmış halini buluruz

        // 20 TL Banknotları
        adet = mevcutMiktar / 20;
        if (adet > 0) {
            System.out.println(adet + " x 20 TL");
        }
        mevcutMiktar = mevcutMiktar % 20;

        // 10 TL Banknotları
        adet = mevcutMiktar / 10;
        if (adet > 0) {
            System.out.println(adet + " x 10 TL");
        }
        mevcutMiktar = mevcutMiktar % 10;

        // 5 TL Banknotları
        adet = mevcutMiktar / 5;
        if (adet > 0) {
            System.out.println(adet + " x 5 TL");
        }
        mevcutMiktar = mevcutMiktar % 5;

        // 2 TL Madeni Paraları
        adet = mevcutMiktar / 2;
        if (adet > 0) {
            System.out.println(adet + " x 2 TL");
        }
        mevcutMiktar = mevcutMiktar % 2;

        // 1 TL Madeni Paraları (En son kalan miktar zaten 1 TL'liklerdir)
        adet = mevcutMiktar / 1; // Ya da direkt 'adet = mevcutMiktar;' diyebiliriz.
        if (adet > 0) {
            System.out.println(adet + " x 1 TL");
        }
        // Kalan miktar burada zaten 0 olacaktır.

        girdi.close();
    }
}
