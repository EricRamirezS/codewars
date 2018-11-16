https://www.codewars.com/kata/56882731514ec3ec3d000009/

# Connect Four

Take a look at wiki description of Connect Four game:

[Wiki Connect Four](https://en.wikipedia.org/wiki/Connect_Four)

The grid columns are named from A to G:

![alt text](http://crowd-multilogue.com/Images/Codewars/KataConnectFourWinner.jpg)

You will receive a list of string that shows the order of the pieces which droped in columns:

```javascript
  piecesPositionList = ["A_Red",
                        "B_Yellow",
                        "A_Red",
                        "B_Yellow",
                        "A_Red",
                        "B_Yellow",
                        "G_Red",
                        "B_Yellow"]
```

The list may contains 42 or less strings, but the order shows the order that players are playing.

The first player who connect four items in same color is the winner.

you should return "Yellow", "Red" or "Draw".



<font color="red">Guys, if you think your algorithm is optimal and works perfectly, please let me know. I wonder if my code is optimal for random tests.</font>
