

public abstract class ATM {

        public abstract void withdraw(double amount);

        public abstract void deposit(double amount);

        public abstract void transfer(double amount);
}
class ICICIBank extends ATM {

        @Override
        public void withdraw(double amount) {
              System.out.println("ICICI Bank Withdraw functionality");
        }

        @Override
        public void deposit(double amount) {
                System.out.println("ICICI Bank Deposit functionality");
        }

        @Override
        public void transfer(double amount) {
                System.out.println("ICICI Bank Transfer functionality");
        }

        public static void main(String[] args) {
            
                ICICIBank icici = new ICICIBank();
                icici.withdraw(1000);
                icici.deposit(2000);
                icici.transfer(3000);
        }
}
class HDFCBank extends ATM {

    @Override
    public void withdraw(double amount) {
          System.out.println("HDFCBank Bank Withdraw functionality");
    }

    @Override
    public void deposit(double amount) {
            System.out.println("HDFCBank Bank Deposit functionality");
    }

    @Override
    public void transfer(double amount) {
            System.out.println("HDFCBank Bank Transfer functionality");
    }

    public static void main(String[] args) {
        
             HDFCBank hdfc = new HDFCBank();
             hdfc.withdraw(1000);
             hdfc.deposit(2000);
             hdfc.transfer(3000);
    }
}
