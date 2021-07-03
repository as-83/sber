package task1;

import model.City;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
    Необходимо реализовать класс task1.Main, используя java.util.Scanner, прочесть информацию из текстового
    представления справочника и разложить данные в модель model.City с полями:
        name – наименование города
        region - регион
        district – федеральный округ
        population – количество жителей города
        foundation – дата основания или первое упоминание
        Полученный список объектов model.City нужно вывести в консоль.

    Пример полученного результата:
        model.City{name='Адыгейск', region='Адыгея', district='Южный', population=12248, foundation='1973'}
        model.City{name='Майкоп', region='Адыгея', district='Южный', population=144246, foundation='1857'}
        model.City{name='Горно-Алтайск', region='Алтай', district='Сибирский', population=56928, foundation='1830'}
*/

public class Main {
    public static void main(String[] args) {
        Scanner sc = null;
        try {
            sc = new Scanner(new File("city_ru.csv"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String [] cityParams;
        List<City> cities = new ArrayList<>();

        while(sc.hasNext()){
            cityParams = sc.nextLine().split(";");
            cities.add(new City(cityParams));
        }

        sc.close();
        cities.forEach(city -> System.out.println(city));
    }

}
