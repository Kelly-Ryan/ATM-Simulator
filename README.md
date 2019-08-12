# ATM-Simulator
Programming Challenge Topic 1 - Assignment 10

In this program, you are asked to simulate the workings of an ATM machine.
Scenario
The Bank of Duke has asked you to create an ATM application to run in a terminal.
The bank currently only has three customers.

Account Number 45646432
PIN No. 3435
First Name Julian
Last Name King
Balance 100

Account Number 48593741
PIN No. 8246
First Name Anne
Last Name Williams
Balance 200

Account Number 15432432
PIN No. 6157
First Name Derek
Last Name James
Balance 300

• Create a class named Account, to store information about the bank’s customers. Include a constructor and accessor methods in the class.
Create a class named Assignment1_10, to include the main method.

• The class should create three objects of class type, Account.

• The objects should be stored in an array of class type, Account.

• The program should prompt the customer to enter their PIN no.

• The program should determine whether the PIN number entered matches that of one of the bank’s customers.

• If the PIN No. entered by the customer is invalid, they should be told so. The program must not continue.

• If the PIN No. entered by the customer is recognised, information about cash withdrawals should then be presented. The maximum withdrawal amount is 200 Euro and only certain withdrawal denominations are allowed.

• The withdrawal amount entered must be validated.
  o Text entries will not be accepted.
  o Negative numbers will not be accepted.
  o Floating point numbers will not be accepted.

• A Scanner object should be used to allow the user to enter the withdrawal amount.

• If a valid withdrawal amount is entered, the program should check to see if the customer has sufficient funds available. If so, the withdrawal should be processed and the customer’s new balance should be displayed. If the customer does not have sufficient funds, an appropriate message should be displayed.

The program should run in an infinite loop to simulate the appearance of an ATM machine. To terminate the program, enter Ctrl + C in the console.

• Thoroughly test the inputs to the program.
