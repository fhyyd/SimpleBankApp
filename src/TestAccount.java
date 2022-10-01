public class TestAccount {
    public static void main(String [] args){
        Account Fahad = new Account();
        Fahad.setName("Fahad");
        Fahad.setAccount_no(1);
        Fahad.setBalance(100.0);
        Account Mohammed = new Account();
        Mohammed.setName("Mohammed");
        Mohammed.setAccount_no(2);
        Mohammed.setBalance(200.0);
        Account Anas = new Account(3,"Anas", 300.0);
        Account Ali = new Account(4, "Ali", 400.0);
        Account Faisal = new Account(5, "Faisal", 500.0);
        Fahad.Deposit(500.0);
        Mohammed.Deposit(400.0);
        Anas.withdraw(100);
        Faisal.withdraw(200);
        System.out.println(Fahad.toString());
        System.out.println(Mohammed.toString());
        System.out.println(Anas.toString());
        System.out.println(Ali.toString());
        System.out.println(Faisal.toString());
        System.out.println("Accounts created: " + Account.getNumberOfAccountCreated());


    }
}
