https://www.codewars.com/kata/alphabet-war-wo-lo-loooooo-priests-join-the-war/

# Introduction

There is a war and nobody knows - the alphabet war!  
There are two groups of hostile letters. The tension between left side letters and right side letters was too high and the war began. The letters have discovered a new unit - a priest with Wo lo looooooo power.

<img src="https://i.imgur.com/AUaPiip.jpg"/>

# Task

Write a function that accepts `fight` string consists of only small letters and return who wins the fight. When the left side wins return `Left side wins!`, when the right side wins return `Right side wins!`, in other case return `Let's fight again!`.

The left side letters and their power:
```
 w - 4
 p - 3 
 b - 2
 s - 1
 t - 0 (but it's priest with Wo lo loooooooo power)
```
The right side letters and their power:
```
 m - 4
 q - 3 
 d - 2
 z - 1
 j - 0 (but it's priest with Wo lo loooooooo power)
```
The other letters don't have power and are only victims.  
The priest units `t` and `j` change the adjacent letters from hostile letters to friendly letters with the same power.  
```
mtq => wtp
wjs => mjz
```
A letter with adjacent letters `j` and `t` is not converted i.e.:
```
tmj => tmj
jzt => jzt
```

The priests (`j` and `t`) do not convert the other priests ( `jt => jt `).

# Example

```csharp
AlphabetWar("z")         //=>  "z"  => "Right side wins!"
AlphabetWar("tz")        //=>  "ts" => "Left side wins!" 
AlphabetWar("jz")        //=>  "jz" => "Right side wins!" 
AlphabetWar("zt")        //=>  "st" => "Left side wins!" 
AlphabetWar("azt")       //=> "ast" => "Left side wins!"
AlphabetWar("tzj")       //=> "tzj" => "Right side wins!" 
```
```javascript
alphabetWar("z")         //=>  "z"  => "Right side wins!"
alphabetWar("tz")        //=>  "ts" => "Left side wins!" 
alphabetWar("jz")        //=>  "jz" => "Right side wins!" 
alphabetWar("zt")        //=>  "st" => "Left side wins!" 
alphabetWar("azt")       //=> "ast" => "Left side wins!"
alphabetWar("tzj")       //=> "tzj" => "Right side wins!" 
```

```python
alphabet_war("z")         #=>  "z"  => "Right side wins!"
alphabet_war("tz")        #=>  "ts" => "Left side wins!" 
alphabet_war("jz")        #=>  "jz" => "Right side wins!" 
alphabet_war("zt")        #=>  "st" => "Left side wins!" 
alphabet_war("azt")       #=> "ast" => "Left side wins!"
alphabet_war("tzj")       #=> "tzj" => "Right side wins!" 
```