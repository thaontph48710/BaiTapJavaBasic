package BT_JAVA_BASIC_2;

public class Calculator {
    public int tinhSoNguyen(int a, int b) {
        return a+b;

    }
    public float tinhTichSoThuc(float a, float b) {
        return a*b;

    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.tinhSoNguyen(24, 07));
        System.out.println(calculator.tinhTichSoThuc(24.07F,8.06F ));
    }
}
