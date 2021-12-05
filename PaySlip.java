package myProject3;
import java.util.*;

class Employee {
	String emp_name,address,mail_id,emp_id;
	int mobile_num;
	public void set_info() {
		Scanner in=new Scanner(System.in);
		System.out.println("Name: ");
		String emp_name=in.nextLine();
		this.emp_name=emp_name;
		System.out.println("Employee ID: ");
		String emp_id=in.nextLine();
		this.emp_id=emp_id;
		System.out.println("Mail ID: ");
		String mail_id=in.nextLine();
		this.mail_id=mail_id;
		System.out.println("Address: ");
		String address=in.nextLine();
		this.address=address;
		System.out.println("Mobile number: ");
		int mobile_num=Integer.parseInt(in.nextLine());
		in.nextLine();
		this.mobile_num=mobile_num;
	}
	
	
	public void Display() {
		System.out.println("----------------PAY SLIP----------------");
		System.out.println("Name:"+this.emp_name);
		System.out.println("Employee ID: "+this.emp_id);
		System.out.println("Mail ID: "+this.mail_id);
		System.out.println("Address: "+this.address);
		System.out.println("Mobile N0.: "+this.mobile_num);
    }

}
class Programmer extends Employee{
	double basicPay,DA,HRA,PF,CF,grossSalary,netSalary;
	public void calculateSalary(double bp) {
		this.basicPay=bp;
		DA=0.97*basicPay;
		HRA=0.1*basicPay;
		PF=0.12*basicPay;
		CF=0.001*basicPay;
		grossSalary=basicPay+HRA+DA;
		netSalary=grossSalary-PF-CF;
	}
	public void printPaySlip() {
        
        System.out.println("---------------------------------------");
        System.out.println("BASIC PAY: Rs " + basicPay);
        System.out.println("DEARNESS ALLOWANCE: Rs " + DA);
        System.out.println("HOUSE RENT ALLOWANCE: Rs " + HRA);
        System.out.println("PROVIDENT FUND: Rs " + PF);
        System.out.println("STAFF CLUB FUND: Rs " + CF);
        System.out.println("GROSS SALARY: Rs " + grossSalary);
        System.out.println("NET SALARY: Rs " + netSalary);
        System.out.println("---------------------------------------");
    }
	
}
class Team_Lead extends Employee{
	double basicPay,DA,HRA,PF,CF,grossSalary,netSalary;
	public void calculateSalary(double bp) {
		this.basicPay=bp;
		DA=0.97*basicPay;
		HRA=0.1*basicPay;
		PF=0.12*basicPay;
		CF=0.001*basicPay;
		grossSalary=basicPay+HRA+DA;
		netSalary=grossSalary-PF-CF;
	}
	public void printPaySlip() {
        
        System.out.println("---------------------------------------");
        System.out.println("BASIC PAY: Rs " + basicPay);
        System.out.println("DEARNESS ALLOWANCE: Rs " + DA);
        System.out.println("HOUSE RENT ALLOWANCE: Rs " + HRA);
        System.out.println("PROVIDENT FUND: Rs " + PF);
        System.out.println("STAFF CLUB FUND: Rs " + CF);
        System.out.println("GROSS SALARY: Rs " + grossSalary);
        System.out.println("NET SALARY: Rs " + netSalary);
        System.out.println("---------------------------------------");
    }
	
}
class Ass_ProjectManager extends Employee{
	double basicPay,DA,HRA,PF,CF,grossSalary,netSalary;
	public void calculateSalary(double bp) {
		this.basicPay=bp;
		DA=0.97*basicPay;
		HRA=0.1*basicPay;
		PF=0.12*basicPay;
		CF=0.001*basicPay;
		grossSalary=basicPay+HRA+DA;
		netSalary=grossSalary-PF-CF;
	}
	public void printPaySlip() {
        
        System.out.println("---------------------------------------");
        System.out.println("BASIC PAY: Rs " + basicPay);
        System.out.println("DEARNESS ALLOWANCE: Rs " + DA);
        System.out.println("HOUSE RENT ALLOWANCE: Rs " + HRA);
        System.out.println("PROVIDENT FUND: Rs " + PF);
        System.out.println("STAFF CLUB FUND: Rs " + CF);
        System.out.println("GROSS SALARY: Rs " + grossSalary);
        System.out.println("NET SALARY: Rs " + netSalary);
        System.out.println("---------------------------------------");
    }
}
class ProjectManager extends Employee{
	double basicPay,DA,HRA,PF,CF,grossSalary,netSalary;
	public void calculateSalary(double bp) {
		this.basicPay=bp;
		DA=0.97*basicPay;
		HRA=0.1*basicPay;
		PF=0.12*basicPay;
		CF=0.001*basicPay;
		grossSalary=basicPay+HRA+DA;
		netSalary=grossSalary-PF-CF;
	}
	public void printPaySlip() {
        
        System.out.println("---------------------------------------");
        System.out.println("BASIC PAY: Rs " + basicPay);
        System.out.println("DEARNESS ALLOWANCE: Rs " + DA);
        System.out.println("HOUSE RENT ALLOWANCE: Rs " + HRA);
        System.out.println("PROVIDENT FUND: Rs " + PF);
        System.out.println("STAFF CLUB FUND: Rs " + CF);
        System.out.println("GROSS SALARY: Rs " + grossSalary);
        System.out.println("NET SALARY: Rs " + netSalary);
        System.out.println("---------------------------------------");
    }
	
}

public class PaySlip{
	public static void main(String args[]) {
		Scanner in =new Scanner(System.in);
        Employee ob=new Employee();
		ob.set_info();
		Programmer ob1=new Programmer();
		Team_Lead ob2=new Team_Lead();
		Ass_ProjectManager ob3=new Ass_ProjectManager();
		ProjectManager ob4=new ProjectManager();
		
		while(true)
        {
            menu();
            int choice=in.nextInt();
            double bp;
            if(choice==1)
            {
                ob.Display();
                System.out.println("Designation: Programmer");
                System.out.print("Basic Pay : Rs ");
                bp=in.nextDouble();
                ob1.calculateSalary(bp);
                ob1.printPaySlip();
                break;

            }
            else if(choice==2)
            {
                ob.Display();
                System.out.println("Designation: Team Lead");
                System.out.print("Basic pay : Rs ");
                bp=in.nextDouble();
                ob2.calculateSalary(bp);
                ob2.printPaySlip();
                break;

            }
            else if(choice==3)
            {
                ob.Display();
                System.out.println("Designation: Assistant Project Manager");
                System.out.print("Basic pay : Rs ");
                bp=in.nextDouble();
                ob3.calculateSalary(bp);
                ob3.printPaySlip();
                break;
            }
            else if(choice==4)
            {
                ob.Display();
                System.out.println("Designation: Project Manager");
                System.out.print("Basic pay : Rs ");
                bp=in.nextDouble();
                ob4.calculateSalary(bp);
                ob4.printPaySlip();
                break;

            }
            else if(choice==5)
            {
                System.out.println("Thank you...");
                System.exit(1);
                break;
            }

        }

    }
    public static void menu()
    {
        System.out.println("Kindly Choose Your Designation :");
        System.out.println("1.Programmer\n2.Team Lead");
        System.out.println("3.Assistant Project Manager\n4.Project Manager");
        System.out.println("5.Exit");
    }	    	
}

