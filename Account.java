public class Account {

		private static int numAccounts = 0;
				
		public Account() {
			numAccounts++;   
		}
		
		public static int getNumAccounts() {    
			return numAccounts;
		}
		
		public static void main(String[] args) {
      new Account();
	    new Account();
		  new Account();
		  new Account();
			
			System.out.println("Account created: " + Account.getNumAccounts());
		
		}
	
	}
