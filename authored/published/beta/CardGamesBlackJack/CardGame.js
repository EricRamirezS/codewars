function winners(player1, player2, player3, croupier, deck){
    var p1points = scoreHand(player1);
    var p2points = scoreHand(player2);
    var p3points = scoreHand(player3);
    var cpoints = scoreHand(croupier);
    var i = 0;
    if (p1points <= 21 || p2points <= 21 || p3points <= 21) {
        while (cpoints < 17) {
            croupier.push(deck[i++]);
            cpoints = scoreHand(croupier);
        }
        var winners = [];
        if (cpoints > 21) {
            if (p1points <= 21) winners.push("Player 1");
            if (p2points <= 21) winners.push("Player 2");
            if (p3points <= 21) winners.push("Player 3");
        } else if (cpoints === 21 && croupier.length !== 2) {
            if (p1points === 21 && player1.length === 2) winners.push("Player 1");
            if (p2points === 21 && player2.length === 2) winners.push("Player 2");
            if (p3points === 21 && player3.length === 2) winners.push("Player 3");
        } else if (cpoints < 21) {
            if (p1points > cpoints && p1points <= 21) winners.push("Player 1");
            if (p2points > cpoints && p2points <= 21) winners.push("Player 2");
            if (p3points > cpoints && p3points <= 21) winners.push("Player 3");
        }
        return winners.join(", ");
    }
    return "";
}

function scoreHand(cards) {
    var aces = 0
        , score = cards.reduce(function (s, c) {
        if (c === 'A') { aces++; return s + 11 }
        return /\d/.test(c) ? s + parseInt(c) : s + 10
    }, 0);
    while (aces-- && score > 21) score -= 10;
    return score;
}