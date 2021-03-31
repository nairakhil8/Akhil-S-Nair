class Rectangle{
    constructor(width,height){
        this.width = width;
        this.height = height;
    }
}

//Question No. 1

let rect1 =  new Rectangle(10,20);
console.log(rect1.width);
console.log(rect1.height);
rect1.width = 30;
console.log(rect1.width);

//Question No. 2
Rectangle.prototype.getArea = function(){
    return this.width * this.height;
}

//Question No. 3
//the spelling of height is wrong. Thats the reason for the wrong output.
let r = new Rectangle(4, 5);
r.hieght = 50;
r.getArea();


//Question No. 4
var obj1 = {
    firstName: 'Akhil',
    lastName: 'Nair'
}
console.log(obj1.firstName);
console.log(obj1.lastName);

//Question No. 5
console.log(obj.middlename); 
obj.middlename = 'Lake'
console.log(obj.middlename); 

//Question No. 6

let str = "({firstName:'Akhil', lastName:'Nair'})";
console.log(eval(str));


//Question No. 7

var json = '{"firstName":"Akhil","lastName":"Nair"}'
console.log(JSON.parse(json));


