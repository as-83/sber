package task4;

/*
    Задание 4
    Необходимо определить количество городов в разрезе регионов.

    Пример полученного результата:

    Вологодская область - 15

    Татарстан - 22

    Хабаровский край – 7

    …
*/

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        //Получение списка городов из файла
        List<City> cities = CityUtils.parse();

        //Подсчет количества городов в разрезе регионов
        Map<String, Long> citiesInRegion = cities.stream()
                .collect(Collectors.groupingBy(City::getRegion, Collectors.counting()));

        //Вывод результата в консоль
        for(Map.Entry<String, Long> item : citiesInRegion.entrySet()){
            System.out.println(item.getKey() + " - " + item.getValue());
        }
    }

}
