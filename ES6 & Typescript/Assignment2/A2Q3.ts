class getNextArmstrong{
    no;
    *[Symbol.iterator](){
        try {
            let num= this.no;
            num=0;
            while(num<300)
            {
                let noofdigits=num.toString().length;
                let temp= num;
                let sum=0,remainder;
                while(temp>0){
                    remainder = temp % 10;
                    sum += remainder ** noofdigits;
                    temp = Math.floor(temp/10);
                }
                if(sum == num){yield num;}
                num++;
            }
            throw " Sorry limit exceeded";    
        } catch (error) {
            yield error
        }       
    }
    reset()
    {
        this.no=0;
    }
}

let arm = new getNextArmstrong()[Symbol.iterator]();

console.log(arm.next());
console.log(arm.next());
console.log(arm.next());
console.log(arm.next());
console.log(arm.next());
console.log(arm.next());
console.log(arm.next());
console.log(arm.next());
console.log(arm.next());
console.log(arm.next());
console.log(arm.next());
console.log(arm.next());
