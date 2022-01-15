package Demo;

import java.util.Scanner;

public class FactoryDesignPattern {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		NetflixPlanFactory planFactory = new NetflixPlanFactory();
		System.out.println("Enter plan...");
		String userChoice = sc.next();
		System.out.println("Enter number of months...");
		int userMonths = sc.nextInt();
		NetflixPlan plan =  planFactory.getPlan(userChoice);
		int userCost = plan.getFinalAmount(userMonths);
		System.out.println("Cost of plan: $" + userCost);		
		sc.close();
		
	}

}

class NetflixPlanFactory {
	
	public NetflixPlan getPlan(String plan) {
		if (plan == null) {
			return null;
		}
		else if (plan.equalsIgnoreCase("basic")) {
			return new BasicPlan();
		}
		else if (plan.equalsIgnoreCase("standard")) {
			return new StandardPlan();
		}
		else if (plan.equalsIgnoreCase("premium")) {
			return new PremiumPlan();
		}
		return null;
	}
}
	
abstract class NetflixPlan {
	protected int price;
	abstract int getPrice();
		
	public int getFinalAmount(int months) {
		return getPrice() * months;
	}
}	

class BasicPlan extends NetflixPlan {

	@Override
	public int getPrice() {
		this.price = 499;
		return price;
	}
	
}

class StandardPlan extends NetflixPlan {

	@Override
	public int getPrice() {
		this.price = 649;
		return price;
	}
	
}

class PremiumPlan extends NetflixPlan {

	@Override
	public int getPrice() {
		this.price = 799;
		return price;
	}
	
}