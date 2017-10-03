import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    private static CepTelefonu cepTelefonu = new CepTelefonu("123123124");

    public static void main(String[] args) {
        telefonuBaslat();
        boolean cikis=false;
        int secim;

        menuyuGoster();
        while (!cikis) {
            System.out.println("Menüyü görmek için 6'yı tuşlayın..");

            secim = scan.nextInt();
            switch (secim) {
                case 0:
                    cikis=true;
                    break;
                case 1:
                    cepTelefonu.listele();
                    break;
                case 2:
                    YeniKisiEkle();
                    break;
                case 3:
                    KisiBul();
                    break;
                case 4:
                    Guncelle();
                    break;
                case 5:
                    Sil();
                    break;
                case 6:
                    menuyuGoster();
                    break;
                default:
                    System.out.println("Hatalı giriş..");
            }
        }
    }

    private static void Sil() {
        System.out.println("Adını girin:");
        String silinecekAd = scan.next();
        cepTelefonu.kisiSil(silinecekAd);
    }

    private static void Guncelle() {

        System.out.println("Kimi güncellemek istiyorsunuz? Adını girin:");
        String guncellenecekAd = scan.next();

        System.out.println("\n\n Yeni ad:");
        String yeniAd = scan.next();
        System.out.println("Yeni Telefon Numarası:");
        String yeniTelno = scan.next();
        Kisi updateKisi = new Kisi(yeniAd,yeniTelno);
        cepTelefonu.kisiGuncelle(guncellenecekAd,updateKisi);
    }

    private static void KisiBul() {
        System.out.println("Adını girin:");
        String bulunacakAd= scan.next();
        cepTelefonu.kisiBul(bulunacakAd);
    }

    private static void telefonuBaslat() {
        System.out.println("Telefon Başlatılıyor....\n\n");
    }

    private static void menuyuGoster() {
        System.out.println("********* MENU *********");
        System.out.println("0-) Çıkış\n1-) Tüm kişileri listele\n2-) Yeni kişi ekle\n"
                +"3-) Kişi Bul\n"
                +"4-) Kişi güncelle\n5-) Kişi sil\n6-)Menü göster");

    }

    private static void YeniKisiEkle() {
        System.out.println("Adı girin:");
        String ad = scan.next();
        System.out.println("Telefon Numarasını Girin:");
        String telNo=scan.next();
        cepTelefonu.kisiEkle(Kisi.olustur(ad,telNo));
    }
}
