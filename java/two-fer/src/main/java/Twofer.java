public class Twofer {
    public String twofer(String name) {
        if(name != null) {
            return "One for " + name + ", one for me.";
        }
        return twofer();
    }

    public String twofer() {
        return "One for you, one for me.";
    }
}
