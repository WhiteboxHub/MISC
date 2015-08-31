/* The Recipe Card

•	Create an object to hold information on your favorite recipe. It should have properties for title (a string), servings (a number), and ingredients (an array of strings).
•	On separate lines (one console.log statement for each), log the recipe information so it looks like:
o	Mole
o	Serves: 2
o	Ingredients:
o	cinnamon
o	cumin
o	cocoa

*/

var Recipe = function(title,servings,ingredients){
    
   var title = title;
   var servings = servings;
   var ingredients = ingredients;
    
    return {
        
        printInfo : function(){
            
            console.log(title);
            console.log('Serves:' + servings);
            console.log('Ingredients:' );
            for (var i = 0 ; i < ingredients.length ; i++) {
               console.log(ingredients[i]); 
                
            }
          
        }
        
    }
    
}

var mole = new Recipe('Mole',2,['cinnamon','cumin','cocoa']);

console.log(mole.printInfo());