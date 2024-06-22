package functionfourday;

import java.util.Arrays;

public class Javapassvlaue {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
        change(arr);
        
        System.out.println(Arrays.toString(arr));
    }

    public static void change(int []nums){
        nums[0]=99;
    }
}
 