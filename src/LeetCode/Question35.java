package LeetCode;
public class Question35 {

    public int searchInsert(int[] nums, int target) {
        
        if(nums.length ==0){
            return 0;
        }
        
        int left = 0;
        int right = nums.length -1;
        
        while(left <= right){
            int mid = left +(right-left)/2;
            if(nums[mid]== target){
                return mid;
            }
            if(nums[mid]<target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return left;       
    }

    public static void main(String args[]){
        Question35 question35 = new Question35();
        System.out.print(question35.searchInsert(new int[]{1 ,3, 5, 7, 9, 10}, 6));
    }
    
}
