package org.example.homework_nr_5;

public class HomeWork5 {
    public static void main(String[] args) {
        //months
        for (Month month : Month.values()) {
            System.out.println(month);
        }
        System.out.println("---------------------------------------");

        //weeks
        System.out.println(Weekday.MONDAY.isWeekday()); // true
        System.out.println(Weekday.SATURDAY.isWeekday()); // false
        System.out.println(Weekday.SUNDAY.isHoliday()); // true

        boolean bool = Boolean.parseBoolean("true");
        byte b = Byte.parseByte("120");
        short s = Short.parseShort("32000");
        int i = Integer.parseInt("147895632");
        long l = Long.parseLong("987654321987654321");
        double d = Double.parseDouble("4444.5");
        float f = Float.parseFloat("2354.56f");
    }

    enum Month {
        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE,
        JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
    }

    enum Weekday {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

        public boolean isWeekday() {
            return this != SATURDAY && this != SUNDAY;
        }

        public boolean isHoliday() {
            return this == SATURDAY || this == SUNDAY;
        }
    }
}

