public class DZ2 {
    public static void main(String[] args) {
        System.out.println(checkSumInRangeFrom10to20(10, 5));
        printCheckOnPositiveNegative(-5);
        System.out.println(checkOnPositiveNegative(-5));
        printStringNTimes("Ура, сегодня лекция", 5);
        System.out.println(checkOnLeapYear(2000));

    }

    public static boolean checkSumInRangeFrom10to20(int a, int b) {
        return ((a+b) >= 10 && (a+b) <= 20);
    }

    public static void printCheckOnPositiveNegative(int a) {
        if (a < 0)  {
            System.out.println("Передано отрицательное число");
        } else {
            System.out.println("Передано положительное число");
        }
    }

    public static boolean checkOnPositiveNegative(int a) {
        return (a < 0);
    }

    public static void printStringNTimes(String string, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(string);
        }
    }

    public static boolean checkOnLeapYear(int year) { //в задании не говорится о формате входных данных, пусть будет int.
        if (year % 400 == 0) return true; //високосный
        if (year % 100 == 0) return false; //невисокосный
        return year % 4 == 0;
    }
}
