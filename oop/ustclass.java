package oop;
public class ustclass extends absclass {
    public int x;

    public ustclass(int x){
        this.x=x;
    }

    public void yazdir(){
        System.out.printf("Ust sınıf degisken = %d\n",x);
    }
}