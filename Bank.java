package Basic_Java;

public class Bank {

	public String account_type="Savings";
	public void customer_details() {
		System.out.println("This customer has account in the bank");
	}
	
	class customer1 extends Bank{
		public void customer_details() {
			int id = 234;
			String name = "Luis";
			String place = "Bangalore";
			double income = 75000.0;
		System.out.println("Customer1 details: " +id+ " " +name+ " " +place+ " " +income);
		}
	}
	
	class customer2 extends Bank{
		public void customer_details() {
			int id = 435;
			String name = "Sara";
			String place = "Mumbai";
			double income = 105000.0;
		System.out.println("Customer1 details: " +id+ " " +name+ " " +place+ " " +income);
		}
	}
	
	class customer3 extends Bank{
		public void customer_details() {
			int id = 879;
			String name = "Keya";
			String place = "Kolkata";
			double income = 25000.0;
		System.out.println("Customer1 details: " +id+ " " +name+ " " +place+ " " +income);
		}
	}
}
	
	class Main{
		public static void main(String[] args) {
			Bank account_holder = new Bank();
			account_holder.customer_details();
			Bank cx1 = new Bank();
			Bank cx2 = new Bank();
			Bank cx3 = new Bank();
			cx1.customer_details();
			cx2.customer_details();
			cx3.customer_details();
	
		}
	}

