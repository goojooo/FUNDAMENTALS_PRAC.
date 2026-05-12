import java.util.Arrays;

public class FibonacciMemoization {

    static int fib(int n, int dp[]) {

        // Base cases
        if (n <= 1) {
            return n;
        }

        // If already calculated
        if (dp[n] != -1) {
            return dp[n];
        }

        // Store and return answer
        dp[n] = fib(n - 1, dp) + fib(n - 2, dp);

        return dp[n];
    }

    public static void main(String[] args) {

        int n = 7;

        int dp[] = new int[n + 1];

        // Fill array with -1
        Arrays.fill(dp, -1);

        System.out.println("Fibonacci of " + n + " is: " + fib(n, dp));
    }
}

// Fibonacci using Dynamic Programming

// We will learn 2 approaches:

// Memoization → Top Down (Recursion + DP)
// Tabulation → Bottom Up (Iterative DP)
// What is Fibonacci?

// Fibonacci series:

// 0 1 1 2 3 5 8 13 21 ...

// Formula:

// F(n) = F(n-1) + F(n-2)

// Example:

// F(5) = F(4) + F(3)
//      = 3 + 2
//      = 5
// Why Dynamic Programming?

// Normal recursion repeats work.

// Example:

// fib(5)
// ├── fib(4)
// │   ├── fib(3)
// │   │   ├── fib(2)
// │   │   └── fib(1)
// │   └── fib(2)
// └── fib(3)

// Notice:

// fib(3) calculated multiple times
// fib(2) calculated multiple times

// Dynamic Programming stores answers.

// 1. MEMOIZATION (Top Down)
// Idea
// Solve recursively
// Store answer
// Reuse stored answer
// Mind Tree
// Need fib(5)

// fib(5)
// ↓
// Need fib(4) and fib(3)

// fib(4)
// ↓
// Need fib(3) and fib(2)

// Store answers in dp[]
// Reuse if already computed
// Flowchart
// Start
//   ↓
// Is n <= 1 ?
//   ↓ yes
// Return n
//   ↓ no
// Is answer already in dp[] ?
//   ↓ yes
// Return stored answer
//   ↓ no
// Calculate:
// fib(n-1) + fib(n-2)
//   ↓
// Store in dp[]
//   ↓
// Return answer