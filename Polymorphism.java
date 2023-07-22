package myProject2;
class Publication {
  private String title;
  private double price;
  private int copies;

  public Publication(String title, double price, int copies) {
    setTitle(title);
    setPrice(price);
    setCopies(copies);
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getCopies() {
    return this.copies;
  }

  public void setCopies(int qty) {
    this.copies = qty;
  }

  public double getPrice() {
    return this.price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void sellCopy(int qty) {
    System.out.println("Total Publication Sale : Rs " + qty * price);
    System.out.println("Original Method called");
  }

}

class Book extends Publication {
  private String author;

  public Book(String author, String title, double price, int copies) {
    super(title, price, copies);
    setAuthor(author);
  }

  public String getAuthor() {
    return this.author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public void orderCopies(int copies) {
    int totalCopies = getCopies() + copies;
    setCopies(totalCopies);
    System.out.println(copies + " copies ordered");
    System.out.println("Total copies : " + totalCopies);
  }
  @Override
  public void sellCopy(int qty) {
    System.out.println("Total Book Sales of book " + getTitle() + " are : Rs " + qty * getPrice());
    System.out.println("Overriden method called");
  }

}

class Magazine extends Publication {
  private int orderQty;
  private String currIssue;

  public Magazine(String title, double price, int orderQty, String currIssue) {
    super(title, price, orderQty);
    setCurrIssue(currIssue);
    setOrderQty(orderQty);
  }

  public int getOrderQty() {
    return this.orderQty;
  }

  public void setOrderQty(int orderQty) {
    this.orderQty = orderQty;
  }

  public String getCurrIssue() {
    return this.currIssue;
  }

  public void setCurrIssue(String currIssue) {
    this.currIssue = currIssue;
  }

  public void recvNewIssue(String newIssue) {
    setCopies(getOrderQty());
    setCurrIssue(newIssue);
    System.out.println("Issue updated to " + newIssue);
  }
  @Override
  public void sellCopy(int qty) {
    System.out.println("Total Magazine Sales of Magazine " + getTitle() + " are : Rs " + qty * getPrice());
  }
}





package myProject2;
import java.util.*;

public class Main {
	  public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    String title, author;
	    int copies;
	    double price;
	    int orderedCopies;

	    System.out.println("Enter book's details : ");
	    System.out.print("Title : ");
	    title = in.nextLine();
	    System.out.print("Author : ");
	    author = in.nextLine();
	    System.out.print("Price : ");
	    price = in.nextDouble();
	    System.out.print("Books ordered initially : ");
	    copies = in.nextInt();

	    System.out.print("Enter number of more copies to order : ");
	    orderedCopies = in.nextInt();

	    Book b1 = new Book(author, title, price, copies);
	    b1.orderCopies(orderedCopies);
	    b1.sellCopy(b1.getCopies());
	    
	    System.out.println("New object created of class Book to show Method Overriding");
	    Publication p1 = new Book(author, title, price, copies);
	    p1.sellCopy(orderedCopies);
	    
	    Publication p2 = new Publication(title, price, copies);
	    p2.sellCopy(orderedCopies);
	    
	    in.close();
	  }
}



