function scoreHand(cards) {
    var points = 0;
    for (var i = 0; i < cards.length; i++) {
        switch (cards[i]) {
            case "J":
                points += 10;
                break;
            case "Q":
                points += 10;
                break;
            case "K":
                points += 10;
                break;
            case "A":
                points += 11;
                break;
            default:
                points += parseInt(cards[i]);
        }
    }
    var i = 0;
    while (points > 21) {
        if (cards[i++] === "A") points -= 10;
        if (cards.length <= i) break;
    }
    return points;
}
