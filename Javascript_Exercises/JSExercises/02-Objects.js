/*
Write a function that removes all elements with a given value

Attach it to the array class
Read about prototype and how to attach methods

*/
Array.prototype.remove = function(key){
    
    var remove = function(element,index,array){
        
        if ( element === key )
        
            array.splice(index,1);
    };
     this.forEach(remove);
}
    

var arr = [1,2,1,4,1,3,4,1,111,3,2,1,"1"];

arr.remove(1);
console.log(arr);

/*
Write a function that makes a deep copy of an object
The function should work for both primitive and reference types

*/

var f1 = function(obj) {
    var newobj = {};
    for (var prop in obj) {
        if (obj.hasOwnProperty(prop)) {
            newobj[prop] = obj[prop];
        }
    }
    for (var prop in newobj) {
        console.log(newobj[prop]);
    }
    return newobj;
}

var myobj = {name : 'SJ' , printMe : function()
             {
               console.log('My name is ' +myobj.name);
             }};


console.log(f1(myobj));