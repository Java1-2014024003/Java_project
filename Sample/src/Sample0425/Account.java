package Sample0425;

public class Account {
	private int regNumber;
	private String name;
	private int balance;
	
	Account(int regNumber, String name, int balance){
		this.regNumber = regNumber;
		this.name = name;
		this.balance = balance;
	}
	
	Account(){
		/*regNumber = 1;
		name = "2";
		balance = 10000;*/
		this(1, "2", 10000);
	}
	
	public String getName() {
		return name;
		}
	public void setName(String name) {
		this.name = name;
		}
	public int getBalance() {
		return balance;
		}
	public void setBalance(int balance) {
		this.balance = balance;
		}
	
	/*public int getRegNumber() {
		return regNumber;
	}

	public void setRegNumber(int regNumber) {
		this.regNumber = regNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void setName(String name) {
		this.name = name;
	}*/
}