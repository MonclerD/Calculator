package tr.edu.maltepeproject.oop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*

        //calculator with if-else
        int n1, n2, select;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        n1 = input.nextInt();
        System.out.print("Enter second number: ");
        n2 = input.nextInt();

        System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division");
        System.out.print("Selection: ");
        select = input.nextInt();

        if(select == 1){
            System.out.println("Sum: " + (n1 + n2));
        }else if (select == 2){
            System.out.println("Sub: " + (n1 - n2));
        }else if (select == 3){
            System.out.println("Multiple: " + (n1 * n2));
        }else if (select == 4){
            if (n2 != 0){
                System.out.println("Divide: " + (n1 / n2));
            }else {
                System.out.println("Numbers can't be divided by '0'. ");
            }
        }else {
            System.out.println("Wrong selection!! Please try it again.");
        }

         */

        //calculator with switch-case
        int select;
        double n1, n2;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        n1 = input.nextDouble();
        System.out.print("Enter second number: ");
        n2 = input.nextDouble();

        System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division");
        System.out.print("Selection: ");
        select = input.nextInt();

        switch (select) {

            case 1:
                System.out.println("Sum: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Sub: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Multiple: " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0){
                    System.out.println("Divide: " + (n1 / n2));
                }else {
                    System.out.println("Numbers can't be divided by '0'. ");
                }
                break;
            default:
                System.out.println("Wrong selection!! Please try it again.");

        }

    }
}
