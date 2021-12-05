package myProject4;
import java.util.*;

abstract class Shape{
    abstract public void ComputeArea();
}

class Rectangle extends Shape{
	double length,breadth;
	public void set_info() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Kindly enter the length and breadth in cm");
		System.out.print("Length : " );
		double length=sc.nextDouble();
		this.length=length;
		System.out.print("Breadth : ");
		double breadth=sc.nextDouble();
		this.breadth=breadth;
		sc.close();
	}
	@Override
	public void ComputeArea() {
		System.out.println("Area of Rectangle : "+(length*breadth)+" cm^2");
	}
}

class Triangle extends Shape{
	double base,height;
	public void set_info() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Kindly enter the base length and height in cm");
		System.out.print("Base Length : " );
		double base=sc.nextDouble();
		this.base=base;
		System.out.print("Height : ");
		double height=sc.nextDouble();
		this.height=height;
		sc.close();
	}
	@Override
	public void ComputeArea() {
		System.out.println("Area of Triangle : "+((0.5)*base*height)+" cm^2");
	}
}

public class ShapeArea {
	public static void main(String args[]) {
		System.out.println("Choose the shape : ");
		System.out.println("1.RECTANGLE\n2.TRIANGLE");
		int choice;
		Scanner sc=new Scanner(System.in);
		choice=sc.nextInt();
		
		Rectangle ob1=new Rectangle();
		Triangle ob2=new Triangle();
		
		if(choice==1) {
			ob1.set_info();
			ob1.ComputeArea();
	    }
		else if(choice==2) {
			ob2.set_info();
			ob2.ComputeArea();
	    }
	    else {
			System.out.println("Kindly choose a valid option...");
	    }
		sc.close(); 
    }
}