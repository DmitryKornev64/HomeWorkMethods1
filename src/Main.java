import java.time.LocalDate;

public class Main {

    // Задание 1.
    public static void leapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + "  — високосный год");
        } else {
            System.out.println(year + "  — не високосный год");
        }
    }


    // Задание 2.
    public static void updateVersion(int typeOc, int yearOfIssue){
        if (typeOc != 1 && typeOc != 0){
            throw new IllegalArgumentException ("Такого ОС нет!");
        }
        int currentYear = LocalDate.now().getYear();
        if (yearOfIssue > currentYear) {
            throw new IllegalArgumentException("Такого года выпуска нет!");
        }
            String osString = typeOc == 0 ? "IOS":"Android";
            String versionString = yearOfIssue < 2015 ? "обычную":"облегченную";
        System.out.println("Установите %s версию %s по ссылке%n" + versionString + osString);
        }


    // Задание 3.

    public static int calculateDeviveryDays(int distance) {
    if (distance <= 20) {
        return 1;
    } else {
        return (int) Math.round((double) distance / 40) + 1;
    }
    }



    public static void main(String[] args) {

        // Задание 1.
        System.out.println("   Задание 1.");
        leapYear(2022);


        // Задание 2.
        System.out.println("   Задание 2.");
        updateVersion(0, 2005);


        // Задание 3.
        System.out.println("   Задание 3.");
        int deliveryDays = calculateDeviveryDays(60);
        System.out.println("Потребуется дней: " + deliveryDays);


    }
}