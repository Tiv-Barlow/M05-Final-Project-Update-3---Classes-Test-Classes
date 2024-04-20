//M05 Final Project: Update 3 - Classes/Test Classes
//Ivy Tech Community College
//SDEV 200 - Java
//Professor Bumgardner
//Nativida Muhammad
//20 April 2024

import java.util.Date;

class User {
  private String username;
  private String name;
  private String password;
  private String email;

  // Below is the constructor
  public User(String username, String name, String password, String email) {
    this.username = username;
    this.name = name;
    this.password = password;
    this.email = email;
  }

  // Below is how the GET will work
  public String getUsername() {
    return username;
  }

  public String getName() {
    return name;
  }

  public String getPassword() {
    return password;
  }
}

class Account {
  private int accountNumber;
  private double accountBalance;
  private String username;

  // Below is another constructor
  public Account(int accountNumber, double accountBalance, String username) {
    this.accountNumber = accountNumber;
    this.accountBalance = accountBalance;
    this.username = username;
  }

  // Below is another way to GET
  public double getBalance() {
    return accountBalance;
  }

  public int getAccountNumber() {
    return accountNumber;
  }

  public String getUsername() {
    return username;
  }

  // Below is how the SET will work
  public void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  // Below are the Methods
  public void deposit(double amount) {
    accountBalance += amount;
  }

  public boolean withdraw(double amount) {
    if (amount > accountBalance) {
      return false;
    }
    accountBalance -= amount;
    return true;
  }
}

class Transaction {
  private String transactionID;
  private String accountNumber;
  private String type;
  private double amount;
  private Date timestamp;

  // Another constructor
  public Transaction(String transactionID, String accountNumber, String type, double amount, Date timestamp) {
    this.transactionID = transactionID;
    this.accountNumber = accountNumber;
    this.type = type;
    this.amount = amount;
    this.timestamp = timestamp;
  }

  // Another getter
  public String getTransactionID() {
    return transactionID;
  }

  public String getType() {
    return type;
  }

  public double getAmount() {
    return amount;
  }

  public Date getTimestamp() {
    return timestamp;
  }
}



// Below is the TEST Class
public class Main {
  public static void main(String[] args) {
    // Test User class
    User user = new User("TivzBank", "Tiv Muhammad", "sikeyourmind", "nbarlow7@ivytech.edu");
    System.out.println("Username: " + user.getUsername());
    System.out.println("Name: " + user.getName());
    System.out.println("Password: " + user.getPassword());

    // Test Account class
    Account account = new Account(1236547890, 8000.00, "TivzBank");
    System.out.println("Account Number: " + account.getAccountNumber());
    System.out.println("Balance: $" + account.getBalance());
    account.deposit(100.00);
    System.out.println("New Balance after deposit: $" + account.getBalance());
    boolean withdrawSuccess = account.withdraw(300.00);
    System.out.println("Withdrawal Success: " + withdrawSuccess);
    System.out.println("New Balance after withdrawal: $" + account.getBalance());

    // Test Transaction class
    Transaction transaction = new Transaction("TID2024", "1236547890", "Deposit", 100.00, new Date());
    System.out.println("Transaction ID: " + transaction.getTransactionID());
    System.out.println("Transaction Type: " + transaction.getType());
    System.out.println("Transaction Amount: $" + transaction.getAmount());
    System.out.println("Transaction Timestamp: " + transaction.getTimestamp());
  }
}
