import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main {
        public static void p1() {
            System.out.println("|--- /---\\ |    |  /---\\");
            System.out.println("   | |   | |    |  |   |");
            System.out.println("   | |   | |    |  |   |");
            System.out.println("   | |---| |    |  |---|");
            System.out.println("   | |   |  \\  /   |   |");
            System.out.println("\\__/ |   |   \\/    |   |");
        }
        public static void p2() {
            float a = 1;
            float hours_to_minutes = a*60;
            float minutes_to_hours = a/60;
            System.out.println(hours_to_minutes);
            System.out.println(minutes_to_hours);
        }
        public static void p3() {
            int a = 1, b = 2, c = 3;
            int d = a%b%c;
            System.out.println(d);
        }
        public static void p4()
        {
            double factorA = 1;
            double factorB = 2;
            double factorC = 3;
            double delta = Math.pow(factorB, 2) - 4 * factorA * factorC;

            if (delta > 0) {
                double x1 = (-factorB + Math.sqrt(delta)) / (2 * factorA);
                double x2 = (-factorB - Math.sqrt(delta)) / (2 * factorA);
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else if (delta == 0) {
                double x = -factorB / (2 * factorA);
                System.out.println("x = " + x);
            } else
                System.out.println("No roots");
        }
        public static void p5(){
            int a = 5;
            if (a % 2 == 0)
                System.out.println("EVEN");
             else
                System.out.println("ODD");

        }
        public static void p6(){
            int a = 4;
            switch (a){
                case 1:
                    a += 1;
                    break;
                case 2:
                    a += 2;
                    break;
                case 3:
                    a += 3;
                    break;
                case 4:
                    a += 4;
                    break;
                default:
                    a = 5;
                    break;
            }
            System.out.println(a);
        }

        public static void p7(){
            //1
            int a = 10;
            int b = 20;
            int max = (a > b) ? a : b;
            System.out.println(max);
            //2
            boolean weekend = true;
            int books = 5;
            boolean read_books = (weekend && books > 0);
            System.out.println(read_books);
            //3
            int number = -5;
            if (number > 0)
                System.out.println("Positive number");
            else if (number < 0)
                System.out.println("Negative number");
            else
                System.out.println("Zero");
        }

        public static void p8(){
            //1
            int number = 15;
            if (number > 0 && number <= 10)
                System.out.println("The number belongs to the range from 1 to 10.");
             else if (number > 10 && number <= 20)
                System.out.println("The number belongs to the range from 11 to 20.");
             else
                System.out.println("The number does not belong to any of the specified ranges.");

            //2
            int point_x = 3;
            int point_y = 5;
            if ((point_x >= 0 && point_x <= 10) && (point_y >= 0 && point_y <= 10))
                System.out.println("The point is within the rectangle with vertices (0,0), (10,0), (10,10), (0,10).");
             else
                System.out.println("The point is outside the rectangle area.");


            //3
            int year = 2024;
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
            //4
            double gradeMath = 4.5;
            double gradeCS = 5.0;
            if (gradeMath >= 4.0 && gradeCS >= 4.0) {
                System.out.println("The student passed both subjects with a positive grade.");
            } else if (gradeMath >= 4.0 || gradeCS >= 4.0) {
                System.out.println("The student passed at least one of the subjects.");
            } else {
                System.out.println("The student did not pass any of the subjects.");
            }
            //5
            String password = "dsfsdfsag!.";
            if ((password.length() >= 8 && password.matches(".*\\w.*")) || password.contains("!")) {
                System.out.println("The password meets security requirements.");
            } else {
                System.out.println("The password does not meet security requirements.");
            }
        }

        public static void p9(){
            int number = 5;
            switch (number) {
                case 0:
                    System.out.println("The number is 0.");
                    break;
                case 1:
                    System.out.println("The number is 1.");
                    break;
                case 2:
                    System.out.println("The number is 2.");
                    break;
                case 3:
                    System.out.println("The number is 3.");
                    break;
                case 4:
                    System.out.println("The number is 4.");
                    break;
                case 5:
                    System.out.println("The number is 5.");
                    break;
                case 6:
                    System.out.println("The number is 6.");
                    break;
                case 7:
                    System.out.println("The number is 7.");
                    break;
                case 8:
                    System.out.println("The number is 8.");
                    break;
                case 9:
                    System.out.println("The number is 9.");
                    break;
                default:
                    System.out.println("The number is outside the range from 0 to 9.");
                    break;
            }
        }

        public static void p10(){
            int number = 10;
            boolean modulozero = (number % 2 == 0) ? true : false;
            System.out.println(modulozero);
        }

        public static void p11(){
            int a = -4;
            if (a<0)
                a = Math.abs(a);
            System.out.println(a);
        }
        public static void p12() {
            int num = 3;

            switch (num) {
                case 1:
                case 4:
                case 8:
                    System.out.println("The variable has a value of 1, 4, or 8.");
                    break;
                case 2:
                case 3:
                case 7:
                    System.out.println("The variable has a value of 2, 3, or 7.");
                    break;
                default:
                    System.out.println("The variable has a different value.");
                    break;
            }
        }
        public static void p13() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("user balance: ");
            double userBalance = scanner.nextDouble();
            double fee = userBalance * 0.10;
            System.out.println("the fee is:" + fee);
        }

        public static void p14() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("number:");
            int number_of_month = scanner.nextInt();
            String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
            if (number_of_month >= 1 && number_of_month <= 12)
                System.out.println("Month name: " + months[number_of_month - 1]);
             else
                System.out.println("Invalid month number.");
        }

        public static void p15() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("code color:");
            String code_color = scanner.next().toUpperCase();
            switch (code_color) {
                case "G":
                    System.out.println("Green");
                    break;
                case "B":
                    System.out.println("Blue");
                    break;
                case "R":
                    System.out.println("Red");
                    break;
                default:
                    System.out.println("invalid");
                    break;
            }
        }
        public static void p16() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("number:");
            int number_of_month = scanner.nextInt();
            switch (number_of_month){
                case 1:
                case 2:
                case 12:
                    System.out.println("Winter");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Spring");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Summer");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Autumn");
                    break;
                default:
                    System.out.println("Invalid");
            }
        }

        public static void p17() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("height in m:");
            double height = scanner.nextDouble();
            System.out.println("weight in kg:");
            double weight = scanner.nextDouble();
            double BMI = weight/Math.pow(height, 2);
            String health;
            if (BMI < 18.5 )
                health = "underweight";
            else if (BMI > 18.5 && BMI < 24.9)
                health = "normal";
            else
                health = "overweight";

            System.out.println("your BMI:" + BMI +" " +"you are: "+ health);
        }

        public static void p18() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Income: ");
            double income = scanner.nextDouble();
            scanner.close();

            double tax = 0;

            double bracket1 = 12000;
            double bracket2 = 34000;

            double rate1 = 0.1;
            double rate2 = 0.2;
            double rate3 = 0.3;

            if (income <= bracket1) {
                tax = income * rate1;
            } else if (income <= bracket2) {
                tax = bracket1 * rate1 + (income - bracket1) * rate2;
            } else {
                tax = bracket1 * rate1 + (bracket2 - bracket1) * rate2 + (income - bracket2) * rate3;
            }
            System.out.println("tax : " + tax);

        }

        public static void p19(){
            for(int i = 1; i<=20; i++){
                if (i%2 != 0)
                    System.out.println(i);
                else
                    continue;
            }
        }
        public static void p20(){
            int a = 0;
            while (a<20){
                a ++;
                if (a%2 != 0)
                    System.out.println(a);
                else
                    continue;
            }
        }

        public static void p21(){
            for (int num = 1; num <= 100; num++) {
                if (num % 4 == 0 && num % 8 != 0 && num % 10 != 0)
                    System.out.println(num);
                else
                    continue;
            }
        }

        public static void p22(){
            Scanner scanner = new Scanner(System.in);
            char operation;
            double num1, num2;
            boolean continueCalculation = true;

            while (continueCalculation) {
                System.out.print("Enter the first number: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter the second number: ");
                num2 = scanner.nextDouble();
                System.out.print("Enter the operation (+, -, *, /): ");
                operation = scanner.next().charAt(0);
                switch (operation) {
                    case '+':
                        System.out.println("Result: " + (num1 + num2));
                        break;
                    case '-':
                        System.out.println("Result: " + (num1 - num2));
                        break;
                    case '*':
                        System.out.println("Result: " + (num1 * num2));
                        break;
                    case '/':
                        if (num2 != 0) {
                            System.out.println("Result: " + (num1 / num2));
                        } else {
                            System.out.println("Cannot divide by zero.");
                        }
                        break;
                    default:
                        System.out.println("Invalid operation.");
                }
                System.out.print("Perform another calculation? (Yes/No): ");
                String response = scanner.next().toLowerCase();
                continueCalculation = response.equals("yes") || response.equals("y");
            }

            System.out.println("Program terminated.");
            scanner.close();

        }

        public static void p23(){
            int tablica[] = {1, 2, 3, 4, 5, 6};
            for (int i = 0; i < tablica.length; i++) {
                System.out.println(tablica[i]);
            }
        }

        public static void p24() {
            enum Major {
                COMPUTER_SCIENCE, BIOLOGY, HISTORY, MATHEMATICS
            }

            interface StudentBehavior {
                void study();
                void participateInClass();
            }

            class Student {
                String name;
                int age;

                public Student(String name, int age) {
                    this.name = name;
                    this.age = age;
                }
                public void introduce() {
                    System.out.println("My name is " + name + " and I am " + age + " years old.");
                }
            }
            class ComputerScienceStudent extends Student implements StudentBehavior {
                Major major;

                public ComputerScienceStudent(String name, int age) {
                    super(name, age);
                    this.major = Major.COMPUTER_SCIENCE;
                }

                public void study() {
                    System.out.println("I am tudying programming");
                }

                public void participateInClass() {
                    System.out.println("I am participating in cs lectures");
                }
            }

            List<Student> students = new ArrayList<>();
            students.add(new ComputerScienceStudent("Alice", 20));
            students.add(new Student("Bob", 22));

            for (Student student : students) {
                student.introduce();

                if (student instanceof StudentBehavior) {
                    ((StudentBehavior) student).study();
                    ((StudentBehavior) student).participateInClass();
                }

                System.out.println();
            }

        }

        public static void main (String[] args){
            p24();
        }
}