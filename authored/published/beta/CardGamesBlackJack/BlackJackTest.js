Test.describe("Fixed croupier 21", function () {
    Test.assertEquals(winners(
        ["J", "A"],
        ["K", "10"],
        ["10", "2", "Q"],
        ["8", "2"],
        ["A", "J", "10", "2", "A", "2", "A", "3", "5"])
        , "Player 1");
});

Test.describe("Fixed Croupier 20", function () {
    Test.assertEquals(winners(
        ["5", "10", "4"],
        ["Q", "5", "6"],
        ["10", "2", "Q"],
        ["5", "A"],
        ["4", "4", "10", "2", "A", "2", "A", "3", "5"])
        , "Player 2");
});

Test.describe("Fixed Croupier 21 BlackJack", function () {
    Test.assertEquals(winners(
        ["J", "A"],
        ["Q", "A"],
        ["10", "A"],
        ["K", "A"],
        ["J", "4", "10", "2", "A", "2", "A", "3", "5"])
        , "");
});

Test.describe("Fixed Aces overload", function () {
    Test.assertEquals(winners(
        ["A", "A", "A", "A", "A", "A", "A", "A", "A", "A", "A", "A", "A", "A", "A", "A", "A", "A", "A", "A", "A"],
        ["A", "A", "A", "A", "A", "A", "A", "A", "A", "A", "A", "A", "A", "A", "A", "A", "A", "A", "A", "A"],
        ["A", "A", "A", "A", "A", "A", "A", "A", "A", "A", "A", "A", "A", "A", "A", "A", "A"],
        ["2", "2"],
        ["A", "A", "4", "A", "A", "A", "A", "A", "A"])
        , "Player 1");
});

Test.describe("Fixed test 1", function () {
    Test.assertEquals(winners(
        ["J", "A"],
        ["Q", "2", "7", "A", "K"],
        ["10", "5", "5"],
        ["10", "2"],
        ["4", "3", "9", "A", "A", "K", "Q", "3", "5"])
        , "Player 1, Player 3");
});

Test.describe("Fixed test 2", function () {
    Test.assertEquals(winners(
        ["J", "2", "10"],
        ["10", "A"],
        ["9", "3", "8"],
        ["10", "2"],
        ["4", "3", "2", "A", "A", "K", "Q", "3", "5"])
        , "Player 2, Player 3");
});

Test.describe("Fixed test 3", function () {
    Test.assertEquals(winners(
        ["J", "2", "9"],
        ["10", "A"],
        ["10", "5", "3"],
        ["5", "5"],
        ["5", "5", "A", "A", "K", "5", "A", "A", "A"])
        , "Player 1, Player 2");
});

Test.describe("Fixed test 4", function () {
    Test.assertEquals(winners(
        ["10", "2", "10"],
        ["A", "7", "6", "10"],
        ["10", "5", "K"],
        ["A", "2"],
        ["3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"])
        , "");
});

Test.describe("Fixed test 5", function () {
    Test.assertEquals(winners(
        ["9", "J"],
        ["A", "Q", "10", "A", "6"],
        ["A", "A", "A"],
        ["7", "5"],
        ["A", "A", "8", "A", "3", "10", "9", "5", "A", "A", "6", "A", "7", "8", "A", "2", "6", "2", "5", "7", "4"])
        , "Player 1, Player 3");
});

Test.describe("Fixed test 6", function () {
    Test.assertEquals(winners(
        ["9", "K"],
        ["K", "7", "7"],
        ["10", "Q", "10"],
        ["3", "9"],
        ["Q", "9", "1", "A", "3", "2", "9", "2", "5", "A", "8", "6", "5", "J", "A", "6", "8", "2", "1", "2", "2"])
        , "Player 1");
});

Test.describe("Fixed test 7", function () {
    Test.assertEquals(winners(
        ["9", "A", "1", "2", "K"],
        ["3", "4", "3", "J"],
        ["Q", "5", "K", "5"],
        ["2", "Q"],
        ["8", "1", "6", "7", "K", "4", "5", "7", "7", "1", "1", "10", "9", "4", "2", "2", "J", "Q", "A", "6", "J"])
        , "");
});

