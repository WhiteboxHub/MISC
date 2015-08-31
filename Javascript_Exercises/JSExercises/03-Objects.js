/*
Write a function that finds the youngest person in a given array of persons and prints his/hers full name
Each person have properties firstname, lastname and age, as shown:

*/

var persons = [
  {firstname : "Gosho", lastname: "Petrov", age: 32}, 
  {firstname : "Bay", lastname: "Sonu", age: 2},
  {firstname : "Sam", lastname: "V", age:33},
  {firstname : "Sheryll", lastname: "V", age:3}    
];

console.log(persons.length);

var pickYoungest = function (arr) {
    
    var min = arr[0].age;
    var index = 0;
    for (var i = 1 ; i < arr.length ; i++) {
         if ( min > arr[i].age ){
             min = arr[i].age;
             index = i;
         }
      
    }
    
    return arr[index].firstname;
    
}

console.log(pickYoungest(persons));
