// https://leetcode.com/problems/determine-if-two-strings-are-close/description/?envType=study-plan-v2&envId=leetcode-75

package leetcode_75.medium.determine_if_two_strings_are_close.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean closeStrings(String word1, String word2) {
        Map<Character, Integer> char_count_of_word1 = new HashMap<>();
        Map<Character, Integer> char_count_of_word2 = new HashMap<>();

        for(int i = 0; i < word1.length(); i++){
            if(char_count_of_word1.containsKey(word1.charAt(i))){
                int current_count = char_count_of_word1.get(word1.charAt(i));
                char_count_of_word1.put(word1.charAt(i), ++current_count);
            } else {
                char_count_of_word1.put(word1.charAt(i), 1);
            }
        }
        for(int i = 0; i < word2.length(); i++){
            if(char_count_of_word2.containsKey(word2.charAt(i))){
                int current_count = char_count_of_word2.get(word2.charAt(i));
                char_count_of_word2.put(word2.charAt(i), ++current_count);
            } else {
                char_count_of_word2.put(word2.charAt(i), 1);
            }
        }

        ArrayList<Character> list1_char = new ArrayList<>();
        ArrayList<Integer> list1_count = new ArrayList<>();

        for(Map.Entry<Character, Integer> entry:char_count_of_word1.entrySet()){
            list1_count.add(entry.getValue());
            list1_char.add(entry.getKey());
        }

        ArrayList<Integer> list2_count = new ArrayList<>();
        ArrayList<Character> list2_char = new ArrayList<>();

        for(Map.Entry<Character, Integer> entry:char_count_of_word2.entrySet()){
            list2_count.add(entry.getValue());
            list2_char.add(entry.getKey());
        }

        Collections.sort(list1_count);
        Collections.sort(list1_char);
        Collections.sort(list2_count);
        Collections.sort(list2_char);

        if (list1_count.equals(list2_count) && list1_char.equals(list2_char)){
            return true;
        }
        return false;
    }
}
