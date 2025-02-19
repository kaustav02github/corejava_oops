import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class Collectionapi{
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(3);
        nums.add(6);
        nums.add(9);
        nums.add(10);
        System.out.println(nums);
        System.out.println(nums.get(2));
        nums.add(1, 12);
        System.out.println(nums);
    }
}