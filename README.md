# Banking
A simple Bank Programming by java
Banking System (Java)
This is a simple console-based banking application in Java. It allows the user to log in with a username and password, and then perform basic banking operations such as checking balance, depositing money, withdrawing money, and exiting the system.

Features
User Authentication

Prompts the user to enter a username and password.

Allows multiple login attempts.

Exits if login fails and the user chooses not to retry.

Banking Operations (after successful login):

Check Balance – Displays current account balance.

Deposit – Lets the user deposit money into the account (negative amounts not allowed).

Withdraw – Lets the user withdraw money (cannot withdraw more than balance).

Exit – Safely exits the system.

Initial Balance: Account starts with ₹1000.

How It Works
Program starts by asking for username and password.

Correct username: satvik2813

Correct password: GitHub

After login, the account menu is displayed:

text
1. BALANCE
2. DEPOSIT
3. WITHDRAW
4. EXIT
The user selects an option and performs the operation.

The program continues running until the user selects Exit.

Code Structure
showBalance(double balance)
Displays the current balance in currency format.

deposit()
Accepts deposit amount and validates it. Returns the valid amount to add to balance.

withdraw(double balance)
Accepts withdrawal amount and validates it against available balance. Returns the valid amount to subtract.

main(String[] args)
Contains login process, menu loop, and main execution flow.

Example Run
text
Enter your Username:
satvik2813
Enter Password:
GitHub
Login Successful!
WELCOME TO YOUR ACCOUNT satvik2813

1.BALANCE
2.DEPOSIT
3.WITHDRAW
4.EXIT
Please Choose (1 - 4) From Main Menu
If the user chooses 1:

text
=======> ₹1000.00
If the user chooses 2 and enters 500:

text
ENTER THE AMOUNT TO BE DEPOSITED:
500
Now balance becomes ₹1500.00.

If the user chooses 3 and enters 2000:

text
ENTER AMOUNT TO BE WITHDRAWN:
2000
INSUFFICIENT FUNDS
If the user chooses 4:

text
THANK YOU!! PLEASE VISIT US AGAIN
Requirements
Java 8 or higher

Any Java IDE (IntelliJ, Eclipse, VS Code) or command line compiler

How to Run
Save the code into a file named Banking.java.

Open terminal/command prompt and navigate to the file’s directory.

Compile the program:

text
javac Banking.java
Run the program:

text
java Banking
