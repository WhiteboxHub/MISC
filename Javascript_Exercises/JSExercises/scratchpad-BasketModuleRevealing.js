/* Revealing Module Pattern */

var BasketModule = (function(){
    var basket = [];
    var getItemCount = function(){
        return basket.length;
    } 
    var addItem = function(item){
        basket.push(item);
    }
    
    var removeItem = function(item){
         var newBasket = [];
         
         for (key in basket){
             
             if (basket[key].price === item.price)
               continue;
             var obj = {};
             Object.defineProperty(obj,'name',{
                 value : basket[key].name,
                 writable : true,
                 enumerable : true,
                 configurable : true
             });
             Object.defineProperty(obj,'price',{
                 value : basket[key].price,
                 writable : true,
                 enumerable : true,
                 configurable : true
             })
             newBasket.push(obj);
         }
         basket = newBasket;
    }
    
    var showBasket = function() {
      console.log('There are ' + getItemCount() +
                 ' items.');
      for (key in basket){
             console.log(basket[key]);
         }
    }
    
    return {
      show : showBasket,
      add : addItem,
      del : removeItem
    }
  
})();


BasketModule.add({
    name : 'Logo',
    price : 35
});
BasketModule.add({
    name : 'Cards',
    price : 65.5
});
BasketModule.add({
    name : 'Tatoo',
    price : 3.25
});
BasketModule.show();
BasketModule.del({
    name : 'Cards',
    price : 65.5
});
console.log(BasketModule.show);
