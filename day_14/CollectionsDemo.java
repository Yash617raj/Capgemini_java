import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {

        // Array list basic
        // List arr = new ArrayList();
        // arr.add(10);
        // arr.add(10.5);
        // arr.add('a');
        // arr.add("Abc");
        // arr.add(false);
        // System.out.println(arr);
        // System.out.println(arr.size());
        // System.out.println(arr.get(1));
        // arr.add(null);
        // System.out.println(arr);

		// List<String> pb = new ArrayList<String>();
		// pb.add("Sarso da saag");
		// pb.add("Chole bhature");
		// pb.add("Butter Chicken");
		// pb.add("Lassi");
		// System.out.println("PB: "+ pb );
		// List<String> up= new ArrayList<String>();
		// up.add("Litti chokha");
		// up.add("Dal chawal");
		// up.add("Sattu");
		// System.out.println("UP: "+ up);
		// List<String> south = new ArrayList<String>();
		// south.add("Dosa");
		// south.add("Idli");
		// south.add("Sambhar");
		// south.add("Chutney chutney");
		// south.add("Biryani");
		// System.out.println("SOUTH: "+ south);
		
		// List<String> lpu = new ArrayList<String>();
		// lpu.addAll(south);
		// lpu.addAll(pb);
		// System.out.println("LPU: "+ lpu);
		// lpu.addAll(4, up);
		// System.out.println("LPU: "+ lpu);
		
		// lpu.remove("Idli");
		// System.out.println("LPU: "+ lpu);
		
		// System.out.println(south.contains("Idli"));
		// System.out.println(lpu.contains("Idli"));
		
		// System.out.println(pb.remove(0));
		// System.out.println("PB: "+ pb);
		
		// System.out.println(lpu.containsAll(pb));
		
		// System.out.println(lpu.containsAll(south));
		
		// System.out.println(lpu.removeAll(south));
		// System.out.println("LPU: "+ lpu);
		// lpu.clear();
		// System.out.println("LPU: "+ lpu);
		// System.out.println(lpu.removeAll(south));

        // WAJP to print all the elements of list one by one using get method

        // List<String> st= new ArrayList<String>();
        // st.add("Avi"); 
        // st.add("Yash"); 
        // st.add("Ankit"); 
        // st.add("Shivam");
        
        // for(int i=0;i<st.size();i++){
        //     System.out.println(st.get(i));
        // }

        /*
            Write a Java program that performs the following operations on an ArrayList of Strings:
            - Create an ArrayList named cities.
            - Add the following city names to the list: "Delhi", "Mumbai", "Chennai", "Kolkata".
            - Insert the city "Bangalore" at index 2.
            - Display all the cities in the list.
            - Check whether the city "Mumbai" exists in the list and print a message:
                If found, print: "Mumbai is present in the list."
                Otherwise, print: "Mumbai is not present in the list."
            - Sort the list of cities in alphabetical order and display the sorted list.
            - Clear the list and print the final size of the ArrayList.
        */

            // List<String> cities = new ArrayList<String>();
            // cities.add("Delhi");
            // cities.add("Mumbai");
            // cities.add("Chennai");
            // cities.add("Kolkata");
            // cities.add(2,"Banglore");

            // System.out.println(cities);
            // System.out.println(
            //     cities.contains("Mumbai")?"Mumbai is present in the list":"Mumbai is not present in the list"
            // );

            // Collections.sort(cities);
            // System.out.println(cities);

            // cities.clear();
            // System.out.println(cities.size());

            /*
                Write a Java program that performs the following using an ArrayList of integers:
                - Add the following numbers to the list: 10, 5, 20, 15, 25.
                - Insert the number 12 at index 2.
                - Print all elements of the list.
                - Check if the number 15 exists in the list and print an appropriate message.
                - Sort the list in ascending order.
                - Remove the number 5 from the list.
                - Print the final list and its size.
            */

                // List<Integer> arr = new ArrayList<Integer>();
                // arr.add(10);
                // arr.add(5);
                // arr.add(20);
                // arr.add(15);
                // arr.add(25);

                // arr.add(2,12);
                // System.out.println(arr);

                // System.out.println(
                //     arr.contains(15) ? "15 is present in the array" : "15 is not present in the array"
                // );

                // Collections.sort(arr);
                // arr.remove(Integer.valueOf(5));
                // System.out.println(arr);
                // System.out.println(arr.size());

            // WAJP to convert all the element of array into list

            // int[] arr = {10,20,30,40};
            // List<Integer> arrL = new ArrayList<Integer>();

            // for(Integer it:arr){
            //     arrL.add(it);
            // }

            // System.out.println(arrL);

            //WAJP to create array which can store different type of data = {10,"LPU",'a',null,false,10.5}
            // List arr = new ArrayList();
            // arr.add(10);
            // arr.add("LPU");
            // arr.add('a');
            // arr.add(null);
            // arr.add(false);
            // arr.add(10.5);

            // System.out.println(arr);

            // WAJP to convert all the element of list into array

            // List<Integer> arr = new ArrayList<Integer>();
            // arr.add(1);
            // arr.add(2);
            // arr.add(3);
            // arr.add(4);
            // int[] arr1 = new int[arr.size()];
            
            // int j=0;
            // for(int it:arr){
            //     arr1[j++] = it;
            // }
            // System.out.println(Arrays.toString(arr1));

    }
}
