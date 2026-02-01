class Student {
    String name;

    Student(String name) {
        this.name = name;  
    }

    void show() {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Student s = new Student("Shrawan");
        s.show();
    }
}
