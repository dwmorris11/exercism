class RnaTranscription {

    String transcribe(String dnaStrand) {
        String result = "";
        for(char c : dnaStrand.toUpperCase().toCharArray()) {
            switch (c) {
                case ('G'): {
                    result += 'C';
                    break;
                }
                case ('C'): {
                    result += 'G';
                    break;
                }
                case ('T'): {
                    result += 'A';
                    break;
                }
                case ('A'): {
                    result += 'U';
                    break;
                }
                default:
                    break;
            }
        }
        return result;
    }

}
