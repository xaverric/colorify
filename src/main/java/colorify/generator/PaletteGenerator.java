package colorify.generator;

import java.util.Collections;
import java.util.List;

public class PaletteGenerator<T> {

    public T getRandom(List<T> list) {
        Collections.shuffle(list);
        return list.get(0);
    }
}
