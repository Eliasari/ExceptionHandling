package polymorphism;
public class Shape {
    //private member variable
    private String color;
    //constructor
    public Shape (String color){
        this.color = color;
    }
    @Override
    public String toString(){
        return "Shape[color=" + color + "]";
    }
    //All shapes must have a method called getArea().
    public double getArea(){
        //we need to return dome value to compile the progra,.
        System.err.println("Shape unknown! Cannot compute area!");
        return 0;
    }
}
