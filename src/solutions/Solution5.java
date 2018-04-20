package solutions;

public class Solution5 {
    public void Solve() {
        boolean done = false;
        int number = 20;
        while (!done) {
            if (IsEvenlyDivisible(number)) {
                done = true;
            } else {
                number++;
            }
        }
        System.out.println(number);
    }

    public boolean IsEvenlyDivisible(int number) {
        for (int x = 1; x <= 20; x++) {
            if (number % x != 0) {
                return false;
            }
        }
        return true;
    }
}
