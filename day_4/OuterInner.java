class OuterInner {

    int x = 50;

    class Inner {
        void display() {
            System.out.println("Outer value: " + x);
        }
    }

    public static void main(String args[]) {

        OuterInner outer = new OuterInner();
        OuterInner.Inner inner = outer.new Inner();

        inner.display();
    }
}
 