Test.describe("Fixed test 8", function () {
    Test.assertEquals(winners(
        ["9", "4"],
        ["7", "J", "3", "6", "3"],
        ["J", "9", "4"],
        ["10", "10"],
        ["A", "6", "Q", "3", "8", "6", "K", "Q", "A", "1", "6", "4", "6", "J", "Q", "8", "5", "8", "1", "9", "3"])
        , "");
});

Test.describe("Fixed test 9", function () {
    Test.assertEquals(winners(
        ["Q", "K"],
        ["1", "2", "1", "6", "6", "A"],
        ["2", "K", "5", "1"],
        ["4", "2"],
        ["K", "2", "5", "Q", "4", "6", "A", "4", "2", "Q", "9", "10", "2", "7", "7", "9", "Q", "J", "Q", "Q", "6"])
        , "Player 1");
});

Test.describe("Fixed test 10", function () {
    Test.assertEquals(winners(
        ["6", "7", "2", "4", "Q", "J"],
        ["6", "Q", "1", "8"],
        ["A", "9"],
        ["A", "2"],
        ["8", "A", "A", "8", "K", "10", "5", "A", "5", "A", "J", "J", "10", "8", "5", "Q", "9", "9", "10", "A", "10"])
        , "");
});

Test.describe("Fixed test 11", function () {
    Test.assertEquals(winners(
        ["8", "5", "4", "6", "A", "2", "A"],
        ["J", "K", "10", "5"],
        ["A", "J", "J", "A", "9"],
        ["Q", "8"],
        ["A", "Q", "A", "Q", "2", "4", "6", "A", "K", "5", "5", "8", "2", "4", "K", "10", "3", "4", "7", "6", "6"])
        , "");
});

Test.describe("Fixed test 12", function () {
    Test.assertEquals(winners(
        ["3", "K", "9", "8", "J", "Q"],
        ["4", "K", "3", "8", "2", "K"],
        ["5", "7", "8", "K"],
        ["Q", "3"],
        ["2", "8", "K", "A", "8", "8", "9", "J", "6", "A", "J", "2", "A", "A", "8", "K", "10", "5", "6", "A", "4"])
        , "");
});

Test.describe("Fixed test 13", function () {
    Test.assertEquals(winners(
        ["J", "4"],
        ["K", "J", "4"],
        ["9", "2", "A", "10", "J"],
        ["9", "6"],
        ["9", "8", "A", "6", "A", "2", "4", "J", "A", "Q", "10", "A", "8", "9", "4", "A", "5", "3", "A", "5", "J"])
        , "Player 1");
});

Test.describe("Fixed test 14", function () {
    Test.assertEquals(winners(
        ["A", "A", "A", "8", "5", "Q"],
        ["2", "Q", "9", "8", "5", "4"],
        ["A", "A", "2"],
        ["4", "8"],
        ["J", "A", "8", "J", "3", "Q", "4", "6", "A", "6", "8", "10", "K", "5", "10", "10", "9", "K", "8", "Q", "9"])
        , "Player 3");
});

Test.describe("Fixed test 15", function () {
    Test.assertEquals(winners(
        ["4", "A", "6", "9", "3"],
        ["2", "2"],
        ["3", "K"],
        ["8", "Q"],
        ["4", "Q", "8", "6", "5", "5", "Q", "4", "8", "6", "9", "8", "K", "A", "9", "7", "A", "9", "Q", "K", "3"])
        , "");
});

Test.describe("Fixed test 16", function () {
    Test.assertEquals(winners(
        ["10", "5", "7", "A", "9", "8"],
        ["5", "3", "3", "J"],
        ["3", "7", "A"],
        ["9", "Q"],
        ["3", "K", "3", "9", "3", "5", "3", "6", "Q", "2", "9", "J", "J", "J", "9", "A", "3", "10", "2", "Q", "9"])
        , "Player 2, Player 3");
});

Test.describe("Fixed test 17", function () {
    Test.assertEquals(winners(
        ["2", "K", "J", "2"],
        ["7", "A"],
        ["K", "A"],
        ["9", "5"],
        ["K", "A", "Q", "3", "10", "2", "6", "3", "10", "9", "8", "J", "J", "Q", "9", "A", "K", "10", "7", "4", "Q"])
        , "Player 2, Player 3");
});

