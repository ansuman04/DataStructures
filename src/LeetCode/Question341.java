package LeetCode;

import java.util.ArrayList;
import java.util.List;

 public class Question341 {
     public static void main(String[] args) {
        
     }
    
    // This is the interface that allows for creating nested lists.
    // You should not implement it, or speculate about its implementation.
    class NestedInteger {
        
        NestedInteger(int x) {
        }
        
      // Return true if this NestedInteger holds a single integer, rather than a nested list.
        boolean isInteger() {
         }

         // Return the single integer that this NestedInteger holds, if it holds a single integer.
         // The result is 1e9 if this NestedInteger holds a nested list.
         int getInteger() {
            
         }

         // Return the nested list that this NestedInteger holds, if it holds a nested list.
         // The result is an empty ArrayList if this NestedInteger holds a single integer.
         ArrayList<NestedInteger> getList() {
            
         }
    }
    

class NestedIterator {
    List<Integer> flattenList = null;
    int current =0;
    NestedIterator(ArrayList<NestedInteger> nestedList) {
        flattenList = new ArrayList<>();
        for(NestedInteger nestedInteger:nestedList){
            helper(nestedInteger);
        }
          
    }

    int next() {
         return flattenList.get(current++);
    }

    boolean hasNext() {
         return current < flattenList.size();
    }

    private void helper(NestedInteger value){
        if(value.isInteger()){
            flattenList.add(value.getInteger());
        }else{
            for(NestedInteger nestedInteger:value.getList()){
                helper(nestedInteger);
            }
        }
    }
}
 }