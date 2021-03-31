var id=1;
var title="ABC"
var price=123;

let Order=
{
  id,
  title,
  price,
  printOrder:() =>
  {
    return 10;
  },
  getPrice:()=>
  {
     return 20;
  }

};

let copy=Object.assign(Order);