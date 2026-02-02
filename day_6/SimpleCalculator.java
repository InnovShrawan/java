abstract class Calculator {

    abstract void add(int a, int b);
    abstract void sub(int a, int b);
}

class SimpleCalculator extends Calculator {

    void add(int a, int b) {
        System.out.println(a + b);
    }

    void sub(int a, int b) {
        System.out.println(a - b);
    }

    public static void main(String[] args) {
        SimpleCalculator c = new SimpleCalculator();
        c.add(10, 5);
        c.sub(10, 5);
    }
}
