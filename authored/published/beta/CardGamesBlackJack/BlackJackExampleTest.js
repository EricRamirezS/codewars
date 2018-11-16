Test.describe("Example tests", function () {
    Test.assertEquals(winners(
        ["6", "1", "2", "Q", "3"],
        ["5", "8"],
        ["6", "Q", "2"],
        ["3", "10"],
        ["A", "4", "10", "5", "4", "A", "Q", "2", "6", "A", "5", "7", "9", "Q", "2", "8", "9", "1", "K", "2", "8"])
        , "");
    Test.assertEquals(winners(
        ["J", "A"],
        ["8", "J", "7"],
        ["2", "4", "K", "10"],
        ["K", "8"],
        ["10", "6", "1", "8", "9", "A", "3", "Q", "5", "2", "3", "8", "6", "J", "K", "2", "8", "7", "7", "K", "Q"])
        , "Player 1");
    Test.assertEquals(winners(
        ["J", "2", "K"],
        ["1", "5", "1", "5", "7"],
        ["J", "A"],
        ["2", "Q"],
        ["4", "10", "Q", "K", "2", "8", "9", "8", "9", "4", "K", "7", "10", "A", "4", "9", "5", "A", "Q", "Q", "3"])
        , "Player 2, Player 3");
});