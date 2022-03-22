package LeetCode;

import java.util.Arrays;
import java.util.Comparator;

public class Question179 {

    public String largestNumber(int[] nums) {

        if(nums.length ==0){
            return "";
        }

        String[] sa =  new String [nums.length];

        for(int i=0;i<nums.length;i++){
            sa[i] = Integer.toString(nums[i]);
        }

        Arrays.sort(sa,new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                String a = o1+o2;
                String b = o2+o1;
                return b.compareTo(a);
            }
        });

        if(sa[0].equals("0"))
         return "0";

         StringBuilder sb = new StringBuilder();
         for(String s:sa){
             sb.append(s);
         }

         return sb.toString();
        
    }

    public static void main(String args[]){
        int[] nums = {3,30,94,5,9};
        Question179 question179 = new Question179();
        System.out.print(question179.largestNumber(nums));
    }
    
}
