package figures;

public class Square {
    private double length;

    public Square(){

    }
    public Square(double length) {
        this.length = length;
    }
    // calculate perimeter
    public double calculatePerimeter(){
        return length * 4;
    }
    //calculate area
    public double calculatearea(){
        return length * 2;
    }
    //print properties
    public void printProperties(){
        System.out.println("----------- Square Properties ----------");
        System.out.println("length:" + length + "[cm]");
        System.out.println("Perimeter:" + calculatePerimeter() + "[cm]");
        System.out.println("Area:" + 0d + "[cm2]");
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}