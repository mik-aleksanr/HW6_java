package Lesson_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

// public class seminar3 {
//     public static void main(String[] args) {
//         // Создаем объект списка с использованием интерфейса List
//         List<String> fruits = new ArrayList<>();

//         // Добавляем элементы в список
//         fruits.add("Яблоко");
//         fruits.add("Банан");
//         fruits.add("Апельсин");

//         // Получаем размер списка
//         int size = fruits.size();
//         System.out.println("Размер списка: " + size);

//         // Получаем элемент по индексу
//         String firstFruit = fruits.get(0);
//         System.out.println("Первый элемент: " + firstFruit);

//         // Перебираем элементы списка
//         for (String fruit : fruits) {
//             System.out.println(fruit);
//         }

//         // Удаляем элемент по значению
//         fruits.remove("Банан");
//         System.out.println("После удаления 'Банана': " + fruits);
//     }
// }

// public class seminar3 {
//     public static void main(String[] args) {
//         // Создаем объект ArrayList
//         ArrayList<Integer> numbers = new ArrayList<>();

//         // Добавляем элементы
//         numbers.add(10);
//         numbers.add(20);
//         numbers.add(30);

//         // Получаем элемент по индексу
//         int secondNumber = numbers.get(1);
//         System.out.println("Второй элемент: " + secondNumber);

//         // Изменяем элемент по индексу
//         numbers.set(0, 5);
//         System.out.println("Измененный список: " + numbers);

//         // Удаляем элемент по индексу
//         numbers.remove(2);
//         System.out.println("После удаления элемента: " + numbers);

//         // Проверяем наличие элемента
//         boolean containsTwenty = numbers.contains(20);
//         System.out.println("Содержит 20: " + containsTwenty);
//     }
// }



// public class seminar3 {
//     public static void main(String[] args) {
//         // Создаем ArrayList для хранения строк
//         ArrayList<String> fruits = new ArrayList<>();

//         ArrayList<String> fruits1 = new ArrayList<>();

//         // Добавляем элементы в конец списка
//         fruits.add("Яблоко");
//         fruits.add("Банан");
//         fruits.add("Апельсин");

//         fruits1.add("Груша");
//         fruits1.add("Вишня");


//         // Выводим список
//         System.out.println("Список после добавления элементов: " + fruits);

//         // Добавляем новый элемент в конец списка
//         fruits.add("Груша");

//         fruits.add(1,"Киви");

//         // Выводим обновленный список
//         System.out.println("Список после добавления нового элемента: " + fruits);
//     }
// }

// public class seminar3 {
//     public static void main(String[] args) {
//         // Создаем ArrayList для хранения строк
//         ArrayList<String> fruits = new ArrayList<>();

//         // Добавляем элементы в список
//         fruits.add("Яблоко");
//         fruits.add("Банан");
//         fruits.add("Апельсин");

//         // Выводим список до удаления
//         System.out.println("Список до удаления: " + fruits);

//         // Выводим второй элемент
//         System.out.println("Второй элемент списка: " + secondFruit);

//         // Удаляем все элементы из списка
//         fruits.clear();

//         // Проверяем, содержит ли список элемент "Банан"
//         boolean containsBanana = fruits.contains("Банан");

//         // Проверяем, содержит ли список элемент "Груша"
//         boolean containsPear = fruits.contains("Груша");

//         System.out.println("Список содержит 'Банан': " + containsBanana);
//         System.out.println("Список содержит 'Груша': " + containsPear);

//         // Получаем элемент по индексу
//         String secondFruit = fruits.get(1);

        

//         // Выводим пустой список после удаления
//         System.out.println("Список после удаления: " + fruits);
//     }
// }

// public class seminar3 {
//     public static void main(String[] args) {
//         // Создаем ArrayList для хранения строк
//         ArrayList<String> fruits = new ArrayList<>();

//         // Добавляем элементы в список
//         fruits.add("Яблоко");
//         fruits.add("Банан");
//         fruits.add("Апельсин");
//         fruits.add("Банан");

//         // Находим индекс первого вхождения "Банан" в списке
//         int indexOfBanana = fruits.indexOf("Банан");

//         // Проверяем, пуст ли список
//         boolean isEmpty = fruits.isEmpty();

//         System.out.println("Список пустой: " + isEmpty);

//         // Удаляем элемент с индексом 1
//         fruits.remove(1); 

//         // Выводим обновленный список
//         System.out.println("Список после удаления первого 'Банана': " + fruits);

//         System.out.println("Индекс первого вхождения 'Банан' в списке: " + indexOfBanana);
//     }
// }

