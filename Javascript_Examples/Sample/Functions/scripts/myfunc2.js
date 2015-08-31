/*
console.log('The program starts !!')
var s1 = add(45,100);  // Exec1 
console.log('s1 = ' + s1);
// functional declaration
function add(a, b) { 
          return a + b ; 
} 
var s = add(5,10); 
console.log('s = ' + s);
function pingMe(){ 
    console.log('Ping!!' ); 
} 
pingMe(); 
 
console.log('After Function Add declaration');
 
var s1 = add(45,100);  // Exce2
*/
function pingMe(){ 
    console.log('Ping!!' ); 
} 
var f1 = pingMe; 
f1();

 /*
 
 console.log('Program Ends here');
 
 var msg = 'Its a beautiful day';
// passed by value 
 var f1 =  function(message) {
     message += ' Its not too hot';
     console.log(message);
 }
 
 f1(msg);
console.log(msg);

var myObj = {key1 : 'value1'} ;

// passed by reference
var f2 = function(obj) {
    
    obj.key2 = 'value2';
}
f2(myObj);

console.log( myObj ) ;
 
 */
