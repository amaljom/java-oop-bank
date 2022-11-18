package jana60.bank;

public class Main {
	public static void main(String[] args) {  
		
		Conto persona1 = new Conto( 578963212 , "Gianluca");
		
		System.out.println(persona1.getAccountNumber());
	
		persona1.setName("Marco");
		
		persona1.addMoney(40);
		
		persona1.getMoney(50);
		
		System.out.println(persona1.getSaldo());
	}
}
