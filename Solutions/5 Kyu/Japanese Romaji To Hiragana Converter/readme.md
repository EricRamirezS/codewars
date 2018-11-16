https://www.codewars.com/kata/5be0c8601b109ad2450000a5

こんにちは!

This かた (kata) is to translate romaji, or Japanese written in latin characters, into hiragana, a Japanese character set that is used to phonetically spell native Japanese words (among other things). You do not need any prior knowledge of Japanese to complete this かた--you can do it!<br>がんばって!

## Hiragana Basics

1\. There are 46 basic hiragana symbols, as seen in the chart below. It should be read right-to-left.

<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/2/28/Table_hiragana.svg/768px-Table_hiragana.svg.png" alt="Hiragana Chart" style="background-color:white;" />

There are some hiragana that do not follow the pattern, namely `shi`, `chi`, `tsu`, `fu`, and `n`.

2\. There are 25 additional hiragana that are created by adding a diacritical mark like the voiced `゛` and the semi-voiced `゚゜`, as seen below. Notice that `ji` does not follow the pattern.


<table style="width:100%;">
  
<tr>
    
<th>
</th>
    
<th style="border-bottom: 3px solid black;">
</th>
    
<th style="border-bottom: 3px solid black; text-align: center;">a
</th>
    
<th style="border-bottom: 3px solid black;">
</th>
    
<th style="border-bottom: 3px solid black; text-align: center;">i
</th>
    
<th style="border-bottom: 3px solid black;">
</th>
    
<th style="border-bottom: 3px solid black; text-align: center;">u
</th>
    
<th style="border-bottom: 3px solid black;">
</th>
    
<th style="border-bottom: 3px solid black; text-align: center;">e
</th>
    
<th style="border-bottom: 3px solid black;">
</th>
    
<th style="border-bottom: 3px solid black; text-align: center;">o
</th>
  
</tr>
  
<tr>
  
<td style="border-right: 3px solid black; text-align: center;">g:
</td>
<td style="background: #42473f; text-align: center;">が
</td>
<td style="background: #42473f; text-align: center;">ga
</td>
<td style="text-align: center;">ぎ
</td>
<td style="text-align: center;">gi
</td>
<td style="background: #42473f; text-align: center;">ぐ
</td>
<td style="background: #42473f; text-align: center;">gu
</td>
<td style="text-align: center;">げ
</td>
<td style="text-align: center;">ge
</td>
<td style="background: #42473f; text-align: center;">ご
</td>
<td style="background: #42473f; text-align: center;">go
</td>
  
</tr>
  
<tr>
    
<td style="border-right: 3px solid black; text-align: center;">z:
</td>
<td style="text-align: center;">ざ
</td>
<td style="text-align: center;">za
</td>
<td style="background: #42473f; text-align: center;">じ
</td>
<td style="background: #42473f; text-align: center;">ji
</td>
<td style="text-align: center;">ず
</td>
<td style="text-align: center;">zu
</td>
<td style="background: #42473f; text-align: center;">ぜ
</td>
<td style="background: #42473f; text-align: center;">ze
</td>
<td style="text-align: center;">ぞ
</td>
<td style="text-align: center;">zo
</td>
  
</tr>
  
<tr>
    
<td style="border-right: 3px solid black; text-align: center;">d:
</td>
<td style="background: #42473f; text-align: center;">だ
</td>
<td style="background: #42473f; text-align: center;">da
</td>
<td>
</td>
<td>
</td>
<td style="background: #42473f; text-align: center;">
</td>
<td style="background: #42473f; text-align: center;">
</td>
<td style="text-align: center;">で
</td>
<td style="text-align: center;">de
</td>
<td style="background: #42473f; text-align: center;">ど
</td>
<td style="background: #42473f; text-align: center;">do
</td>
  
</tr>
  
<tr>
    
