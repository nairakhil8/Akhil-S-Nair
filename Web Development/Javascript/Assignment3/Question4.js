class BankAccount{
    constructor(accountNumber, accountHolderName, accountBalance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
    }

    
}

BankAccount.prototype.withdraw = function(amount){
    if(this.accountBalance >= amount){
        this.accountBalance = this.accountBalance - amount;
    }
}

class Savings extends BankAccount{
    constructor(accountNumber, accountHolderName, accountBalance,isSalary){
        super(accountNumber, accountHolderName, accountBalance);
        this.isSalary = isSalary;
    }
}


let savings = new Savings(1,"Michael",5000,true);
console.log(savings.withdraw(200));


class Current extends BankAccount{
    constructor(accountNumber, accountHolderName, accountBalance,odLimit){
        super(accountNumber, accountHolderName, accountBalance);
        this.odLimit = odLimit;
    }
}

let current = new Current(47,"Jordan",3000,200);

console.log(current.withdraw(200));
console.log(savings.accountBalance);
console.log(current.accountBalance);