public class Account extends Bank{
    private String Name;
    private  double Balance;
    private String Account;
    private String PhoneNumber;
    private String Email;

    public Account(String Name,double Balance, String Account, String PhoneNumber,String Email ){

        this.Name = Name;
        this.Balance = Balance;
        this.Account = Account;
        this.PhoneNumber = PhoneNumber;
        this.Email = Email;
    }

    public void depositMoney(double depositedMoney){
        this.Balance += depositedMoney;
        System.out.println("Deposit is Sucessful, New Balance is "+ this.Balance);
    }

    public void withdrawMoney(double withdrawalMoney){
        if(this.Balance-withdrawalMoney <0){
            System.out.println("Unsufficent Balance");
        }
        else{
            this.Balance -= withdrawalMoney;
            System.out.println("Please take your money, Current Balance is : "+ this.Balance);
        }
    }



    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getAccount() {
        return Account;
    }

    public void setAccount(String account) {
        Account = account;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }
}
