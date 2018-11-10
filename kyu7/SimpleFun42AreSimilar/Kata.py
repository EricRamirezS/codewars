def are_similar(a, b):
    false=0
    for i in range(len(a)):
        false= false + (0 if a[i] == b[i] else 1)
    return false < 3 and sorted(a)==sorted(b)
