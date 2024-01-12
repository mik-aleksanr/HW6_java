package Lesson_04;
// сортировка слиянием
// import java.util.ArrayList;
// import java.util.List; // Импортируем класс List из пакета java.util

// public class seminar4 { // Объявление класса MergeSortExample
//     public static void main(String[] args) { // Основной метод программы
//         // Создаем неотсортированный список чисел
//         List<Integer> unsortedList = new ArrayList<>(); // Создаем объект ArrayList для хранения целых чисел
//         unsortedList.add(5); // Добавляем число 5 в список
//         unsortedList.add(1); // Добавляем число 1 в список
//         unsortedList.add(9); // Добавляем число 9 в список
//         unsortedList.add(3); // Добавляем число 3 в список
//         unsortedList.add(7); // Добавляем число 7 в список

//         // Выводим неотсортированный список
//         System.out.println("Неотсортированный список: " + unsortedList);

//         // Вызываем метод сортировки слиянием
//         mergeSort(unsortedList);

//         // Выводим отсортированный список
//         System.out.println("Отсортированный список: " + unsortedList);
//     }

//     // Метод сортировки слиянием
//     public static void mergeSort(List<Integer> list) {
//         // Проверяем базовый случай: если список содержит 1 элемент или меньше, он уже отсортирован
//         if (list.size() <= 1) {
//             return; // Возвращаемся из метода, не выполняя дополнительных действий
//         }

//         // Находим средний индекс списка
//         int middle = list.size() / 2;

//         // Делим список на две половины: левую и правую
//         List<Integer> left = new ArrayList<>(list.subList(0, middle)); // Создаем левую половину списка
//         List<Integer> right = new ArrayList<>(list.subList(middle, list.size())); // Создаем правую половину списка

//         // Рекурсивно сортируем левую и правую половины списка
//         mergeSort(left); // Вызываем метод сортировки слиянием для левой половины
//         mergeSort(right); // Вызываем метод сортировки слиянием для правой половины

//         // Объединяем отсортированные половины в исходный список
//         merge(list, left, right); // Вызываем метод объединения
//     }

//     // Метод для объединения двух отсортированных списков в один
//     public static void merge(List<Integer> result, List<Integer> left, List<Integer> right) {
//         int i = 0, j = 0, k = 0;

//         // Пока есть элементы в обеих половинах
//         while (i < left.size() && j < right.size()) {
//             // Сравниваем элементы левой и правой половин
//             if (left.get(i) < right.get(j)) {
//                 result.set(k, left.get(i)); // Заменяем элемент в исходном списке на элемент из левой половины
//                 i++;
//             } else {
//                 result.set(k, right.get(j)); // Заменяем элемент в исходном списке на элемент из правой половины
//                 j++;
//             }
//             k++;
//         }

//         // Если остались элементы только в левой или правой половине, добавляем их в исходный список
//         while (i < left.size()) {
//             result.set(k, left.get(i));
//             i++;
//             k++;
//         }

//         while (j < right.size()) {
//             result.set(k, right.get(j));
//             j++;
//             k++;
//         }
//     }
// }


// import java.util.LinkedList;

// public class seminar4 {
//     public static void main(String[] args) {
//         LinkedList<String> linkedList = new LinkedList<>();
        
//         linkedList.add("Первый");
//         linkedList.add("Второй");
//         linkedList.add("Третий");

//         // Удаляем и получаем первый элемент списка
//         String removedElement = linkedList.removeFirst();

//         System.out.println("Удаленный первый элемент: " + removedElement);
//         System.out.println("Список после удаления: " + linkedList);
    
//         linkedList.add("Первый");
//         linkedList.add("Второй");
//         linkedList.add("Третий");

//         // Удаляем и получаем последний элемент списка
//         String removedElement = linkedList.pollLast();

//         System.out.println("Удаленный последний элемент: " + removedElement);
//         System.out.println("Список после удаления: " + linkedList);

//         // Добавляем элемент в начало списка
//         linkedList.offerFirst("Новый элемент в начало");
//         // Получаем первый элемент списка
//         String firstElement = linkedList.getFirst();

//         System.out.println("Первый элемент списка: " + firstElement);
//         // Получаем последний элемент списка
//         String lastElement = linkedList.getLast();


//         System.out.println("Последний элемент списка: " + lastElement);
//         // Добавляем элемент в начало списка
//         linkedList.offerFirst("Новый элемент в начало");

//     }
// }


// import java.util.LinkedList;
// import java.util.Queue;

// public class seminar4 {
//     public static void main(String[] args) {
//         Queue<String> queue = new LinkedList<>(); //создаем список очередь

//         // Примеры использования методов для работы с очередью

//         // 1. Добавление элемента в конец очереди с помощью add(element)
//         queue.add("Элемент 1");
//         queue.add("Элемент 2");
//         queue.add("Элемент 3");

