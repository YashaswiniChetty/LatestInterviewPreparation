package Heap;

import java.util.Map;
import java.util.TreeMap;

public class RelativeRanks {
    public static String[] findRelativeRanks(int[] score) {
        Map<Integer, Integer> map = new TreeMap<>((i1, i2) -> i2.compareTo(i1));
        for(int i=0; i<score.length; i++){
            map.put(score[i], i);
        }

        int rank = 1;
        String[] result = new String[score.length];
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){

            if(rank == 1){
                result[entry.getValue()] = "Gold Medal";
            }else if(rank == 2){
                result[entry.getValue()] = "Silver Medal";
            }else if(rank == 3){
                result[entry.getValue()] = "Bronze Medal";
            }else {
                result[entry.getValue()] = rank + "";
            }
            rank++;
        }
        return result;

    }

    public static void main(String[] args) {
        int scores[] ={10, 3, 8, 9, 4};
        String [] strings = findRelativeRanks(scores);
    }
}
