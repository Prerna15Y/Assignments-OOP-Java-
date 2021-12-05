package myProject;
import java.util.* ;

class OperationC{
	float real,img;
    OperationC(){
    	real=0;
    	img=0;
    }
	
OperationC(float C1,float C2){
	real=C1;
	img=C2;
}
	
public
void Add_Numbers(OperationC c1,OperationC c2) {
	float real,img;
	real=c1.real+c2.real;
	img=c1.img+c2.img;
	
System.out.println("c1 + c2 = " + "(" + real + ") + (" + img + ")i");
	
}
void Sub_Numbers(OperationC c1,OperationC c2) {
	float real,img;
	real=c1.real-c2.real;
	img=c1.img-c2.img;
	
System.out.println("c1-c2 = " + "(" + real + ") + (" + img + ")i");
}
void Multiply_Numbers(OperationC c1,OperationC c2) {
	float real,img;
	real=(c1.real*c2.real)-(c1.img*c2.img);
	img=(c1.real*c2.img)+(c1.img*c2.real);
	
System.out.println("c1 * c2 = " + "(" + real + ") + (" + img + ")i");
}
void Divide_Numbers(OperationC c1,OperationC c2) {
	float real,img;
	real = ((c1.real)*(c2.real) + (c1.img)*(c2.img))/ ( (c2.real*c2.real) + (c2.img*c2.img) ) ;
    img = ((c1.img)*(c2.real) - (c1.real)*(c2.img)) / ( (c2.real*c2.real) + (c2.img*c2.img) ) ;
System.out.println("c1 / c2 = " + "(" + real + ") + (" + img + ")i");
}
}

public class Complex{
	public static void main(String[] args) {
		OperationC c = new OperationC();
		float num1,num2;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first number : ");
		num1=input.nextFloat();     //real part
		num2=input.nextFloat();     //imaginary part
		OperationC Object1 = new OperationC(num1,num2);
		
		System.out.println("Enter the second number : ");
		num1=input.nextFloat();     //real part
		num2=input.nextFloat();     //imaginary part
		OperationC Object2 = new OperationC(num1,num2);
		
		System.out.println("1. ADDITION ");
        System.out.println("2. SUBTRACTION ");
        System.out.println("3. MULTIPLICATION ");
        System.out.println("4. DIVISION ");
        System.out.println("5. :: EXIT ::  ");
        
        System.out.print("Enter the Operation you want to perform  :" );
        int option = input.nextInt() ;
		
        if(option==5){
            System.out.println("Thanks for your input.You chose to exit.");
        }
        else if (option == 1){
        	c.Add_Numbers(Object1,Object2);    
        }
        else if (option == 2){
            c.Sub_Numbers(Object1,Object2);
        }

        else if (option == 3){
            c.Multiply_Numbers(Object1,Object2);
        }

        else if (option == 4){
        	c.Divide_Numbers(Object1,Object2);
        }

        else {
            System.out.println("Try again , your choice was out of range [ 1 - 5 ] : ");
        }
        input.close();
    }
	
}
