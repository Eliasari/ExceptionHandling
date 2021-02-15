package polymorphism;
public class pengujianRelationLine {
    public static void main (String[]args){
        Line line1 = new Line(1,2,3,4);
        Line line2 = new Line(1,2,3,4);
        line1.getLength();
        line2.getLength();
        
        System.out.println("line 1 > line 2 = "+line1.isGreater(line1,line2));
        System.out.println("line 1 < line 2 = "+line1.isLess(line1,line2));
        System.out.println("line 1 == line 2 = "+line1.isEqual(line1,line2));
    }
}
