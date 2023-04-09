package org.example.homework_nr_5;

import java.time.Month;

public class HomeWork5 {
    public static void main(String[] args) {
        Month[] months = Month.values();
        int i;
        for (i = 0; i != Month.values().length; i++)
            System.out.println(Month.values()[i]);

        enum Month {
            JANUARY,
            FEBRUARY,
            MARCH,
            APRIL,
            MAY,
            JUNE,
            JULY,
            AUGUST,
            SEPTEMBER,
            OCTOBER,
            NOVEMBER,
            DECEMBER

        }
        for (Month m : Month.values()) {
            System.out.println(m);

            System.out.println("-------------------------------------------");

            enum WeekDay {
                MONDAY,
                TUESDAY,
                WEDNESDAY,
                THURSDAY,
                FRIDAY,
                SATURDAY,
                SUNDAY;


                public boolean isWeekday() {
                    return this != SATURDAY && this != SUNDAY;
                }

                public boolean isHoliday() {
                    return !isWeekday();
                }


            }


            System.out.println(WeekDay.SATURDAY.isWeekday()); // true
            System.out.println(WeekDay.MONDAY.isHoliday()); // false
            System.out.println(WeekDay.SUNDAY.isHoliday()); // true

            System.out.println("----------------------------------------------");

            boolean boolVar = Boolean.parseBoolean("true");
            byte byteVar = Byte.parseByte("120");
            short shortVar = Short.parseShort("32000");
            int intVar = Integer.parseInt("147895632");
            long longVar = Long.parseLong("987654321987654321");
            double doubleVar = Double.parseDouble("4444.5d");
            float floatVar = Float.parseFloat("2354.56f");

            System.out.println("boolVar = " + boolVar);
            System.out.println("byteVar = " + byteVar);
            System.out.println("shortVar = " + shortVar);
            System.out.println("intVar = " + intVar);
            System.out.println("longVar = " + longVar);
            System.out.println("doubleVar = " + doubleVar);
            System.out.println("floatVar = " + floatVar);


        }
    }
}
