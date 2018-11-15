import math

def triangle_perimeter(triangle):
    sideAB = math.sqrt((triangle.a.x - triangle.b.x)**2+(triangle.a.y - triangle.b.y)**2)
    sideBC = math.sqrt((triangle.c.x - triangle.b.x)**2+(triangle.c.y - triangle.b.y)**2)
    sideCA = math.sqrt((triangle.c.x - triangle.a.x)**2+(triangle.c.y - triangle.a.y)**2)
    return sideAB+sideBC+sideCA
