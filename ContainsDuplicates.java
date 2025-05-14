package Neetcode;

import java.util.*;

public class ContainsDuplicates {
    class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seenSet = new HashSet<>();

        for(int num: nums){
            if(seenSet.contains(num)){
                return true;
            }
            seenSet.add(num);
        }
        return false;
    }
}
}
