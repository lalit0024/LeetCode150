import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class NonRepeatingChar {
    public static void main(String[] args) {
        String s = "leetcode";

        System.out.println("First unique character (nested loops): " + firstUniqCharNested(s));
        System.out.println("First unique character (HashMap): " + firstUniqCharHashMap(s));
        System.out.println("First unique character (Array Count): " + firstUniqueChar(s));
        System.out.println("Is Anagram: " + isAnagram("anagram", "nagaram"));
        System.out.println("Is Anagram (HashMap): " + isAnagramHashMap("anagram", "nagaram"));
        System.out.println("Is Anagram (Array Count): " + isAnagramArrayCount("anagram", "nagaram"));

        System.out.println("Group Anagrams: " + groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"})); 
   
      System.out.println("Find Max: " + finMax(new int[]{3, 5, 7, 2, 8}));
    }

    //O`(n^2) time complexity
    public static char firstUniqCharNested(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            boolean isUnique = true;
            for (int j = i+1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                return chars[i];
            }
        }
        return ' ';
    }

    private static char firstUniqCharHashMap(String s) {
        // Implementing using HashMap for O(n) time complexity
        // This method is not implemented in the current code but can be added for completeness
            char[] chars = s.toCharArray();
            Map<Character, Integer> charCount = new LinkedHashMap<>();
            for (char c : chars) {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
            for (char c : chars) {
                if (charCount.get(c) == 1) {
                    return c;
                }
            }
        return ' ';


    }   

    private static char firstUniqueChar(String s) {
        int[] charCount = new int[26];
        for (char c : s.toCharArray()) {
            charCount[c - 'a']++;
        }
        for (char c : s.toCharArray()) {
            if (charCount[c - 'a'] == 1) {
                return c;
            }
        }   
         return ' ';
    }

    // O(n) time complexity and O(1) space complexity
    private static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
       int asciSum = 0;
        for (char c : s.toCharArray()) {
            asciSum += c;
        }
         for (char c : t.toCharArray()) {
            asciSum -= c;
        }
        return (asciSum == 0)? true : false ;
    }   

   private static boolean isAnagramHashMap(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            if (!charCount.containsKey(c) || charCount.get(c) == 0) {
                return false;
            }
            charCount.put(c, charCount.get(c) - 1);
        }
        return true;
    }

    private static boolean isAnagramArrayCount(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] charCount = new int[26];
       // System.out.println("Character count array initialized: " + java.util.Arrays.toString(charCount));
        for (char c : s.toCharArray()) {
            charCount[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            charCount[c - 'a']--;
            if (charCount[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }


    private static List<List<String>> groupAnagrams(String[] strs) {
          
           Map<Integer, List<String>> anagramMap = new HashMap<>();
        for (String str : strs) {
            int asciSum = 0;
            char[] charArray = str.toCharArray();
            for (char c : charArray) {
                asciSum += c;
            }
            if (!anagramMap.containsKey(asciSum)) {
                List<String> anagramList = new ArrayList<>();
                anagramList.add(str);
                anagramMap.put(asciSum, anagramList);
               
            }else
                anagramMap.get(asciSum).add(str);
        }
        return anagramMap.values().stream().toList();    
    }

// O(n) time complexity and O(1) space complexity
    private static int finMax (int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        return max;
    }   

// O(n) time complexity and O(1) space complexity
    private static int findSecondMax (int[] nums) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }
        return secondMax;
    }
}
