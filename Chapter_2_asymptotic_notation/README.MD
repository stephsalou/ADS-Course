# Assignment 2: Initial Setup and Problem Solving

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

### 402. Remove K Digits (https://leetcode.com/problems/remove-k-digits/description/)
#### Solution
```java
class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> pile = new Stack<>();


        for(char number: num.toCharArray()) {
            if (k > 0 && !pile.isEmpty() && number < pile.peek()) {
                pile.pop();
                k--;
            }
            pile.push(number);
        }
        while(k>0) {

            pile.pop();
            k--;
        }
        StringBuilder result = new StringBuilder();
        while (!pile.isEmpty()) {
            result.append(pile.pop());
        }
        result.reverse();

        // Supprimer les zéros en tête
        while (result.length() > 0 && result.charAt(0) == '0') {
            result.deleteCharAt(0);
        }

        // Si le résultat est une chaîne vide, retourner '0'
        return result.length() == 0 ? "0" : result.toString();
    }
}
```

### Rotate List (https://leetcode.com/problems/rotate-list/description/)

#### Solution
```java

```

### Counting Bits (https://leetcode.com/problems/counting-bits/description/)


#### Solution
```java
public class Solution {
  public int[] countBits(int n) {
    int[] ans = new int[n + 1]; // Initialize array

    // Loop through each number from 0 to n
    for (int i = 0; i <= n; i++) {
      ans[i] = countOnes(i); // Count 1's and store in ans[i]
    }

    return ans; // Return the array ans
  }

  // Method to count the number of 1's in binary representation of a number
  private int countOnes(int num) {
    int count = 0;
    while (num > 0) {
      count += num & 1; // Add last bit of num to count
      num >>= 1; // Shift num to the right by 1
    }
    return count;
  }

  public static void main(String[] args) {
    Solution sol = new Solution();
    int[] result = sol.countBits(5); // Example usage
    for (int i : result) {
      System.out.print(i + " ");
    }
  }
}

```

### The 3n + 1 problem (https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=29&page=show_problem&problem=36)

#### Solution
```java
```
# 1
