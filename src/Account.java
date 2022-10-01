public class Account {
  private int Account_no;
  private String Name, History = "";
  static int count = 0;
  private double Balance;
  private double withdrawAmount;


    public Account() {
        History += "Welcome Mr/Miss. Your acoount is created with " + getBalance() + " balance\n";
        count++;
    }

    public Account(int Account_no,  String Name, double Balance){
        this.Account_no = Account_no;
        this.Name = Name;
        this.Balance = Balance;
        if(Balance > 0){
            this.Balance = Balance;

        }
        else{
            this.Balance = 0;

        }
        History += "Welcome Mr/Miss. Your acoount is created with " + getBalance() + " balance\n";
        count++;
    }

    public int getAccount_no() {
        return Account_no;
    }

    public void setAccount_no(int Account_no) {
        this.Account_no = Account_no;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAccountHistory() {
        return History;
    }

    public void setHistory(String History) {
        this.History = History;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double Balance) {
        if(Balance > 0){
            this.Balance = Balance;

        }
        else{
            this.Balance = 0;

        }
        History += Balance + " Was set \n";
    }
    public static int getNumberOfAccountCreated(){
        return count;
    }
    public void Deposit(double Balance) {
        if (Balance > 0) {
            this.Balance += Balance;
            History += Balance + " deposited \n";

        }
        else{
            this.Balance += 0;
        }

        }
    public void withdraw(double withdrawAmount)
    {
            if (withdrawAmount > Balance)
                System.out.println("Withdrawal amount exceeded account balance");
            else
                Balance = Balance - withdrawAmount;
            History += withdrawAmount + " withdrawn \n";
    }






    @Override
    public String toString() {
        return "Account number: " + Account_no + "\n" + "Name: " + Name + "\n" + "Balance: " + Balance + "\n" +  "History: " + History + "======================" + "\n";
    }
}