//         // 2. Добавление элемента в конец очереди с помощью offer(element)
//         boolean offered = queue.offer("Элемент 4");

//         System.out.println("Добавлен элемент 4 с использованием offer(): " + offered);

//         // 3. Удаление и получение элемента из начала очереди с помощью remove()
//         String removedElement = queue.remove();

//         System.out.println("Удаленный элемент из начала очереди с remove(): " + removedElement);

//         // 4. Удаление и получение элемента из начала очереди с помощью poll()
//         String polledElement = queue.poll();

//         System.out.println("Удаленный элемент из начала очереди с poll(): " + polledElement);

//         // 5. Получение элемента из начала очереди без удаления с помощью element()
//         String firstElement = queue.element();

//         System.out.println("Первый элемент в очереди (element()): " + firstElement);

//         // 6. Получение элемента из начала очереди без удаления с помощью peek()
//         String peekedElement = queue.peek();

//         System.out.println("Первый элемент в очереди (peek()): " + peekedElement);
//     }
// }

// import java.util.ArrayDeque;
// import java.util.Deque;

// public class seminar4 {
//     public static void main(String[] args) {
//         Deque<String> deque = new ArrayDeque<>();

//         // Примеры использования методов для работы с двусторонней очередью

//         // Добавление элементов в начало и конец очереди
//         deque.addFirst("Элемент 1");
//         deque.addLast("Элемент 2");
//         deque.offerFirst("Элемент 0");
//         deque.offerLast("Элемент 3");

//         // Удаление и получение элементов из начала и конца очереди
//         String firstRemoved = deque.removeFirst();
//         String lastRemoved = deque.removeLast();
//         String firstPolled = deque.pollFirst();
//         String lastPolled = deque.pollLast();

//         System.out.println("Удален первый элемент: " + firstRemoved);
//         System.out.println("Удален последний элемент: " + lastRemoved);
//         System.out.println("Получен первый элемент (после удаления): " + firstPolled);
//         System.out.println("Получен последний элемент (после удаления): " + lastPolled);

//         // Получение элементов из начала и конца очереди без удаления
//         String firstElement = deque.getFirst();
//         String lastElement = deque.getLast();

//         System.out.println("Первый элемент (без удаления): " + firstElement);
//         System.out.println("Последний элемент (без удаления): " + lastElement);
//     }
// }

// import java.util.PriorityQueue;

// public class seminar4 {
//     public static void main(String[] args) {
//         // Создаем приоритетную очередь с элементами типа Integer
//         PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

//         // Добавляем элементы с учетом их приоритета
//         priorityQueue.add(5);
//         priorityQueue.add(3);
//         priorityQueue.add(8);
//         priorityQueue.add(1);

//         // Извлекаем элементы с наивысшим приоритетом
//         int highestPriority = priorityQueue.poll();
//         int nextPriority = priorityQueue.poll();

//         System.out.println("Наивысший приоритет: " + highestPriority);
//         System.out.println("Следующий приоритет: " + nextPriority);
           
        //    // Выводим приоритетную очередь до извлечения элементов
        // System.out.println("Приоритетная очередь: " + priorityQueue.toString());

        // // Извлекаем элемент с наивысшим приоритетом без удаления
        // int highestPriority = priorityQueue.peek();
        // System.out.println("Наивысший приоритет (без удаления): " + highestPriority);

        // // Извлекаем и удаляем элемент с наивысшим приоритетом
        // int removedHighestPriority = priorityQueue.poll();
        // System.out.println("Наивысший приоритет (после удаления): " + removedHighestPriority);

        // // Выводим приоритетную очередь после извлечения элемента
        // System.out.println("Приоритетная очередь после извлечения: " + priorityQueue);
//     }
// }

// import java.util.Stack;

// public class seminar4 {
//     public static void main(String[] args) {
//         // Создаем стек с элементами типа String
//         Stack<String> stack = new Stack<>();

//         // Добавляем элементы в стек
//         stack.push("Элемент 1");
//         stack.push("Элемент 2");
//         stack.push("Элемент 3");

//         // Извлекаем элементы с вершины стека
//         String topElement = stack.pop();
//         String nextTopElement = stack.pop();

//         System.out.println("Вершина стека: " + topElement);
//         System.out.println("Следующая вершина стека: " + nextTopElement);
//     }
// }

import java.util.Stack;

public class seminar4 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Добавление элементов в стек
        stack.push("Элемент 1");
        stack.push("Элемент 2");
        stack.push("Элемент 3");

        // Извлечение и удаление элементов с вершины стека
        String topElement = stack.pop();
        System.out.println("Извлеченный элемент: " + topElement);

        // Получение элемента с вершины стека без удаления
        String peekedElement = stack.peek();
        System.out.println("Элемент на вершине стека: " + peekedElement);

        // Проверка, пуст ли стек
        boolean isEmpty = stack.empty();
        System.out.println("Стек пустой? " + isEmpty);
    }
}