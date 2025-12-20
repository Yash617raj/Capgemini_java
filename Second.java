import java.util.Scanner;

class Second {
    public static void main(String[] args){
        //Q1 WAJP to check leap year

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Write the year: ");

        // int n = sc.nextInt();

        // if(n%400==0 || (n%4==0 && n%100!=0)){
        //     System.out.println("It is a leap year");
        // }
        // else System.out.println("Not a leap year");
        // sc.close();

        // Q2 WAJP for fruits using switch
        
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the fruit name: ");

        // String st = sc.nextLine();
        // switch (st) {
        //     case "apple":
        //         System.out.println("Apples are rich in fiber and vitamin C");
        //         break;
            
        //     case "banana":
        //         System.out.println("Bananas are a great source of potassium");
        //         break;

        //     case "mango":
        //         System.out.println("Mangoes are the king of fruits!");
        //         break;

        //     case "orange":
        //         System.out.println("Oranges are packed with vitamin C");
        //         break;

        //     default:
        //         System.out.println("Sorry, I don't have information about that fruit");
        //         break;
        // } 

        // Q3 WAJP that takes student's marks as input (A,B,C,D,F) and uses a switch statement ot print the message

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your Grade: ");

        // char ch = sc.next().charAt(0);
        // switch (ch) {
        //     case 'A':
        //         System.out.println("Excellent");
        //         break;
            
        //     case 'B':
        //         System.out.println("Good");
        //         break;

        //     case 'C':
        //         System.out.println("Fair");
        //         break;

        //     case 'D':
        //         System.out.println("Pass");
        //         break;

        //     case 'F':
        //         System.out.println("Fail");
        //         break;

        //     default:
        //         System.out.println("Invalid input");
        //         break;
        // } 

        //Q4 WAJP to perform arithmetic operation using switch and user choice. addition add 2 var,add 3 var, add 4 var

        // Scanner sc = new Scanner(System.in);

        // System.out.println("Choose Operation:");
        // System.out.println("1. Addition");
        // System.out.println("2. Subtraction");
        // System.out.println("3. Multiplication");
        // System.out.println("4. Division");

        // int choice = sc.nextInt();

        // switch (choice) {

        //     case 1:
        //         System.out.println("Addition Menu:");
        //         System.out.println("1. Add 2 numbers");
        //         System.out.println("2. Add 3 numbers");
        //         System.out.println("3. Add 4 numbers");

        //         int addChoice = sc.nextInt();

        //         switch (addChoice) {
        //             case 1:
        //                 System.out.print("Enter two numbers: ");
        //                 int a = sc.nextInt();
        //                 int b = sc.nextInt();
        //                 System.out.println("Sum = " + (a + b));
        //                 break;

        //             case 2:
        //                 System.out.print("Enter three numbers: ");
        //                 int x = sc.nextInt();
        //                 int y = sc.nextInt();
        //                 int z = sc.nextInt();
        //                 System.out.println("Sum = " + (x + y + z));
        //                 break;

        //             case 3:
        //                 System.out.print("Enter four numbers: ");
        //                 int p = sc.nextInt();
        //                 int q = sc.nextInt();
        //                 int r = sc.nextInt();
        //                 int s = sc.nextInt();
        //                 System.out.println("Sum = " + (p + q + r + s));
        //                 break;

        //             default:
        //                 System.out.println("Invalid Addition Choice");
        //         }
        //         break;

        //     case 2:
        //         System.out.println("Subtraction Menu:");
        //         System.out.println("1. Add 2 numbers");
        //         System.out.println("2. Add 3 numbers");
        //         System.out.println("3. Add 4 numbers");

        //         int subChoice = sc.nextInt();

        //         switch (subChoice) {
        //             case 1:
        //                 System.out.print("Enter two numbers: ");
        //                 int a = sc.nextInt();
        //                 int b = sc.nextInt();
        //                 System.out.println("Sub = " + (a - b));
        //                 break;

        //             case 2:
        //                 System.out.print("Enter three numbers: ");
        //                 int x = sc.nextInt();
        //                 int y = sc.nextInt();
        //                 int z = sc.nextInt();
        //                 System.out.println("Sub = " + (x - y - z));
        //                 break;

        //             case 3:
        //                 System.out.print("Enter four numbers: ");
        //                 int p = sc.nextInt();
        //                 int q = sc.nextInt();
        //                 int r = sc.nextInt();
        //                 int s = sc.nextInt();
        //                 System.out.println("Sub = " + (p - q - r - s));
        //                 break;

        //             default:
        //                 System.out.println("Invalid Subtraction Choice");
        //         }
        //         break;
            
        //     case 3:
        //         System.out.println("Multiplication Menu:");
        //         System.out.println("1. multiply 2 numbers");
        //         System.out.println("2. multiply 3 numbers");
        //         System.out.println("3. multiply 4 numbers");

        //         int mulChoice = sc.nextInt();

        //         switch (mulChoice) {
        //             case 1:
        //                 System.out.print("Enter two numbers: ");
        //                 int a = sc.nextInt();
        //                 int b = sc.nextInt();
        //                 System.out.println("multiply = " + (a * b));
        //                 break;

        //             case 2:
        //                 System.out.print("Enter three numbers: ");
        //                 int x = sc.nextInt();
        //                 int y = sc.nextInt();
        //                 int z = sc.nextInt();
        //                 System.out.println("multiply = " + (x * y * z));
        //                 break;

        //             case 3:
        //                 System.out.print("Enter four numbers: ");
        //                 int p = sc.nextInt();
        //                 int q = sc.nextInt();
        //                 int r = sc.nextInt();
        //                 int s = sc.nextInt();
        //                 System.out.println("multiply = " + (p * q * r * s));
        //                 break;

        //             default:
        //                 System.out.println("Invalid Multiplication Choice");
        //         }
        //         break;

        //     case 4:
        //         System.out.print("Enter two numbers: ");
        //         int d1 = sc.nextInt();
        //         int d2 = sc.nextInt();

        //         if (d2 != 0) {
        //             System.out.println("Division = " + (d1 / d2));
        //         } else {
        //             System.out.println("Division by zero not allowed");
        //         }
        //         break;

        //     default:
        //         System.out.println("Invalid Choice");
        // }

        // sc.close();

        //Q5 WAJP to display an employees designation based on the department and role selected by user.

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Write the Department: ");

        // System.out.println("Choices");
        // System.out.println("1. IT");
        // System.out.println("2. HR");
        // System.out.println("3. Finance");
        // System.out.println("4. Operation");

        // int n = sc.nextInt();
        // switch (n) {
        //     case 1:
        //         System.out.println("Developer");
        //         System.out.println("Tester");
        //         System.out.println("DevOps Engineer");
        //         break;
        //     case 2:
        //         System.out.println("Recruiter");
        //         System.out.println("HR executive");
        //         System.out.println("Payroll Officer");
        //         break;

        //     case 3:
        //         System.out.println("Accountant");
        //         System.out.println("Financial Analyst");
        //         System.out.println("Auditor");
        //         break;

        //     case 4:
        //         System.out.println("Operation Executive");
        //         System.out.println("Team Lead");
        //         System.out.println("Manager");
        //         break;

        //     default:
        //         System.out.println("Invalid Department");
        //         break;
        // }
        // sc.close();


        // Q6 WAJP to perform area calculation circle,rectangle,triangle,square

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Choose Which Shape area:");
        // System.out.println("1. Circle");
        // System.out.println("2. Rectangle");
        // System.out.println("3. Triangle");
        // System.out.println("4. Square");

        // int n = sc.nextInt();
        // switch (n) {
        //     case 1:
        //         System.out.println("Write the Radius: ");
        //         double r = sc.nextDouble();
        //         System.out.println("Area of Circle is: "+3.14*r*r);
        //         break;
        //     case 2:
        //         System.out.println("Write the sides: ");
        //         int a = sc.nextInt(),b=sc.nextInt();
        //         System.out.println("Area of Rectangle is: "+a*b);
        //         break;
        //     case 3:
        //         System.out.println("Write the sides: ");
        //         double base = sc.nextDouble(),height = sc.nextInt();
        //         System.out.println("Area of Triangle is: "+ 0.5*(base*height));
        //         break;
        //     case 4:
        //         System.out.println("Write the sides: ");
        //         int s = sc.nextInt();
        //         System.out.println("Area of Square is: "+s*s);
        //         break;
        
        //     default:
        //         break;
        // }

        /*
            Develop a menu driven Java program for complany to process details and determine role,acess level and final salary
            step 1: input Details: Employee Id(int), Employee Name(string), Age(int),Department choice(int) 1-IT, 2-HR, 3-Finance, Basic Salary(double)
            step 2: Age Validation: If age is less than 21, print ' Emplotee is not eligible to work' and stop execution, Otherwise continue
            step 3: Department & Role Selection(Nested Switch): It->developer,tester HR->Recruiter,Payroll, Finance-> Accountant,Auditor
            step4: Developer 30%, Tester 25%, Recruiter 20%, Payroll 22% , Accoutant 28% , Audtor 26%
            final Salary = Base salary + (base+allowance/100)

            step5: Access Level Decision: if sal>=60000 && dept is IT them admin acess, if sal>=60000 & dept is !IT them Manager acess, else Employee access

            step 6 Output: display id,name,dept,role,basic sal,final sal,access level
        */

            // Scanner sc = new Scanner(System.in);

            // System.out.println("Write Employee Id: ");
            // int empId = sc.nextInt();

            // System.err.println("Employee Name: ");
            // String name = sc.next();

            // System.out.println("Age: ");
            // int age = sc.nextInt();

            // System.out.println("Department Choice: ");
            // System.out.println("1-IT\n2-HR\n3-Finance");
            // int choice = sc.nextInt();

            // System.out.println("Salary");
            // double salary = sc.nextDouble();

            // if(age<21) {
            //     System.out.println("Employee is not eligible to work");
            //     return;
            // }
            //     double allowance=0.0;
            //     String role="",dept="";
            //     System.out.println("Enter your role");
            //     System.out.println("IT-> Developer, Tester\nHR-> Recruiter, Payroll\nFinance-> Accountant, Auditor");
            //     switch (choice) {
            //         case 1:
            //             dept="IT";
            //              role =  sc.next();
            //             switch (role) {
            //                 case "Developer":
            //                     allowance=30;
            //                     break;
            //                 case "Tester":
            //                     allowance=25;
            //                     break;
            //                 default:
            //                     System.out.println("Wrong Role");
            //                     break;
            //             }
                        
            //             break;
            //         case 2:
            //             dept="HR";
            //             role = sc.next();
            //             switch (role) {
            //                 case "Recruiter":
            //                     allowance=20;
            //                     break;
            //                 case "Payroll":
            //                     allowance=22;
            //                     break;
            //                 default:
            //                     System.out.println("Wrong Role");
            //                     break;
            //             }
            //             break;

            //         case 3:
            //             dept="Finance";
            //             role = sc.next();
            //             switch (role) {
            //                 case "Accountant":
            //                     allowance=28;
            //                     break;
            //                 case "Auditor":
            //                     allowance=26;
            //                     break;

            //                 default:
            //                     System.out.println("Wrong Role");
            //                     break;
            //             }
            //             break;

            //         default:
            //             System.out.println("Invalid Choice");
            //             break;
            //     }

            //     double finalSal = salary+(salary * allowance/100);

            //     String access;
            //     if(finalSal>=60000 && choice==1) access="Admin Level";
            //     else if(finalSal>=60000 && choice!=1) access="Manager Level";
            //     else access="Employee Access";

            //     System.out.println("Employee Id: "+empId);
            //     System.out.println("Name: " + name);
            //     System.out.println("Department: "+dept);
            //     System.out.println("Role: "+role);
            //     System.out.println("Basic Salary: "+salary);
            //     System.out.println("Final Salary: "+finalSal);
            //     System.out.println("Acess Level: "+access);

            // sc.close();

        /* 
        Design a Java Program that simulates a travel eitcket booking sytem. The program must validate passenger details calculate fare dunamiccaly, apply discounts and determine booking status using multiple decision structures

        step 1: Passenger Input: passenger ID, Passenger name, Age, travel type(1-Bus,2-Train,3-Flight), Base fare, Is Government Employee(boolean)

        step2: Age & Eligibilty Validtion(if/else): If age<5 pirnt free ticket- no booking and stop execution, if age>80 print <edical Clearnace Requuired and stop execution, else contiue booking process 
        step 3: Travel type& class Selection(Nested Switch)
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Passenger ID: ");
        int id = sc.nextInt();

        System.out.println("Passenger Name");
        String name = sc.next();

        System.out.println("Age");
        int age = sc.nextInt();

        System.out.println("Travel Type: ");
        System.out.println("1-Bus\n2-Train\n3-Flight");
        int travel = sc.nextInt();

        System.out.println("Base Fare: ");
        int bFare = sc.nextInt();

        System.out.println("Is Government Employee:(true/false) ");
        Boolean gEmp=sc.nextBoolean();

        if(age<5){
            System.out.println("Free Ticket");
            return;
        }
        if(age>80){
            System.out.println("Medical Clearance Required");
            return;
        }

        String classSelect="",t="";
        double mul=0.0;
        System.out.println("Select the Travel class");
        System.out.println("Bus-> Sleeper, Seater");
        System.out.println("Train-> General, Sleeper, AC");
        System.out.println("Flight-> Economy, Business");
        switch (travel) {
            case 1:
                t="Bus";
                classSelect = sc.next();
                switch (classSelect) {
                    case "Sleeper":
                        mul=1.2;
                        classSelect="Sleeper";
                        break;
                    case "Seater":
                        mul=1.0;
                        classSelect="Seater";
                        break;
                    default:
                        System.out.println("Wrong Role");
                        break;
                }
                break;

            case 2:
                t="Train";
                classSelect = sc.next();
                switch (classSelect) {
                    case "General":
                        mul = 1.0;
                        classSelect="General";
                        break;
                    case "Sleeper":
                        mul=1.3;
                        classSelect="Sleeper";
                        break;
                    case "AC":
                        mul=1.6;
                        classSelect="AC";
                        break;
                    default:
                        System.out.println("Wrong Role");
                        break;
                }
                break;

            case 3:
                t="Flight";
                classSelect = sc.next();
                switch (classSelect) {
                    case "Economy":
                        mul=2.5;
                        classSelect="Economy";
                        break;
                    case "Business":
                        mul=3.5;
                        classSelect="Business";
                        break;
                    default:
                        System.out.println("Wrong Role");
                        break;
                }
                break;
        
            default:
                System.out.println("Invalid Choice");
                break;
        }
        double fareClass = bFare*mul;
        double disc;
        if(age>=60) disc=30;
        else if(gEmp) disc=15;
        else if(age>=5 && age<12) disc = 50;
        else disc=0;

        double finalFare= fareClass-disc;
        String bookingStatus;
        if(finalFare>=10000){
            if(travel==3) bookingStatus="Confirmed";
            else bookingStatus="Waiting List";
        }
        else bookingStatus="Confirmed";
        

        System.out.println("Passenger Id: "+id);
        System.out.println("Passenger Name: "+name);
        System.out.println("Travel Type: "+ t);
        System.out.println("Travel Class: "+classSelect);
        System.out.println("Base Fare: "+bFare);
        System.out.println("Final Fare: "+finalFare);
        System.out.println("Discount given: "+disc);
        System.out.println("Booking Status: "+bookingStatus);
    }
}
