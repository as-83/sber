package task3;

/*
    Задание 3.
    Необходимо преобразовать список городов в массив и путем перебора массива найти индекс
    элемента и значение с наибольшим количеством жителей города.

    Пример полученного результата:
    [489] = 11 514 330
*/

import java.util.List;


public class Main {
    public static void main(String[] args) {
        //Получение списка городов из файла
        List<City> cities = CityUtils.parse();

        //Преобразование списка городов в массив
        City[] citiesArray = cities.toArray(new City[0]);
        int maxPopulation = 0;
        int maxPopulationIndex = 0;

        //Поиск индекса элемента и значения с наибольшим количеством жителей
        for (int i = 0; i < citiesArray.length; i++) {
            if(citiesArray[i].getPopulation() > maxPopulation) {
                maxPopulation = citiesArray[i].getPopulation();
                maxPopulationIndex = i;
            }
        }

        System.out.print("[" + maxPopulationIndex + "] = ");
        System.out.printf("%,d", maxPopulation);
    }

}
