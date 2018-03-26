public class second {
    public static void main(String[] args) {
        int currentFib = 3;
        int previousA = 2;
        int previousB;
        int sumEven = 2;
        while(currentFib <= 4000000) {
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
