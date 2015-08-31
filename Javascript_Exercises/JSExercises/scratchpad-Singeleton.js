/* Singeleton Pattern */
var MySingeleton = (function(){
    var instance;
    var createinstance = function(){
        instance = Object.create(Object.prototype);
        instance.prop1 = 'SomeProp';
        return instance;
    }
    return {
        getinstance : function(){
            if (!instance){
                instance = createinstance();
            }
            return instance;
        }
    }
})();

var i1 = MySingeleton.getinstance();
var i2 = MySingeleton.getinstance();
i1.prop1 = 'NewProp';
console.log(i2.prop1);