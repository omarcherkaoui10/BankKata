package kata;

public class BankKataTest {
    public static void main(String[] args) {
      
        Account account = new Account();
        account.deposit(1000, "10-01-2012");
        account.deposit(2000, "13-01-2012");
        account.withdraw(500, "14-01-2012");

       
        String statement = account.printStatement();
        System.out.println(statement);

       
        String expectedStatement = """
                date       | amount | balance
                10-01-2012 | 1000   | 1000
                13-01-2012 | 2000   | 3000
                14-01-2012 | -500   | 2500
                """; 

        
        if (statement.equals(expectedStatement)) {
            System.out.println("✅ Test Réussi !");
        } else {
            System.out.println("❌ Test Échoué !");
            System.out.println("Résultat obtenu :\n" + statement);
        }
    }
}