package task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class CityUtils {
    /**
     * Вывод в консоль списка городов,
     * отсортированных по имени,
     * без учета регистра
     *
     * @param cities список городов
     */
    public static void printSortedByNameIgnoreCase(List<City> cities) {
        cities.stream()
                .sorted(Comparator.comparing(city -> city.getName().toLowerCase()))
                .forEach(System.out::println);
    }

    /**
     * Вывод в консоль списка городов,
     * отсортированных по округу(1) и имени(2),
     * с учетом регистра
     *
     * @param cities список городов
     */
    public static void printSortedByDistrictAndName(List<City> cities) {
        cities.stream()
                .sorted(Comparator.comparing(City::getDistrict).thenComparing(City::getName))
                .forEach(System.out::println);
    }

    /**
     * Загрузка данных о городах из файла в список
     *
     * @return список с данными о городах
     */
    public static List<City> parse() {
        List<City> cities = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File("resources/city_ru.csv")); // Загрузка данных из файла
            while (scanner.hasNextLine()) {
                cities.add(parse(scanner.nextLine()));
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return cities;
    }

    /**
     * Разбор строки с данными о городе
     *
     * @param line строка с данными
     * @return {@link City}
     */
    private static City parse(String line) {
        String [] cityParams = line.split(";");
        String name = cityParams[1];
        String region = cityParams[2];
        String district = cityParams[3];
        int population = Integer.parseInt(cityParams[4]);
        String foundation = null;
        if (cityParams.length == 6) { // У некоторых городов в файле отсутствует год основания
            foundation = cityParams[5];
        }

        return new City(name, region, district, population, foundation);
    }
}
