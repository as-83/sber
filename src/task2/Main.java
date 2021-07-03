package task2;

/*
    Задание 2.
    Необходимо реализовать следующие варианты сортировки:

    Сортировка списка городов по наименованию в алфавитном порядке по убыванию без учета регистра;
    Сортировка списка городов по федеральному округу и наименованию города внутри каждого федерального округа в алфавитном порядке по убыванию с учетом регистра;
    Вывести полученный список объектов City в консоль. При реализации сортировки обратить внимание на возможные варианты реализации: Comporator, lambda-выражения.

    Пример полученного результата для сортировки по наименованию:

    City{name='Абаза', region='Хакасия', district='Сибирский', population=17111, foundation='1867'}

    City{name='Абакан', region='Хакасия', district='Сибирский', population=165183, foundation='1931'}

    City{name='Абдулино', region='Оренбургская область', district='Приволжский', population=20663, foundation='1795'}

    …

    Пример полученного результата для сортировки по двум полям справочника – федеральному округу и наименованию города:

    City{name='Алдан', region='Якутия', district='Дальневосточный', population=21277, foundation='1924'}

    City{name='Александровск-Сахалинский', region='Сахалинская область', district='Дальневосточный', population=10613, foundation='1869'}

    City{name='Амурск', region='Хабаровский край', district='Дальневосточный', population=42977, foundation='1958'}

    …

    City{name='Абдулино', region='Оренбургская область', district='Приволжский', population=20663, foundation='1795'}

    City{name='Агидель', region='Башкортостан', district='Приволжский', population=16365, foundation='1980'}

    City{name='Агрыз', region='Татарстан', district='Приволжский', population=19299, foundation='1646'}

    …
*/

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Получение списка городов из файла
        List<City> cities = CityUtils.parse();

        //Вывод списка городов, отсортированных по имени
        CityUtils.printSortedByNameIgnoreCase(cities);
        System.out.println("\n\n\n\n\n" +
                "-----------------------------------------------");
        //Вывод списка городов, отсортированных по федеральному округу и имени
        CityUtils.printSortedByDistrictAndName(cities);
    }

}
