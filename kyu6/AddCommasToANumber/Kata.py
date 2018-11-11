def commas(num):
    return "{:,}".format(int(round(num,3)) if round(num,3).is_integer() else round(num,3))