package studiKasus;
class luasPermukaan{
    public double jariJari;
    public int sisi;
    public int luasPermukaanBola;   
    public double luasPermukaanKubus;
    public double luasPermukaanTabung;
    
    luasPermukaan(double jariJari,int sisi){
        this.jariJari =jariJari;
        this.sisi = sisi;
    }    
    public void showluasPermukaanBola(){
        double luasPermukaanBola = 4 * Math.PI * Math.pow(jariJari,2);
        System.out.println("Luas Permukaan Bola : " + luasPermukaanBola + " cm^2 ");  
    }
    public void showluasPermukaanKubus(){
        double luasPermukaanKubus = 6 * sisi * sisi;
        System.out.println("Luas Permukaan Kubus : " + luasPermukaanKubus + " cm^2 ");
    }
    public void showluasPermukaanTabung(){
        double luasPermukaanTabung = 2 * Math.PI * Math.pow(jariJari,2);
        System.out.println("Luas Permukaan Tabung : " + luasPermukaanTabung + " cm^2 ");
    }
}
public class studiKasusClassObject {
    public static void main(String[]args){
        System.out.println("--------lUAS PERMUKAAN BOLA--------");
        double jari = 14;
        System.out.println("Jari-jari = " + jari + " cm ");       
        luasPermukaan luas1 = new luasPermukaan(14,22);
        luas1.showluasPermukaanBola();
        System.out.println("");
        System.out.println("--------lUAS PERMUKAAN KUBUS--------");
        luas1.showluasPermukaanKubus();
        System.out.println("");
        System.out.println("--------lUAS PERMUKAAN TABUNG--------");
        luas1.showluasPermukaanTabung();       
    }
}
