import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class P1 {
    public static void main(String[] args) {
        // WAJP to convert all the element of array into list

        // int[] arr = {1,2,3,4,5,6};
        // List<Integer> al = new ArrayList<Integer>();

        // for(int i:arr){
        //     al.add(i);
        // }
        // System.out.println(al);

        // List<Integer> al2 = Arrays.asList(1,2,3,4,5,6);
        // System.out.println(al2);

        // al.add(10);
        // al.remove(0);
        // System.out.println(al);

        // // al2.add(10);  UnsupportOperationException
        // // al2.remove(0);  UnsupportOperationException
        // System.out.println(al2);

        //Q find if the person exist or not also if he exist at which index he is at

        // String[] s = {"Mridul","Girish","Pawan","Balaji","Murali"};
        // List<String> al = new ArrayList<String>();

        // for(String name:s){
        //     al.add(name);
        // }

        // System.out.println(al);

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the name: ");
        // String st = sc.next();

        // System.out.println(
        //     al.contains(st) ? st+" is Present at index "+al.indexOf(st) : st+" is absent"
        // );
    
        //Q WAJP to remove all the odd objects from the given list

        // int[] a = {10,21,23,25,26,28,22,23,21,24,25,26};
        // List<Integer> al = new ArrayList<Integer>();
        // for(int i:a){
        //     al.add(i);
        // }

        // System.out.println(al);

        // List<Integer> al2 = new ArrayList<Integer>();

        // for(Integer it:al){
        //     if(it.intValue()%2==0) al2.add(it);
        // }

        // for(int i=al.size()-1;i>=0;i--){
        //     if(al.get(i)%2 != 0) al.remove(i);
        // }

        // System.out.println(al);

        // WAJP to remove object from list one by one
        // int[] a = {10,21,23,25,26};
        // List<Integer> al = new ArrayList<Integer>();
        // for(int i:a){
        //     al.add(i);
        // }

        // System.out.println(al);

        // Iterator<Integer> itr = al.iterator();
        // while(itr.hasNext()){
        //     itr.next();
        //     itr.remove();
        //     System.out.println(al);
        // }

        
        // String[] s = {"Mridul","Girish","Pawan","Balaji","Murali"};
        // List<String> al = new ArrayList<String>();

        // for(String name:s){
        //     al.add(name);
        // }

        // System.out.println(al);

        // ListIterator<String> itr = al.listIterator();

        // System.out.println(itr.hasPrevious()); false
        // System.out.println(itr.previous()); noSuchElementException

        // System.out.println("==forward==");
        // while (itr.hasNext()) {
        //     System.out.println(itr.next());
        // }

        // System.out.println("==Backward");
        // while (itr.hasPrevious()) {
        //     System.out.println(itr.previous());
        // }

        // while(itr.hasNext()){
        //     itr.next();
        // }
        // while(itr.hasPrevious()){
        //     itr.previous();
        //     itr.remove();
        //     System.out.println(al);
        // }

        // Vector

        // List<String> v = new Vector<String>();
        // v.add("Yash");
        // v.add("Avi");
        // v.add("Ankit");
        // v.add("Shivam");

        // System.out.println(v);
        // System.out.println(v.size());

        // for(int i=0;i<v.size();i++){
        //     System.out.println(v.get(i));
        // }

        // System.out.println("-----");
		// Iterator<String> itr = v.iterator();
		// while(itr.hasNext()) {
		// 	System.out.println(itr.next());
		// }

        // Stack
        Stack<Integer> st = new Stack<Integer>();
        st.push(10);
        st.push(14);
        st.push(19);
        st.push(42);
        st.push(54);
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.empty());
    }
}
