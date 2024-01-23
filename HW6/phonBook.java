package HW6;
/*
Задание
Реализуйте структуру телефонной книги с помощью HashMap.
Программа также должна учитывать, что в во входной структуре будут повторяющиеся имена с
разными телефонами, их необходимо считать, как одного человека с разными телефонами.
Вывод должен быть отсортирован по убыванию числа телефонов.
*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;


class PhoneBook {
    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();
    private static LinkedHashMap<String, Integer> sorter = new LinkedHashMap<>();
    // Вводим абонентов и телефоны в phoneBook, а также подсчитываем количество телефонов у абонента
    // и записываем в sorter
    public void add(String name, Integer phoneNum) {
        
        if (phoneBook.containsKey(name)) {
            int count = phoneBook.get(name).size() + 1;
            phoneBook.get(name).add(phoneNum);
            sorter.put(name, count);                   
        } else {
            ArrayList<Integer> values = new ArrayList<>();
            values.add(phoneNum);
            phoneBook.put(name, values);
            int count = 1;
            sorter.put(name, count);
        }
        sort();
    }
    //Сортируем sorter по убыванию количества телефонов в записи
    public void sort() {
        Map<String, Integer> sortedMap = sorter.entrySet().stream() 
                                            .sorted(Comparator.comparingInt(e -> -e.getValue())) 
                                            .collect(Collectors.toMap( 
                                            Map.Entry::getKey, 
                                            Map.Entry::getValue, 
                                            (a, b) -> { throw new AssertionError(); }, 
                                            LinkedHashMap::new));
        sorter.clear();
        sorter.putAll(sortedMap);
        
    }
    // Получаем телефон абонента по имени
    public ArrayList<Integer> getNumb(String name) {
        if (phoneBook.containsKey(name)) {
            return phoneBook.get(name);
        }
        System.out.println("Данного имени нет книге");
        return null;
    }
    //Выводим телефонный справочник
    public static void getPhoneBook() {
        for (String key: sorter.keySet()) {
            ArrayList<Integer> phones = phoneBook.get(key);
            System.out.println(key + ": " + phones);         
         }
        
    }
    // удаляем номер абонента из справочника
    public void dellNumb(String name) {
        if (phoneBook.containsKey(name)) {
            phoneBook.remove(name);
            sorter.remove(name);
            System.out.println("Абонент удален");
        }
        else {
            System.out.println("Такого абонента не существует, удалять нечего");
        }
    }
}


public class phonBook {
    public static void main(String[] args) {

        PhoneBook myPhoneBook = new PhoneBook();

        System.out.println("Доступные команды");
        System.out.println("i - ввести номер телефона");
        System.out.println("g - получить номер телефона по имени");
        System.out.println("b - вывести весь телефонный справочник");
        System.out.println("d - удалить абонента");
        System.out.println("q - выход из программы");

        boolean flag = true;
        
        while(flag){

            Scanner in = new Scanner(System.in);
            System.out.printf("Введите команду: ");
            char command = in.next().charAt(0);
           
            if(command == 'i') {
                Scanner data = new Scanner(System.in);
                System.out.printf("Введите имя: ");
                String name = data.nextLine();
                System.out.printf("Введите телефонный номер: ");
                boolean flagNum = data.hasNextInt();
                if(flagNum == false){
                    System.out.println("Телефон введен некоректно, повторите ввод данных");
                    continue;
                }
                int phone = data.nextInt();
                myPhoneBook.add(name, phone);
                continue;
            }
            else if(command == 'g') {
                Scanner data = new Scanner(System.in);
                System.out.printf("Введите имя: ");
                String name = data.nextLine();
                System.out.println(myPhoneBook.getNumb(name));
                continue;
            }
            else if(command == 'b') {
                PhoneBook.getPhoneBook();
                continue;
            }
            else if(command == 'd') {
                Scanner data = new Scanner(System.in);
                System.out.printf("Введите имя: ");
                String name = data.nextLine();
                myPhoneBook.dellNumb(name);
                continue;
            }
            else if(command == 'q') {
                in.close();
                flag = false;
                continue;
            }
            else{
                System.out.println("Неверная команда, повторите ввод используя команды из списка");
                continue;
            }
                  
        }                
    }    
}
