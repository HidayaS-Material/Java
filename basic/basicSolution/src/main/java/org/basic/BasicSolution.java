package org.basic;

import java.util.*;

public class BasicSolution {

    public static void main(String[] args) {
//        System.out.println("Hello, World!");
//        Q1();

        //Q2
        /*
            //        case 1:
                    System.out.println(endsWith("Hello", 'o'));
            //        Expected Output: true
            //        case 2:
                    System.out.println(endsWith("Hello", 'O'));
            //        Expected Output: true
            //        case 1:
                    System.out.println(endsWith("World", 'h'));
            //        Expected Output: false
            //        case 2:
                    System.out.println(endsWith("World", 'a'));
            //        Expected Output: false
            */

        //Q3
       /* System.out.println("The sum of the digits is : "+sumOfDigits(125));
        System.out.println("The sum of the digits is : "+sumOfDigits(15));
        System.out.println("The sum of the digits is : "+sumOfDigits(3556));*/

        //Q4

        /*
               System.out.println(reverseString("The quick brown fox"));
        */


        //Q5
       /* System.out.println(guessTheSquareRoot(2,4));
        System.out.println(guessTheSquareRoot(4,16));
        System.out.println(guessTheSquareRoot(3,14));*/


        //Q6
       /* System.out.println(evenAndOdd(new int[]{5, 7, 2, 4, 9}));
//        Number of even elements in the array: 2
//        Number of odd elements in the array: 3

        System.out.println(evenAndOdd(new int[]{5, 7, 1, 4, 22, 40, 65, 19, 20, 99, 80}));
//        Number of even elements in the array: 5
//        Number of odd elements in the array: 6
*/

        //Q7
        /*
                System.out.println(Arrays.toString(multiply(new int [] { 1, 3, -5, 4},new int []{1, 4, -5, -2})));
        */

        //Q8
        /*
        System.out.println(Arrays.toString(reverseArray(new int []{1, 2, 3, 4, 5, 6})));
*/

        //Q9
        /*
//        case 1:
        System.out.println(containsDuplicates(new String[]{"Ali" , "MOMO", "Salma", "Ali"}));
//        Expected Output: true
//        case 2:
        System.out.println( containsDuplicates(new String[]{"Nada" , "MOMO", "Salma", "Ali"}));
//        Expected Output: false

*/

        //Q10
        /*
        case 1:
        Input: removeDuplicates(new String[]{"Ali" , "MOMO", "Salma", "Ali"})
        Expected Output: ["MOMO", "Salma", "Ali"]
        case 2:
        Input: removeDuplicates(new String[]{"Nada" , "MOMO", "Salma", "Ali"})
        Expected Output:["Nada" , "MOMO", "Salma", "Ali"]

        System.out.println(removeDuplicates(new String[]{"Ali" , "MOMO", "Salma", "Ali"}));
        System.out.println(removeDuplicates(new String[]{"Nada" , "MOMO", "Salma", "Ali"}));

         */

        //Q11
        /*
        case 1:
        Input: removeElement(new int []{1,5,11,3,7},11)
        Expected Output: [1,5,3,7]
        case 2:
        Input: removeElement(new int []{1,5,11,3,4,7,9,13},13)
        Expected Output: [1,5,11,3,4,7,9]
        case 3:
        Input: removeElement(new int []{1,5,11,3,4,7,9,13},15)
        Expected Output: [1,5,11,3,4,7,9,13]
        case 4:
        Input: removeElement(new int {11,5,11,3,4,7,9,13},11)
        Expected Output: [5,3,4,7,9,13]
        case 5:
        Input: removeElement(new int []{4},4)
        Expected Output: []


        System.out.println(removeElement(new int []{1,5,11,3,7},11));
        System.out.println(removeElement(new int []{1,5,11,3,4,7,9,13},13));
        System.out.println(removeElement(new int []{1,5,11,3,4,7,9,13},15));
        System.out.println(removeElement(new int [] {11,5,11,3,4,7,9,13},11));
        System.out.println(removeElement(new int []{4},4));
        */

        //Q12
        /*
        case 1:
        Input: insertShiftArray(new int []{2,4,6,-8}, 5)
        Expected Output: [2,4,5,6,-8]
        case 2:
        Input: insertShiftArray(new int []{42,8,15,23,42}, 16)
        Expected Output: [42,8,15,16,23,42]


        System.out.println(Arrays.toString(insertShiftArray(new int []{2,4,6,-8}, 5)));
        System.out.println(Arrays.toString(insertShiftArray(new int []{42,8,15,42,20,24,132}, 16)));
    */

        //Q13
        /*
        case 1:
        Input:range(5, 8);
        Expected Output: [5, 6, 7, 8]
        case 1:
        Input:range(8, 5);;
        Expected Output: [5, 6, 7, 8]
        System.out.println(range(5,8));
        System.out.println(range(8,5));
         */

        //Q14
        /*
        case 1:
        Input: sort(new int []{0, 1, 2, 3, 4, 5, 6});
        Expected Output: [6, 5, 4, 3, 2, 1, 0]
        case 2:
        Input: sort(new int []{3, 6, 2, 0, 4, 1, 5});
        Expected Output: [6, 5, 4, 3, 2, 1, 0]
         System.out.println(Arrays.toString(sort(new int []{0, 1, 2, 3, 4, 5, 6})));
        System.out.println(Arrays.toString(sort(new int []{3, 6, 2, 0, 4, 1, 5})));
        */

        //Q15
        /*
        case 1:
        Input: zipLists(new int []{1, 3, 2},new int []{5, 9, 4});
        Expected Output: [1, 5, 3, 9, 2, 4]
        case 2:
        Input: zipLists(new int []{1, 3},new int []{5, 9, 4});
        Expected Output: [1, 5, 3, 9, 4]
        case 3:
        Input: zipLists(new int []{1, 3, 2},new int []{5, 9});
        Expected Output: [1, 5, 3, 9, 2]
        System.out.println(zipLists(new int []{1, 3, 2},new int []{5, 9, 4}));
        System.out.println(zipLists(new int []{1, 3},new int []{5, 9, 4}));
        System.out.println(zipLists(new int []{1, 3, 2},new int []{5, 9}));
        */

        //Q17
        /*
        case 1:
        Input: convertToString(new Character[]{'c', 'a', 't'});
        Expected Output: "cat"
        case 2:
        Input: convertToString(new Character[]{'h', 'e', 'l', 'l', 'o'});
        Expected Output: "hello"
         System.out.println(convertToString(new char[]{'c', 'a', 't'}));
        System.out.println(convertToString(new char[]{'h', 'e', 'l', 'l', 'o'}));
        */





    }

