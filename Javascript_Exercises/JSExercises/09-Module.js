var Account = (function(){
    
    var balance = 100;
    var getBalance = function (){
            return balance;
    }
    return {
        
        withdraw : function(amt) {
            balance -= amt;
        },
        showBalance : function(){
           // console.log(balance);
            console.log(getBalance());
            
        }
        
    }
    
})();
    
Account.showBalance();