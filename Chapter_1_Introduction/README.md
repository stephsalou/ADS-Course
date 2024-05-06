# Assignment 1: Initial Setup and Problem Solving

##  Estimation
### 1-21
#### Question
- Do all the books you own total at least one million pages? How many total
  pages are stored in your school library?

#### Solution
 -  I estimate I own around 100 books. An average of 300 pages per book so i have 100 * 300 = 30000 pages so i don't have 1 million page in my library.
 - Suppose the school library contains a library divided by sections. We suppose having 8 sections, Each sections contains 5 books storage. Each books can contain 300 books, with average page of 300 pages. so ((300^2) * 5 ) * 8 = 3.600.000 pages stored on the school library.
### 1-22
#### Question
 - How many words are there in this textbook?

#### Solution
 -   if a average page contain 6 paragraphs of 100 words  and each textbooks contains 800 pages we can have 600*800 words
### 1-23
#### Question
 - How many hours are one million seconds? How many days? Answer these questions by doing all the arithmetic in your head.

#### Solution
 - if 1h equals to 3600 seconds so 30h = (3600 * 10) * 3 = 108.000s if i multiply 108.000 by 10 i got 1.080.000 who equals to 300h if i remove 20h who eaquals to  (3600 * 10) * 2 = 72.000  i figure that 1million seconds made ~280hours and with 24h to make one day so ~280hours make ~13days 
### 1-24
#### Question
 - Estimate how many cities and towns there are in the United States.

#### Solution
 - 

## Interview Problems

### 1-32
#### Question
 - Write a function to perform integer division without using either the / or * operators. Find a fast way to do it.

#### Solution
```java
public static int divide(int dividend, int divisor) {
    if (divisor == 0) {
       return 0;
    }

    dividend = Math.abs(dividend);
    divisor = Math.abs(divisor);

    int quotient = 0;
    while (dividend >= divisor) {
        dividend -= divisor;
        quotient++;
    }

    return quotient;
}
```

### 1-33
#### Question
- There are twenty-five horses. At most, five horses can race together at a time.
You must determine the fastest, second fastest, and third-fastest horses.
Find the minimum number of races in which this can be done.

#### Solution
- with the formula of n = x^k . n was the amount subjects , k the minimum number of races and x the number of subject by race. so we have 25 = 5^2 son we have the minimum of 2 run to find the 1st the 2sd and the 3rd


### 1-35

#### Question
 - How many gas stations are there in the United States?

#### Solution
 
## Assigment 3: Coding questions

### Daily temperature (https://leetcode.com/problems/daily-temperatures/)
#### Solution
```java
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int [temperatures.length];
        Stack<Integer> stack = new Stack();
        for(int i = 0;i < temperatures.length ; i++) {

            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int lastStackIndex = stack.pop();
                result[lastStackIndex]= i - lastStackIndex;
            }
            stack.push(i);
        }
        return result;
    }
}
```

### Rotate List (https://leetcode.com/problems/rotate-list/description/)

#### Solution
```java

```

### Kangaroo (https://www.hackerrank.com/challenges/kangaroo/)


#### Solution
```java
 public static String kangaroo(int x1, int v1, int x2, int v2) {
    // Write your code here
    if(((v1-v2) <=0 ) || ((x2-x1) < 0) ) {
        return "NO";
    }

    if((x2-x1) % (v1-v2) == 0) {
        return "YES";
    }
    return "NO";
}

```

### The 3n + 1 problem (https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=29&page=show_problem&problem=36)

#### Solution
```java
```
# 1
