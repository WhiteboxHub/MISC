// querySelector only returns the first match.
var el = document.querySelector('li.hot');
el.className = 'cool';
// querySelectorAll returns a NodeList.
// The third li element is then selected and changed.
var els = document.querySelectorAll('li.hot');
els[1].className = 'cool';

var staticList = document.querySelector('li');
var el = document.querySelector('ul.green');


var el = document.querySelector('li.hot');
var ul =  el.parentNode;
var firstListItem = ul.firstChild;
var lastListItem = ul.lastChild;

var secondListItem = firstListItem.nextSibling;