    public static void Q1() {
        System.out.println(-5 + 8 * 6);
        System.out.println((55 + 9) % 9);
        System.out.println(20 + -3 * 5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);

    }

    //Q2
    public static boolean endsWith(String string, char ch) {
//        if (string.endsWith(String.valueOf(Character.toLowerCase(ch)))){
//            return true;
//        }
//        return false;
        return string.endsWith(String.valueOf(ch).toLowerCase());

    }

    //Q3
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            num = num / 10;
            System.out.println(digit);
        }
        return sum;
    }

    //Q4
    public static String reverseString(String string) {
        String result = "";
//        StringBuilder sb=  new StringBuilder(string);
//        sb.reverse();
//        for (int j =0 ; j < sb.length() ;j++)
//        {
//            System.out.println(sb.charAt(j));
//        }
        for (int i = string.length() - 1; i >= 0; --i) {
            result = result + string.charAt(i);
        }

        return result;
    }

    //Q5

    public static String guessTheSquareRoot(int number, int squareRoot) {
//        System.out.println(Math.sqrt(squareRoot) +"=="+ number);
        if (Math.sqrt(squareRoot) == number)
            return "correct";
        return "incorrect";
//        return Math.sqrt(number) == squareRoot ? "correct" : "incorrect";
//        return squareRoot * squareRoot == number ? "correct" : "incorrect";
    }

    //Q6
    public static String evenAndOdd(int[] numbers) {
        int odd = 0;
        int even = 0;

        for (int i = 0; i < numbers.length; ++i) {
            if (numbers[i] % 2 == 0) {
                ++even;
            } else {
                ++odd;
            }
        }

        return "Number of even elements in the array: " + even + "\nNumber of odd elements in the array: " + odd;
    }

    //Q7

    public static int[] multiply(int[] firstArr, int[] secArr) {
        int[] result = new int[firstArr.length];

        for (int i = 0; i < firstArr.length; i++) {
            result[i] = firstArr[i] * secArr[i];
        }
        return result;
    }

    public static int[] reverseArray(int[] arr) {
        int[] reversedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArr[arr.length - 1 - i] = arr[i];
        }
        return reversedArr;
    }

    public static boolean containsDuplicates(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    return true;
                }
            }
        }
