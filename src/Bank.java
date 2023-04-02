public class Bank {
    public static void main(String[] args){

        Account ShuvoAccount = new Account("Shuvo",0.0,"88457","4783","shuvo@xyz.com");
        ShuvoAccount.depositMoney( 1000);
        ShuvoAccount.withdrawMoney(580);
}
}