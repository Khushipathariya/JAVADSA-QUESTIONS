import java.util.Scanner;
public class maxminNumber {
    public static void printmax(int a, int b, int c){
        if (a>b && a>c){
            System.out.println("maximun number is: " + a);
        }
        else if (b>a && b>c){
            System.out.println("maximum number is: " + b);
        
        }
        else{
            System.out.println("maximum number is: "  + c);
        }
    }
    public static void printmin(int a, int b, int c){
        if(a<b && a<c){
            System.out.println(" mninimum number is: " + a);
         }
         else if(b<a && b<c){
            System.out.println("minimum number is: " + b);
         }
         else{
            System.out.println("minimum number is: "  + c);
         }
        }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = sc.nextInt();

        System.out.println(" Enter the second number: ");
        int b = sc.nextInt();

        System.out.println( "Enter the third number: ");
        int c = sc.nextInt();
        printmax(a, b, c);
        printmin(a, b, c);
}
}
