// A Class that represents user-defined exception 
class InsufficientBalanceException extends Exception { 
public InsufficientBalanceException(String message) { 
// Call constructor of parent Exception 
super(message); 
} 
} 
// A Class that uses above InsufficientBalanceException 
public class BankAccount { 
private double balance; 
public BankAccount(double balance) { 
this.balance = balance; 
} 
public void withdraw(double amount) throws 
InsufficientBalanceException { 
if (amount > balance) { 
throw new InsufficientBalanceException("Insufficient 
balance in account"); 
} else { 
balance -= amount; 
System.out.println("Withdrawal successful. Remaining 
balance: " + balance); 
} 
} 
public static void main(String[] args) { 
BankAccount account = new BankAccount(1000.0); 
try { 
account.withdraw(500.0); 
account.withdraw(600.0); // This will throw 
InsufficientBalanceException 
} catch (InsufficientBalanceException e) { 
System.out.println("Caught: " + e.getMessage()); 
} 
} 
} 
/*
Output: 
Withdrawal successful. Remaining balance: 500.0 
Caught: Insufficient balance in account 
  */
