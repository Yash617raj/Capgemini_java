import java.util.*;

class Students implements Comparable<Students>{
    int id;
    String name;
    double marks;
    public Students(int id,String name,double marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString(){
        return "Student [id= "+id+", name= "+name+", marks= "+marks+"]";
    }

    @Override
    public int compareTo(Students s){
        return this.id - s.id;
    }
}

class sortByNames implements Comparator<Students>{

    @Override
	public int compare(Students s1, Students s2) {
		return s1.name.compareTo(s2.name);
	}
    
}

class sortByMarks implements Comparator<Students>{

    @Override
    public int compare(Students s1, Students s2) {
		return Double.compare(s1.marks, s2.marks);
	}
    
}
public class P1 {
    public static void main(String[] args) {

        List<Integer> arr1 = new ArrayList<>(Arrays.asList(1,4,5,2,65,3,54,9));
        System.out.println("original array: "+arr1);;
        Collections.sort(arr1);
        System.out.println("Array after sort: "+arr1);

        List<Double> arr2 = new ArrayList<>(Arrays.asList(1.4,4.3,5.1,2.54,65.4,3.5,54.6,9.9));
        System.out.println("original array: "+arr2);;
        Collections.sort(arr2);
        System.out.println("Array after sort: "+arr2);

        List<Character> arr3 = new ArrayList<>(Arrays.asList('a','c','f','h','b','m'));
        System.out.println("original array: "+arr3);;
        Collections.sort(arr3);
        System.out.println("Array after sort: "+arr3);
        
        List<String> arr4 = new ArrayList<>(Arrays.asList("ABC","abc","DEF","def","fdsa"));
        System.out.println("original array: "+arr4);;
        Collections.sort(arr4);
        System.out.println("Array after sort: "+arr4);
        
       List<Students> arr5 = new ArrayList<>();
       arr5.add(new Students(1,"Yash",90.6));
       arr5.add(new Students(4,"Avi",85.4));
       arr5.add(new Students(3,"Ankit",50.6));
       arr5.add(new Students(2,"Sky",92.9));

       System.out.println("Array before sorting by ID:");
       for(Students it:arr5) System.out.println(it);
       Collections.sort(arr5);
       System.out.println("\nArray after sorting by ID:");
       for(Students it:arr5) System.out.println(it);

       
       System.out.println("\n--Sorted by name--");
		Collections.sort(arr5,new sortByNames());
		for (Students s : arr5) {
			System.out.println(s);
		}
       System.out.println("\n--Sorted by Marks--");
		Collections.sort(arr5,new sortByMarks());
		for (Students s : arr5) {
			System.out.println(s);
		}
    }
}
