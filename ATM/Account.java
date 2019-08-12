package ATM;

class Account {

    private String accountNo;
    private String firstName;
    private String lastName;
    private String pinNo;
    private int balance;


    public Account(String accountNo, String firstName, String lastName, String pinNo, int balance){

        this.accountNo = accountNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.pinNo = pinNo;
        this.balance = balance;
    }

    public Account(){

    }

    public String getAccountNo(){

        return accountNo;
    }

    public String getFirstName(){

        return firstName;
    }

    public String getLastName(){

        return lastName;
    }

    public int getBalance(){

        return balance;
    }

    public String getPIN(){

        return pinNo;
    }

    public void withdrawFunds(int sum){

        balance = balance - sum;
    }

    public void lodgeFunds(int sum) {

        balance = balance + sum;
    }

}
