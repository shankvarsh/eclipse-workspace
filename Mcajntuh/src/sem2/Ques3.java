package sem2;

import java.util.Scanner;

class Complex{
    Scanner sc=new Scanner(System.in);
    private double re;
    private double img;
    Complex(){
        this.re=0;
        this.img=0;
    }
    Complex(double x){
        this.re=x;
        this.img=x;
    }
    Complex (double x, double y){
        this.re=x;
        this.img=y;
    }
    //Method to read complex number
    public void readComplex(){
        System.out.println("Enter real and imaginary numbers:  ");
        this.re=sc.nextDouble();
        this.img=sc.nextDouble();
    }
    //Method to Display Complex number
    public void displayComplex(){
        System.out.println(this.re + "+i"+this.img);
    }
    //Method to Add two Complex numbers
    public Complex addComplex(Complex c){
        Complex sum=new Complex();
        sum.re=this.re+c.re;
        sum.img=this.img+c.img;
        return sum;
    }
    //Method to Mulitply two Complex numbers
    public Complex multiplyComplex(Complex c){
        Complex mul=new Complex();
        mul.re=(this.re*c.re)-(this.img*c.img);
        mul.img=(this.re*c.img)+(this.img*c.re);
        return mul;
    }

}

public class Ques3 {
    public static void main(String[] args) {
        Complex c1=new Complex();
        c1.readComplex();
        Complex c2=new Complex(); 
        c2.readComplex();
        Complex c3;
        System.out.println("The two complex numbers are ");
        c1.displayComplex();
        c2.displayComplex();
        System.out.println("After addition : ");
        c3=c1.addComplex(c2);
        c3.displayComplex();
        System.out.println("After multiplication : ");   
        c3=c1.multiplyComplex(c2);
        c3.displayComplex();
    }
}

