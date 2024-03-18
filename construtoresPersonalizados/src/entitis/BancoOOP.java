package entitis;

public class BancoOOP {

	private int numberAccount ;
	private String holder;
	private double money;
	
	
	public BancoOOP (int conta, String name, double depositoInicial) {
		 this.holder = name;
		 this.numberAccount = conta;
		 deposito(depositoInicial);
	 }
	
	public BancoOOP(int numberAccount, String holder) {
		this.numberAccount = numberAccount;
		this.holder = holder;
	}

	public int getNumberAccount() {
		return numberAccount;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getMoney() {
		return money;
	}

   public void deposito (double deposito) {
	   money += deposito;
	   
   }
   public void saque (double saque) {
	   money -= saque + 5.00;
	   
   }
   
   public String toString() {
		return "Conta "
				+ numberAccount
				+ ", titular: "
				+ holder
				+ ", Saldo: $ "
				+ String.format("%.2f", money);
	}
	
	
	
	
}


 