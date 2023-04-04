package streams;

import java.util.List;

public class Stream_Task_6 {

    record Person(String id, String name, String city) {}

    public static void main(String[] args) {

        List<Person> persons = List.of(
                new Person("1", "Vasya", "Ivanov"),
                new Person("2", "Ivan", "Kolodin"),
                new Person("3", "Sergey", "Matvienko"),
                new Person("4", "Petr", "Drevin")
        );

        // Чтобы найти нужно пользователя по id - придется затратить O(n) времени для поиска проходясь по листу.
        // Воспользуйтесь знаниями о структурах данных и переложите (в декларативном стиле) пользователей туда,
        // где поиск по id будет осуществляться за O(1)
    }
}
