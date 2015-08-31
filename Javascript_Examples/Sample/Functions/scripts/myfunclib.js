/*console.log(orderBy(4,7676));
function orderBy(a, b) {
  //  console.log(a, "," ,b);
    return (a === b ? 0 : (a > b ? -1 : 1));
      
}
var num = [100, 19, 5, 23, 56, 43];
alert(num.sort(orderBy));


//console.log(num.splice(1,2));

var arr = new Array(20);
console.log(arr.length);
for (var i = 0 ; i < arr.length ; i++) {
    arr[i] = i * 5;
    console.log(arr[i]);
}

var arr1 = ['h','e','l','o'];
var arr2 = ['w','o','r','l'];

function compare(arr1,arr2) {
    
var len = arr1.length >= arr2.length ? arr2.length : arr1.length;

for (var i = 0 ; i < len ; i++) {
    
    if (arr1[i] == arr2[i]) continue;
    if (arr1[i] < arr2[i]) return -i;
    if (arr1[i] > arr2[i]) return i;
}
    
}

//console.log(compare(arr1,arr2));

function maximal(arr){
    
    int maxsize = 1;
    int startindex = 0;
    var list = [];
    for (var i = startindex + 1 ; i < arr.length ; i++){
        list.push(arr[startindex])   ;  
        if (arr[i] === arr[startindex] 
           || arr[i] - arr[startindex] != 1) {
            startindex = i;
            continue;
        }
        
        list.push(arr[i]);
        maxsize++;    
    }
}
*/
 function binary_search(key, arr) {
     
     var ret = -1;
     var lo = 0
     var hi = arr.length -1;
     
     for (var i = lo ; lo <= hi ;){
         console.log('lo = '+ lo);
         console.log("hi =" + hi);
         var mid = lo + parseInt((hi - lo)/2);
         console.log("mid =" + mid);
         if (arr[mid] === key) 
             return mid;
         if (key > arr[mid]) {
             lo = mid + 1;
         }
         else {
            hi = mid - 1;
         }
         
     }
     return -1;
 }

console.log(binary_search(5,[1,3,5,8,10,12]));
    


