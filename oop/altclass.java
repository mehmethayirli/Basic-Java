package oop;
public class altclass extends ustclass {
    
    public int y;

    public altclass(int x){
        super(x);
        this.y=x;
    }
    public void yazdir(){
        System.out.printf("Ust sınıf degisken = %d\nAlt sınıf degisken=yok\n",y);
    }
}