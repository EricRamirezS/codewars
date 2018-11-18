def tower_builder(n, b):
    w, h = b
    width = n*w*2-w
    tower = []
    for i in range(n):
        blank = (" "*w)*(n-i-1)
        for j in range(h):
            tower.append(blank+(("*"*w)*(i*2+1))+blank)
    return tower
