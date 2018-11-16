function clean_string(s) {
    var newString = "";
    for (var i = 0; i < s.length; i++) {
        if (s.charAt(i) === '#') newString = newString.substr(0, newString.length - 1);
        else newString = newString + s.charAt(i);
    }
    return newString;
};