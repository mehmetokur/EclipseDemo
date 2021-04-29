package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCostumer okur = new IndividualCostumer();
		okur.customerNumber="123";
		CorporateCustomer mmtoys = new CorporateCustomer();
		mmtoys.customerNumber= "456";
		
		CustomerManager customerManager = new CustomerManager();
		
		Customer[] customers = {okur,mmtoys};
		
		customerManager.addMultiple(customers);
	}

}
