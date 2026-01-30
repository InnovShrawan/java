import java.util.Scanner;

class FloatToInt {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter float value: ");
        float num = sc.nextFloat();

        Float f = num;           
        int i = f.intValue();      

        System.out.println("Integer value: " + i);
    }
}
