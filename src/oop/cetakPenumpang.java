package oop;
class Bus3{
    public int penumpang;
    public int maxpenumpang;
    private double penumpangBaru;
    private double counter;
    
    Bus3(int maxpenumpang){
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }
    //method mutator
    public void addpenumpang(int penumpang){
        int temp;
        temp = this.penumpang + penumpang;
        if(temp > maxpenumpang){
            System.out.println("penumpang melebihi kuota");
        }
        else { 
            this.penumpang = temp;
            counter++;
        }       
    }
        public void getpenumpang(double password){
            if (password == 24){
                System.out.println("Pasword Benar");
                addpenumpang(15);
            }
            else {
                System.out.println("Pasword Salah");
            }          
        }
        public double getAverage(){
            return penumpang/counter;            
        }
        public void cetakpenumpang(){
            System.out.println("Penumpang Bus Sekarang = "+penumpang);
            System.out.println("Maksimum penumpang yang seharusnya adalah "+maxpenumpang);
    }
}
public class cetakPenumpang {
    public static void main (String[]args){
         Bus3 Buss = new Bus3(5);
            Buss.getpenumpang(17);
            Buss.getpenumpang(24);
            Buss.cetakpenumpang();
            
            //penambahan penumpang
            Buss.addpenumpang (2); //tambah 2 penumpang
            Buss.cetakpenumpang();
            
            //penambahan penumpang
            Buss.addpenumpang (1); //tambah 1 penumpang
            Buss.cetakpenumpang();
            
            //penambahan penumpang
            Buss.addpenumpang (2); //tambah 2 penumpang
            Buss.cetakpenumpang();
            
             //penambahan penumpang
            Buss.addpenumpang (2); //tambah 1 penumpang
            Buss.cetakpenumpang();
            
            System.out.println("Rata-rata penumpang : " + Buss.getAverage());            
    }
}
