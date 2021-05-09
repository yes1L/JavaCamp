package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {new SmsLogger(), new EmailLogger(), new FileLogger()};
		
		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer engin = new Customer(1, "Engin", "Demiro�");
		Customer rabia = new Customer(2, "Rabia", "G�l");
		Customer mustafa = new Customer(3, "Mustafa", "Ye�il");
		customerManager.add(engin);
		
		Customer[] customers = new Customer[] {engin, rabia, mustafa};
				
	}

}
