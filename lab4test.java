package daddy;

public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(3, 4);
        
        p1.setXY(1, 2);
        System.out.println("Point1: " + p1.getXY()[0] + ", " + p1.getXY()[1]);
        
        System.out.println("Point2: " + p2);
        
        System.out.println("Distance from P1 to P2: " + p1.distance(p2));
        System.out.println("Distance from P2 to Origin: " + p2.distance());
    }
}
