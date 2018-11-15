https://www.codewars.com/kata/5bebcbf2832c3acc870000f6/

# Introduction

A new casino has come to LAS VEGAS, but this casino does not want to have human staff, but they want to implement a series of computer systems that automate the process.
After looking for references and recommendations, the administrative team has decided to hire you to develop these systems.

## Your assignment

> [BlackJack](https://en.wikipedia.org/wiki/Blackjack)

Write a function that draws cards for the dealer, and returns the players who have won.

Each table will consist of 3 players, `"Player 1"`, `"Player 2"`, `"Player 3"`

## Rules
 * Players play against the croupier only, not against other players.
 * In blackjack each card has its value, the numerals are worth whatever their number indicates. `"J"`, `"Q"` and `"K"` are worth `10`, `"A"` may worth `11 or 1`, always trying to keep the highest score possible.
 * If a player exceeds `21` points, they loses.
 * The croupier must draw card from deck until it's hand scores `17` or more points.
 * A player has a blackjack when they has 2 card, a worth 10 card, and an `"A"`
 * If the player has a blackjack, then they won, unless the croupier also has a blackjack.

## Examples
```java
Player 1 hand => "J" , "A"                  // 21 Black Jack
Player 2 hand => "10", "5", "6"             // 21
Player 3 hand => "3" , "6", "1","3","A","K" // 24 
Croupier hand => "9" , "7"                  // 16
Deck          => "5" , "4" , "K" , "2"

Since the dealer has less than 17 points, it must draw a card.

Croupier hand => "9" , "7", "5"             // 21
Deck          => "4" , "K" , "2"

now comparing hands
Player 1 scores 21, croupier scores 21, but Player 1 has Black Jack, so Player 1 won
Player 2 scores 21, croupier scores 21, draw
Player 3 scores 24, Player 3 exceeded 21  so he lost

return ["Player 1"]

```

```java
Player 1 hand => "10" , "K"            // 20
Player 2 hand => "10", "2", "6"        // 18
Player 3 hand => "8" , "8", "5"        // 21 
Croupier hand => "5" , "10"            // 15
Deck          => "A" , "3" , "K" , "2"

Since the dealer has less than 17 points, it must draw a card.

Croupier hand => "5" , "10", "A", "3"  // 19
Deck          => "K" , "2"

now comparing hands
Player 1 scores 20, croupier scores 19, Player 1 won
Player 2 scores 18, croupier scores 19, Player 2 lost
Player 3 scores 21, croupier scores 19, Player 3 won

return ["Player 1", "Player 3"]

```