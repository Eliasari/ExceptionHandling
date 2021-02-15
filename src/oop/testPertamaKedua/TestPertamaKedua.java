package oop.testPertamaKedua;
class Pertama{
    private int a = 10;
    protected void terprotek (){
        System.out.println("Method ini hanya untuk anaknya");
    }
    public void info (){
        System.out.println("a = "+a);
        System.out.println("Dipanggil pada = "+this.getClass ().getName());
    }
}
class kedua extends Pertama{
    private int b = 8;
    protected void BacaSuper(){
        System.out.println("Nilai b : "+b);
        terprotek ();
        info ();
    }
}
public class TestPertamaKedua {
    public static void main (String []args){
        kedua D2 = new kedua ();
        D2.BacaSuper ();
        D2.info ();
        
        Pertama S1 = new Pertama ();
        S1.terprotek ();
        S1.info ();
    }
}
