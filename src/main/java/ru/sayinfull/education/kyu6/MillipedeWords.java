package ru.sayinfull.education.kyu6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MillipedeWords {
    public static void main(String[] args) {
        System.out.println(check2(new String[]{"excavate", "endure", "desire", "screen", "theater", "excess", "night"}));
    }

//    public static boolean check(String[] millipede) {
//
//        boolean flag = false;
//        for (int i = 0; i < millipede.length - 1; i++) {
//            char[] arraysChar1 = millipede[i].toCharArray();
//            char[] arraysChar2 = millipede[i + 1].toCharArray();
//            if (arraysChar1[arraysChar1.length - 1] == arraysChar2[0]) {
//                flag = true;
//            } else {
//                for (int j = i + 1; j < millipede.length; j++) {
//                    if (arraysChar1[arraysChar1.length - 1] == arraysChar2[0]) {
//                        flag = true;
//                    }
//                }
//            }
//        }
//        return flag;
//    }


    public static boolean check2(String[] millipede) {
        StringBuffer millipedeReplace = new StringBuffer(millipede[0]);
        millipede[0] = "0";

        for (int i = 0; i < millipede.length - 1; i++) {
            for (int j = 0; j < millipede.length; j++) {
                if (millipedeReplace.charAt(millipedeReplace.length() - 1) == millipede[j].charAt(0)) {
                    millipedeReplace.append(millipede[j]);
                    millipede[j] = "0";
                } else if (millipedeReplace.charAt(0) == millipede[j].charAt(millipede[j].length() - 1)) {
                    millipedeReplace.insert(0, millipede[j]);
                    millipede[j] = "0";
                }
            }
        }
        for (int i = 0; i < millipede.length; i++) {
            if (!millipede[i].equals("0")){
                return false;
            }
        }
        return true;
    }
}
