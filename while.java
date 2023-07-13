public class while {
    
    public static void main(String[] args){

    int counter=1;
    double total;
    double point; 
    double sum=0;

    while(counter<=10){
        Scanner inp = new Scanner(System.in);
        System.out.printf("%d. Enter point ", counter);
        point = inp.nextDouble();
        sum+=point;
        counter++;
        }
    sum = total/(counter-1);
    System.out.printf("Total of lesson %d", total);
    }
}