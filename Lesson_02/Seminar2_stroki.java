package Lesson_02;

public class Seminar2_stroki {
    public static void main(String[] args) {
        // создаем строку
        String greeting = "Hello word";//простое литералом
        String greeting1 = new String("hello word");//с помощью конструктора создается объект строка
        


        //конкатенация строк
        String name = "Java";
        String message = greeting + " Welcome to " + name + "!";

        //Выводим иходную и новую строки
        System.out.println("Original string: " + greeting);
        System.out.println("Concatenated string: " + message);
        System.out.println(greeting1);

        //Демонстрация изменяемости строк
        message = message.toUpperCase();
        System.out.println("Modified string: " + message);
        
        //смотрим длинну строки
        int length = greeting1.length();
        System.out.println(length);

        //сравнение строк
        boolean isEqual = greeting1.equals(greeting);// с учетом регистра будет false
        boolean isEqualIgnoreCase = greeting1.equalsIgnoreCase(greeting); //без учета регистра
        System.out.println(isEqual);
        System.out.println(isEqualIgnoreCase);

        //поиск в строке
        int index = greeting1.indexOf('w');//возвращает индекс первого вхождения
        System.out.println(index);

        String sub = greeting.substring(6, 10); //возвращает подстроку символов
        // соотвествующих указанному диапазону индексов
        System.out.println(sub);

        //замена слова в строке
        greeting = greeting.replace("word", "Java");//заменит все указанные слова в строке на другие
        System.out.println(greeting);

        //удаление начальных и конечных пробелов
        greeting = greeting.trim();
        System.out.println(greeting);
        
        //форматирование строки
        int version = 9;
        String formatted = String.format("lang: %s, vers: %d", name, version);
        System.out.println(formatted);
    }
}
