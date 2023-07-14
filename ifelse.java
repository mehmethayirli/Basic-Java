public class ifelse {
    public static void main(String [] args){
        int x=5;
        int y=10;

        if(x>5)
            if(y>5)
                System.out.println("Second if");
            else
                System.out.println("Second if's else"); //empty
    
        if(x>5){
            if(y>5)
                System.out.println("Second if");
        }
            else
                System.out.println("First if");
    }
}