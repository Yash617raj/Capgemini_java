/*
Write a Java program that uses a PriorityQueue to schedule and execute tasks based on their priority (lower number = higher priority). You should:
Create a Task class with name and priority.
Store tasks in a PriorityQueue<Task> so that tasks with higher priority (i.e., lower priority value) are processed first.
Add at least 5 tasks with different priorities.
Print the tasks in the order they are executed.
In a priority queue, elements are ordered based on priority (not insertion order). By default Java’s PriorityQueue behaves like a min-heap, meaning the smallest element is at the head.
*/

import java.util.PriorityQueue;
import java.util.Queue;

class Task implements Comparable<Task> {
    String name;
    int priority;

    Task(String name,int priority){
        this.name = name;
        this.priority = priority;
    }

    @Override
    public int compareTo(Task t) {
        return this.priority - t.priority;
    }
}

public class P2{
    public static void main(String[] args) {
        Queue<Task> t = new PriorityQueue<>();
        t.add(new Task("Yash", 1));
        t.add(new Task("Avi", 5));
        t.add(new Task("Ankit", 3));
        t.add(new Task("Shivam", 2));
        t.add(new Task("Daksh", 4));

        while(!t.isEmpty()){
           Task q = t.poll();
            System.out.println(q.name + " (Priority: " + q.priority + ")");
        }

        
    }
}
