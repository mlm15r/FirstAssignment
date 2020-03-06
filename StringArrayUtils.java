import java.util.Arrays;
import java.util.ArrayList;

/**
 * Created by Yang on 1/23/20.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        return Arrays.asList(array).contains(value);
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String [] checking = new String [array.length];
        int num = 0;
        for (int i=array.length-1; i>=0; i--){
            checking [num] = array[i];
            num++;
        }
        return checking;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        return Arrays.equals(array, reverse(array));
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        boolean[] alpha = new boolean[26];
        String str = "";
        for (int i = 0; i < array.length; i++){
            str+= array[i];
        }
        
        str =  str.replace(" ","");
        int num=0, count=0;
        
        for (int i=0; i < str.length(); i++){
            if (str.charAt(i)>='A' && str.charAt(i)<='Z'){
                num = str.charAt(i) -'A';
            }
            else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                num = str.charAt(i) - 'a';
            }
            alpha[num]=true;
        }
        
        for (int i = 0; i<=25; i++){
            if (!alpha[i]){
                return false;
            }
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int num=0;
        for (int i = 0; i < array.length; i++){
            if (array[i].equals(value)){
                num++;
            }
        }
        return num;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> arrList = new ArrayList<String>();
        for (int i = 0; i < array.length; i++){
            if (!array[i].equals(valueToRemove)){
                arrList.add(array[i]);
            }
        }
        return arrList.toArray(new String[arrList.size()]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> arr = new ArrayList<String>();
        for (int i = 0; i < array.length; i++) {
            if (array.length - 1 == i) {
                arr.add(array[i]);
            }
            else if (!array[i].equals(array[i + 1])) {
                arr.add(array[i]);
            }
        }
        return arr.toArray(new String[arr.size()]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add(array[0]);
        for (int i = 1, j = 0; i < array.length; i++) {
            if (array[i].equals(Character.toString(arr.get(j).charAt(0)))) {
                String concat = arr.get(j)+array[i];
                arr.set(j, concat);
            }
            else{
                arr.add(array[i]);
                j++;
            }
        }
        return arr.toArray(new String[arr.size()]);
       }
}