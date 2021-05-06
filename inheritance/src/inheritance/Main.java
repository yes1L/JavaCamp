package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer engin = new IndividualCustomer();
		engin.customerNumber="12345";
		
		
		CorporateCustomer hepsiburada = new CorporateCustomer();
		hepsiburada.customerNumber = "78910";
		
		CustomerManager customerManager = new CustomerManager();
		
		Customer[] customers = {engin, hepsiburada};
		
		customerManager.addMultiple(customers);
		
	}

}
