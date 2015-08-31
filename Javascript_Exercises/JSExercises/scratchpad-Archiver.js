/*  Create an object obj with prop 'foo'
    Count the number of times the object property is accessed,
    and print it on console.
    Logs everytime the prop value is changed, and store all the
    values in an array
*/
function Archiver() {

  var count = 0;
  var value = 'somevalue';
  var archive = [];  
Object.defineProperty(this,'foo',{
  get : function() {
         count ++;
    console.log('obj foo accessed now , count = ' + count);
    return value;
  },
  set : function(newValue){
      value = newValue;
      archive.push(value);
  },
  enumerable : true,
  configurable : true
  
});
  this.getArchive = function() {
     return archive;
  }
}
var arc = new Archiver();
arc.foo;
console.log(arc.foo);
arc.foo = 'Something new';
arc.foo = 'Something new2';
console.log(arc.getArchive());
console.log(arc.foo);



/*
Exception: SyntaxError: missing name after . operator
@Scratchpad/1:38
*/