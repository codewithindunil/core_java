package first;

import java.util.Scanner;

public class First {

    public static void main(String[] args) {
        int firstVal;
        int secVal;
        int tVal;
        System.out.println("enter a number : ");
        firstVal = new Scanner(System.in).nextInt();
        System.out.println("enter a number : ");
        secVal = new Scanner(System.in).nextInt();
        System.out.println("enter a number : ");
        tVal = new Scanner(System.in).nextInt();
//        if (firstVal > secVal) {
//            if (firstVal > tVal) {
//                System.out.println(firstVal + " is the biggest number");
//            } else {
//                System.out.println(tVal + " is the biggest number");
//
//            }
//        } else if (secVal > firstVal) {
//            if (secVal > tVal) {
//                System.out.println(secVal + " is the biggest number");
//
//            } else {
//                System.out.println(tVal + " is the biggest number");
//
//            }
//        }

//        if (firstVal >= (tVal + secVal)) {
//            System.out.println(firstVal + " is max");
//        }
//        else if (secVal <= (firstVal + tVal)) {
//            System.out.println(secVal + " is max");
//
//        } else {
//            System.out.println(tVal + " is max");
//
//        }
        if (firstVal > secVal) {
           secVal=firstVal;
        }
        if (secVal>tVal) {
            System.out.println(secVal);
        }

    }
}
