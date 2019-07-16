package rocks.zipcode.quiz4.fundamentals;

import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        return string.charAt(string.length()/2);
    }

    public static String capitalizeMiddleCharacter(String str) {
        return str.substring(0,str.length()/2) + str.substring(str.length()/2,str.length()/2+1).toUpperCase() +
                str.substring(str.length()/2+1);
    }

    public static String lowerCaseMiddleCharacter(String str) {
        return str.substring(0,str.length()/2) + str.substring(str.length()/2,str.length()/2+1).toLowerCase() +
                str.substring(str.length()/2+1);
    }

    public static Boolean isIsogram(String str) {
        Set<Character> letterSet = new HashSet<>();
        for(Character c : str.toCharArray()){
            letterSet.add(c);
        }
        return letterSet.size() == str.length();
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        for(int i = 0; i < str.length()-1; i++){
            if(str.charAt(i) == str.charAt(i+1)){
                return true;
            }
        }
        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        StringBuilder sbuild = new StringBuilder();
        int index = 0;
        while(index < str.length()-1){
            if(str.charAt(index) == str.charAt(index+1)){
                index+=2;
                continue;
            }
            sbuild.append(str.charAt(index));
            index++;

        }
        if(str.charAt(str.length()-2)!=str.charAt(str.length()-1)){
            sbuild.append(str.charAt(str.length()-1));
        }
        return sbuild.toString();
    }

    public static String invertCasing(String str) {
        char[] charArr = str.toCharArray();
        for(int i = 0; i < charArr.length; i++){
            if(charArr[i] > 96 && charArr[i] < 123){
                charArr[i] = (char)(charArr[i] - 32);
            }
            else if(charArr[i] > 64 && charArr[i] < 91){
                charArr[i] = (char)(charArr[i] + 32);
            }
        }
        return new String(charArr);
    }
}

