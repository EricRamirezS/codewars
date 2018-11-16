function validParentheses(parens) {
    if (parens.charAt(0) === ')') return false;
    var openbrace = [];
    for (var i = 0; i < parens.length; i++) {
        if (parens.charAt(i) === '(') openbrace.push("(");
        else if (parens.charAt(i) === ")") {
            if (openbrace.length <= 0) return false;
            openbrace.pop();
        }
    }
    return openbrace.length === 0;
}