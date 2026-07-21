package dsa.com.lecture61_RecursionPart8;

public class CoinChange2nd{

    static int solve(int amount,int[] coins,int ind){
        //base case
        if(amount == 0)
            return 1;

        if(amount < 0){
            return 0;
        }

        if(ind >= coins.length){
            return 0;
        }
        //ek case hum solve karenge
        //baaki recursion sambhal lega
        //suppose coins ki value 5 and amount ki value 40 hai
        //agar 5 coin ko include kar lu to
        //remaining amount 40-5 ie. 35 ho jayega

        int includeAns = solve(amount-coins[ind],coins,ind);

        //not using current coin
        //no change in amount
        //then need to move to another coin
        //exclude
        int excludeAns = solve(amount,coins,ind+1);

        return includeAns + excludeAns;
    }
    static int change(int amount, int[] coins){
        int ind = 0;
        return solve(amount,coins,ind);
    }

    public static void main(String[] args) {
        int amount = 5;
        int[] coins = {1,2,5};

       int res =  change(amount,coins);
        System.out.println("Number of combinations that can make up the amount is : " + res);
    }
}
