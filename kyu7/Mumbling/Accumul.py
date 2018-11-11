def accum(s):
    r = ""
    i = 0;
    for c in s:
        i+=1
        r+=(c*i).capitalize()+"-"
    return r[0:-1]