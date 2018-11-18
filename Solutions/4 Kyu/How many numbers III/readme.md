https://www.codewars.com/kata/how-many-numbers-iii/

We want to generate all the numbers of three digits that:

- the value of adding their corresponding ones(digits) is equal to 10.

- their digits are in increasing order (the numbers may have two or more equal contiguous digits)

The numbers that fulfill the two above constraints are: ```118, 127, 136, 145, 226, 235, 244, 334```

Make a function that receives two arguments:

- the sum of digits value 

- the amount of desired digits for the numbers

The function should output an array with three values:
[1,2,3]

1 - the total amount of all these possible numbers

2 - the minimum number

3 - the maximum numberwith

The example given above should be:

```java
HowManyNumbers.findAll(10, 3) == [8, 118, 334]   // as List<Integer>
```

If we have only one possible number as a solution, it should output a result like the one below:

```java
HowManyNumbers.findAll(27, 3) == [1, 999, 999]
```

If there are no possible numbers, the function should output the empty array.

```java
HowManyNumbers.findAll(84, 4) == []
```

The number of solutions climbs up when the number of digits increases.

```java
HowManyNumbers.findAll(35, 6) == [123, 116999, 566666]
```

Features of the random tests:
```
Numbers of tests: 111
Sum of digits value between 20 and 65
Amount of digits between 2 and 15
```