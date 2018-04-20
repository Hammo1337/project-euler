package solutions;
import utilities.Utility;

public class Solution3 {
    Utility util = new Utility();
    int n;

    public void Solve() {
        n = util.GetInputWithMessage("Enter number to find largest prime factor of it");
        Long nLong = new Long(n);
        int i;

        for (i = 2; i <= nLong; i++) {
            if (nLong % i == 0) {
                nLong /= i;
                i--;
            }
        }
        System.out.println(i);
    }
}
