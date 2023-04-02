public class Account extends Bank{
    public String Name;
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
        System.out.println("Deposit is Successful, New Balance is "+ this.Balance);
    }

    public void withdrawMoney(double withdrawalMoney){
        if(this.Balance-withdrawalMoney <0){
            System.out.println("insufficient Balance");
        }
        else{
            this.Balance -= withdrawalMoney;
            System.out.println("Please take your money, Current Balance is : "+ this.Balance);
        }
    }

}
