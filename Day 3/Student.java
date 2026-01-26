class Student {

    int roll;
    String name;
    String div;

    void setData(int r, String n, String d) {
        roll = r;
        name = n;
        div = d;
    }

    void display() {
        System.out.println("Roll No: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Division: " + div);
        System.out.println("-----------------");
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.setData(1, "Rahul", "A");
        s2.setData(2, "Amit", "B");
        s3.setData(3, "Neha", "A");

        s1.display();
        s2.display();
        s3.display();
    }
}
