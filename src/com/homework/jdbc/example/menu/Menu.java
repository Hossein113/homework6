package com.homework.jdbc.example.menu;

import com.homework.jdbc.example.util.Linkedlist;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        try {
            applicationTest();

        } catch (Exception e) {
            System.out.println("please enter correct number !!!");
            applicationTest();
        }
    }

    private static void applicationTest() {
        Linkedlist lklist = new Linkedlist();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            showMenu(lklist);
            int number = scanner.nextInt();

            switch (number) {


                case 1:

                    System.out.println("press enter ");

                    int add = scanner.nextInt();
                    lklist.addToEnd(add);

                    break;

                case 2:
                    System.out.println("press enter index");

                    int remove = scanner.nextInt();
                    lklist.remove(remove);


                    break;


                case 3:
                    System.out.println("press enter Item");

                    int search = scanner.nextInt();
                    boolean exist = lklist.exist(search);
                    System.out.println(exist);


                    break;


                case 4:

                    System.out.println("size : " + lklist.size());


                    break;


                case 5:

                    System.out.println("is empity : " + lklist.isEmpity());
                    System.out.println("size : " + lklist.size());
                    break;

                case 6:
                    flag = false;
                    break;
            }

        }
    }


    private static void showMenu(Linkedlist lklist) {
        lklist.printList();
        System.out.println();
        System.out.println("1.add\n2.remove\n3.search\n4.size\n5.isEmpity\n6.exit");
        System.out.println();
    }

}

