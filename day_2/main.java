// default constructirs
// class student{
//     String name;
//     int age;

//      student() {
//         name = "Default Name";
//         age = 18;
//     }
//     void display(){
//         System.out.println("Name:"+ name + ",Age:"+ age );
//     }
    
// }
// public class main {
//     public static void main(String[] args) {
//         student student1 = new student(); 
//         student1.display();
//     }

// }



//parametrized consrtuctor///
class student{
    String name;
    int age;

     student(String n,int a) {
        name = n;
        age = a;
    }
    void display(){
        System.out.println("Name:"+ name + ",Age:"+ age );
    }
    
}
public class main {
    public static void main(String[] args) {
        student student1 = new student("Alice",20); 
        student1.display();
    }

}

// HW
//write a profgram in java wherw we store student, roll,name,div
// intsert 3 values
 

