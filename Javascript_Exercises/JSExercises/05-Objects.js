/*	Create an array of objects, where each object describes a book and has properties for the title (a string), author (a string), and alreadyRead (a boolean indicating if you read it yet).
	Iterate through the array of books. For each book, log the book title and book author like so: "The Hobbit by J.R.R. Tolkien".
•	Now use an if/else statement to change the output depending on whether you read it yet or not. If you read it, log a string like 'You already read "The Hobbit" by J.R.R. Tolkien', and if not, log a string like 'You still need to read "The Lord of the Rings" by J.R.R. Tolkien.'
*/

var Book = function(title, author, alreadyRead) {
    
    var title = title;
    var author = author;
    var alreadyRead = alreadyRead;
    
    return {
        
        printInfo : function(){
            
            var readMsg  = 'has been read.';
            var unreadMsg = 'has to be read yet.';
            if (alreadyRead)
            console.log("The book " + title 
              + ' authored by ' + author + 
                    readMsg   );
            else
               console.log("The book " + title 
              + ' authored by ' + author + 
                    unreadMsg   ); 
        }
        
         
    }
}