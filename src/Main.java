import java.util.*;

public class Main {
    public static void Zad1(){
        Scanner scanner = new Scanner(System.in);
        People people1 = new People();
        System.out.println("Введите ФИО: ");
        people1.name = scanner.nextLine();
        System.out.println("Введите дату рождения: ");
        people1.birthday = scanner.nextLine();
        System.out.println("Введите номер телефона: ");
        people1.phoneNumber=scanner.nextLine();
        System.out.println("Ввудите город: ");
        people1.city = scanner.nextLine();
        System.out.println("Введите страну: ");
        people1.country=scanner.nextLine();
        System.out.println("Введите адресс: ");
        people1.address=scanner.nextLine();

        System.out.println("ФИО: " + people1.name);
        System.out.println("Дата рождения: " + people1.birthday);
        System.out.println("Номер телефона: " + people1.phoneNumber);
        System.out.println("Город: " + people1.city);
        System.out.println("Страна: " + people1.country);
        System.out.println("Адресс: " + people1.address);
    }

    public static void Zad2(){
        Scanner scanner = new Scanner(System.in);
        City city1 = new City();

        System.out.println("Введите название города: ");
        city1.name=scanner.nextLine();
        System.out.println("Введите название региона: ");
        city1.region = scanner.nextLine();
        System.out.println("Введите название страны: ");
        city1.country = scanner.nextLine();
        System.out.println("Введите количество жителей в городе: ");
        city1.population = scanner.nextFloat();
        System.out.println("Введите почтовый индекс города: ");
        city1.postcode = scanner.nextInt();
        System.out.println("Введите телефоный код города: ");
        city1.phoneCode = scanner.nextInt();

        System.out.println(city1.toString());
    }

    public static void Zad3(){
        Scanner scanner = new Scanner(System.in);
        Country country1 = new Country();

        System.out.println("Введите название страны: ");
        country1.country = scanner.nextLine();
        System.out.println("Введите континент: ");
        country1.continent = scanner.nextLine();
        System.out.println("Введите насиление: ");
        country1.population = scanner.nextFloat();
        System.out.println("Введите телефонный код страны: ");
        country1.countryCode = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введите столицу: ");
        country1.capital = scanner.nextLine();


        System.out.println("Введите города страны: ");
        country1.cityName[0] = scanner.nextLine();

        System.out.println(country1);
    }

    public static void Zad4(){
        Scanner scanner = new Scanner(System.in);
        Fraction fraction = new Fraction();

        System.out.println("Введите числитель и знаменатель (не может = 0) первой дроби:");
        fraction.numerator = scanner.nextInt();
        System.out.println("--");
        fraction.denominator = scanner.nextInt();

        System.out.println("Введите числитель и знаменатель (не может = 0) второй дроби:");
        fraction.numerator2 = scanner.nextInt();
        System.out.println("--");
        fraction.denominator2 = scanner.nextInt();

        fraction.Sum();
//        fraction.Sub();

    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите номер задачи от 1 до 4: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                Zad1();
                break;
            case 2:
                Zad2();
                break;
            case 3:
                Zad3();
                break;
            case 4:
                Zad4();
                break;
            default:
                System.out.println("Такого номера нет!");
    }
}
}
