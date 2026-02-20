
class InvalidMarksException extends Exception {

    public InvalidMarksException(String message) {
        super(message);
    }
}

class Student {

    private String name;
    private int marks;

    public Student(String name, int marks) throws InvalidMarksException {
        this.name = name;
        setMarks(marks);
    }

    public void setMarks(int marks) throws InvalidMarksException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Marks must be between 0 and 100.");
        }
        this.marks = marks;
    }

    public String assignGrade() {
        if (marks >= 90) {
            return "A+"; 
        }else if (marks >= 80) {
            return "A"; 
        }else if (marks >= 70) {
            return "B"; 
        }else if (marks >= 60) {
            return "C"; 
        }else if (marks >= 50) {
            return "D"; 
        }else {
            return "F";
        }
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}

public class UniversityGradingSystem {

    public static void main(String[] args) {
        try {
            Student s1 = new Student("Alice", 85);
            System.out.println(s1.getName() + " scored " + s1.getMarks() + " → Grade: " + s1.assignGrade());

            Student s2 = new Student("Bob", 45);
            System.out.println(s2.getName() + " scored " + s2.getMarks() + " → Grade: " + s2.assignGrade());

            Student s3 = new Student("Charlie", 120);
            System.out.println(s3.getName() + " scored " + s3.getMarks() + " → Grade: " + s3.assignGrade());

        } catch (InvalidMarksException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
