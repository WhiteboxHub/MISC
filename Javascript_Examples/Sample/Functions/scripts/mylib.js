var arr = [1,2,3,4];
arr.join(',')

//console.log('Initial Array');
//printArray(arr);
//console.log(arr.join(','));

var n = arr.length;

// 1,2,3,4,5
// 5,2,3,4,1
// 5,4,3,2,1

for (var i = 0 ; i < n/2 ; i++ ) {
    
    var temp = arr[i] ;
    arr[i] = arr[n-1-i];
    arr[n-1-i] = temp;
    
}

console.log('Reversed Array');
//printArray(arr);

//var f1 = new Function();
//Function Declaration
function printArray(a){
 
    for (var i = 0 ; i < a.length ; i++) {
    console.log(a[i]);
  }
    console.log(i);
    
}

function sortme(myarr) {
  
    console.log(myarr.sort(orderme));
}

sortme([1,3,12,6,5]);

function orderme(a,b) {
    
    console.log ( a , " , " , b);
    return (a === b ? 0 : (a > b ? 1 : -1));
}

//console.log(orderme(100,130));

var list = ['NPU','SVU' ,'ITU' ,'CalState'];
list.splice(2,1,'SJSU','SDSU');
//console.log(list);

//printArray(arr); // execution

//Function Expressions


function listelement(element, index, array){
    
    console.log('Element at ' + index + ' =' + element);
}

//list.forEach(listelement);

var list1 = ['The' , 'fox' , 'jumps' , 'the' , 'gump'];

function binarysearch(arr, key) {
    
    var lo = 0;
    var hi = arr.length - 1;
    for (var i = lo ; lo <= hi ;) {
        console.log("lo =" + lo);
        console.log("hi =" + hi);
        console.log("mid =" + mid);
        var mid = lo + parseInt( (hi - lo)/2);
        if ( key === arr[mid] )
            return mid;
        if ( key > arr[mid] ) {
           lo = mid + 1;   
        }
        else {
            hi = mid - 1;
        }
        
    }
    
    return -1;
    
}

var num = [1,3,5,7,8,9,100,124];
console.log(binarysearch(num,4));

// lo = 0
// hi = 7
// 0 + 3 = 3


var arr1 = ['x','e','l','l' , 'o'];
var arr2 = ['x','o','r','l' , 'd'];
// -1

function compare(a1, a2) {
    
    // char1 == char2 , go to next char
    // if all are same, return 0
    
    // if char 1 < char 2 -- return -index
    
    // return
    
}