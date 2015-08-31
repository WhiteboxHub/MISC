var Account = (function(){
    
    var balance = 100;
    var privateMethod : function(){
        showBalance();
    }
    var getBalance = function (){
            return balance;
    }
    var withdraw = function(amt) {
            balance -= amt;
        }
    var showBalance = function(){
         
            console.log(getBalance());
    }
    return {
        
        getBalance : getBalance,
        withdraw : withdraw,
        showBalance : showBalance
            
        }
        
    }
    
})();
    
Account.showBalance();