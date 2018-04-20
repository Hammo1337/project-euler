package solutions;

public class Solution4 {

    public void Solve() {
        long biggest = 0;

        int a = 999, b = 999;
        for (int bb = b; bb > 0; bb--) {
            for (int aa = a; aa > 0; aa--) {
                int product = aa * bb;
                if (IsPalindrome(product)) {
                    if (product > biggest) {
                        biggest = aa*bb;
                    }
                }
            }
        }
        System.out.println(biggest);
    }

    public boolean IsPalindrome(int number) {
        int[] digits = Integer.toString(number).chars().map(c -> c-='0').toArray();
        int counter = 0;
        while (counter <= Math.floor(digits.length / 2)) {
            if (digits[counter] == digits[digits.length - (counter + 1)]) {
                counter++;
            } else {
                return false;
            }
        }
        return true;
    }
}
