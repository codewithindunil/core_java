package day5_array;

import java.util.Scanner;

public class Day5_array {

    public static void main(String[] args) {
//        String[] names = new String[5];
//        int x;
//        for (x = 0; x < 5; x++) {
//            System.out.println("enter "+(x+1)+" name :indunil");
//            names[x] = new Scanner(System.in).nextLine();
//
//        }

//        double[] second = {1, 2, 3, 4, 5};
//
//        for (x = 0; x < 5; x++) {
//            System.out.println(second[x]);
//            
//
//        }
//
//            for (x = 0; x < 10; x++) {
//                try {
//                    System.out.println(names[x]);
//                } catch (Exception e) {
//                    System.out.println(e);
//                }
//
//            }
        Student team[] = new Student[5];
        int i;
        for (i = 0; i < 3; i++) {
            System.out.println("enter student" + (i + 1) + " name");
            String name = new Scanner(System.in).nextLine();
            System.out.println("enter student" + (i + 1) + " gender");
            String gender = new Scanner(System.in).nextLine();
            team[i] = new Student(name, gender);
        }
        for (i = 0; i < 3; i++) {
            team[i].print();
        }

    }

}