// public class seminar3 {
//     public static void main(String[] args) {
//         // Создаем ArrayList для хранения строк
//         ArrayList<String> fruits = new ArrayList<>();

//         // Добавляем элементы в список
//         fruits.add("Яблоко");
//         fruits.add("Банан");
//         fruits.add("Апельсин");

//         // Выводим список до замены
//         System.out.println("Список до замены: " + fruits);

//         // Заменяем элемент по индексу 1 (второй элемент) на "Груша"
//         fruits.set(1, "Груша");

//         // Получаем размер списка
//         int size = fruits.size();

//         // Выводим размер списка
//         System.out.println("Размер списка: " + size);

//         // Создаем подсписок, начиная с индекса 1 (второй элемент) и заканчивая индексом 3 (четвертый элемент)
//         List<String> sublist = fruits.subList(1, 4);

//         // Добавляем элементы в список
//         fruits.add("Яблоко");
//         fruits.add("Банан");
//         fruits.add("Апельсин");
//         fruits.add("Груша");
//         fruits.add("Вишня");

//         // Выводим подсписок
//         System.out.println("Подсписок элементов: " + sublist);

//         // Выводим обновленный список
//         System.out.println("Список после замены элемента по индексу: " + fruits);
//     }
// }

// public class seminar3 {
//     public static void main(String[] args) {
//         // Создаем ArrayList для хранения строк
//         ArrayList<String> fruits = new ArrayList<>();

//         // Добавляем элементы в список
//         fruits.add("Яблоко");
//         fruits.add("Банан");
//         fruits.add("Апельсин");

//         // Преобразуем список в массив
//         String[] fruitsArray = fruits.toArray(new String[fruits.size()]);

//         // Выводим массив
//         for (String fruit : fruitsArray) {
//             System.out.println(fruit);
//         }
//     }
// }

// public class seminar3 {
//     public static void main(String[] args) {
//         // Создаем ArrayList для хранения строк
//         ArrayList<String> fruits = new ArrayList<>();

//         // Добавляем элементы в список
//         fruits.add("Яблоко");
//         fruits.add("Банан");
//         fruits.add("Апельсин");

//         // Получаем строковое представление списка
//         String fruitsString = fruits.toString();

//         // Выводим строковое представление
//         System.out.println("Строковое представление списка: " + fruitsString);
//     }
// }

// public class seminar3 {
//     public static void main(String[] args) {
//         // Создаем ArrayList для хранения чисел
//         ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));//быстрое создание list

//         // Создаем коллекцию для удаления элементов
//         List<Integer> toRemove = Arrays.asList(2, 4, 6);

//         // Удаляем из списка все элементы, которые содержатся в коллекции toRemove
//         numbers.removeAll(toRemove);// метод только для списков

//         // Выводим результат
//         System.out.println("Список после удаления элементов: " + numbers);
    



//         // Создаем коллекцию с элементами, которые хотим оставить
//         List<Integer> toRetain = Arrays.asList(2, 4, 6);

//         // Оставляем в списке только элементы, которые содержатся в коллекции toRetain
//         numbers.retainAll(toRetain);

//         // Выводим результат
//         System.out.println("Список после оставления элементов: " + numbers);
//     }
// }

// public class seminar3 {
//     public static void main(String[] args) {
//         // Создаем ArrayList с некоторыми значениями
//         ArrayList<String> fruits = new ArrayList<>();
//         fruits.add("Яблоко");
//         fruits.add("Банан");
//         fruits.add("Апельсин");

//         // Используем пользовательский метод replace для замены элемента "Банан" на "Груша"
//         replace(fruits, "Банан", "Груша");

//         // Используем стандартный метод set для замены элемента "Апельсин" на "Вишня"
//         fruits.set(2, "Вишня");

//         // Выводим результат
//         System.out.println("Список фруктов после замен: " + fruits);
//     }

//     // Пользовательский метод replace для замены элемента в ArrayList
//     public static <E> void replace(ArrayList<E> list, E oldElement, E newElement) {
//         int index = list.indexOf(oldElement);
//         if (index != -1) {
//             list.set(index, newElement); // Используем стандартный метод set для замены
//         }
//     }
// }


import java.util.Collections;

public class seminar3 {
    public static void main(String[] args) {
        // Создаем ArrayList с числами
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        // Заменяем каждый элемент на его квадрат
        numbers.replaceAll(n -> n * n);

        // Выводим результат
        System.out.println("Список после замены элементов: " + numbers);
    }
}

