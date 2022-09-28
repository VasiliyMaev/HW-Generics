public class Main {
    public static void main(String[] args) {
        MagicBox<String> magicBox = new MagicBox<>();
        magicBox.add("Волшебная палочка");
        magicBox.add("Книга заклинаний");


        System.out.println(magicBox.pick());
        magicBox.add("Зелье здоровья");
        magicBox.add("Зелье маны");

    }
}
