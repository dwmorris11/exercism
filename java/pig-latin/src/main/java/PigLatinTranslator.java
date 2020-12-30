public class PigLatinTranslator {
    private static char [] vowelSounds = {'a', 'e', 'i', 'o', 'u', 'x', 'y'};
    private static char [] pureVowels = {'a', 'e', 'i', 'o', 'u', 'y'};
    public String translate(String string) {
      String[] strArray = string.split("\\s+");
      String result = "";
      for(int i = 0; i < strArray.length; i++) {
          result += translateWord(strArray[i]);
          if(i < strArray.length - 1) {
              result += " ";
          }
      }
      return result;
    }

    private String translateWord(String string) {
        for(char c : vowelSounds) {
            if(c == string.charAt(0)){
                return translateVowel(string, c);
            }
        }
        if(string.charAt(0) == 'q') {
            return translateQ(string);
        }

        return translateConsonant(string);
    }
    private String translateVowel(String string, char c) {
        if(c == 'x' && string.charAt(1) != 'r') {
            return translateConsonant(string);
        }
        if(c == 'y' && string.charAt(1) != 't') {
            return translateConsonant(string);
        }
        return string + "ay";
    }

    private String translateQ(String string) {
        if(string.charAt(1) == 'u') {
            return string.substring(2) + "quay";
        }
        return string.substring(1) + "qay";
    }

    private String translateConsonant(String string) {
        int i = 1;
        outerLoop :
        {
            for (; i < string.length(); i++) {
                for (char c : pureVowels) {
                    if (string.charAt(i) == c && string.charAt(i - 1) != 'q') {
                        break outerLoop;
                    }
                }
            }
        }
        return string.substring(i) + string.substring(0, i) + "ay";

    }
}
