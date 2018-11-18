def parse(data):
    output = []
    val = 0
    for char in data:
        if char=="i": val+=1
        elif char=="d": val-=1
        elif char=="s": val**=2
        elif char=="o": output.append(val)
    return output