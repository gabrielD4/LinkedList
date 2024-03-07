import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        LinkedList<Fruit> fruitsList = new LinkedList<>(List.of(new Fruit("Apple"),
                new Fruit("Banana"),
                new Fruit("Pineapple"),
                new Fruit("Orange")));
        System.out.println(fruitsList);

        fruitsList.addFirst(new Fruit("Peach"));
        fruitsList.addLast(new Fruit("Strawberry"));
        System.out.println(fruitsList);
    }
}