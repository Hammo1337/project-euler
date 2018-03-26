public class third {
    public static void main(String[] args) {
        long number = 600851475143l;
        int i;

        for (i = 2; i <= number; i++) {
            if (number % i == 0) {
                number /= i;
                i--;
            }
        }

        System.out.println(i);
    }
}
