import java.util.LinkedHashMap;
import java.util.Objects;

class ResistorColorDuo {
    LinkedHashMap<String, Integer> colorCode = new LinkedHashMap<>() {{
        put("black", 0);
        put("brown", 1);
        put("red", 2);
        put("orange", 3);
        put("yellow", 4);
        put("green", 5);
        put("blue", 6);
        put("violet", 7);
        put("grey", 8);
        put("white", 9);
    }};

    int value(String[] colors) {
        return colorCode.get(Objects.requireNonNullElse(colors[0],0)) * 10
                + colorCode.get(Objects.requireNonNullElse(colors[1],0));
    }
}
