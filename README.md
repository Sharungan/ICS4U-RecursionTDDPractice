# Recursion Practice

## Instructions
1. One member of the group fork this repository and import your fork into repl.it
2. Share the repl with your group members to allow multiplayer development on the repl
3. Create a .java file name Group#.java.  
4. Work with your group to code the recursive solution (in the form of a method).  Create a main program in the same .java file to verify your solution.
5. Commit and push your work to github.
6. Issue a pull request to get your solution in your fork to the parent repo.

## Group 1 - triangle
`public int triangle(int rows)`  
We have triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks, the next row has 3 blocks, and so on. Compute recursively (no loops or multiplication) the total number of blocks in such a triangle with the given number of rows.  
```
triangle(0) → 0
triangle(1) → 1
triangle(2) → 3
```

## Group 2 - sumDigits
`public int sumDigits(int n)`  
Given a non-negative int n, return the sum of its digits recursively (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).  
```
sumDigits(126) → 9
sumDigits(49) → 13
sumDigits(12) → 3
```

## Group 3 - countX
`public int countX(String str)`  
Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.  
```
countX("xxhixx") → 4
countX("xhixhix") → 3
countX("hi") → 0
```

## Group 4 - bunnyEars2
`public int bunnyEars2(int bunnies)`  
We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot. Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
```
bunnyEars2(0) → 0
bunnyEars2(1) → 2
bunnyEars2(2) → 5
```

## Group 5 - changeXY
`public String changeXY(String str)`  
Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.
```
changeXY("codex") → "codey"
changeXY("xxhixx") → "yyhiyy"
changeXY("xhixhix") → "yhiyhiy"
```

## Group 6 - noX
`public String noX(String str)`  
Given a string, compute recursively a new string where all the 'x' chars have been removed.  
```
noX("xaxb") → "ab"
noX("abc") → "abc"
noX("xx") → ""
```

## Group 7 - array6
`public boolean array6(int[] nums, int index)`
Given an array of ints, compute recursively if the array contains a 6. We'll use the convention of considering only the part of the array that begins at the given index. In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.
```
array6([1, 6, 4], 0) → true
array6([1, 4], 0) → false
array6([6], 0) → true
```


