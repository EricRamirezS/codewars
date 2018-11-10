function trianglePerimeter(triangle){
    var sideAB = Math.sqrt(Math.pow(triangle.a.x - triangle.b.x,2)+Math.pow(triangle.a.y - triangle.b.y,2));
    var sideBC = Math.sqrt(Math.pow(triangle.c.x - triangle.b.x,2)+Math.pow(triangle.c.y - triangle.b.y,2));
    var sideCA = Math.sqrt(Math.pow(triangle.c.x - triangle.a.x,2)+Math.pow(triangle.c.y - triangle.a.y,2));
    return sideAB+sideBC+sideCA;
}