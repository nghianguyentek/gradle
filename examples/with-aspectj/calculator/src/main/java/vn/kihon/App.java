package vn.kihon;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum = calculator.add(2, 3);
        assert sum == 5;
    }
}
