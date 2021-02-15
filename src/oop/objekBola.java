package oop;
class Bola{
    private double jariJari;
    public Bola(double jariJari){
        this.jariJari = jariJari;
    }   
    public void setJariJari(double jari){
       this.jariJari = jari; 
    }
    public void displayDiameter(){
        double Diameter = this.jariJari * 2;
        System.out.println("Diameter Bola : " + Diameter);
    }
    public void displayluasPermukaann(){
        double luasPermukaann = 4 / 3 * Math.PI * Math.pow(jariJari,3);
        System.out.println("Luas Permukaan Bola : " + luasPermukaann);
    }
    public void displayvolumeBola(){
        double Luas = 4 * Math.PI * Math.pow(jariJari,2);
        System.out.println("Volume Bola : " + Luas);
    }    
}
public class objekBola {
    public static void main (String[]args){
        double jari = 14;
        System.out.println("Jari-jari = " + jari);
        
        Bola bola1 = new Bola(7);
        bola1.displayDiameter();
        bola1.displayluasPermukaann();
        bola1.displayvolumeBola();
        System.out.println("");
        bola1.setJariJari(jari); 
        bola1.displayDiameter();
        bola1.displayluasPermukaann();
        bola1.displayvolumeBola();
    }
}
