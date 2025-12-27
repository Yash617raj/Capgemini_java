import java.util.Scanner;

class Fifth {
    //Q79. WAJP to print all the numbers from the range 1 to 1000 without using any loop

        public static void solve1(int start){
            if(start>1000) return;
            
            System.out.println(start);
            solve1(start+1);
        }
            
    //Q80. WAJP to print odd numbers from the range 500 to 50 without using any loop
        
        public static void solve2(int n){
            if(n<50) return;
            if(n%2==1) System.out.println(n);
            solve2(n-1);

        }

    //Q81. WAJP to print sum of all number from the range 1 to 5 without using any loop

        public static int solve3(int n,int sum){
            if(n>5) return sum;
            sum+=n;
            return solve3(n+1, sum);
        }

    //Q82. WAJP to convert a double value 45.78 into an int and print the result
        public static void solve4(double d){
            
            System.out.println("int value is: "+(int)d);
        }
    
    //Q83. WAJP to Assign an int value 130 to a byte using explicit casting and print the output

        public static void solve5(int n){
            System.out.println("byte value is: "+(byte)n);
        }

    //Q84. WAJP to convert long->int->short->byte. use value 987654321
        public static void solve6(long l){
            System.out.println("int value is: "+(int)l);
            System.out.println("short value is: "+(short)l);
            System.out.println("byte value is: "+(byte)l);
        }


