import java.util.Scanner;
public class sum2num{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();
        System.out.println("enter the second number");
        int num2= sc.nextInt();
        int sum = num1+num2;
        System.out.println("sum of num1 + num2 is: "+ sum);
    }
}
