
class Account{
    constructor( id,name,balance)

    {
        this.id=id;
        this.name=name;
        this.balance=balance;
    }
    static ttlBalance(...accounts)
    {
        let sum=0;
        for(let i of accounts)
        {
            sum+=i.balance;
        }
        console.log("Total Balance is "+sum);
    }
 }
 
 class SavingAccount extends Account
 {
  constructor(id,name,balance,interest)
  {
      super(id,name,balance);
      this.interest=(interest*10*1000)/100;
      }
 }
 class CurrentAccount extends Account
 {
    constructor(id,name,balance,cash_credit)
    {
        super(id,name,balance);
        this.cash_credit=cash_credit;
        
    }
 }
 
 let s1 = new SavingAccount(1,"ABC",20000,5.8);
 let s2 = new SavingAccount(2,"MNO",30000,6.8);
 let s3 = new SavingAccount(3,"PQR",40000,7.8);

 let c1 = new CurrentAccount(7,"XYZ",30000,1000);
 let c2 = new CurrentAccount(8,"JKL",50000,1000);
 let c3 = new CurrentAccount(9,"EFG",70000,1000);

 const result=Account.ttlBalance(s1,s2,s3,c1,c2,c3);
 console.log(s1,s2,s3,c1,c2,c3);