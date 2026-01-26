
class StudentRoll {

    static String collegeCode = "CSE2025";

    static int counter = 1;

    String name;

    StudentRoll(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + collegeCode + counter);
        counter++;
    }

    public static void main(String[] args) {
        StudentRoll s1 = new StudentRoll("Rahul");
        StudentRoll s2 = new StudentRoll("Amit");

        s1.display();
        s2.display();
    }
}
