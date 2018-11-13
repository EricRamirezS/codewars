def rgb(r, g, b):
    return (num2hex(r) + num2hex(g) + num2hex(b)).upper()

def num2hex(l):
    if l<0: t = '00'
    elif l>255: t= "FF"
    elif l<16: t= "0" + str(hex(l)).replace("0x", "")
    else: t = str(hex(l)).replace("0x","")
    return t