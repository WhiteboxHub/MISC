/*
* Write functions for working with shapes in  standard  * Planar coordinate system
* Points are represented by coordinates P(X, Y)
* Lines are represented by two points, marking their * * beginning and ending
* L(P1(X1,Y1),P2(X2,Y2))
* Calculate the distance between two points
* Check if three segment lines can form a triangle

*/

var Point = function (x, y) {
     
        this.x = x;
        this.y = y;
    
}

var p1 = new Point(-2,-3);

var p2 = new Point(-4,4);

var Line = function(X,Y){
    
    this.X = X;
    this.Y = Y;
}

var l1 = new Line(p1,p2);

Line.prototype.getsize =  function() {
    
    return (Math.sqrt( (p2.x - p1.x) * (p2.x - p1.x) + 
                     (p2.y - p1.y)*(p2.y - p1.y)));
    
      }
    
console.log(l1.getsize());

var checkTriangle = function(l1,l2,l3){
    
    if ( l1.getsize() + l2.getsize() > l3.getsize() )
    || ( l2.getsize() + l3.getsize() > l1.getsize() )
    || ( l1.getsize() + l3.getsize() > l2.getsize() )    
    
        return true;
    
    return false;
}
