package dsa.com.lecture45;

public class RotiPrataSPOJProblem {

    static long minTimeToCookPratas(int totalParathas, int[] cookRanks) {

        int maxRank = Integer.MIN_VALUE;

        for (int rank : cookRanks) {
            maxRank = Math.max(maxRank, rank);
        }

        long start = 0;

        // Maximum possible time:
        // Slowest cook cooks all parathas
        long end = (long) maxRank * (totalParathas * (totalParathas + 1L) / 2);

        long answer = -1;

        while (start <= end) {

            long mid = start + (end - start) / 2;

            if (canCookRequiredParathas(totalParathas, cookRanks, mid)) {
                answer = mid;
                end = mid - 1; // try to find smaller answer
            } else {
                start = mid + 1;
            }
        }

        return answer;
    }

    static boolean canCookRequiredParathas(int totalParathas,
                                           int[] cookRanks,
                                           long timeLimit) {

        int parathasCooked = 0;

        for (int rank : cookRanks) {

            long timeTaken = 0;
            int parathaNumber = 1;

            while (true) {

                long nextParathaTime = (long) parathaNumber * rank;

                if (timeTaken + nextParathaTime <= timeLimit) {

                    timeTaken += nextParathaTime;
                    parathasCooked++;
                    parathaNumber++;

                    if (parathasCooked >= totalParathas) {
                        return true;
                    }

                } else {
                    break;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int totalParathas = 10;

        int[] cookRanks = {1, 2, 3, 4};

        long minimumTime =
                minTimeToCookPratas(totalParathas, cookRanks);

        System.out.println(
                "Minimum time required to cook "
                        + totalParathas
                        + " parathas = "
                        + minimumTime + " minutes"
        );
    }
}