Test.describe("Fixed test 18", function () {
    Test.assertEquals(winners(
        ["2", "8", "J", "5", "A"],
        ["8", "Q", "2", "5", "8"],
        ["10", "10", "9", "4", "8"],
        ["K", "Q"],
        ["8", "2", "3", "7", "K", "K", "4", "A", "10", "9", "7", "4", "3", "K", "7", "10", "2", "10", "7", "10", "9"])
        , "");
});

Test.describe("Fixed test 19", function () {
    Test.assertEquals(winners(
        ["6", "A", "K", "A", "A"],
        ["2", "7", "5"],
        ["6", "J"],
        ["5", "6"],
        ["10", "8", "7", "9", "A", "A", "6", "A", "9", "7", "8", "6", "A", "10", "10", "4", "A", "5", "3", "9", "J"])
        , "");
});

Test.describe("Fixed test 20", function () {
    Test.assertEquals(winners(
        ["J", "6", "5", "8", "A", "9"],
        ["K", "J", "A", "A", "6"],
        ["3", "7", "10"],
        ["6", "8"],
        ["3", "6", "6", "4", "6", "10", "2", "4", "8", "J", "Q", "8", "Q", "6", "J", "5", "6", "A", "3", "9", "4"])
        , "Player 3");
});

function sol(p1, p2, p3, c, d){
    var p1p = s(p1);
    var p2p = s(p2);
    var p3p = s(p3);
    var cp = s(c);
    var i = 0;
    if (p1p <= 21 || p2p <= 21 || p3p <= 21) {
        while (cp < 17) {
            c.push(d[i++]);
            cp = s(c);
        }
        var w = [];
        if (cp > 21) {
            if (p1p <= 21) w.push("Player 1");
            if (p2p <= 21) w.push("Player 2");
            if (p3p <= 21) w.push("Player 3");
        } else if (cp === 21 && c.length !== 2) {
            if (p1p === 21 && p1.length === 2) w.push("Player 1");
            if (p2p === 21 && p2.length === 2) w.push("Player 2");
            if (p3p === 21 && p3.length === 2) w.push("Player 3");
        } else if (cp < 21) {
            if (p1p > cp && p1p <= 21) w.push("Player 1");
            if (p2p > cp && p2p <= 21) w.push("Player 2");
            if (p3p > cp && p3p <= 21) w.push("Player 3");
        }
        return w.join(", ");
    }
    return "";
}

function s(cs) {
    var as = 0,
        sc = cs.reduce(function (s, c) {
            if (c === 'A') { as++; return s + 11 }
            return /\d/.test(c) ? s + parseInt(c) : s + 10
        }, 0);
    while (as-- && sc > 21) sc -= 10;
    return sc
}

var cards = ["A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"];

function generateRandom() {
    var p1 = Array.apply(null, Array(
        Math.floor((Math.random() * 7-2))+2
    )).map(function (x, i) {
        return cards[Math.floor((Math.random() * cards.length))]; });
    var p2 = Array.apply(null, Array(
        Math.floor((Math.random() * 6-2))+2
    )).map(function (x, i) {
        return cards[Math.floor((Math.random() * cards.length))]; });
    var p3 = Array.apply(null, Array(
        Math.floor((Math.random() * 5-2))+2
    )).map(function (x, i) {
        return cards[Math.floor((Math.random() * cards.length))]; });
    var c = Array.apply(null, Array(2)).map(function (x, i) {
        return cards[Math.floor((Math.random() * cards.length))]; });
    var deck = Array.apply(null, Array(21)).map(function (x, i) {
        return cards[Math.floor((Math.random() * cards.length))]; });
    return [p1, p2, p3, c, deck];
}

for (var i = 0 ; i < 1000; i++){
    var ran = generateRandom();
    Test.describe("Random test "+(i+1), function () {
        Test.assertEquals(winners(
            ran[0],
            ran[1],
            ran[2],
            ran[3],
            ran[4])
            , sol(ran[0],
                ran[1],
                ran[2],
                ran[3],
                ran[4]));
    });
}