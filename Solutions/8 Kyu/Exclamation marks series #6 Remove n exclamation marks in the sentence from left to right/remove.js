function remove(s, n) {
    let fs = ''
    for (let i = 0; i < s.length; i++) {
        if (s.charAt(i) == '!' && n-- > 0) {
            continue;
        }
        fs += s.charAt(i);
    }
    return fs;
}