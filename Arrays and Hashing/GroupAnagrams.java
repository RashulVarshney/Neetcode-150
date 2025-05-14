package Neetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        if(strs.length == 0){
            return new ArrayList();
        }

        Map<String, List<String>> res = new HashMap<>();
        for (String s : strs) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }

            String key = Arrays.toString(count);

            res.putIfAbsent(key, new ArrayList<>());

            res.get(key).add(s);
        }

        return new ArrayList<>(res.values());
    }
}
}
