interface A {
    default void show() {
        System.out.println("A");
    }
}

interface B {
    default void show() {
        System.out.println("B");
    }
}

class DiamondProblemDemo implements A, B {

    public void show() {
        System.out.println("C");
    }

    public static void main(String[] args) {
        DiamondProblemDemo obj = new DiamondProblemDemo();
        obj.show();
    }
}