/*        Set<String> set = new HashSet<String>();
        for (String item : arr) {
            if (set.add(item) == false) {
                return true;
            }
        }*/

        return false;
    }

    public static ArrayList<String> removeDuplicates(String[] arr) {
       /* Set<String> targetSet = new HashSet(Arrays.asList(array));
        return targetSet.toString();*/
        ArrayList<String> list = new ArrayList<>();
        for (String item : arr) {
            if (!list.contains(item)) {
                list.add(item);
            }
        }

        return list;
//        return false;
    }

    public static ArrayList<Integer> removeElement(int[] arr, int num) {
        ArrayList<Integer> arr_new = new ArrayList();

        for (int i = 0; i < arr.length; ++i) {
            if (num != arr[i]) {
                arr_new.add(arr[i]);
            }
        }

        return arr_new;
    }

    public static int[] insertShiftArray(int[] arr, int num) {
        int middle = arr.length / 2;
        System.out.println(middle);
        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < newArr.length; i++) {
            if (i < middle) {
                newArr[i] = arr[i];
            } else if (i == middle) {
                newArr[i] = num;
            } else {
                newArr[i] = arr[i - 1];
            }
        }
        return newArr;
    }

    public static ArrayList<Integer> range(int start, int end) {
        ArrayList<Integer> arr_new = new ArrayList();

        if (end < start) {
            int temp = start;
            start = end;
            end = temp;
        }
        for (int i = start; i <= end; i++) {
            arr_new.add(i);
        }

        return arr_new;
    }

    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }

    public static ArrayList<Integer> zipLists(int[] firstArr, int[] secArr) {
        ArrayList<Integer> zippedListed = new ArrayList();
        int arrLength = firstArr.length > secArr.length ? firstArr.length : secArr.length;

        for(int i = 0; i < arrLength; ++i) {
            if (firstArr.length > i) {
                zippedListed.add(firstArr[i]);
            }

            if (secArr.length > i) {
                zippedListed.add(secArr[i]);
            }
        }

        return zippedListed;
    }

    public static boolean compareArrays(String[] stringsOne, String[] stringsTwo) {
        String[] one = stringsOne.length > stringsTwo.length ? stringsOne : stringsTwo;
        String[] two = stringsTwo.length < stringsOne.length ? stringsTwo : stringsOne;
        ArrayList<String> longList = new ArrayList(List.of(one));
        ArrayList<String> shortList = new ArrayList(List.of(two));

        for(int i = 0; i < longList.size(); ++i) {
            boolean match = shortList.contains(longList.get(i));
            if (!match) {
                return false;
            }
        }

        return true;
    }

    public static  String convertToString(char[] arr){
        String output= "";
        for (int  i = 0 ; i < arr.length ;i++){
            output+=arr[i];
        }
        return output;
    }
}
