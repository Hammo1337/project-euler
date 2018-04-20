package solutions;

public class Solution6 {
    public void Solve() {
        int sumSquare = 0, squareSum = 0;
        int difference;

        for (int x = 1; x <= 100; x++) {
            sumSquare += x * x;
        }

        for (int x = 1; x <= 100; x++) {
            squareSum += x;
        }
        squareSum = squareSum * squareSum;
        difference = squareSum - sumSquare;

        System.out.println(difference);
    }


}
