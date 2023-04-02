package streams;

import java.util.Arrays;
import java.util.List;

public class Stream_Task_3 {
    public static void main(String[] args) {
        List<Track> tracks = Arrays.asList(
                new Track("Baikal", 524),
                new Track("Violets for us", 378),
                new Track("Time Was", 451));

        // В декларативном стиле - Найти трак с наименьшей длинной
    }

    static class Track {
        String name;
        Integer length;

        public Track(String name, Integer length) {
            this.name = name;
            this.length = length;
        }
    }
}
