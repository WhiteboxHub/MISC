var stage = new Kinetic.Stage({
    container: 'kinetic-container',
    width: 500,
    height: 500
});

var layer = new Kinetic.Layer();
var rect = new Kinetic.Rect({
    x: 200,
    y: 200,
    width: 100,
    height: 100,
    cornerRadius: 10,
    shadowOffset: {
        x: 10,
        y: 10
    },
    shadowBlur: 5,
    dash: [10, 5],
    offset: {
        x: 50,
        y: 50
    },
    scaleY: 0.5,
    shadowColor: 'red',
    rotation: 45,
    stroke: 'blue',
    strokeWidth: 1
});

var circle = new Kinetic.Circle({
    x: 50,
    y: 50,
    radius: 50,
    stroke: 'black',
    strokeWidth: 1,
    rotation: 45,
    scaleY: 0.5
});

var wedge = new Kinetic.Wedge({
    x: 200,
    y: 50,
    radius: 40,
    fill: 'red',
    stroke: 'black',
    strokeWidth: 5,
    angleDeg: 60,
    rotationDeg: -120
});

layer.add(wedge);
layer.add(circle);
layer.add(rect);
stage.add(layer);
