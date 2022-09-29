import java.util.Scanner;

/*
Taksimetre Programı
Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.
 */
public class Main {
    public static void main(String[] args) {

        float km, ucret, minUcret = 20;
        Scanner yazici = new Scanner(System.in);

        System.out.println("Gidilen mesafeyi giriniz:");
        km = yazici.nextFloat();

        ucret= (float) ((10+km*2.20)> 20 ? (10+(km*2.2)) : 20.0);

        System.out.println("Odenecek tutar: "+ucret);
    }
}