<td style="border-right: 3px solid black; text-align: center;">b:
</td>
<td style="text-align: center;">ば
</td>
<td style="text-align: center;">ba
</td>
<td style="background: #42473f; text-align: center;">び
</td>
<td style="background: #42473f; text-align: center;">bi
</td>
<td style="text-align: center;">ぶ
</td>
<td style="text-align: center;">bu
</td>
<td style="background: #42473f; text-align: center;">べ
</td>
<td style="background: #42473f; text-align: center;">be
</td>
<td style="text-align: center;">ぼ
</td>
<td style="text-align: center;">bo
</td>
  
</tr>
  
<tr>
    
<td style="border-right: 3px solid black; text-align: center;">p:
</td>
<td style="background: #42473f; text-align: center;">ぱ
</td>
<td style="background: #42473f; text-align: center;">pa
</td>
<td style="text-align: center;">ぴ
</td>
<td style="text-align: center;">pi
</td>
<td style="background: #42473f; text-align: center;">ぷ
</td>
<td style="background: #42473f; text-align: center;">pu
</td>
<td style="text-align: center;">ぺ
</td>
<td style="text-align: center;">pe
</td>
<td style="background: #42473f; text-align: center;">ぽ
</td>
<td style="background: #42473f; text-align: center;">po
</td>
  
</tr>

</table>
<br>

3\. Also, small characters allow everyone on codewars to have `きゅ` (kyu). They are `ゃ`, `ゅ`, and `ょ`, which can be added after certain characters to transcribe contracted syllables. Notice that `ja`, `ju`, and `jo` do not follow the general pattern.


<table style="width:100%;">
  
<tr>
    
<th>
</th>
    
<th style="border-bottom: 3px solid black;">
</th>
    
<th style="border-bottom: 3px solid black; text-align: center;">a
</th>
    
<th style="border-bottom: 3px solid black;">
</th>
    
<th style="border-bottom: 3px solid black; text-align: center;">u
</th>
    
<th style="border-bottom: 3px solid black;">
</th>
    
<th style="border-bottom: 3px solid black; text-align: center;">o
</th>
  
</tr>
  
<tr>
    
<td style="border-right: 3px solid black; text-align: center;">ky:
</td>
<td style="background: #42473f; text-align: center;">きゃ
</td>
<td style="background: #42473f; text-align: center;">kya
</td>
<td style="text-align: center;">きゅ
</td>
<td style="text-align: center;">kyu
</td>
<td style="background: #42473f; text-align: center;">きょ
</td>
<td style="background: #42473f; text-align: center;">kyo
</td>
  
</tr>
  
<tr>
    
<td style="border-right: 3px solid black; text-align: center;">sh:
</td>
<td style="text-align: center;">しゃ
</td>
<td style="text-align: center;">sha
</td>
<td style="background: #42473f; text-align: center;">しゅ
</td>
<td style="background: #42473f; text-align: center;">shu
</td>
<td style="text-align: center;">しょ
</td>
<td style="text-align: center;">sho
</td>
  
</tr>
  
<tr>
    
<td style="border-right: 3px solid black; text-align: center;">ch:
</td>
<td style="background: #42473f; text-align: center;">ちゃ
</td>
<td style="background: #42473f; text-align: center;">cha
</td>
<td style="text-align: center;">ちゅ
</td>
<td style="text-align: center;">chu
</td>
<td style="background: #42473f; text-align: center;">ちょ
</td>
<td style="background: #42473f; text-align: center;">cho
</td>
  
</tr>
  
<tr>
    
<td style="border-right: 3px solid black; text-align: center;">ny:
</td>
<td style="text-align: center;">にゃ
</td>
<td style="text-align: center;">nya
</td>
<td style="background: #42473f; text-align: center;">にゅ
</td>
<td style="background: #42473f; text-align: center;">nyu
</td>
<td style="text-align: center;">にょ
</td>
<td style="text-align: center;">nyo
</td>
  
</tr>
  
<tr>
    
