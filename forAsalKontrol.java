import java.util.Scanner;

public class forAsalKontrol {
    public static void main(String[] args) {

        int sayi;
    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        sayi = scanner.nextInt();
        
        System.out.println("Asal sayılar:");


        for (int i = 2; i <= sayi; i++) {
            boolean asalMi = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    asalMi = false;
                    //break;
                }
            }
            if (asalMi) {
                System.out.print(i+" ");
            }
        }
    }
}
