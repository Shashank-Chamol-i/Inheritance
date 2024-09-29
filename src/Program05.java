class Account
{
    String accountHolder;
    double balance;
    Account(String accountHolder, double balance)
    {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    void display()
    {
        System.out.println("The account Holder is:"+accountHolder);
        System.out.println("The balance is : "+balance);
    }
}
class SavingAccount extends Account
{
    double rateOfIntrest;
    SavingAccount(String accountHolder, double balance ,double rateOfIntrest)
    {
        super(accountHolder,balance);
        this.rateOfIntrest = rateOfIntrest;
    }

    @Override
    void display()
    {
        super.display();
        System.out.println("Rate of Intrest : "+rateOfIntrest);
    }
}
class CheckingAccount extends Account
{
    double overDraftLimit;
    CheckingAccount(String accountHolder,double balance,double overDraftLimit)
    {
        super(accountHolder,balance);
        this.overDraftLimit = overDraftLimit;
    }
    @Override
    void display()
    {
        super.display();
        System.out.println("Overdraft amount : "+overDraftLimit);
        if(overDraftLimit>0)
        {
            System.out.println("The account is in Overdraft : ");
        }
        else
        {
            System.out.println("The account not in Overdraft : ");
        }
    }
}
public class Program05 {
    public static void main(String[] args) {
        SavingAccount ss = new SavingAccount("Billy", 5000, 5);
        CheckingAccount cc = new CheckingAccount("Simon", 510, 200);
        ss.display();
        cc.display();
    }
}