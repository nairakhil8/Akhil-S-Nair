//Question No. 1
function evenOdd(number){
    if(number%2==0){
        return "even";
    }
    return "odd";
}

//Question No. 2
function max(num1, num2, num3){
    if(num1 > num2 && num1 >num3){
        return num1;
    }else if(num2>num3 && num2>num1){
        return num2;
    }
    return num3;
}

//Question No.3
function numHeads(c)
   {
    var num,h=0;
    
      for (var i = 0; i < c; i++){
        num=Math.ceil(Math.random() *10);
        if(num<6){
          h++;
        }
    }
    console.log("The number of times heads occur is : "+h);
}
console.log(numHeads(10));

//Question No.4
function headsRatio(c)
   {
    var num,h=0;
    for (var i = 0; i < c; i++)
    {
        num=Math.ceil(Math.random() *10);
        if(num<6)
        {
          h=Math.random();
        }
    
    }
    console.log("The number of times heads occur is : "+h);
    }
    headsRatio(100);

//Question No. 5
function padChars(num, str){
    return str.repeat(num);
}

//Question No.6
function numRollsToGetSix()

{
    var counter=0;
    while(x!==6)
    {
        var x=Math.ceil(Math.random()*6);
        counter++;
    }
    return counter;
}
console.log("THe number of times 6 is rolled: "+numRollsToGetSix());


