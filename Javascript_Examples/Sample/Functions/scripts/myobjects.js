/*
var s1 = { name : 'John' , age : 24 , isEnrolled : false, 'Reg no' : 5265216 , '' : 'TBD' , '' :'XYZ',
address : { street : 'Dublin Blvd' , city : 'Dublin'} , printMe : function () {
       console.log ('I am ' + this.name);
       console.log (' I live in ' + this.address.city);
}
};

console.log(s1);

console.log(Object.keys(s1));

for (var i in s1) {
    
    console.log('i =' + i);
    console.log(s1[i]);
    
   
}

console.log(Object.getOwnPropertyNames(s1));

var s2 = { name : 'Sam' , age : 33 , isEnrolled : false, 'Reg no' : 216266 , '' : 'TBD' , '' :'XYZ',
address : { street : 'Owens Rd' , city : 'Pleasanton'} , printMe : function () {
       console.log ('I am ' + this.name);
       console.log (' I live in ' + this.address.city);
}
};
*/
var Student = function(name, age) {
    
    this.name = name;
    this.age = age;
    this.printMe = function(){
        console.log ('I am ' + name + '. I am ' + age + ' yrs old.');
    }
}

var s1 = new Student('John' , 25);
var s2 = new Student('Sam' ,33);

console.log(s1.printMe());
console.log(s2.printMe());

s1.city = 'Dublin' ;

Student.prototype.state = 'CA';

s1.state ='MN';

console.log(s1.state);

console.log(Object.getOwnPropertyNames(s1));
console.log(Object.getOwnPropertyNames(s2));







