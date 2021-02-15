package oop.testPertamaKedua;
class Person {
    private String nama;
    private int usia;
    
    //konsttruktor
    public Person (String nama, int usia){
        this.nama = nama;
        this.usia = usia;
    }
    //metode
    public void info(){
        System.out.println("Nama : "+this.nama);
        System.out.println("Usia : "+this.usia);
    }
}
class Employ extends Person{
    private String noKaryawan;
    //konstruktor
    public Employ (String noKaryawan, String nama, int usia){
        super(nama, usia);
        this.noKaryawan = noKaryawan;
    }
    //metode
    public void info (){
        System.out.println("No. Karyawan : "+this.noKaryawan);
        super.info();
    }
}
//Akhir kelas Employ
public class KonstruktorSuperKelas {
    public static void main (String[]args){
        Employ programer1 = new Employ ("12345678", "Yanto", 32);
        programer1.info();
    }
}
