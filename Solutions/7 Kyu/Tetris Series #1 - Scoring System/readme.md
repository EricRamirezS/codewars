https://www.codewars.com/kata/5da9af1142d7910001815d32/

# A History Lesson

Tetris is a puzzle video game originally designed and programmed by Soviet Russian software engineer Alexey Pajitnov. The first playable version was completed on June 6, 1984. Pajitnov derived its name from combining the Greek numerical prefix tetra- (the falling pieces contain 4 segments) and tennis, Pajitnov's favorite sport.

# About scoring system

The scoring formula is built on the idea that more difficult line clears should be awarded more points. For example, a single line clear is worth 40 points, clearing four lines at once (known as a Tetris) is worth 1200.

A level multiplier is also used. The game starts at level 0. The level increases every ten lines you clear. For our task you can use this table:

<style>
  .demo {
    width:70%;
    border:1px solid #C0C0C0;
    border-collapse:collapse;
    padding:5px;
  }
  .demo th {
    border:1px solid #C0C0C0;
    padding:5px;
  }
  .demo td {
    border:1px solid #C0C0C0;
    padding:5px;
  }
</style>
<table class="demo">
  <thead>
  <tr>
    <th>Level<br></th>
    <th>Points for 1 line<br></th>
    <th>Points for 2 lines</th>
    <th>Points for 3 lines</th>
    <th>Points for 4 lines</th>
  </tr>
  <tr>
    <td>0</td>
    <td>40</td>
    <td>100<br></td>
    <td>300</td>
    <td>1200</td>
  </tr>
  <tr>
    <td>1</td>
    <td>80</td>
    <td>200</td>
    <td>600</td>
    <td>2400</td>
  </tr>
  <tr>
    <td>2</td>
    <td>120</td>
    <td>300</td>
    <td>900</td>
    <td>3600</td>
  </tr>
  <tr>
    <td>3</td>
    <td>160</td>
    <td>400</td>
    <td>1200</td>
    <td>4800</td>
  </tr>
  <tr>
    <td>...</td>
  </tr>
  <tr>
    <td>7</td>
    <td>320</td>
    <td>800</td>
    <td>2400</td>
    <td>9600</td>
  </tr>
  <tr>
    <td>...</td>
    <td colspan = "4">For level n you must determine the formula by yourself using given examples from the table.</td>
  </tr> </thead>
</table>

# Task

Calculate the final score of the game using original Nintendo scoring system

# Input

Array with cleaned lines.  
Example: `[4, 2, 2, 3, 3, 4, 2]`  
Input will always be valid: array of random length (from `0` to `5000`) with numbers from 0 to 4.

# Ouput

Calculated final score.  
`def get_score(arr) -> int: return 0`

# Example

```
>>> arr = [4, 2, 2, 3, 3, 4, 2]
>>> get_score(arr)
4700
```
<b>Step 1:</b> `+1200` points for 4 lines (current level 0). Score: `1200`;  
<b>Step 2:</b> `+100` for 2 lines. Score: `1300`;  
<b>Step 3:</b> `+100`;  
<b>Step 4:</b> `+300` for 3 lines (current level still 0).  
Total number of cleaned lines 11 (4 + 2 + 2 + 3), so level goes up to 1 (level ups each 10 lines);  
<b>Step 5:</b> `+600` for 3 lines (current level 1);  
<b>Step 6:</b> `+2400`;  
<b>Step 7:</b> `+200`. Total score: `4700`.

# Other

If you like the idea: leave feedback, and there will be a series of katas with higher difficulty levels on the Tetris theme.