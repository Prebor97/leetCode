import java.util.Arrays;

/**

 Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 The overall run time complexity should be O(log (m+n)).

 Example 1:
 Input: nums1 = [1,3], nums2 = [2] Output: 2.00000 Explanation: merged array = [1,2,3] and median is 2.

 Example 2:
 Input: nums1 = [1,2], nums2 = [3,4] Output: 2.50000 Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

 **/

public class MergedArrayMedian {
    public void median (int [] array1, int [] array2){
        int totalLength = array1.length + array2.length;
        int [] mergedArray = new int [totalLength];
        for (int i = 0; i<array1.length;i++){
            mergedArray[i]=array1[i];
        }
        for (int i = array1.length ; i<mergedArray.length;i++){
            mergedArray[i] = array2[i-array1.length];
        }
        Arrays.sort(mergedArray);
        int medianIndex = mergedArray.length/2;
        double median;
        if (mergedArray.length % 2 == 0) {
            median = (mergedArray[medianIndex - 1] + mergedArray[medianIndex]) / 2.0;
        } else {
            median = mergedArray[medianIndex];
        }
        System.out.print("This is the merged and sorted array :");
        new TwoSum().displayArray(mergedArray);
        System.out.println();
        System.out.println("The median is : "+mergedArray[medianIndex-1]);
    }

}
