package Basic_Java;

public class Bank_overidding {

	public String account_type="Savings";
	public void customer_details() {
		System.out.println("This customer has account in the bank");
	}
	void customer() {
		System.out.println("This customer dnt have accout in this bank");
	}
}
	
	class customer1 extends Bank_overidding{
		public void customer_details() {
			int id = 234;
			String name = "Luis";
			String place = "Bangalore";
			double income = 75000.0;
		System.out.println("Customer1 details: " +id+ " " +name+ " " +place+ " " +income);
		}

		@Override
		public void customer() {
			System.out.println("This is overriding method");
		}
	}
	

	class Myclass{
		public static void main(String[] args) {
			
			Bank_overidding cx1 = new Bank_overidding();
			cx1.customer_details();
			Bank_overidding customer = new customer1();
			customer.customer_details();
			customer.customer();
			
	
		}
	}


