import java.util.Scanner;

public class sixth {
    /*
        Savings Prediction Calculation
        Question Description
        A finance app predicts savings based on monthly income and expense habits.
        Implement overloaded methods named predict to calculate the expected savings.
        Methods
            double predict(double income, double expenses)
            double predict(double income, double expenses, boolean festiveMonth)
        Rules
            Base Savings = income − expenses
            Festive Month → expenses increase by 20%
        Hardcoded Data Set to Use
            Income = 45000
            Expenses = 30000
            Festive Month = true
        Expected Output
            Festive expenses = 36000
            Savings = 9000
    */

        // public static double predict(double income,double expenses){
        //     double saving = income-expenses;
        //     return saving;
        // }
        // public static double predict(double income,double expenses, boolean festiveMonth){
        //     if(festiveMonth) expenses += (0.2*expenses);
        //     double saving = income-expenses;
        //     return saving;
        // }

        /*
            Loan Payable Amount Calculation

            Question Description
            A bank wants to compute the payable loan amount under different interest structures.
            Implement overloaded methods named loan to calculate the final payable amount based on the provided inputs.
            Overloads Required
            double loan(double principal)
            double loan(double principal, int years)
            double loan(double principal, int years, String loanType)
            Rules
            Base Interest
                Default interest is 8% simple interest when only principal is provided.
            With Years
                When years are provided, interest is compounded annually at 10%.
            With Loan Type
                HOME → compound annually at 7%
                AUTO → compound annually at 9%
                PERSONAL → compound annually at 12%
            Hardcoded Data Set to Use
                Principal = 200000
                Years = 5
                Loan Type = "HOME"
            Expected Output
                HOME loan compound rate = 7%
                Amount = 200000 * (1.0.07)^5 = 280510.35
        */

        // public static double loan(double principal){
        //     double ans = principal*1.08;
        //     return ans;
        // }
        
        // public static double loan(double principal,int years){
        //     double ans = principal * Math.pow(1.1, years);
        //     return ans;
        // }
        
        // public static double loan(double principal,int years, String loanType){
        //     double ans=0;
        //     if(loanType.equalsIgnoreCase("HOME")){
        //         ans = principal * Math.pow(1.07, years);
        //     }
        //     else if(loanType.equalsIgnoreCase("AUTO")){
        //         ans = principal * Math.pow(1.09, years);
        //     }
        //     else if(loanType.equalsIgnoreCase("PERSONAL")){
        //         ans = principal * Math.pow(1.12, years);
        //     }
        //     return ans;
        // }   

        /*
            Fitness Tracker

            A health and wellness company wants to build a Fitness Tracker in Java to help users monitor their daily step count and estimate calorie expenditure.
            The program should demonstrate methods, parameterized methods, and method overloading, while providing an interactive and meaningful user experience.

            The system must allow users to input their daily steps, calculate calories burned using different methods, and display a personalized summary report.

            Real-World Context
            The company, FitTrack Technologies, plans to launch a digital wellness program for employees.
            The tracker will record the number of steps each employee takes daily and estimate the calories they burn — either:

            using a standard formula (for general users), or
            an adjusted formula that considers user weight (for personalized tracking).
            This system will serve as a prototype for their upcoming mobile fitness app.

            Sample User Data
            User	Steps	Weight (kg)
            1		5000	60
            2		10000	70
            3		7500	65
            4		12000	80


            Methods Overview
            1. inputSteps()
            Type: No-argument method
            Purpose: Prompts the user to enter their daily step count using the Scanner class.

            2. calculateCalories(int steps)
            Type: Parameterized method
            Purpose: Calculates calories burned based only on step count.
            Formula:
            Calories = steps × 0.04
            Returns: Estimated calories burned (without weight consideration).

            3. calculateCalories(int steps, double weight) (Overloaded Method)
            Type: Parameterized and Overloaded method
            Purpose: Calculates calories burned considering the user’s weight for better accuracy.
            Formula:
            Calories = steps × weight × 0.0005
            Returns: Personalized calorie estimate.

            4. showSummary()
            Type: No-argument method
            Purpose: Displays a summary showing total steps and calories burned for the day.

            Example Workflow
            1> Accept user input using inputSteps().
            Example:
            Steps = 10000
            Weight = 70 kg

            2> Compute calories burned using either:
            Standard formula: calculateCalories(steps)
            Weight-adjusted formula: calculateCalories(steps, weight)

            3> Round the result using Math.round() for a clean display.

            4> Display results using showSummary().

            Example Output
            Total Steps: 10000
            Calories Burned: 350

            Explanation:
            Calories = 10000 × 70 × 0.0005 = 350
            The program calculates calories based on the user’s step count and weight, rounding the result for clear presentation.
        */

            
    
        // static int inputSteps() {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter daily steps: ");
        // return sc.nextInt();
        // }

        // static double calculateCalories(int steps) {
        //     return steps * 0.04;
        // }

        // static double calculateCalories(int steps, double weight) {
        //     return steps * weight * 0.0005;
        // }
    
        // static void showSummary(int steps, double calories) {
        //     System.out.println("Total Steps: " + steps);
        //     System.out.println("Calories Burned: " + Math.round(calories));
        // }
        
        

        @SuppressWarnings("resource")
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            // System.out.println("Enter your income: ");
            // int inc = sc.nextInt();
            // System.out.println("Enter your expenses: ");
            // int exp = sc.nextInt();
            // System.out.println("If it is festiveMonth or not: ");
            // boolean fes = sc.nextBoolean();

            // System.out.println(predict(inc,exp));
            // System.out.println(predict(inc, exp, fes));

            // SECOND 

            // System.out.println("Enter the principle amount: ");
            // double p = sc.nextDouble();

            // System.out.println("Enter the years: ");
            // int n = sc.nextInt();

            // System.out.println("Enter the type of loan: ");
            // String st= sc.next();

            // System.out.println(loan(p));
            // System.out.println(loan(p, n));
            // System.out.println(loan(p, n, st));

            // THIRD

            // int steps = inputSteps();
            // System.out.print("Enter your weight (kg): ");
            // double weight = sc.nextDouble();

            // System.out.print("Use weight-based calculation? (yes/no): ");
            // String choice = sc.next();
            
            
            // double calories;
            // if (choice.equalsIgnoreCase("yes")) {
            //     calories = calculateCalories(steps, weight);
            // } else {
            //     calories = calculateCalories(steps);
            // }

            // showSummary(steps, calories);

            // FOURTH

            String st = sc.nextLine();
            String[] ans =st.toLowerCase().split(" ");
            
            boolean[] vis = new boolean[ans.length];

            for(int i=0;i<ans.length;i++){
                if(vis[i]) continue;

                int count=1;
                for(int j=i+1;j<ans.length;j++){
                    if(ans[i].equals(ans[j])){
                        count++;
                        vis[j] = true;
                    }
                }

                System.out.println(ans[i]+" Count is: "+count);
            }
        }
}
