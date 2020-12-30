class Acronym {
    private String acronym = "";
    Acronym(String phrase) {
        acronym = createAcronym(phrase);
    }

    private String createAcronym(String phrase){
        StringBuilder result = new StringBuilder();
        char[] phraseArray = phrase.toUpperCase().toCharArray();
        if(phraseArray[0] >='A' && phraseArray[0] <='Z') {
            result.append(phraseArray[0]);
        }
        for(int i = 1; i < phraseArray.length; i++) {
            if(phraseArray[i] >= 'A' && phraseArray[i] <= 'Z' && (phraseArray[i-1] == ' ' || phraseArray[i-1] == '_' || phraseArray[i-1] == '-')){
                result.append(phraseArray[i]);
            }
        }
        return result.toString();
    }
    String get() {
        return acronym;
    }

}
