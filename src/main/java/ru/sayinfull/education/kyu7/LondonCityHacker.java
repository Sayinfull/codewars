package ru.sayinfull.education.kyu7;


public class LondonCityHacker {
    public static void main(String[] args) {
        System.out.println(londonCityHacker(new Object[]{"Piccadilly", 56, 93, 243}));
    }

    public static String londonCityHacker(Object[] journey) {
        double total = 0;
//        boolean doubleNumber = false;
//        for (Object o : journey) {
//            if (o instanceof String) {
//                total += 2.4;
//            } else if (doubleNumber) {
//                doubleNumber = false;
//            } else {
//                total += 1.5;
//                doubleNumber = true;
//            }
//        }
//        return String.format("£%.2f", total);
        for (int i = 0; i < journey.length; i++) {
            {
                if (journey[i] instanceof String) {
                    total += 2.4;
                } else {
                    total += 1.5;
                }
                if (journey[i] instanceof Integer && i < journey.length - 1 && journey[i + 1] instanceof Integer) {
                    i++;
                }
            }
        }
        return String.format("£%.2f", total);
    }
}