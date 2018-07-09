# BankApp
Bank Application:
You are a back-end developer and need to create an application to handle new customer bank account requests

The application does the following:
- read a .cvs file of names, SSNs, account type and initial deposit
- use of proper data structure to hold all the accounts
- both savings and checking accounts share the following properties:
	* deposit()
	* withdraw()
	* transfer()
	* showInfo()
	* 11-Digit Account Number (generated with the following process: 1/2 for Saving/Checking, last 2 digits of the SSN
	unique 5-digit number and a random 3-digit number)

- adding/ updating/ deleting an account
- searching for an account by Account# or SSN
- depositing/ withdrawing money from/to an account
- displaying a list of unused/out of date accounts
- Savings Account holders are given a Safety Deposit Box, identified by a 3-digit number and accessed with a 4-digit code
- Checking Account holders are assigned a Debit Card with a 12-digit number and a 4-digit PIN
- both accounts will use an interface that determines the base interest rate:
	-> savings accounts will use .25 points less than the base rate
	-> checking accounts will use 15% of the base rate

- the showInfo() method should reveal relevant account information as well as information specific to the Checking
account or Savings account	 



--------------------Learning objectives:------------------------------------
- learn to develop a robust application architecture
- encapsulation, inheritance, abstract classes and abstract methods
- read data from a file and store in an appropriate data structure
- use an interface API to receive information from a developer's application
- explore constructors deeper and use the super() keyword
- explore access modifiers and when to use public, private, protected
- generate random numbers and work with String API
