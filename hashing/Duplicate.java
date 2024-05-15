import java.util.HashSet;
import java.util.Set;

public class Duplicate {
    public boolean duplicate(int[] nums){
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    } 
    public static void main(String[] args) {
        Duplicate ob=new Duplicate();
        int [] nums={1,2,3,4};
        int [] arr={1,2,1,4};
        System.out.println(
            ob.duplicate(nums)

        );
        System.out.println(
            ob.duplicate(arr)
        );
    }
}
