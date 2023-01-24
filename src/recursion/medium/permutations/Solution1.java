package recursion.medium.permutations;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {

    // O(N*N!) T
    // O(N*N!) S

    public static List<List<Integer>> getPermutations(List<Integer> array) {
        if (array.size() == 0)
            return new ArrayList<>();

        List<List<Integer>> perms = new ArrayList<>();
        generatePermutations(array, 0, perms);
        return perms;
    }

    private static void generatePermutations(List<Integer> array, int index, List<List<Integer>> perms){
        if (index == array.size()-1) {
            List<Integer> perm = new ArrayList<>(array);
            perms.add(perm);
            return;
        }
        for (int i = index; i < array.size(); i++) {
            swap(array, index, i);
            generatePermutations(array, index+1, perms);
            swap(array, index, i);
        }
    }

    private static void swap(List<Integer> array, int index, int i) {
        int tmp = array.get(index);
        array.set(index, array.get(i));
        array.set(i, tmp);
    }
}
