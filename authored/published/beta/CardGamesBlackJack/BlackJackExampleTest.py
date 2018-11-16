Test.describe("Example test, no winners")
Test.assert_equals(winners(
    ["6", "1", "2", "Q", "3"], #22
    ["5", "8"],                #13
    ["6", "Q", "2"],           #18
    ["3", "10"],               #13, 18 after drawing
    ["A", "4", "10", "5", "4", "A", "Q", "2", "6", "A", "5", "7", "9", "Q", "2", "8", "9", "1", "K", "2", "8"]),[])

Test.describe("Example test, Player 1 wins due to Black Jack")
Test.assert_equals(winners(
    ["J", "A"],                # 21 BJ
    ["8", "J", "7"],           # 25
    ["2", "4", "K", "10"],     # 26
    ["K", "8"],                # 18, 21 after drawing
    ["3", "6", "1", "8", "9", "A", "3", "Q", "5", "2", "3", "8", "6", "J", "K", "2", "8", "7", "7", "K", "Q"]),["Player 1"]  )

Test.describe("Fixed Croupier 21 BlackJack:")
Test.assert_equals(winners(
    ["J", "2", "K"],           # 22
    ["1", "5", "1", "5", "7"], # 19
    ["J", "A"],                # 21 BJ
    ["2", "Q"],                # 12, 26 after drawing
    ["4", "10", "Q", "K", "2", "8", "9", "8", "9", "4", "K", "7", "10", "A", "4", "9", "5", "A", "Q", "Q", "3"]),["Player 2", "Player 3"] )
