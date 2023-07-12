import java.util.Scanner;

public class asalWhile {

    public static void main(String[] args){

        int sayi;
        int sayici=2;
        boolean asalmi=true;
        
        Scanner input = new Scanner(System.in);
        System.out.printf("sayi gir\n");
        sayi=input.nextInt();
        
        while(sayi<0){
            System.out.printf("Negatif sayi giremezsin");
        }
        
        while(sayici<sayi){
            if(sayi%sayici==0){
                asalmi=false;
                System.out.printf("%d\n",sayici);
            }
            sayici++;
        }

        //System.out.print(asalmi?String.format("%d sayisi asaldir",sayi):String.format("%d sayisi asal degildir\n",sayi));

        if (asalmi)
            System.out.printf("%d sayisi asaldir",sayi);
        else
            System.out.printf("%d sayisi asal degildir\n",sayi);

        }        
}