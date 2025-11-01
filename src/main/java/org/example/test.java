package org.example;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

public class test {

    public static void main(String[] args) {

        System.out.println("Hello world!");
    }

//    @Test
//    public int[] twoSum(int[] nums, int target) {
//        int[] a = new int[]{};
//        for (int i = 0; i < nums.length; i++) {
//
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[j] == target - nums[i]) {
//                    a[0] = i;
//                    a[1] = j;
//                    return a;
//                }
//            }
//        }
//        return a;
//    }
//
//    @Test
//    public int sum(int num1, int num2) {
//        return num1 + num2;
//    }

    @Test
    public void groupAnagrams() {
        String[] strs = createSampleOrders();
        List<List<String>> a = new ArrayList<>();
        HashMap<String, Object> b = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String s = new String(chars);

            List<String> list;
            if (b.containsKey(s)) {
                list = (List<String>) b.get(s);

            } else {
                list = new ArrayList<>();
            }
            list.add(strs[i]);
            b.put(s, list);
        }
        b.forEach((k, v) -> {
            a.add((List<String>) v);
        });
        System.out.println(a);
    }

    private static String[] createSampleOrders() {
        String[] strings = {"eat", "tea", "tan", "ate", "nat", "bat"};

        return strings;
    }

    @Test
    public void longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        Set<Object> objects = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        List<Integer> collect = set.stream().sorted().collect(Collectors.toList());
        for (int i = 0; i < collect.size(); i++) {

            Integer integer = collect.get(i);
            if (set.contains(integer + 1)) {
            }
        }
    }

}