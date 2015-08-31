var myList=document.createElement('ul');
for(var i=0;i<5;i++)
{
    m=i*5;
    var obj = document.createElement('li');
    var text = document.createTextNode(m);
    obj.appendChild(text);
    myList.appendChild(obj);
}

var p = document.getElementById('main');
p.appendChild(myList);