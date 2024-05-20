package entities;

public class User {

		private int accountNumber;
		private String userName;
		private double money;
		
		
		public User(int accountNumber, String userName, double money) {
			super();
			this.accountNumber = accountNumber;
			this.userName = userName;
			this.money = money;
		}


		public User(int accountNumber, String userName) {
			super();
			this.accountNumber = accountNumber;
			this.userName = userName;
		}


		public int getAccountNumber() {
			return accountNumber;
		}



		public String getUserName() {
			return userName;
		}


		public void setUserName(String userName) {
			this.userName = userName;
		}


		public double getMoney() {
			return money;
		}

		
		public void deposit(double value){
			
			money += value;
			
		}
		
		public void withdraw(double value){
			
			money -= value + 5;
			
		}
		
		public String toString() {
			
			return "Account: " + accountNumber + ", User: " + userName + ", Balance: " + money;
			
		}

}
