final class FinalDemo {

    final int MAX = 50;

    final void show() {
        System.out.println("Value is: " + MAX);
    }

    public static void main(String[] args) {
        FinalDemo obj = new FinalDemo();
        obj.show();
    }
}
