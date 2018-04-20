import solutions.*;
import utilities.*;

public class EulerProject {
    public static void main(String[] args) {
        Utility util = new Utility();

        int n;
        boolean done = false;

        while (!done) {
            n = util.GetInputWithMessage("Enter the number of the problem you want to solve (999 to exit)");

            switch(n) {
                case 1:
                    Solution1 solution1 = new Solution1();
                    solution1.Solve();
                    break;
                case 2:
                    Solution2 solution2 = new Solution2();
                    solution2.Solve();
                    break;
                case 3:
                    Solution3 solution3 = new Solution3();
                    solution3.Solve();
                    break;
                  case 999:
                      done = true;
                      break;
            }
        }

    }
}
