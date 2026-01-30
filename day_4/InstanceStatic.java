class InstanceStatic {

    int a = 10;          
    static int b = 20;   

    void showInstance() {
        System.out.println("Instance value: " + a);
    }

    static void showStatic() {
        System.out.println("Static value: " + b);
    }

    public static void main(String args[]) {

        InstanceStatic obj = new InstanceStatic();
        obj.showInstance();   

        showStatic();         
    }
}
