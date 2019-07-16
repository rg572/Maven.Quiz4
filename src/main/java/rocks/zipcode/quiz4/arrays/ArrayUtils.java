package rocks.zipcode.quiz4.arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        return values[values.length/2];
    }

    public static String[] removeMiddleElement(String[] values) {
        String[] returnArray = new String[values.length-1];

        for(int i = 0; i < values.length/2; i++){
            returnArray[i] = values[i];
        }
        for(int i = values.length/2; i < returnArray.length; i++){
            returnArray[i] = values[i+1];
        }
        return returnArray;
    }

    public static String getLastElement(String[] values) {
        return values[values.length-1];
    }

    public static String[] removeLastElement(String[] values) {
        String[] returnArray = new String[values.length-1];
        for(int i =0; i < returnArray.length; i++){
            returnArray[i] = values[i];
        }
        return returnArray;
    }
}