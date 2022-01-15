package Demo;

public class BehavioralDesignPattern {
	
	public static void main(String[] args) {
		Approver assistMngr, mngr, rtgsMngr;
		Loan loan;
		
		assistMngr = new AssistantBankManager();
		mngr = new BankManager();
		rtgsMngr = new RTGSManager();
		
		assistMngr.passToSuccessor(mngr);
		mngr.passToSuccessor(rtgsMngr);
		
		loan = new Loan("2022-J-15", 3000000, "John Doe");
		assistMngr.processRequest(loan);
		
		loan = new Loan("2022-J-16", 200000, "Susan Stones");
		assistMngr.processRequest(loan);
		
		loan = new Loan("2022-J-17", 4000000, "Peter Parker");
		assistMngr.processRequest(loan);
	}

}

class Loan {
	String loanId;
	String customerName;
	float loanAmount;
	
	public Loan(String id, float amt, String name) {
		this.loanId = id;
		this.customerName = name;
		this.loanAmount = amt;
	}
	
	public String getLoanId() {
		return this.loanId;
	}
	
	public float getLoanAmount() {
		return this.loanAmount;
	}
	
	public String getCustomerName() {
		return this.customerName;
	}
}

abstract class Approver {
	protected Approver successor;
	
	public void passToSuccessor(Approver successor) {
		this.successor = successor;
	}
	
	public abstract void processRequest(Loan loan);
}

class AssistantBankManager extends Approver {

	@Override
	public void processRequest(Loan loan) {
		if (loan.getLoanAmount() < 1000000) {
			System.out.println(this.getClass().getSimpleName() + " approved loan request id: " + loan.getLoanId() + " for customer " + loan.getCustomerName());
		}
		else if (successor != null) {
			successor.processRequest(loan);
		}
	}
	
}

class BankManager extends Approver {

	@Override
	public void processRequest(Loan loan) {
		if (loan.getLoanAmount() < 3000000) {
			System.out.println(this.getClass().getSimpleName() + " approved loan request id: " + loan.getLoanId() + " for customer " + loan.getCustomerName());
		}
		else if (successor != null) {
			successor.processRequest(loan);
		}
	}
	
}

class RTGSManager extends Approver {

	@Override
	public void processRequest(Loan loan) {
		if (loan.getLoanAmount() < 5000000) {
			System.out.println(this.getClass().getSimpleName() + " approved loan request id: " + loan.getLoanId() + " for customer " + loan.getCustomerName());
		}
		else if (successor != null) {
			successor.processRequest(loan);
		}
	}
	
}