<td style="border-right: 3px solid black; text-align: center;">hy:
</td>
<td style="background: #42473f; text-align: center;">ひゃ
</td>
<td style="background: #42473f; text-align: center;">hya
</td>
<td style="text-align: center;">ひゅ
</td>
<td style="text-align: center;">hyu
</td>
<td style="background: #42473f; text-align: center;">ひょ
</td>
<td style="background: #42473f; text-align: center;">hyo
</td>
  
</tr>
  
<tr>
    
<td style="border-right: 3px solid black; text-align: center;">my:
</td>
<td style="text-align: center;">みゃ
</td>
<td style="text-align: center;">mya
</td>
<td style="background: #42473f; text-align: center;">みゅ
</td>
<td style="background: #42473f; text-align: center;">myu
</td>
<td style="text-align: center;">みょ
</td>
<td style="text-align: center;">myo
</td>
  
</tr>
  
<tr>
    
<td style="border-right: 3px solid black; text-align: center;">ry:
</td>
<td style="background: #42473f; text-align: center;">りゃ
</td>
<td style="background: #42473f; text-align: center;">rya
</td>
<td style="text-align: center;">りゅ
</td>
<td style="text-align: center;">ryu
</td>
<td style="background: #42473f; text-align: center;">りょ
</td>
<td style="background: #42473f; text-align: center;">ryo
</td>
  
</tr>
  
<tr>
    
<td style="border-right: 3px solid black; text-align: center;">gy:
</td>
<td style="text-align: center;">ぎゃ
</td>
<td style="text-align: center;">gya
</td>
<td style="background: #42473f; text-align: center;">ぎゅ
</td>
<td style="background: #42473f; text-align: center;">gyu
</td>
<td style="text-align: center;">ぎょ
</td>
<td style="text-align: center;">gyo
</td>
  
</tr>
  
<tr>
    
<td style="border-right: 3px solid black; text-align: center;">j:
</td>
<td style="background: #42473f; text-align: center;">じゃ
</td>
<td style="background: #42473f; text-align: center;">ja
</td>
<td style="text-align: center;">じゅ
</td>
<td style="text-align: center;">ju
</td>
<td style="background: #42473f; text-align: center;">じょ
</td>
<td style="background: #42473f; text-align: center;">jo
</td>
  
</tr>
  
<tr>
    
<td style="border-right: 3px solid black; text-align: center;">by:
</td>
<td style="text-align: center;">びゃ
</td>
<td style="text-align: center;">bya
</td>
<td style="background: #42473f; text-align: center;">びゅ
</td>
<td style="background: #42473f; text-align: center;">byu
</td>
<td style="text-align: center;">びょ
</td>
<td style="text-align: center;">byo
</td>
  
</tr>
  
<tr>
    
<td style="border-right: 3px solid black; text-align: center;">py:
</td>
<td style="background: #42473f; text-align: center;">ぴゃ
</td>
<td style="background: #42473f; text-align: center;">pya
</td>
<td style="text-align: center;">ぴゅ
</td>
<td style="text-align: center;">pyu
</td>
<td style="background: #42473f; text-align: center;">ぴょ
</td>
<td style="background: #42473f; text-align: center;">pyo
</td>
  
</tr>

</table>
<br>


4\. Lastly, a small `っ` is used to transcribe the first of two back-to-back consonnants. For example, `sakka` is written as `さっか`.
<br>
Also, when there are two back-to-back `n`s, the first is not written with the small `っ`. It is written with `ん`. For example, `konnichiha` is written as `こんにちは`.

## The Challenge

Write a function, `romajiToHiragana`, that takes a romaji string and returns a hiragana string.
<br><br>
A map called `hiragana` with romaji keys and hiragana values, containing everything from the above tables has been provided. The small `っ`'s key is `tsuSmall`, and while all concatenated syllables are provided, `ゃ`, `ゅ`, and `ょ` can be accessed individually with `yaSmall`, `yuSmall`, and `yoSmall`, respectively.

**Note:** Assume that `nya`, `nyu`, and `nyo` will always be written as `にゃ`, `にゅ`, and `にょ`, and never as `んや`, etc.

Happy coding! :)    