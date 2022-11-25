package ru.sayinfull.education.kyu7;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListFiltering {
    public static void main(String[] args) {
        System.out.println(filterList(Arrays.asList(1, 2, "a", 6, 4, "b")));
    }

    public static List<Object> filterList(final List<Object> list) {
        return list.stream().filter(i->i instanceof Integer).collect(Collectors.toList());
//        List<Object> newList = new ArrayList<>();
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) instanceof Integer){
//                newList.add(list.get(i));
//            }
//        }
//        return newList;

    }
}
