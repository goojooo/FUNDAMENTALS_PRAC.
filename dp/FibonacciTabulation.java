public class FibonacciTabulation {

    public static void main(String[] args) {

        int n = 7;

        // Edge case
        if (n <= 1) {
            System.out.println(n);
            return;
        }

        int dp[] = new int[n + 1];

        // Base values
        dp[0] = 0;
        dp[1] = 1;

        // Build dp table
        for (int i = 2; i <= n; i++) {

            dp[i] = dp[i - 1] + dp[i - 2];

            System.out.println(
                "dp[" + i + "] = " +
                dp[i - 1] + " + " +
                dp[i - 2] + " = " +
                dp[i]
            );
        }

        System.out.println("\nFibonacci of " + n + " is: " + dp[n]);
    }
}

// 2. TABULATION (Bottom Up)
// Idea
// Start from small values
// Build answer step by step
// Mind Tree
// Know:
// fib(0)=0
// fib(1)=1

// Use them to build:
// fib(2)
// fib(3)
// fib(4)
// ...
// fib(n)
// Flowchart
// Start
//   ↓
// Create dp[]
//   ↓
// dp[0]=0
// dp[1]=1
//   ↓
// Loop from 2 to n
//   ↓
// dp[i]=dp[i-1]+dp[i-2]
//   ↓
// Return dp[n]

// Difference Between Memoization & Tabulation

// | Feature            | Memoization     | Tabulation      |
// | ------------------ | --------------- | --------------- |
// | Style              | Top Down        | Bottom Up       |
// | Uses Recursion     | Yes             | No              |
// | Uses Stack         | Yes             | No              |
// | Starts From        | Big problem     | Small problem   |
// | Faster in Practice | Slightly slower | Slightly faster |
