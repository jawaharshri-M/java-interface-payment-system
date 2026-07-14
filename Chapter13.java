package minipro;

interface Payment{
	void pay(double amount);


	
}
interface Receipt{
	void PrintReceipt();
}
class Googlepay implements Payment,Receipt{
	public void pay(double amount) {
		System.out.println("Googlepay payment successfull");
		
	}
	public void PrintReceipt() {
		System.out.println("receipt");
	}
}
class Phonepe implements Payment,Receipt{
public 	void pay(double Payment) {
	System.out.println("Phonepe payment successfull");
	
		
	}
public void PrintReceipt() {
	System.out.println("Receipt");
}
}
class CreditCard implements Payment,Receipt{
	public void pay ( double amount) {
		System.out.println("credit bill payment successfull");
		
	}
	public void PrintReceipt() {
		System.out.println("Receipt");
	}
	
}
class Cash implements Payment,Receipt{
	public void pay(double amount) {
		System.out.println("cash payed successfull");
		
	}
	public void PrintReceipt() {
		System.out.println("Receipt");
	}
}




public class Chapter13 {
	public static void main(String[] args) {
		Payment p;
		p=new Googlepay();
		p.pay(10000.2);
		Receipt R;
		R=new Googlepay();
		R.PrintReceipt();
		
		Payment P1;
		P1=new Phonepe();
		P1.pay(10000.1);
		Receipt r1;
		r1=new Phonepe();
		r1.PrintReceipt();
		
		Payment p2;
		p2=new CreditCard();
	p2.pay(10000.2);
		Receipt r2;
		r2=new CreditCard();
		r2.PrintReceipt();
		
		Payment p3;
		p3=new  Cash();
		p3.pay(10000.1);
		Receipt r3;
		r3=new Cash();
		r3.PrintReceipt();
		
	}

}
