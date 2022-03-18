package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Question229 {

    public List<Integer> majorityElement(int[] nums) {

        int cme1=-1;
        int cme2=-1;
        int count1=0;
        int count2=0;

        for(int i=0;i<nums.length;i++){
            if(count1==0){
                cme1 =  nums[i];
                count1+=1;
            }else if(count2==0){
                cme2 =nums[i];
                count2+=1;
            }else if(cme1 == nums[i]){
                count1+=1;
            }else if(cme2 ==nums[i]){
                count2+=1;
            }else{
                count1--;
                count2--;
            }
        }

        List<Integer> result = new ArrayList<>();
        count1 = 0;
        count2 =0;
    
        for(int n : nums) {
        if(cme1 != -1 && cme1 == n) {
            count1++;
        }
    
        if (cme2 != -1 && cme2 == n) {
                count2++;
        }
        }
    
        int p = nums.length;
        if (count1 > p/3) result.add(cme1);
        if (count2 > p/3) result.add(cme2);
    

        return result;
        
    }


    public static void main(String args[]){

        int[] nums = {3,2,3};

        Question229 question229 = new Question229();
        List<Integer> res= question229.majorityElement(nums);

        res.stream().forEach(e->System.out.print(e));

    }
    
}
