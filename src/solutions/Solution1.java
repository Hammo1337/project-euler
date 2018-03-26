package solutions;
import utilities.*;

public class Solution1 {
    Utility util = new Utility();
    int i, n;
    int sum = 0;

    public void Solve() {
        n = util.GetInputWithMessage("Enter number to find the sum of all the multiples of 3 or 5 below it");

        for(i = 0; i < n; i++) {
            if(i % 5 == 0 || i % 3 == 0) {
                sum += i;
            }
        }

        System.out.println("Answer is: " +sum);
    }
}
