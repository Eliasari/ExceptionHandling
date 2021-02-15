package studiKasus;
class keretaApi{
    private double penumpang;
    private double maxpenumpang;
    private double counter;
    public double penumpangBaru;
    public double hargaTiket; 
    private char namaPenumpang;
    
    keretaApi(int maxpenumpang){
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }
    public void addpenumpang(int penumpang){
        int temp;
        temp = (int) (this.penumpang + penumpang);
        if(temp > maxpenumpang){
            System.out.println("penumpang melebihi kuota");
        }
        else { 
            this.penumpang = temp;
            counter++;
        }       
    }
    public void getpenumpang(double gerbongKereta){
            if (gerbongKereta == 03){
                System.out.println("Masuk gerbong kereta yang tepat");
                addpenumpang(10);
            }
            else {
                System.out.println("Masuk gerbong kereta yang salah");
            }          
        }
    public double getAverage(){
        return penumpang/counter;            
    }
    public void addpembayaran (){
        hargaTiket = 150000;
        double pembayaran = penumpang*hargaTiket;
        System.out.println("Pembayaran Tiket sekarang : Rp." + pembayaran);       
    }        
    public void getTotalPembayaran(){
        System.out.println(" Rp."+ hargaTiket*penumpang);                  
    }
    public void cetakpenumpang(){
        System.out.println("Penumpang kereta api sekarang : "+penumpang +" orang");
        System.out.println("Maksimum penumpang kereta api yang seharusnya : "+maxpenumpang + " orang");
    }
    private void namaPenumpang(){
        System.out.println("Nama Penumpang : elia sari ulala" +namaPenumpang);
    }
}
public class studiKasusEnkapsulasi {
    public static void main (String[]args){
        keretaApi kereta = new keretaApi(28);
        kereta.getpenumpang(03);   
        System.out.println("");
        kereta.cetakpenumpang();
        kereta.addpembayaran();
        System.out.println("");
        kereta.addpenumpang (10); 
        kereta.cetakpenumpang();
        kereta.addpembayaran();
        System.out.println("");
        kereta.addpenumpang (10); 
        kereta.cetakpenumpang();
        kereta.addpembayaran();
        System.out.println("");
        kereta.addpenumpang (8); 
        kereta.cetakpenumpang();
        kereta.addpembayaran();
        System.out.println("");
        
        System.out.println("Rata-rata penumpang : " + kereta.getAverage());
        System.out.println("");
        System.out.println("---------Pembayaran Total---------");
        kereta.getTotalPembayaran(); 
    }
}

