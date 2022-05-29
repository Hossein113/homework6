import java.util.ArrayList;
import java.util.List;

public class MainApplication {


    public static void main(String[] args) {

    }

    private static List<Integer> createArrayList() {
        List<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(7);
        list.add(9);
        list.add(2);
        list.add(5);
        list.add(5);
        list.add(8);
        list.add(5);
        list.add(6);
        list.add(3);
        list.add(4);
        list.add(7);
        list.add(3);
        list.add(1);

        int number = list.size();
        if (list.size() % 2 != 0) {
            list.remove((number - 1));
        }
        return list;

    }


}
