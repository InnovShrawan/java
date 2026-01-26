
class InstanceDemo {

    int number = 10;

    static int value = 20;

    void display() {
        System.out.println("Instance variable: " + number);
        System.out.println("Static variable: " + value);
    }

    public static void main(String[] args) {

        InstanceDemo obj = new InstanceDemo();
        obj.display();
    }
}
