package solutions;
import utilities.*;

public class Solution2 {
    Utility util = new Utility();
    int n;

    int currentFib = 3;
    int previousA = 2;
    int previousB;
    int sumEven = 2;

    public void Solve() {
        n = util.GetInputWithMessage("Enter number to find sum of even numbers in fibonacci sequence that do not exceed that value");

        while(currentFib <= n) {
            if (currentFib % 2 == 0) {
                sumEven += currentFib;
            }

            previousB = previousA;
            previousA = currentFib;
            currentFib = previousB + currentFib;
        }
        System.out.println(sumEven);


    }
}
