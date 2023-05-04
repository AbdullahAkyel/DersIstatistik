import java.util.Scanner;

public class DersIstatistik {

    public int notAA, notBA, notBB, notCB, notCC, notDC, notDD;
    public int toplamOgrenciSayisi;
    // Programımız için gerekli değişkenleri tanımlıyoruz.

    // Getter ve setter metodlarını tanımlıyoruz.
    public void setNotAA(int notAA) {
        this.notAA = notAA;
    }

    public void setNotBA(int notBA) {
        this.notBA = notBA;
    }

    public void setNotBB(int notBB) {
        this.notBB = notBB;
    }

    public void setNotCB(int notCB) {
        this.notCB = notCB;
    }

    public void setNotCC(int notCC) {
        this.notCC = notCC;
    }

    public void setNotDC(int notDC) {
        this.notDC = notDC;
    }

    public void setNotDD(int notDD) {
        this.notDD = notDD;
    }

    // Toplam öğrenci sayısı tutulacak
    public void setToplamOgrenciSayisi(DersIstatistik ders) {
        this.toplamOgrenciSayisi = ders.getNotAA() + ders.getNotBA() + ders.getNotBB() + ders.getNotCB() + ders.getNotCC() + ders.getNotDC() + ders.getNotDD();
    }

    public int getNotAA() {
        return notAA;
    }

    public int getNotBA() {
        return notBA;
    }

    public int getNotBB() {
        return notBB;
    }

    public int getNotCB() {
        return notCB;
    }

    public int getNotCC() {
        return notCC;
    }

    public int getNotDC() {
        return notDC;
    }

    public int getNotDD() {
        return notDD;
    }

    public int getToplamOgrenciSayisi() {
        return toplamOgrenciSayisi;
    }

    public void baslikYazdir() {
        System.out.println("****************************************");
        System.out.println("*** DERS NOTLARI İSTATİSTİK PROGRAMI ***");
        System.out.println("****************************************");
    }

    // Kullanıcıyı yönlendirecek gerekli yerleri oluşturuyoruz.
    public static void menuYazdir() {
        System.out.println("MENÜ:");
        System.out.println("(1) Her bir harfli başarı notu için öğrenci sayısı gir");
        System.out.println("(2) Metinsel istatistik yazdır");
        System.out.println("(3) Grafiksel istatistik yazdır");
        System.out.println("(4) Tüm verileri sıfırla");
        System.out.println("(5) Programı sonlandır");
        System.out.println();
        System.out.print("İşlem seçiniz: ");
    }

