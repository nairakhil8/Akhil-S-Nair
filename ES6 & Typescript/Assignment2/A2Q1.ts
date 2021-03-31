class FibonnaciSeries
{
 next(n:number)
 {
     let final;
     let previous : Symbol;
     previous = 0;
     let currentNo : Symbol;
     current = 1;

     for(let i = 0; i < n;i++ )
     {
        final = previous + current;
         previous = current;
         currentNo = final;
             
     }
         return final;
     };
 }
 let fibo1 = new FibonnaciSeries();
 console.log(fibo1.next(3));