import java.util.Scanner; // Kullanıcıdan giriş almak için Scanner sınıfını içeriye aktardık

public class BmiHesaplama {
    public static void main(String[] args) {

        // 1. Kullanıcıdan veri almak için Scanner nesnesi oluşturuluyor.
        Scanner girdi = new Scanner(System.in);

        // 2. Kilo ve boy değişkenlerini tanımlıyoruz (double ondalıklı sayıları tutar)
        double kilo;
        double boy;
        double bmi;

        // 3. Kullanıcıdan Kilo bilgisini alıyoruz
        System.out.println("Lutfen kilonuzu (kg) giriniz:");
        kilo = girdi.nextDouble(); // Kullanıcıdan double tipinde (ondalıklı) kilo değerini okuduk

        // 4. Kullanıcıdan Boy bilgisini alıyoruz
        // Boy genellikle metre cinsinden istendiği için bu şekilde alıyoruz.
        System.out.println("Lutfen boyunuzu (metre cinsinden, Ornegin: 1.75) giriniz:");
        boy = girdi.nextDouble(); // Kullanıcıdan double tipinde boy değerini okuduk

        // 5. BMI Formülü Uygulanıyor: BMI = kilo / (boy * boy)
        // Matematiksel işlemler: Önce parantez içi (boy * boy) yapılır.
        bmi = kilo / (boy * boy);

        // 6. Sonucu Ekrana Yazdırıyoruz
        System.out.println("\n--- SONUC ---"); // Bir satır boşluk ve başlık
        System.out.println("Girdiginiz Kilo: " + kilo + " kg");
        System.out.println("Girdiginiz Boy: " + boy + " m");
        // Hesaplanan BMI değerini, virgülden sonra iki hane olacak şekilde formatlıyoruz.
        System.out.printf("Vucut Kitle Indeksiniz (BMI): %.2f\n", bmi);

        // 7. Kullanılan Scanner nesnesini kapatıyoruz (iyi bir programlama alışkanlığıdır)
        girdi.close();
    }
}
