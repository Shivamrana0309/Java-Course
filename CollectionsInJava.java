import java.util.ArrayList;
import java.util.HashSet;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.Map;
import java.util.TreeMap;
import java.util.List;

public class CollectionsInJava {
    public static void main(String[] args) {
        // ArrayList
        List<Integer> nums = new ArrayList<Integer>(); // it is like vector in cpp
        nums.add(6);
        nums.add(10);
        nums.add(7);
        nums.add(19);
        System.out.println(nums.get(3)); // nums is indexed, but used with get keyword
        for(int n:nums){
            System.out.println(n);
        }
        
        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i,Integer j){
                if(i%10 > j%10) return 1;
                else return -1;
            }
        };
        Collections.sort(nums,com); // sorts in inc order
        System.out.println(nums);

        // Set or HashSet
        Set<Integer> num = new HashSet<Integer>(); // unique values but not sorted 
        // TreeSet -> unique + sorted values
        num.add(6);
        num.add(10);
        num.add(19);
        num.add(6);
        System.out.println(num);

        // Map -> key - value pair similar to cpp, stores unique keys only
        // HashMap and TreeMap works the same like Set
        Map<String,Integer> students = new TreeMap<>();
        students.put("Shivam", 56);
        students.put("Harsh", 46);
        students.put("Shiv", 96);
        students.put("Rana", 50);
        System.out.println(students);
        for(String key : students.keySet()){
            System.out.println(key + " : "+ students.get(key));
        }
    }
}
