function cake(x, y) {
    var sum = 0;
    for (var i = 0; i < y.length; i++) {
        if (i % 2 == 0) sum = sum + y.charCodeAt(i);
        else sum += i + 1;
    }
    if (sum / x > 0.7) return 'Fire!';
    return 'That was close!';
}