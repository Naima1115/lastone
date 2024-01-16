package encapsulations;

public class BankAccount {
	
	private String accountNumber;
	private double balance;
	
	public String getAccount() {
		return accountNumber;
	}
	
	public void setAccount(String number) {
		this.accountNumber= number;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double blnc) {
		this.balance= blnc;
	}
	

	public static void main(String[] args) {
		
	BankAccount obj= new BankAccount();
	obj.setAccount("sb_0908");
	obj.setBalance(2000.0);
	String accountNumber= obj.getAccount();
	double balance= obj.getBalance();
	System.out.println("accountNumber:"+" "+ accountNumber);
	System.out.println("balance:"+" "+balance);

	}

}
