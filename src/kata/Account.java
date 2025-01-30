package kata;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private final List<Transaction> transactions = new ArrayList<>();

    public void deposit(int amount, String date) {
        transactions.add(new Transaction(date, amount));
    }

    public void withdraw(int amount, String date) {
        transactions.add(new Transaction(date, -amount));
    }

    public String printStatement() {
        StringBuilder statement = new StringBuilder();
        statement.append("date       | amount | balance\n");

        int balance = 0;
        for (Transaction transaction : transactions) {
            balance += transaction.getAmount();
            // Ajuster l'alignement et l'espacement pour correspondre exactement
            statement.append(String.format("%-10s | %-6d | %-6d%n", transaction.getDate(), transaction.getAmount(), balance));
        }

        return statement.toString().stripTrailing();
    }
}