        public static void main(){
            // solve1(1); 
            // solve2(500); 

            // System.out.println(solve3(1,0));

            // solve4(45.78);
            // solve5(130);
            // solve6(987654321);
            Scanner sc = new Scanner(System.in);

            //Q85. WJAP to print even elements from the given array

            // System.out.println("Enter the size of array: ");
            // int n = sc.nextInt();
            // int arr[] = new int[n];
            // System.out.println("Enter the elements of array: ");
            // for(int i=0;i<n;i++) arr[i] = sc.nextInt();

            // for(int i=0;i<n;i++){
            //     if(arr[i]%2==0) System.out.println("Even elements are: "+arr[i]);
            // }
            
            //Q86. WJAP to print prime elements from the given array.

            // System.out.println("Enter the size of array: ");
            // int n = sc.nextInt();
            // int arr[] = new int[n];
            // System.out.println("Enter the elements of array: ");
            // for(int i=0;i<n;i++) arr[i] = sc.nextInt();

            // for(int i=0;i<n;i++){
            //     boolean flag =true;
            //     for(int j=2;j<arr[i];j++){
            //         if(arr[i]%j==0) flag = false;
            //     }
            //     if(flag) System.out.println(arr[i]+" is a prime number");
            //     else System.out.println(arr[i]+" is not a prime number");
            // }
            
            //Q87. WJAP to print perfect elements from the given array.

            // System.out.println("Enter the size of array: ");
            // int n = sc.nextInt();
            // int arr[] = new int[n];
            // System.out.println("Enter the elements of array: ");
            // for(int i=0;i<n;i++) arr[i] = sc.nextInt();

            // for(int i=0;i<n;i++){
            //     int sum=0;
            //     for(int j=1;j<arr[i];j++){
            //         if(arr[i]%j==0) sum+=j;
            //     }
            //     if(sum==arr[i]) System.out.println(arr[i]+" is a perfect number");
            //     else System.out.println(arr[i]+" is not a perfect number");
            // }

            //Q88. WJAP to find the sum of all elements

            // System.out.println("Enter the size of array: ");
            // int n = sc.nextInt();
            // int arr[] = new int[n];
            // System.out.println("Enter the elements of array: ");
            // for(int i=0;i<n;i++) arr[i] = sc.nextInt();
            // int sum=0;
            // for(int i=0;i<n;i++){
            //     sum+=arr[i];
            // }
            // System.out.println("Sum of all elements is: "+sum);

            //Q89. WJAP to find the product of all elements.

            // System.out.println("Enter the size of array: ");
            // int n = sc.nextInt();
            // int arr[] = new int[n];
            // System.out.println("Enter the elements of array: ");
            // for(int i=0;i<n;i++) arr[i] = sc.nextInt();
            // int pro = 1;
            // for(int i=0;i<n;i++)pro*=arr[i];
            // System.out.println("Product of all elements is: "+pro);
            

            //Q90. WJAP to find smallest element.
            
            // System.out.println("Enter the size of array: ");
            // int n = sc.nextInt();
            // int arr[] = new int[n];
            // System.out.println("Enter the elements of array: ");
            // for(int i=0;i<n;i++) arr[i] = sc.nextInt();

            // int mini = arr[0];
            // for(int i=0;i<n;i++){
            //     if(arr[i]<mini) mini = arr[i];
            // }
            // System.out.println("Smallest element in a array is: "+mini);

            //Q91 WJAP to find the largest element

            // System.out.println("Enter the size of array: ");
            // int n = sc.nextInt();
            // int arr[] = new int[n];
            // System.out.println("Enter the elements of array: ");
            // for(int i=0;i<n;i++) arr[i] = sc.nextInt();

            // int maxi = arr[0];
            // for(int i=0;i<n;i++){
            //     if(arr[i]>maxi) maxi = arr[i];
            // }

            // System.out.println("Largest element in a array is: "+maxi);

            //Q92 WJAP to find second smallest element

            // System.out.println("Enter the size of array: ");
            // int n = sc.nextInt();
            // int arr[] = new int[n];
            // System.out.println("Enter the elements of array: ");
            // for(int i=0;i<n;i++) arr[i] = sc.nextInt();

            // int mini1=Integer.MAX_VALUE,mini2=Integer.MAX_VALUE;
            // for(int i=0;i<n;i++){
            //     if(arr[i]<mini1){
            //         mini2 = mini1;
            //         mini1 = arr[i];
            //     }
            //     if(arr[i]>mini1 && arr[i]<mini2) mini2 = arr[i];
            // }

            // System.out.println("Second smallest number is: "+mini2);

            //Q93 WJAP to find second largest element
            
            // System.out.println("Enter the size of array: ");
            // int n = sc.nextInt();
            // int arr[] = new int[n];
            // System.out.println("Enter the elements of array: ");
            // for(int i=0;i<n;i++) arr[i] = sc.nextInt();

            // int maxi1=0,maxi2=0;
            // for(int i=0;i<n;i++){
            //     if(arr[i]>maxi1){
            //         maxi2 = maxi1;
            //         maxi1 = arr[i];
            //     }
            //     if(arr[i]<maxi1 && arr[i]>maxi2) maxi2 = arr[i];
            // }

            // System.out.println("Second largest number is: "+maxi2);

            //Q94. WJAP to find third smallest element

            // System.out.println("Enter the size of array: ");
            // int n = sc.nextInt();
            // int arr[] = new int[n];
            // System.out.println("Enter the elements of array: ");
            // for(int i=0;i<n;i++) arr[i] = sc.nextInt();

            // int mini1=Integer.MAX_VALUE,mini2 = Integer.MAX_VALUE,mini3 = Integer.MAX_VALUE;
            // for(int i=0;i<n;i++){
            //     if(arr[i]<mini1){
            //         mini3=mini2;
            //         mini2=mini1;
            //         mini1=arr[i];
            //     }

            //     else if(arr[i]!=mini1 && arr[i]<mini2) {
            //         mini3 = mini2;
            //         mini2 = arr[i];
            //     }
            //     else if(arr[i]!=mini2 && arr[i]!=mini1 && arr[i]<mini3) mini3 = arr[i];
            // }
            // System.out.println("Third smallest number is: "+mini3);

            //Q95. WJAP to find third largest element.

            // System.out.println("Enter the size of array: ");
            // int n = sc.nextInt();
            // int arr[] = new int[n];
            // System.out.println("Enter the elements of array: ");
            // for(int i=0;i<n;i++) arr[i] = sc.nextInt();

            // int maxi1=0,maxi2 = 0,maxi3 = 0;
            // for(int i=0;i<n;i++){
            //     if(arr[i]>maxi1){
            //         maxi3=maxi2;
            //         maxi2=maxi1;
            //         maxi1=arr[i];
            //     }

            //     else if(arr[i]!=maxi1 && arr[i]>maxi2) {
            //         maxi3 = maxi2;
            //         maxi2 = arr[i];
            //     }
            //     else if(arr[i]!=maxi2 && arr[i]!=maxi1 && arr[i]>maxi3) maxi3 = arr[i];
            // }
            // System.out.println("Third smallest number is: "+maxi3);

            //Q96. WJAP to merge two array.

            // System.out.println("Enter the size of array: ");
            // int n = sc.nextInt();
            // int arr1[] = new int[n];
            // int arr2[] = new int[n];
            // System.out.println("Enter the elements of first array: ");
            // for(int i=0;i<n;i++) arr1[i] = sc.nextInt();
            // System.out.println("Enter the elements of Second array: ");
            // for(int i=0;i<n;i++) arr2[i] = sc.nextInt();

            // int ans[] = new int[2 * n];
            // int i = 0;

            // while (i < n) {
            //     ans[i] = arr1[i];
            //     i++;
            // }

            // int j = 0;
            // while (i < 2 * n) {
            //     ans[i] = arr2[j];
            //     i++;
            //     j++;
            // }

            // for(int k=0;k<2*n;k++) System.out.println(ans[k]);

            //Q97 WJAP to find union from two array without collection.

            //     System.out.print("Enter size of first array: ");
            //     int n1 = sc.nextInt();
            //     int[] arr1 = new int[n1];
            //     System.out.println("Enter elements of first array:");
            //     for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();

            //     System.out.print("Enter size of second array: ");
            //     int n2 = sc.nextInt();
            //     int[] arr2 = new int[n2];
            //     System.out.println("Enter elements of second array:");
            //     for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();

            //     int[] union = new int[n1 + n2];
            //     int k = 0;

            //     for (int i = 0; i < n1; i++) {
            //         union[k++] = arr1[i];
            //     }

            //     for (int i = 0; i < n2; i++) {
            //         boolean found = false;

            //         for (int j = 0; j < n1; j++) {
            //             if (arr2[i] == arr1[j]) {
            //                 found = true;
            //                 break;
            //             }
            //         }

            //         if (!found) {
            //             union[k++] = arr2[i];
            //         }
            //     }

            //     System.out.println("Union of arrays:");
            //     for (int i = 0; i < k; i++) {
            //         System.out.print(union[i] + " ");
            //     }
            // }

            //Q98. WJAP to find intersections from two array.

            // System.out.print("Enter size of first array: ");
            // int n1 = sc.nextInt();
            // int[] arr1 = new int[n1];
            // System.out.println("Enter elements of first array:");
            // for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();

            // System.out.print("Enter size of second array: ");
            // int n2 = sc.nextInt();
            // int[] arr2 = new int[n2];
            // System.out.println("Enter elements of second array:");
            // for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();

            // int[]intersection = new int[n1 + n2];
            // int k = 0;

            // for (int i = 0; i < n1; i++) {
            //     intersection[k++] = arr1[i];
            // }

            // for (int i = 0; i < n2; i++) {
            //     boolean found = false;

            //     for (int j = 0; j < n1; j++) {
            //         if (arr2[i] == arr1[j]) {
            //             found = true;
            //             break;
            //         }
            //     }

            //     if (found) {
            //         intersection[k++] = arr2[i];
            //     }
            // }

            // System.out.println("intersection of arrays:");
            // for (int i = 0; i < k; i++) {
            //     System.out.print(intersection[i] + " ");
            // }

            //Q99 WAJP to print the occurrence of each element
            
            // System.out.println("Enter the size of array: ");
            // int n = sc.nextInt();
            // int arr[] = new int[n];
            // System.out.println("Enter the elements of array: ");
            // for(int i=0;i<n;i++) arr[i] = sc.nextInt();

            // for(int i=0;i<n;i++){
            //     int count=0;
            //     for(int j=0;j<n;j++){
            //         if(arr[i]==arr[j]) count++;
            //     }
            //     System.out.println(arr[i]+" occurence of this element is: "+count);
            // }

            //Q100. WAJP to find unique elements from array

            // System.out.println("Enter the size of array: ");
            // int n = sc.nextInt();
            // int arr[] = new int[n];
            // System.out.println("Enter the elements of array: ");
            // for(int i=0;i<n;i++) arr[i] = sc.nextInt();
            // for(int i=0;i<n;i++){
            //     boolean flag = true;
            //     for(int j=0;j<n;j++){
            //         if(i==j) continue;
            //         else if(arr[i]==arr[j]){
            //             flag = false;
            //             break;
            //         }
            //     }
            //     if(flag) System.out.println(arr[i]+" Is a unique element");
            //     else System.out.println(arr[i]+" Not a unique element");
            // }

            //Q101. WAJP to find duplicates from array

            
            // System.out.println("Enter the size of array: ");
            // int n = sc.nextInt();
            // int arr[] = new int[n];
            // System.out.println("Enter the elements of array: ");
            // for(int i=0;i<n;i++) arr[i] = sc.nextInt();
            // for(int i=0;i<n;i++){
            //     boolean flag = true;
            //     for(int j=0;j<n;j++){
            //         if(i==j) continue;
            //         else if(arr[i]==arr[j]){
            //             flag = false;
            //             break;
            //         }
            //     }
            //     if(!flag) System.out.println(arr[i]+" Is a duplicate element");
            //     else System.out.println(arr[i]+" Not a duplicate element");
            // }

            //Q102. WAJP to find count of elements which are divisible by k

            // System.out.println("Enter the size of array: ");
            // int n = sc.nextInt();
            // int arr[] = new int[n];
            // System.out.println("Enter the elements of array: ");
            // for(int i=0;i<n;i++) arr[i] = sc.nextInt();
            // System.out.println("Enter the number: ");
            // int k = sc.nextInt();
            
            // int count=0;
            // for(int i=0;i<n;i++){
            //     if(k%arr[i]==0)count++;
            // }
            // System.out.println("Total number divisble ny k is: "+count);

            //Q103. WAJP to find pairs whose sum is equal to given target.

            // System.out.println("Enter the size of array: ");
            // int n = sc.nextInt();
            // int arr[] = new int[n];
            // System.out.println("Enter the elements of array: ");
            // for(int i=0;i<n;i++) arr[i] = sc.nextInt();

            // System.out.println("Enter the target: ");
            // int k = sc.nextInt();
            // boolean flag = false;

            // for(int i=0;i<n;i++){
            //     for(int j=0;j<n;j++){
            //         if(i==j) continue;
            //         if(arr[i]+arr[j]==k) {
            //             flag = true;
            //             System.out.println(i+" "+j);
            //             break;
            //         }
            //     }
            //     if(flag) break;
                
            // }

            //Q104 Find the counts of elements of an unsorted integer array which are equal to the average of all elements of that array

            // System.out.println("Enter the size of array: ");
            // int n = sc.nextInt();
            // int arr[] = new int[n];
            // System.out.println("Enter the elements of array: ");
            // for(int i=0;i<n;i++) arr[i] = sc.nextInt();

            // int count=0,avg=0;
            // for(int i=0;i<n;i++) avg += arr[i];

            // avg/=n;
            // for(int i=0;i<n;i++){
            //     if(avg==arr[i])count++;
            // }
            // System.out.println(count);

            //Q105. Find the average of largest and smallest numbers in an unsorted integer 

            // System.out.println("Enter the size of array: ");
            // int n = sc.nextInt();
            // int arr[] = new int[n];
            // System.out.println("Enter the elements of array: ");
            // for(int i=0;i<n;i++) arr[i] = sc.nextInt();

            // int mini = Integer.MAX_VALUE;
            // int maxi = Integer.MIN_VALUE;
            // for (int i = 0; i < n; i++) {
            //     if (arr[i] < mini) mini = arr[i];
            //     if (arr[i] > maxi) maxi = arr[i];
            // }

            // int sum = 0;
            // int count = 0;

            // for (int i = 0; i < n; i++) {
            //     if (arr[i] == mini || arr[i] == maxi) {
            //         sum += arr[i];
            //         count++;
            //     }
            // }

            // double avg = (double) sum / count;
            // System.out.println("Average = " + avg);
            
            //Q106. Given an array of integers, find and print all the leaders of the array. A leader is defines as an element of the array which is greater than all the elements following it. The rightmost element is always a leader

            // System.out.println("Enter the size of array: ");
            // int n = sc.nextInt();
            // int arr[] = new int[n];
            // System.out.println("Enter the elements of array: ");
            // for(int i=0;i<n;i++) arr[i] = sc.nextInt();

            // for(int i=0;i<n;i++){
            //     boolean flag = true;
            //     for(int j=i+1;j<n;j++){
            //         if(arr[i]<arr[j]) flag =false;
            //     }
            //     if(flag) System.out.println(arr[i]);
            // }

            //Q107

            // System.out.println("Enter the size of array: ");
            // int n = sc.nextInt();
            // int arr[] = new int[n];
            // System.out.println("Enter the elements of array: ");
            // for(int i=0;i<n;i++) arr[i] = sc.nextInt();

            // System.out.println("Enter the target: ");
            // int k = sc.nextInt();

            // int maxi=0,ans=0;
            // for(int i=0;i<n;i++){
            //     int count=0,temp=arr[i];
            //     while(temp>0){
            //         int dig=temp%10;
            //         if(dig==k) count++;
            //         temp/=10;
            //     }
            //     if(count>maxi) ans=arr[i];
            //     maxi = Math.max(maxi,count);
            // }
            // System.out.println("The maximum occurrence is of number: "+ans);

            //Q108. Write a Program reverse each element

            // System.out.println("Enter the size of array: ");
            // int n = sc.nextInt();
            // int arr[] = new int[n];
            // System.out.println("Enter the elements of array: ");
            // for(int i=0;i<n;i++) arr[i] = sc.nextInt();

            // for(int i=0;i<n;i++){
            //     int temp = arr[i],rev=0;
            //     while(temp>0){
            //         int dig = temp%10;
            //         rev= rev*10+dig;
            //         temp/=10;
            //     }
            //     arr[i] = rev;
            // }

            // for(int i=0;i<n;i++) System.out.println(arr[i]);

            /*
                SmartTracker App – Daily Sales and Weather Insights
                Welcome to the world of SmartTracker, a digital assistant used by small shop owners and local weather stations.
                The app stores and analyzes daily sales and temperature data using arrays — helping users make smarter business and lifestyle decisions.

                Through this scenario, you’ll learn how 1D arrays can make data tracking and analysis efficient, accurate, and automated.

                Background Story
                You’ve been hired as a Java developer for SmartTracker Labs, a startup creating intelligent dashboards for community businesses.
                Your job is to write a Java module that analyzes:

                Shop sales over 7 days
                Temperature patterns for the same week
                Using arrays and methods, you’ll design algorithms that process, search, and update data — much like what real apps do behind the scenes.

                Data Setup
                int[] sales = {120, 80, 150, 90, 200, 75, 110}; // Sales for 7 days (in ₹)
                int[] temperatures = {32, 28, 31, 29, 35, 27, 30}; // Temperatures (°C) for 7 days
                Each array represents a week’s worth of data — from Monday to Sunday.

                Activity 1 – Average Temperature
                Goal: Find the average weekly temperature.
                Use a method to sum all values and divide by the total number of days.

                Expected Output:
                Average Temperature: 30.3°C


                Activity 2 – Hottest and Coldest Day
                Goal: Identify the highest and lowest recorded temperatures.
                Bonus: Try to print which day (e.g., Day 5) had those temperatures.

                Expected Output:
                Highest Temperature: 35°C
                Lowest Temperature: 27°C


                Activity 3 – Count Hot Days
                Goal: Count how many days the temperature was above 30°C.

                Expected Output:
                Number of hot days (>30°C): 3


                Activity 4 – Total and Average Sales
                Goal: Calculate total revenue and average daily sales using array traversal.

                Expected Output:
                Total Sales: 825
                Average Sales: 117.86


                Activity 5 – Record-Breaking Sales
                Goal: Identify the highest and lowest sales of the week and the days they occurred.

                Expected Output:
                Highest Sale: 200 on Day 5
                Lowest Sale: 75 on Day 6


                Activity 6 – Count High-Sales Days
                Goal: Find out how many days had sales above ₹100.

                Expected Output:
                Number of high sales days (>100): 4


                Activity 7 – Search for a Specific Sale
                Goal: Search the array for a specific sale amount (for example, ₹150).
                If found, print which day it occurred.

                Expected Output:
                Sale 150 found on Day 3


                Activity 8 – Update Sales Record
                Goal: Suppose the shop owner updated the sales for Day 2 to ₹95.
                Update the array and display the new value.

                Expected Output:
                Updated sales for Day 2: 95
            */

            int[] sales = {120, 80, 150, 90, 200, 75, 110};
            int[] temperatures = {32, 28, 31, 29, 35, 27, 30};

            // Activity1

            double sum =0;
            for(int i=0;i<7;i++){
                sum+=temperatures[i];
            }

            double avg = sum/7;
            System.out.println("The average of temprature is: "+avg);

            // Activity2

            int maxi=0,mini=temperatures[0];
            for(int i=0;i<7;i++){
                if(temperatures[i]>maxi) maxi=temperatures[i];
                if(temperatures[i]<mini) mini = temperatures[i];
            }

            System.out.println("Highest temprature is: "+maxi);
            System.out.println("Lowest temprature is: "+mini);

            //Activity3

            int count=0;
            for(int i=0;i<7;i++){
                if(temperatures[i]>30) count++;
            }
            System.out.println("Temprature above 30 is: "+count);

            //Activity 4

            double total=0;
            avg=0;

            for(int i=0;i<7;i++){
                total=sales[i];
            }
            avg = total/7;
            System.out.println("Total sales is: "+total);
            System.out.println("Avg of sales is:"+avg);

            // Activity 5

            maxi = 0;
            mini = sales[0];
            int day1=0,day2=0;
            for(int i=0;i<7;i++){
                if(sales[i]>maxi) {
                    maxi = sales[i];
                    day1=i;
                }
                if(sales[i]<mini){
                    mini = sales[i];
                    day2=i;
                }
            }
            System.out.println("Highest sales is: "+maxi+" on "+day1);
            System.out.println("lowest sales is: "+mini+" on "+day2);

            // Activity 6

            count =0;
            for(int i=0;i<7;i++){
                if(sales[i]>100) count++;
            }
            System.out.println("Sales above 100 are: "+count);

            // Activity 7

            System.out.println("Enter the sales you want to search: ");
            int s = sc.nextInt();

            for(int i=0;i<7;i++){
                if(sales[i]==s){
                    System.out.println("sales "+sales[i]+" found on day"+i);
                }
            }

            // Activity 8

            System.out.println("Enter the day you want to update: ");
            int upt= sc.nextInt();

            System.out.println("Enter the value: ");
            int val = sc.nextInt();

            sales[upt] = val;
            System.out.println("Updated sales for Day"+upt+" : "+ 95);

        }

}
    


