package Lesson_02;

public class Seminar2_bilder{
    public static void main(String[] args) {
        // создаем объект StringBuilder
        StringBuilder builder = new StringBuilder("Hello");

        //добавляем дополнительный текст
        builder.append(", Java word");
        builder.append("!");

        //выводим текущее состояние StringBuilder
        System.out.println("Curren StringBuilder content: " + builder.toString());

        //добавляем текст в начало
        builder.insert(0, "Greetings: ");

        //Выводим измененное состояние
        System.out.println("Modified StringBuilder content: " + builder.toString());

        //удаляем часть текста
        builder.delete(8, 16);
        System.out.println("After deletion: " + builder.toString());

        // заменяем часть строки
        builder.replace(15, 19, "Universe");
        System.out.println("After replacement: " + builder.toString());
        
        //преобразуем билдер обратно в строку
        String finaString = builder.toString();
        System.out.println("Final string: " + finaString);

    }
}