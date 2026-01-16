import java.util.*;

public class P1 {
    public static void main(String[] args) {
        // WAJP to iterator all the objects of linked list in forward as well as backward direction

        // List<Integer> arr = new LinkedList<>();
        // arr.add(10);
        // arr.add(20);
        // arr.add(30);
        // arr.add(40);

        // ListIterator<Integer> it = arr.listIterator();

        // System.out.println("Forward direction: ");
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

        // System.out.println("Backward direction: ");
        // while(it.hasPrevious()){
        //     System.out.println(it.previous());
        // }

        // Priority-Queue 
        
// 		Queue<Integer> pq = new PriorityQueue<Integer>();
// 		pq.offer(10);
// 		pq.offer(15);
// 		pq.offer(26);
// 		pq.offer(7);
// 		pq.offer(13);
// 		pq.offer(10);
// 		pq.offer(14);
// //		pq.offer(null); NullPointerException
// 		System.out.println(pq);
// 		System.out.println(pq.peek());
// 		System.out.println(pq.peek());
// 		System.out.println(pq.poll());
// 		System.out.println(pq);
// 		System.out.println(pq.poll());
// 		System.out.println(pq);
// 		pq.poll();
// 		System.out.println(pq);
// 		pq.poll();
// 		System.out.println(pq);

        /*
            Write a Java program that uses a PriorityQueue to schedule and execute tasks based on their priority (lower number = higher priority). You should:
            Create a Task class with name and priority.
            Store tasks in a PriorityQueue<Task> so that tasks with higher priority (i.e., lower priority value) are processed first.
            Add at least 5 tasks with different priorities.
            Print the tasks in the order they are executed.
            In a priority queue, elements are ordered based on priority (not insertion order). By default Java’s PriorityQueue behaves like a min-heap, meaning the smallest element is at the head.
        */

            // Queue<Integer> q = new PriorityQueue<>();
            // q.offer(1);
            // q.offer(14);
            // q.offer(10);
            // q.offer(5);
            // q.offer(9);

            // while(!q.isEmpty()){
            //     System.out.println(q.peek());
            //     q.poll();
            // }

        // HashSet

		// Set hs = new HashSet();
		// hs.add(10);
		// hs.add(12);
		// hs.add(null);
		// hs.add('a');
		// hs.add(true);
		// hs.add(10);
		// hs.add("LPU");
		// hs.add('a');
		// hs.add(null);
		// System.out.println(hs);
		// System.out.println("----");
		// for(Object obj : hs) {
		// 	System.out.println(obj);
		// }
        // System.out.println("----");
        // Iterator itr = hs.iterator();
        // while(itr.hasNext()) {
		// 	System.out.println(itr.next());
		// }

        //LinkedHashSet

		// Set hs = new LinkedHashSet();
		// hs.add(10);
		// hs.add(12);
		// hs.add(null);
		// hs.add('a');
		// hs.add(true);
		// hs.add(10);
		// hs.add("LPU");
		// hs.add('a');
		// hs.add(null);
		// System.out.println(hs);
		// System.out.println("----");
		// for(Object obj : hs) {
		// 	System.out.println(obj);
		// }
		// System.out.println("----");
		// Iterator itr = hs.iterator();
		// while(itr.hasNext()) {
		// 	System.out.println(itr.next());
		// }

        // WAJP to remove duplicate from given list and print only unique objects;
        List<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(12);
        arr.add(13);
        arr.add(12);
        arr.add(14);
        arr.add(14);
        arr.add(null);
        arr.add(15);
        arr.add(11);
        arr.add(10);
        arr.add(16);
        arr.add(null);
        arr.add(10);
        System.out.println("arr: "+arr);

        Set<Integer> hs = new LinkedHashSet<>(arr);
        System.out.println("hashSet: "+ hs);
			
    }
}
