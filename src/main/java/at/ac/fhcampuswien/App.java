package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        // input your solution here
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        // input your solution here
        System.out.println("0123456789012345678901" + System.lineSeparator() +
                         "         __" + System.lineSeparator() +
                " _(\\    |@@|" + System.lineSeparator() +
                "(__/\\__ \\--/ __" + System.lineSeparator() +
                "   \\___|----|  |   __" + System.lineSeparator() +
                "       \\ }{ /\\ )_ / _\\" + System.lineSeparator() +
                "       /\\__/\\ \\__O (__" + System.lineSeparator() +
                "      (--/\\--)    \\__/" + System.lineSeparator() +
                "      _)(  )(_" + System.lineSeparator() +
                "     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){
        // input your solution here
        int sum;
        char z = 'Z';
        int a = 0xface;
        int b = 012;
        long c = 80L;
        float d = 44e-1f;
        double e = 5.5f;
        double f = 8.88e1;
        double g = 99.9;

        int zz = z;
        int cc = (int) c;
        int dd = (int) d;
        int ee = (int) e;
        int ff = (int) f;
        int gg = (int) g;

        sum = zz+a+b+cc+dd+ee+ff+gg;
        System.out.println(sum);
    }

    //todo Task 4
    public void addTwoNumbers(){
        // input your solution here
        Scanner sc = new Scanner(System.in);
        int x;
        int y;
        int z;

        x = sc.nextInt();
        y = sc.nextInt();
        z = x+y;
        System.out.println(z);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        // input your solution here
        Scanner sc = new Scanner(System.in);
        int x;
        int y;

        System.out.println("Before Swap:");
        x = sc.nextInt();
        y = sc.nextInt();

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After Swap:");
        System.out.println(x +
                     "\n"+ y );
    }

    //todo Task 6
    public void compareTwoNumbers(){
        // input your solution here
        Scanner sc = new Scanner(System.in);
        int x;
        int y;
        for (int i = 1; i <= 3; i++) {
            System.out.println("n1: ");
            x = sc.nextInt();
            System.out.println("n2: ");
            y = sc.nextInt();

            if (x == y) {
                System.out.printf("n1 == n2"+ System.lineSeparator());

            } else if (x > y) {
                System.out.printf("n1 > n2"+ System.lineSeparator());

            } else if (y > x) {
                System.out.printf("n2 > n1"+ System.lineSeparator());

            } else if (x < y) {
                System.out.printf("n1 < n2"+ System.lineSeparator());

            } else if (y < x) {
                System.out.println("n2 > n1"+ System.lineSeparator());
            }
        }
    }

    //todo Task 7
    public void ratingSalesPerson() {
        // input your solution here
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 2; i++) {

        System.out.println("Enter annual Revenue: \n" +
                "0-100 000");
        int x = sc.nextInt();

            if (x <= 0 || x >= 100000) {
                System.out.printf("Invalid Revenue" + System.lineSeparator());

            } else if (x <= 0 || x < 20000) {
                System.out.printf("Poor Sales Revenue" + System.lineSeparator());

            } else if (x <= 50000 || x < 80000) {
                System.out.printf("Average Sales Revenue" + System.lineSeparator());

            } else if (x <= 80000 || x < 100000) {
                System.out.printf("Excellent Sales Revenue" + System.lineSeparator());
            }

        }
    }


    //todo Task 8
    public void getCommissionRate(){
        // input your solution here#
        Scanner sc = new Scanner(System.in);
        double y;

        for (int i = 1; i <= 2; i++) {
        System.out.println("Enter CommissionClass: \n" +
                "Eingabe: 1 --> Provision: 0,01\n" +
                "Eingabe: 2 --> Provision: 0,02\n" +
                "Eingabe: 3 --> Provision: 0,03\n" +
                "Eingabe: 4 --> Provision: 0,04");

        int x = sc.nextInt();

        switch (x){
            case 1:
                y = 0.01;
                break;
            case 2:
                y = 0.02;
                break;
            case 3:
                y = 0.03;
                break;
            case 4:
                y = 0.04;
                break;
            default:
                y = 0.00;
        }
        System.out.println("Your Commission Rate was set to "+y);
        }
    }

    //todo Task 9
    public void leapyear(){
        // input your solution here
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 2; i++) {
            System.out.print("Year: ");
            int x = sc.nextInt();

            if (x % 4 == 0 && (x % 100 != 0 || x == 0)) {
                System.out.println("Leapyear\n");
            } else {
                System.out.println("Not a Leapyear\n");
            }
        }
    }

    //todo Task 10
    public void transposedNumbers(){
        // input your solution here
        Scanner sc = new Scanner(System.in);
        int z = 0;

        System.out.println("Number: ");
        int x = sc.nextInt();

        while(x != 0)
        {
            int y = x % 10;
            z = z * 10 + y;
            x = x/10;
        }
        System.out.println(z);

    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}