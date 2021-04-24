package Heap.TopKFrequentWords;

public class LeetCode {
    /*public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for(String word :words){
            map.put(word, map.getOrDefault(word, 0)+1);
        }
        PriorityQueue<String> que = new PriorityQueue<>(new Comparator<String>(){
            @Override
            public int compare(String word1, String word2){
                int frequency1 = map.get(word1);
                int frequency2 = map.get(word2);
                if(frequency1 == frequency2){
                    return word2.compareTo(word1);//greater alphabatical order
                }
                return frequency1 - frequency2;//sort by lesser frequency
            }
        });
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            que.add(entry.getKey());
            if(que.size()>k){
                que.poll();
            }
        }
        List<String> list = new ArrayList<>();
        while(!que.isEmpty()){
            list.add(que.poll());
        }
        Collections.reverse(list);
        return list;
    }*/
}
