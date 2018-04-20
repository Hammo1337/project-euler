package solutions;

public class Solution7 {
    public void Solve() {
        int currentPrime = 0, primeCount = 0, number = 0;
        while (primeCount != 10001) {
            if (IsPrime(number)) {
                currentPrime = number;
                primeCount++;
            }
            number++;
        }
        System.out.println(currentPrime);
    }

    public boolean IsPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0) return false;
        return true;
    }
}
