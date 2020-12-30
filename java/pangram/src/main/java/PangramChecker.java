import java.util.HashMap;

public class PangramChecker {
    private HashMap<Character, Boolean> alphabet = new HashMap<>();
    public boolean isPangram(String input) {
        input = input.toLowerCase();
        initializeAlphabet();
        for(Character c : input.toCharArray()) {
            alphabet.replace(c,true);
        }
        if(alphabet.values().stream().anyMatch(x->x==false)) {
            return false;
        }
        return true;
    }

    private void initializeAlphabet() {
        char current = 'a';
        while(current <= 'z') {
            alphabet.put(current, false);
            current++;
        }
    }

}
