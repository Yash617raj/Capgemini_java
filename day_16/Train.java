import java.util.*;

public class Train {
    public static void main(String[] args) {
        /*
            Problem Statement

            You are developing a Train Compartment Management System using Java Collections.
            Each compartment is identified by a compartment number (Integer).

            Tasks to Perform
                Create a LinkedList<Integer> to store compartment numbers.
                Add compartments in the following order: 101, 102, 103, 104, 105, 106

            Perform the following operations step by step:
            🔹 Operations
                Insert a VIP compartment (999): Immediately after compartment 102
                Remove all even-numbered compartments (Use Iterator only)
                Reverse the remaining compartments without using Collections.reverse()
                Check whether compartment 105 exists:
                    If present → print its index
                    If not present → print "Compartment not found"
        */
       List<Integer> arr = new  LinkedList<>();
       arr.add(101);
       arr.add(102);
       arr.add(103);
       arr.add(104);
       arr.add(105);
       arr.add(106);

       arr.add(2, 999);
       ListIterator<Integer> it = arr.listIterator();
        while(it.hasNext()){
            int a = it.next();
            if(a%2==0){
                it.remove();
            }
            
        }

        List<Integer> rev = new LinkedList<>();
        ListIterator<Integer> lit = arr.listIterator(arr.size());
        while (lit.hasPrevious()) {
            rev.add(lit.previous());
        }
        arr = rev;

        System.out.println("Reversed Compartments: " + arr);
        

        System.out.println(
            arr.contains(105) ? arr.indexOf(105)+" exist at the pos linked list" : " doesn't exist in the linked list"
        );
    }
}
