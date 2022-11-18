package jana60.bank;

public class Conto {
	private int accountNumber;
	public String userName;
	private int balance;
	
	public Conto(int accountNumber, String userName) {
		this.accountNumber = accountNumber;
		this.userName = userName;
		this.balance = 0;
	}
	
	// metodo per cambiare nome
	public String setName(String userName) {
		this.userName = userName;
		return this.userName;
	}
	
	// metodo per mostrare il numero del conto
	public int getAccountNumber() {
		return this.accountNumber;
	}
	// metodo per versare sul conto
	public void addMoney(int moneyToAdd) {
		this.balance += moneyToAdd;
	}
	
	// metodo per togliere denaro dal conto
	
	public void getMoney(int moneyToSub) {
		if( balance - moneyToSub >= 0 ) {
			this.balance -= moneyToSub;
		}
	}
	
	// metodo per mostrare il saldo
	
	public int getSaldo() {
		return this.balance;
	}
	
	
}
