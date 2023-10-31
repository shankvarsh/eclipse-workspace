package sem2;
import java.util.Scanner;

interface Poly{
    double area();
    double perimeter();
}

class Squ implements Poly{
    double side;
    Squ(){
        side=0.0;
    }
    Squ(double a){
        side=a;
    }
    public double area(){
        return side*side;
    }
    public double perimeter(){
        return 4*side;
    }
}

class Rect implements Poly{
    double length,width;
    Rect(){
        length=0.0;width=0.0;
    }
    Rect(double a,double b){
        length=a;width=b;
    }
    public double area(){
        return length*width;
    }
    public double perimeter(){
        return 2*(length+width);
    }
}

class Tri implements Poly{
    double a,b,c;
    Tri(){
        a=b=c=0.0;
    }
    Tri(double x,double y,double z){
        a=x;b=y;c=z;
    }
    public double area(){
        double s=(a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    public double perimeter(){
        return a+b+c;
        
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enter your choice:\n1.Square\n2.Rectangle\n3.Triangle\n4.Exit");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                        System.out.println("Enter side of the square");
                        double s=sc.nextDouble();
                        Square sq = new Square(s);
                        System.out.println("Perimeter of the Square: "+sq.perimeter());
                        System.out.println("Area of the square :"+sq.area());
                        break;
                case 2: 
                        System.out.println("Enter the length and width of Rectangle");
                        double l=sc.nextDouble(),w=sc.nextDouble();
                        Rectangle r = new Rectangle(l, w);
                        System.out.println("Perimeter of the Rectangle: "+r.perimeter());
                        System.out.println("Area of the Rectangle :"+r.area());
                        break;
                case 3: 
                        System.out.println("Enter the sides of triangle: ");
                        double a=sc.nextDouble(),b=sc.nextDouble(),c=sc.nextDouble();
                        Triangle t = new Triangle(a,b,c);
                        System.out.println("Area of the Triangle :"+t.area());
                        System.out.println("Perimeter of the Triangle: "+t.perimeter());
                        break;

                case 4:
                        System.out.println("TERMINATED!");
                        sc.close();
                        System.exit(0);
            }

        }while(true);
        
    }
}

