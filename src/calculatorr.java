import java.io.IOException;
import java.util.Scanner;

public class calculatorr {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

         float num1,num2,result;
         int decider;
        System.out.println("Hello amine enter first number please!");
        num1 = sc.nextFloat();
        System.out.println("enter second number please!");
        num2 = sc.nextFloat();
        System.out.println("enter operation!");
        System.out.println("1.addition!");
        System.out.println("2.subb!");
        System.out.println("3.multiplication!");
        System.out.println("4.division!");
        decider = sc.nextInt();
        switch (decider)
        {
            case 1:
            result=num1+num2;
            System.out.println(result);
            case 2:
            result=num1-num2;
            System.out.println(result);
            case 3:
            result=num1*num2;
            System.out.println(result);
            case 4:
            result=num1/num2;
            System.out.println(result);
        }
    }
}
