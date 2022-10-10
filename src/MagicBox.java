import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class MagicBox<T> {

    Random random = new Random();

    private T[] items;

    public MagicBox(int lenght) {
        this.items = (T[]) new Object[lenght];
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    public T pick() {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                throw new RuntimeException(String.format("Коробка не полна, добавь ещё " + (items.length - i)));
            }
        }
        int randomInt = random.nextInt(items.length - 1);
        int index = randomInt;
        return items[index];
    }
}

