import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /**
         Array sum of two numbers that equals target
         **/

        //    TwoSum twoSum = new TwoSum();
//        System.out.print("Enter array size : ");
//        int arraySize = scan.nextInt();
//        System.out.print("Enter target : ");
//        int target = scan.nextInt();
//        twoSum.initializeArray(arraySize);
//        int value = 0;
//        int index = 0;
//        System.out.print("Enter values for array. Input -1 to exit loop : ");
//        while (index<twoSum.sumArray.length){
//            value = scan.nextInt();
//            if (value==-1){
//                break;
//            }
//            twoSum.addValues(value,index);
//            index+=1;
//        }
//       twoSum.optimizedSumIndices(twoSum.sumArray, target);


        /**
         Linked reverse sum problem
         **/

//        LinkedListSum linkedListSum = new LinkedListSum();
//        ListNode list1 = new ListNode(0);
//        ListNode current = list1;
//        ListNode list2 = new ListNode(0);
//        ListNode current2 = list2;
//        int value1 = 0;
//        int value2 = 0;
//        System.out.println("Please enter values for the first linked list :");
//        while(value1 >= 0){
//             value1 = scan.nextInt();
//             if (value1<0){
//                 System.out.println("Value have been saved");
//             }else {
//                 current = linkedListSum.addLinkedValue(current, value1);
//             }
//        }
//        System.out.print("The values in the first linked list are : ");
//        linkedListSum.outPutList(list1);
//        System.out.println();
//
//        System.out.println("Please enter values for the second linked list :");
//        while(value2 >= 0){
//            value2 = scan.nextInt();
//            if (value2<0){
//                System.out.println("Value have been saved");
//            }else {
//                current2 = linkedListSum.addLinkedValue(current2, value2);
//            }
//        }
//        System.out.print("The values in the second linked list are : ");
//        linkedListSum.outPutList(list2);
//        System.out.println();
//
//        ListNode listSum = linkedListSum.addTwoLists(list1,list2);
//        int [] sumArray = linkedListSum.dummyArray(listSum);
//        System.out.print("Predicted sum for 123 and 123 is 642 and actual sum is : ");
//        linkedListSum.outPutList(listSum, sumArray);
//    }

        /**
         Longest String Problem
         **/
//        LongestSubString longestSubString = new LongestSubString();
//        System.out.print("Input string value to access : ");
//        String s = scan.next();
//        int maxLength = longestSubString.lengthOfLongestSubString(s);
//        System.out.println("The longest length is : "+ maxLength);
//        System.out.println("Peace out");

        /**
         Merged Array median problem
         **/

//        MergedArrayMedian median = new MergedArrayMedian();
//        TwoSum twoSum = new TwoSum();
//        System.out.print("Input size of array 1 : ");
//        int val1 = scan.nextInt();
//        System.out.println("Populate the array with "+val1+" values");
//        int [] array1 = new int[val1];
//        int counter = 0;
//        int value = 0;
//        while (counter<val1){
//            value = scan.nextInt();
//            twoSum.addValues(array1, value, counter);
//            counter++;
//        }
//        System.out.print("Input size of array 2 : ");
//        int val2 = scan.nextInt();
//        System.out.println("Populate the array with "+val2+" values");
//        int [] array2 = new int[val2];
//        int counter2 = 0;
//        int value2 = 0;
//        while (counter2<val2){
//            value2 = scan.nextInt();
//            twoSum.addValues(array2, value2, counter2);
//            counter2++;
//        }
//        median.median(array1,array2);

        /**
         Longest palindrome problem
         **/

//        LongestPalindrome longestPalindrome = new LongestPalindrome();
//        System.out.print("Please enter string value : ");
//        String s = scan.next();
//        System.out.println();
//        System.out.print("The longest palindrome is : "+longestPalindrome.longestPalindrome(s));

        /**
         Reverse integer problem
         **/

//            int val = 0;
//            System.out.print("Enter integer to reverse : ");
//            try{
//                val = scan.nextInt();
//            }catch (InputMismatchException i){
//                System.out.println("Value must be an integer");
//            }
//
//            ReverseInt reverseInt = new ReverseInt();
//            System.out.println("The reverse integer is "+reverseInt.reverse(val));


        /**

         int conversion problem

         **/

//        IntConversion intConversion = new IntConversion();
//                System.out.print("Input string : ");
//                String val = scan.next();
//                int converted_string = intConversion.getIntConversion(val);
//        System.out.println("The converted value is :"+converted_string);

    }
}
