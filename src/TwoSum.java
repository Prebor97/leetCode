/**
 Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 You may assume that each input would have more than one solution, and you may not use same element twice.
 You can return the answer in any order.
 Example 1:
 Input: nums = [2,7,11,15], target = 9 Output: [0,1] Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

 Example 2:
 Input: nums = [3,2,4], target = 6 Output: [1,2]

 Example 3:
 Input: nums = [3,3], target = 6 **Output: [0,1]
 **/

import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    int [] sumArray;

    public void initializeArray(int nElem){
        sumArray = new int[nElem];
    }

    public void addValues(int value, int index){
        sumArray[index] = value;
    }

    public void addValues(int [] array, int value, int index){
        array[index] = value;
    }

    public void displayArray(int [] arr){
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++){
            if(arr[i]==0){
                continue;
            }
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
    }
    public void sumIndexes(int [] sumArrayExample, int target) {
        boolean found = false;
        int[] sum = new int[2];
        for (int i = 0; i < sumArrayExample.length; i++) {
            for (int j = i + 1; j < sumArrayExample.length; j++) {
                if (sumArrayExample[i] + sumArrayExample[j] == target) {
                    sum[0] = sumArrayExample[i];
                    sum[1] = sumArrayExample[j];
                    System.out.println("The numbers are " +sum[0] + " and " + sum[1]);
                    System.out.print("The indices are : [ "+i+" "+j+" ]");
                    System.out.println();
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("sum not found");
        }
    }
    public void optimizedSumIndices(int [] sumArrayExample, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        boolean found = false;
        for (int i = 0; i < sumArrayExample.length; i++){
            int complement = target - sumArrayExample[i];
            if (map.containsKey(complement)){
                System.out.println("The numbers are "+complement+" and "+sumArrayExample[i]);
                System.out.println("The indices are : [ "+map.get(complement)+" "+i+" ]");
                found = true;
            }
            map.put(sumArrayExample[i],i);
        }
        if (!found){
            System.out.println("sum not found");
        }
    }
}
