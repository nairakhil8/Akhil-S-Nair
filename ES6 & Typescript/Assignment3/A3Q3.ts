interface Printable{
    objName?:string;
    radius?:number;
    fname?:string; 
    lname?:string; 
    id?:number; 
}
function printAll(PrintableObj:Printable)
{
    console.log(PrintableObj);
}  
let circle: Printable={
    objName:"Shape",
    radius:10
    }

let employee: Printable={
    fname:"A",
    lname:"B",
    id:10
} 
console.log("Circle");
printAll(circle);
console.log("Employee");
printAll(employee);

  