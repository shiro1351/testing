package testing;

public class test {
    public static void main(String[] args) {
        // Khởi tạo biến tổng và gán giá trị ban đầu là 0
        int sum = 0;

        // Sử dụng vòng lặp for để lặp qua các số từ 1 đến 10
        for (int i = 1; i <= 10; i++) {
            // Kiểm tra nếu số đó là số chẵn
            if (i % 2 == 0) {
                // Cộng số chẵn vào biến tổng
                sum += i;
            }
        }

        // In ra tổng của các số chẵn từ 1 đến 10
        System.out.println("Tổng của các số chẵn từ 1 đến 10 là: " + sum);
    }
}

