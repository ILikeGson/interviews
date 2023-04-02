package streams;

import java.util.List;

public class Stream_Task_2 {
    public static void main(String[] args) {
        List<String> names = List.of(
                "Arkady", "Petya", "Igor",
                "Leonid", "Stepan", "Vasilii",
                "Anton", "Sergey", "Ivan");

        task_2_imperative('I', names);
        task_2_declarative('I', names);
    }

    private static void task_2_imperative(Character startingLetter, List<String> names) {
        // Ищем первое попавшееся имя из списка, которое начинается с переданного значения 'startingLetter'
        // Необходимо решить данную задачу в декларативном стиле

        String foundName = null;
        for(String name : names) {
            if(name.startsWith(startingLetter.toString())) {
                foundName = name;
                break;
            }
        }

        if (foundName != null) {
            System.out.println("Imperative way output: ".concat(foundName));
        } else {
            System.out.println("Imperative way output: ".concat("No name found"));
        }
    }

    private static void task_2_declarative(Character startingLetter, List<String> names) {
        // Решение
        System.out.println("Declarative way output: ");
    }
}
