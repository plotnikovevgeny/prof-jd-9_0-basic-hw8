import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // задание один
        int year = 1900;
        System.out.println(leapYearDefinition(year));

        //задание два
        selectionOS("Android", 2021);

        // задание три
        getNumberOfDaysForDelivery(99);
    }

    // задание один
    public static String leapYearDefinition(int year) {
        boolean condition = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
        if (condition) {
            return year + " - високосный год";
        } else
            return year + " - не високосный год";
    }

    //задание два
    public static void selectionOS(String osName, int year) {
        int currentYear = LocalDate.now().getYear();
        if (currentYear > year) {
            System.out.println("Установите облегченную версию приложения для " + osName + " по ссылке");
        } else
            System.out.println("Установите версию приложения для " + osName + " по ссылке");
    }

    // задание три
    public static void getNumberOfDaysForDelivery(int deliveryDistance) {
        int deliveryDays = 0;
        if (deliveryDistance < 20) deliveryDays = 1;
        if (deliveryDistance < 60 && deliveryDistance >= 20) deliveryDays = 2;
        if (deliveryDistance >= 60 && deliveryDistance < 100) deliveryDays = 3;
        String answer = "Потребуется дней: " + deliveryDays;
        if (deliveryDistance >= 100)
            answer = "Это слишком далеко";
        System.out.println(answer);
    }

}