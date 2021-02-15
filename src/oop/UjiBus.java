package oop;
class Bus{
    public int penumpang;
    public int maxPenumpang;
    
    public void cetak(){
        System.out.println("penumpang Bus sekarang adalah " + penumpang);
        System.out.println("Penumpang maksimum seharausnya adalah " + maxPenumpang);
    }

    void addPenumpang(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
public class UjiBus {
    public static void main (String[]args){
        //membuat objek busMini dari kelas Bus
        Bus busMini = new Bus();
        //memasukkan nilai jumlah penumpang dan penumpang maksimal ke 
        //dalam objek busMini
        busMini.penumpang = 5;
        busMini.maxPenumpang = 15;
        //memanggil method cetak pada kelas Bus
        busMini.cetak();
        
        //menambahkan penumpang pada busMini
        busMini.penumpang = busMini.penumpang + 5;
        busMini.cetak();
        
        //mengurangi jumlah penumpang pada busMini
        busMini.penumpang = busMini.penumpang - 2;
        busMini.cetak();
        
        //menambahkan jumlah penumpang pada busMini
        busMini.penumpang = busMini.penumpang + 8;
        busMini.cetak();
        
    }
}
