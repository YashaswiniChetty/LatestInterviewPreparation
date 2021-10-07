package Trees;

import java.util.HashMap;
import java.util.Map;

public class UniqueBST {
    public int numTrees(int n) {
        //cache results of sub problems and hen use them
        Map<Integer, Integer> map = new HashMap<>();

            if (n == 0 || n == 1) {
                return 1;
            }
            if (map.containsKey(n)) {
                return map.get(n);
            }
            int count = 0;
            for (int i = 1; i <= n; i++) {
                count += numTrees(i - 1) * numTrees(n - i);
                map.put(n, count);
            }
            return map.get(n);
        }
    }
