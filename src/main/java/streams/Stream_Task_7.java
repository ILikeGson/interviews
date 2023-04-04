package streams;

import java.util.List;

public class Stream_Task_7 {

    record Employer(String id, String name, String company) {}

    public static void main(String[] args) {
        List<Employer> employers = List.of(
                new Employer("1", "Vasya", "Apple"),
                new Employer("2", "Igor", "Google"),
                new Employer("3", "Max", "Google"),
                new Employer("4", "Sveta", "Netflix"),
                new Employer("5", "Oleg", "Netflix")
        );

        // Сгруппировать сотрудников по компаниям (в декларативном стиле)
    }
}
