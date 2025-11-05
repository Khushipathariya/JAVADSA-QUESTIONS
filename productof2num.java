import java.util.Scanner;
public class productof2num {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers: ");
         
        System.out.println("first number :");
        int num1= sc.nextInt();

        System.out.println("second number :");
        int num2 = sc.nextInt();
         int product = num1 * num2;
         System.out.println("product of two numbers is :" + product);

    }
}
