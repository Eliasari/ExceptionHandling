package oop;
class EncapSiswa{
    private String name;
    private String address;
    private int absen;
    
    public int getAbsen(){
        return absen;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public void setAge (int newAbsen){
        absen = newAbsen;
    }
    public void setName (String newName){
        name = newName;
    }
    public void getAddress(String newAddress){
        address = newAddress;
    }
        
}
public class TestSiswa {
    public static void main(String[]args){
        EncapSiswa siswa = new EncapSiswa();
        siswa.setName("Julian");
        siswa.setAge(23);
        siswa.getAddress("Malang");
        
        System.out.println("Name : "+ siswa.getName() + " Absen : " + siswa.getAbsen()+ " Address : " + siswa.getAddress() );
    }
}
