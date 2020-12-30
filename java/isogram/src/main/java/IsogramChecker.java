import java.util.HashMap;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(Character c : phrase.toLowerCase().toCharArray()) {
            if(c.equals(' ') || c.equals('-')){ continue; }
            if(hashMap.get(c) != null) {
                return false;
            }else{
                hashMap.put(c,1);
            }
        }
        return true;
    }

}
