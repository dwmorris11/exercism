import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Anagram {
    HashMap<Character, Integer> anagramMap;
    String anagram;
    Anagram(String string) {
        anagram = string.toLowerCase();
        anagramMap = storeMap(anagram);
    }

    public List<String> match(List<String> list) {
        List<String> result = new ArrayList<>();
        for(String element : list) {
            if(element.toLowerCase().equals(anagram)) { continue; }
            if(isAnagram(storeMap(element.toLowerCase()))) {
                result.add(element);
            }
        }
        return result;
    }

    private HashMap storeMap(String word) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(char c : word.toCharArray()) {
            int k = map.getOrDefault(c,0) + 1;
            map.put(c, k);
        }
        return map;
    }

    private boolean isAnagram(HashMap map) {
        if(map.size() != anagramMap.size()) { return false; }
        for(HashMap.Entry<Character, Integer> entry : anagramMap.entrySet() ) {
            if(entry.getValue() != map.get(entry.getKey())) { return false; }
        }
        return true;
    }
}
