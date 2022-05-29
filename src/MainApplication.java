import java.util.ArrayList;
import java.util.List;

public class MainApplication {


    public static void main(String[] args) {

        System.out.println("0k");
        List<Integer> originalList = createArrayList();
        printlist(originalList);

        List<Integer> copyArrayList = new ArrayList<>(originalList);
        List<Integer> exeptArrayList = exeptListFinal(copyArrayList);
        printlist(exeptArrayList);

        //METHOD(1)
        List<Integer> copy = new ArrayList<>(originalList);
        List<Integer> exeptLisCopy = exeptListFinal(copy);
        printlist(exeptLisCopy);

        //METHOD(2)
//        List<Integer> removeListOrgin = new ArrayList<>(originalList);
//        List<Integer> byRemove = removelistFinal(removeListOrgin);
//        System.out.println("last-------------------");
//        printlist(originalList);
//        printlist(byRemove);


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

    //METHOD(1)
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

    //METHOD(2)

    public static List<Integer> removelistFinal(List<Integer> list) {

        for (int i = 0; i < list.size(); i += 2) {

            if ((list.get(i)) > (list.get(i + 1))) {

                list.remove(i);
                list.remove(i);
                i -= 2;

            }


        }
        return list;
    }


    public static void printlist(List<Integer> list) {


        for (Integer i : list) {
            System.out.print(" " + i + " , ");
        }

        System.out.println();
        System.out.println(" ____________________________ ");


    }
}



