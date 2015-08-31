/*
var Account = function(type,interest,balance){
   this.type = type;
    this. interest = interest || 5;
    this.balance = balance || 1000 ;
  
}
Account.prototype = {
  getBalance : function(){
       return this.balance;
  }
  
}

var acc1 = new Account('Checking', 3, 500);
acc1.interest = 7;
console.log(acc1.interest);
delete acc1.interest;
console.log(acc1.getBalance());
*/

var obj = {a : 1};
//obj.b = 2 ;
Object.defineProperty(obj,'b',{
    value : 2,
    enumerable : false,
    writable : false,
    configurable : false
    
});
obj.b = 5;
delete obj.b;
console.log(obj.b);

// specifying access descriptors
var obj2 ={};
var initial = 100;
Object.defineProperty(obj2,'a', {
    get : function(){
           console.log('a accessed');
           return initial;
    },
    set : function(val) {
             console.log('prop value changed');
             initial = val;
},
   enumerable : true,
   configurable : true    
});
obj2.a = 200;
console.log(obj2.a);   

// counts the number of times an obj prop is accessed
// archives all the previous property values of the object
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
