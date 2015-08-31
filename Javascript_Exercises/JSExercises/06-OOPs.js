/*
var Shape = function(type) {
    var type = 'Shape';
    return {
        print : function() {
             console.log('I am a ' + type);   
        }
     }
    
}

var Rect = function(type, width, height) {
    var type = type;
    var width = width;
    var height = height;
    Shape.call(type);
    Rect.prototype = new Shape();
    return {
        
        area : function(){
                return width * height;   
        },
        
        getType : function() {
                 return type;
        }
    
    }
}
    

    
var r1 = new Rect('Rectangle' ,10, 5);
console.log(r1.area());
console.log(r1.getType());
 /*
var Car = function(){
    models : ['Toyota','Audi','BMW']   
}

var SportsCar = {
    mph : 40,
    name : 'XYZ'
}

SportsCar.prototype = new Car();

console.log(SportsCar.mph);
console.log(SportsCar.models);

*/

var o = { a :1 , b:2};
o.[[Prototype]].c = 100;
o.[[Prototype]].c = 200;

    