def tower_builder(n):
    tower = []
    for i in range(n):
        blank = " "*(n-i-1)
        tower.append(blank+("*"*(i*2+1))+blank)
    return tower
