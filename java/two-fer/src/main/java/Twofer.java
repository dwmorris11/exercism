import java.util.Objects;

public class Twofer {
    public String twofer(String name) {
        return Objects.nonNull(name) ? "One for " + name + ", one for me." : twofer();
    }

    public String twofer() {
        return "One for you, one for me.";
    }
}
