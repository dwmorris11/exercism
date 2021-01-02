import java.util.Objects;

public class Twofer {
    public String twofer(String name) {
        return "One for " + Objects.toString(name, "you") + ", one for me.";
    }
}
