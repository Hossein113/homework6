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
    public static List<Integer> exeptListFinal(List<Integer> List) {

        List<Integer> listFinal = new ArrayList<>();
        for (int i = 0; i < List.size(); i += 2) {

            if (List.get(i) <= List.get(i + 1)) {
                listFinal.add(List.get(i));
                listFinal.add(List.get(i + 1));

            }
        }
        return listFinal;
    }

    public static void printlist(List<Integer> list) {


        for (Integer i : list) {
            System.out.print(" " + i + " , ");
        }

        System.out.println();
        System.out.println(" ____________________________ ");


    }
}



