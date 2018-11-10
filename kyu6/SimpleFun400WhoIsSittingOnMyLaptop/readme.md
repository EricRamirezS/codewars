https://www.codewars.com/kata/simple-fun-number-400-who-is-sitting-on-my-laptop

Story & Task
A party was held at John's house.

After eating, drinking, playing, and enjoying...

John's friends are sitting on the lawn of the garden. They formed a circle. Some people are facing the inside, others are facing the outside.

John suddenly remembered that he had to log on to Codewars with his laptop now.

As an excellent programmer, he has code training every day. Such as to solve the new kata authored by myjinxin.

But his laptop can't be found.

He looked at his friends. There's a square plastic object underneath everyone's bottom.

He was convinced that his laptop must be under someone's butt.

"Who is sitting on my laptop?"

Friends know the answer, but they do not tell John directly, but rather a puzzle:

"Your laptop is on my left side's 3rd person's right side's 1st person's left side's 2nd person's bottom." someone said. (Don't mind the grammar, it's just for better connection)

John had to count people carefully. The trouble is, if a person is facing inside, his left is clockwise and his right is counterclockwise. But, if a person is facing the outside, his left is counterclockwise and his right is clockwise.

John began to search hard. "aaa's left side's 3rd person is bbb, and bbb's right side's 1st person is ccc, and ccc's left side's 2nd person is ddd. Hmm, ddd is sitting on my laptop!"

Now, your task is coming..

To help John, find out who is sitting on John's laptop, and return his name.

Input
friends. A 2D string array, each subarray contains 2 elements: The friend's name and the direction he faces(inside/outside).
You can assume that all the friends formed a circle in counterclockwise order.

puzzle. A string with the same format like "Your laptop is on my left side's 3rd person's right side's 1st person's left side's 2nd person's bottom."
You can assume that the puzzle was the first friend's words. The first friend means the first name in the array friends.

Output
A string. The friend's name.

Example
For

friends = [
["Tom","inside"],
["Jerry","inside"],
["Bob","inside"],
["Alice","outside"],
["Jone","outside"],
["Voile","inside"],
["Unnamed","outside"]
],
puzzle =
"Your laptop is on my left side's 3rd person's right side's 1st person's left side's 2nd person's bottom."
the output should be "Voile".

There are 7 friends formed a circle in counterclockwise order:


     Tom↓   Unnamed↑

Jerry→         ←Voile

Bob→          Jone→

       Alice↓


The 3rd person on the left side of Tom is: Jone

The 1st person on the right side of Jone is: Alice

The 2nd person on the left side of Alice is: Voile

So, the answer is "Voile"
See more examples in the sample tests.

Note
3 fixed testcases

100 random testcases, testing for correctness of solution

All inputs are valid.

If my reference solution gives the wrong result in the random tests, please let me know(post an issue).

