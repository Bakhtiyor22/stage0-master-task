package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if (year < 0 || month < 1 || month > 12) {
            System.out.println("invalid date");
            return;
        }

        switch (month) {
            case 4: case 6: case 9: case 11:
                System.out.println(30);
                break;
            case 2:
                System.out.println((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ? 29 : 28);
                break;
            default:
                System.out.println(31);
        }
    }

}
