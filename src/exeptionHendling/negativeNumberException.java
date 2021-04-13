package exeptionHendling;
public class negativeNumberException extends Exception{
    
    private int bilangan;
    
    // default constructor
    public negativeNumberException() {
    }
    // constructor dengan parameter bertipe String
    public negativeNumberException(String pesan) {
        super(pesan);
    }
    // constructor dengan parameter bertipe String dan int
    public negativeNumberException(String pesan, int nilai) {
        super(pesan);
        bilangan = nilai;
    }
    public int getBilangan() {
        return bilangan;
    }
}
