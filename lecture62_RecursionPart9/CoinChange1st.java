package dsa.com.lecture62_RecursionPart9;

public class CoinChange1st {


    static int solve(int[] coins,int amount){

        //base case
        if(amount == 0)
            return 0;

        if(amount < 0){
            return Integer.MAX_VALUE;
        }

        int mini = Integer.MAX_VALUE;

        for (int coin : coins){
            int ans = solve(coins,amount - coin);

            if (ans != Integer.MAX_VALUE){
                int totalCoinsUSed = ans + 1;
                mini = Math.min(mini,totalCoinsUSed);
            }
        }
        return mini;
    }

    static int coinChange(int[] coins,int amount){
        int ans = solve(coins,amount);

        if(ans == Integer.MAX_VALUE){
            return -1;
        }
        else {
            return ans;
        }
    }
    public static void main(String[] args) {
        int [] coins = {1,2,5};
        int amount = 11;

        System.out.println("Fewest number of coins that make up the amount : " + coinChange(coins,amount));
    }
}
