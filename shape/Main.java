package shape;

interface Shapes {
  default double getArea(){
      return 50;
  }
}

class Circle implements Shapes{
        int radius;
        public Circle(int radius){
            this.radius = radius;
        }


    public double getArea() {
     double pi = 3.14;
     double area = radius * radius * pi;
        return area;
    }
}

class Square implements Shapes{
    int length;
    public Square(int length) {
        this.length = length;
    }
    public double getArea() {
     int area = length * length;
        return area;
    }
}

class DefaultShape implements Shapes{

}

public class Main{
    public static void main(String[] args) {
        Shapes circle = new Circle(5);
        double area = circle.getArea();
        Shapes square = new Square(7);
       double area2 = square.getArea();
        System.out.println(area);
        System.out.println(area2);

        DefaultShape df = new DefaultShape();
        double dfarea = df.getArea();
        System.out.println(dfarea);
    }
}
