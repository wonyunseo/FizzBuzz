package lab1;

public class Multiples {
    public static void main(String[] args) {
        int n = 0, a = 0, b = 0;
        System.out.println(multiples(n, a, b));

    }

    static int multiples(int n, int a, int b) {
        int num = 0;

        for (int i = 1; i < n; i++) {

            if (i % a == 0 || i % b == 0) {
                num++;
            }
        }
        return num;
    }
}
