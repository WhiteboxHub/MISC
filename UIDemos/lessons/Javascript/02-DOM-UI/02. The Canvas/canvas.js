var canvas = document.getElementById("canvas");
var ctx = canvas.getContext("2d");

ctx.canvas.width = "500";
ctx.canvas.height = "500";
ctx.lineWidth = "5";

ctx.fillStyle = "#ccc";
ctx.strokeStyle = "#777";

//ctx.setLineDash([2, 4]);
//ctx.lineCup = 'round';
ctx.lineJoin = 'round';



ctx.fillRect(10, 10, 100, 75);
ctx.strokeRect(10, 10, 100, 75);

ctx.beginPath();
ctx.moveTo(10, 100);
ctx.lineTo(10, 300);
ctx.lineTo(100, 100);
ctx.lineTo(10, 100);
ctx.stroke();

ctx.beginPath();
ctx.moveTo(100, 100);
ctx.lineTo(100, 300);
ctx.lineTo(10, 300);
ctx.closePath();
ctx.fill();

//ctx.save();
//ctx.scale(0.5, 0.5);
ctx.moveTo(250, 90);
ctx.arc(200, 90, 50, 0, Math.PI / 2, false);
ctx.closePath();
ctx.stroke();
//ctx.restore();

//ctx.rotate(Math.PI / 6);
//ctx.transform(10,10);
ctx.moveTo(130, 10);
ctx.quadraticCurveTo(155, 200, 180, 10);
ctx.stroke();

//ctx.getImageData(x,y,width,height);