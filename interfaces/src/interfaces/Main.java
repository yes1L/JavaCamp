package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {new SmsLogger(), new EmailLogger(), new FileLogger()};
		
		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer engin = new Customer(1, "Engin", "Demiroð");
		Customer rabia = new Customer(2, "Rabia", "Gül");
		Customer mustafa = new Customer(3, "Mustafa", "Yeþil");
		customerManager.add(engin);
		
		Customer[] customers = new Customer[] {engin, rabia, mustafa};
				
	}

}
