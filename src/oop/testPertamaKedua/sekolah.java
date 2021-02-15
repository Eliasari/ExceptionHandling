package oop.testPertamaKedua;
class karyawann {
    private String nama;
    private int usia;
    private String mataPelajaran;
    public karyawann (String nama, int usia, String mataPelajaran){
        this.nama = nama;
        this.usia = usia;
        this.mataPelajaran = mataPelajaran;
    }
    public void info(){
        System.out.println("Nama : "+this.nama);
        System.out.println("Usia : "+this.usia);
        System.out.println("Mata Pelajaran yang diajarkan : "+this.mataPelajaran);
    }
}
class data extends karyawann{
    private String noKaryawan;
    public data(String noKaryawan, String nama, int usia, String mataPelajaran){
        super(nama, usia, mataPelajaran);
        this.noKaryawan = noKaryawan;
    }
    public void info (){
        System.out.println("No. Karyawan : "+this.noKaryawan);
        super.info();
    }
}
public class sekolah {
    public static void main (String[]args){
        data programer1 = new data ("5467", "mimin", 51, "biologi");
        programer1.info();
    }
}

