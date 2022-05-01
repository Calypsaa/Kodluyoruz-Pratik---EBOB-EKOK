import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("N1 sayısını giriniz: ");
        int n1 = scanner.nextInt();
        int kucuk;
        int ebob = 0;
        int ekok = 0;

        System.out.print("N2 sayısını giriniz: ");
        int n2 = scanner.nextInt();

        if (n1 < n2) {
            kucuk = n1;
        } else {
            kucuk = n2;
        }

        for (int i = 1; i <= kucuk; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
        }

        System.out.println("En büyük ortak bölen: " + ebob);
        ekok = (n1 * n2) / ebob;
        System.out.print("En küçük ortak kat: " + ekok);
    }
}
