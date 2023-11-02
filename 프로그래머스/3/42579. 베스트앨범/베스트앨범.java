import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> genreMap = new HashMap<>();
        Map<String, HashMap<Integer, Integer>> music = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        IntStream.range(0, plays.length).forEach(i -> {
            genreMap.put(genres[i], genreMap.getOrDefault(genres[i], 0) + plays[i]);
            if (!music.containsKey(genres[i])) {
                HashMap<Integer, Integer> map = new HashMap<>();
                map.put(i, plays[i]);
                music.put(genres[i], map);
            } else {
                music.get(genres[i]).put(i, plays[i]);
            }
        });

        List<String> genreSet = new ArrayList<>(genreMap.keySet());
        genreSet.sort((o1, o2) -> genreMap.get(o2) - genreMap.get(o1));

         for(String genre : genreSet) {
             HashMap<Integer, Integer> map = music.get(genre);
             List<Integer> indexes = new ArrayList<>(map.keySet());

             indexes.sort(((o1, o2) -> map.get(o2) - map.get(o1)));

             result.add(indexes.get(0));
             if(indexes.size() > 1){
                 result.add(indexes.get(1));
             }
         }

        return result.stream().mapToInt(i -> i).toArray();
    }
}