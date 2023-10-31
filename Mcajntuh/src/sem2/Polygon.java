package sem2;
import java.util.Scanner;

abstract class Polygonvalues{
    abstract double area();
    abstract double perimeter();
}
class Square extends Polygon{
    double side;
    Square(){
        side=0.0;
    }
    Square(double a){
        side=a;
    }
    double area(){
        return side*side;
    }
    double perimeter(){
        return 4*side;
    }
}

class Rectangle extends Polygon{
    double length,width;
    Rectangle(){
        length=0.0;width=0.0;
    }
    Rectangle(double a,double b){
        length=a;width=b;
    }
    double area(){
        return length*width;
    }
    double perimeter(){
        return 2*(length+width);
    }
}

class Triangle extends Polygon{
    double a,b,c;
    Triangle(){
        a=b=c=0.0;
    }
    Triangle(double x,double y,double z){
        a=x;b=y;c=z;
    }
    double area(){
        double s=(a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    double perimeter(){
        return a+b+c;
        
    }
}

public class Polygon{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enter option:\n1.Square\n2.Rectangle\n3.Triangle\n4.Exit");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                        System.out.println("Enter the sides of the Square");
                        double s=sc.nextDouble();
                        Square sqr = new Square(s);
                        System.out.println("Perimeter of the Square: "+sqr.perimeter());
                        System.out.println("Area of the square :"+sqr.area());
                        break;
                case 2: 
                        System.out.println("Enter the length and width of Rectangle");
                        double l=sc.nextDouble(),w=sc.nextDouble();
                        Rectangle rect = new Rectangle(l, w);
                        System.out.println("Perimeter of the Rectangle: "+rect.perimeter());
                        System.out.println("Area of the Rectangle :"+rect.area());
                        break;
                case 3: 
                        System.out.println("Enter the sides of the triangle: ");
                        double a=sc.nextDouble(),b=sc.nextDouble(),c=sc.nextDouble();
                        Triangle tri = new Triangle(a,b,c);
                        System.out.println("Perimeter of the Triangle: "+tri.perimeter());
                        System.out.println("Area of the Triangle :"+tri.area());
                        
                        break;

                case 4:
                        System.out.println("TERMINATED!!!");
                        sc.close();
                        System.exit(0);
            }

        }while(true);
        
    }
}