    // Kullanıcıdan notlara göre sınıflandırılmış öğrenci sayılarını alıyoruz.
    public static void notSayisiGir(DersIstatistik ders) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("AA alan öğrenci sayısını giriniz: ");
        ders.setNotAA(scanner.nextInt());
        System.out.print("BA alan öğrenci sayısını giriniz: ");
        ders.setNotBA(scanner.nextInt());
        System.out.print("BB alan öğrenci sayısını giriniz: ");
        ders.setNotBB(scanner.nextInt());
        System.out.print("CB alan öğrenci sayısını giriniz: ");
        ders.setNotCB(scanner.nextInt());
        System.out.print("CC alan öğrenci sayısını giriniz: ");
        ders.setNotCC(scanner.nextInt());
        System.out.print("DC alan öğrenci sayısını giriniz: ");
        ders.setNotDC(scanner.nextInt());
        System.out.print("DD alan öğrenci sayısını giriniz: ");
        ders.setNotDD(scanner.nextInt());
        ders.setToplamOgrenciSayisi(ders);
        System.out.println("Toplam öğrenci sayısı: " + ders.getToplamOgrenciSayisi());
        System.out.println();
    }

    // Notlara göre sınıflandırılmış öğrenci sayılarını yüzde(%) olarak ifade etmek için bir fonksiyon tanımlıyoruz.
    public void metinselIstatistikYazdir(DersIstatistik ders) {
        int toplamOgrenciSayisi = ders.getNotAA() + ders.getNotBA() + ders.getNotBB() + ders.getNotCB() + ders.getNotCC() + ders.getNotDC() + ders.getNotDD();
        double yuzdeAA = (double) ders.getNotAA() / toplamOgrenciSayisi * 100;
        double yuzdeBA = (double) ders.getNotBA() / toplamOgrenciSayisi * 100;
        double yuzdeBB = (double) ders.getNotBB() / toplamOgrenciSayisi * 100;
        double yuzdeCB = (double) ders.getNotCB() / toplamOgrenciSayisi * 100;
        double yuzdeCC = (double) ders.getNotCC() / toplamOgrenciSayisi * 100;
        double yuzdeDC = (double) ders.getNotDC() / toplamOgrenciSayisi * 100;
        double yuzdeDD = (double) ders.getNotDD() / toplamOgrenciSayisi * 100;
        System.out.printf("AA: %%%.2f\nBA: %%%.2f\nBB: %%%.2f\nCB: %%%.2f\nCC: %%%.2f\nDC: %%%.2f\nDD: %%%.2f\n",yuzdeAA, yuzdeBA, yuzdeBB, yuzdeCB, yuzdeCC, yuzdeDC, yuzdeDD);
        System.out.println();
    }

    // Öğrenci sayı oranlarını ifade etmek için yıldızları kullanıyoruz.
    public void grafikselIstatistikYazdir(DersIstatistik ders) {
        double oranAA = (double) ders.getNotAA() / ders.toplamOgrenciSayisi;
        double oranBA = (double) ders.getNotBA() / ders.toplamOgrenciSayisi;
        double oranBB = (double) ders.getNotBB() / ders.toplamOgrenciSayisi;
        double oranCB = (double) ders.getNotCB() / ders.toplamOgrenciSayisi;
        double oranCC = (double) ders.getNotCC() / ders.toplamOgrenciSayisi;
        double oranDC = (double) ders.getNotDC() / ders.toplamOgrenciSayisi;
        double oranDD = (double) ders.getNotDD() / ders.toplamOgrenciSayisi;
        int yildizAA = (int) Math.round(oranAA * 50);
        int yildizBA = (int) Math.round(oranBA * 50);
        int yildizBB = (int) Math.round(oranBB * 50);
        int yildizCB = (int) Math.round(oranCB * 50);
        int yildizCC = (int) Math.round(oranCC * 50);
        int yildizDC = (int) Math.round(oranDC * 50);
        int yildizDD = (int) Math.round(oranDD * 50);

        System.out.println("     0    10   20   30   40   50   60   70   80   90   100");
        System.out.println("     |    |    |    |    |    |    |    |    |    |    |");
        System.out.println("     *    *    *    *    *    *    *    *    *    *    *");

        System.out.printf("AA:  *", Math.round(oranAA * 100));
        for (int i = 0; i < yildizAA; i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.printf("BA:  *", Math.round(oranBA * 100));
        for (int i = 0; i < yildizBA; i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.printf("BB:  *", Math.round(oranBB * 100));
        for (int i = 0; i < yildizBB; i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.printf("CB:  *", Math.round(oranCB * 100));
        for (int i = 0; i < yildizCB; i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.printf("CC:  *", Math.round(oranCC * 100));
        for (int i = 0; i < yildizCC; i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.printf("DC:  *", Math.round(oranDC * 100));
        for (int i = 0; i < yildizDC; i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.printf("DD:  *", Math.round(oranDD * 100));
        for (int i = 0; i < yildizDD; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.println();
    }

    // Bu metot "notSayisiGir" fonksiyonunda girilen değerleri sıfırlamak için kullanılacak
    public static void veriSifirla(DersIstatistik ders) {
        ders.setNotAA(0);
        ders.setNotBA(0);
        ders.setNotBB(0);
        ders.setNotCB(0);
        ders.setNotCC(0);
        ders.setNotDC(0);
        ders.setNotDD(0);
        ders.setToplamOgrenciSayisi(new DersIstatistik());
        System.out.println("Tüm veriler sıfırlandı!");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DersIstatistik ders = new DersIstatistik();
        int secim;
        ders.baslikYazdir();

        // Programımımızın "5" sayısı seçilene kadar kapamasını engellemek için döngüye alıyoruz ve koşul ifadelerini yerleştiriyoruz.
        do {
            menuYazdir();
            secim = scanner.nextInt();
            System.out.println("----------------");
            System.out.println();

            switch (secim) {
                case 1:
                    notSayisiGir(ders);
                    break;
                case 2:
                    if (ders.toplamOgrenciSayisi == 0) {
                        System.out.println("UYARI: Harfli başarı notları için henüz sayısal veriler girilmemiştir!");
                        System.out.println();
                        break;
                    }
                    ders.metinselIstatistikYazdir(ders);
                    break;
                case 3:
                    if (ders.toplamOgrenciSayisi == 0) {
                        System.out.println("UYARI: Harfli başarı notları için henüz sayısal veriler girilmemiştir!");
                        System.out.println();
                        break;
                    }
                    ders.grafikselIstatistikYazdir(ders);
                    break;
                case 4:
                    veriSifirla(ders);
                    break;
                case 5:
                    System.out.println("Programdan çıkılıyor...");
                    System.out.println();
                    break;
                default:
                    System.out.println("UYARI: İşlem yapabilmek için 1 ile 5 arasında bir sayı seçilmelidir!");
                    System.out.println();
                    System.out.print("Devam etmek için bir tuşa ve sonrasında ENTER tuşuna basınız: ");
                    scanner.next();
                    System.out.println();
            }
        } while (secim != 5);
    }
}