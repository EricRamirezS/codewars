function who(friends, puzzle) {
    if (puzzle === "Your laptop is on my bottom.") return friends[0][0];
    var index = 0;
    var words = puzzle.split(" ");
    var directions = [];
    var steps = [];
    for (var i = 0; i < words.length; i++) {
        var word = words[i];
        if (isNaN(word.replace(/^\D+/g, ''))) {
            var num = word.match(/\d/g);
            num = num.join("");
            steps.push(parseInt(num));
        } else if (word === 'left' || word === 'right') {
            directions.push(word);
        } else {
        }
    }
    for (var i = 0; i < steps.length; i++) {
        var step = steps[i];
        var direction = directions[i];
        if (direction==='right') step*=-1;
        index= move(friends[index][1]==='inside',index,friends.length,step)
    }
    return friends[index][0];
}

function move(inside, index, max, steps){
    if(inside) return fixIndex(index-steps,max);
    else return fixIndex(index+steps,max);
}

function fixIndex(index, max) {
    if (index >= 0 && index < max) return index;
    if (index < 0) return fixIndex(index + max, max);
    if (index >= max) return fixIndex(index - max, max);
}