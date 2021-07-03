package task1;

/*
    Задача 1.
    Необходимо реализовать класс Main, используя java.util.Scanner, прочесть информацию из текстового
    представления справочника и разложить данные в модель City с полями:
        name – наименование города
        region - регион
        district – федеральный округ
        population – количество жителей города
        foundation – дата основания или первое упоминание
        Полученный список объектов task1.City нужно вывести в консоль.

    Пример полученного результата:
        City{name='Адыгейск', region='Адыгея', district='Южный', population=12248, foundation='1973'}
        City{name='Майкоп', region='Адыгея', district='Южный', population=144246, foundation='1857'}
        City{name='Горно-Алтайск', region='Алтай', district='Сибирский', population=56928, foundation='1830'}
*/

public class Main {
    public static void main(String[] args) {
        CityUtils.print(CityUtils.parse());
    }

}
