/*
 * This Scope
 */

var func = {
    print : function(){
      console.log(this);
  }
}
// funnction scope
func.print();

// Global Var f1 
var f1 = func.print;
f1();

// Array Scope
var arr = [];
arr.push(func.print);
arr[0].bind(window)();

