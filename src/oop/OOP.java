package oop;
class Buss{
    private int penumpang;
    private int maxPenumpang;
    
    //konstruktor kelas Bus
    public Buss(int maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }
    //method mutator untuk menambahkan penumpang
    public void addPenumpang(int penumpang){
        int temp;
        temp = this.penumpang+penumpang;
        if (temp >= maxPenumpang){
            System.out.println("Penumpang melebihi kuota");
        }else {
            this.penumpang = temp;
        }
                
    }
    public void cetak(){
        System.out.println("Penumpang Bus Sekarang adalah " + penumpang);
        System.out.println("Penumpang maksimum seharusnya adalah " + maxPenumpang);
    }
}
public class OOP {
    public static void main(String[] args) {
        //membuat objek busBesar dari class Bus
        Buss busBesar = new Buss(40);
        busBesar.cetak();
        
        //penambahan penumpang
        busBesar.addPenumpang(15); //menambahkan 15 penumpang
        busBesar.cetak();
        
        //penambahan penumpang
        busBesar.addPenumpang(5); //menambahkan 5 penumpang
        busBesar.cetak();
        
        //penambahan penumpang
        busBesar.addPenumpang(26); //menambahkan 26 penumpang
        busBesar.cetak();
    }
    
}
