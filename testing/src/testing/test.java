package testing;

public class test {
    // Phương thức để tính tổng các số chẵn từ 1 đến n
    public static int sumEvenNumbers(int n) {
        int sumEven = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            }
        }
        return sumEven;
    }
}



