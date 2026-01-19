import java.util.HashSet;
import java.util.Set;
public class Q1{
    public static void main(String[] args){
    /*
    1. Remove Duplicates
	Given an array of integers, remove duplicate elements using HashSet and print unique values.
    */

    int[] arr = {10,3,4,10,5,23,4,5};
    Set<Integer> h = new HashSet<Integer>();
    for(int it:arr) h.add(it);
    System.out.println(h);
    
    }
}