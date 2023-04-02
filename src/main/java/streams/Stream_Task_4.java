package streams;

import java.util.List;

public class Stream_Task_4 {
    public static void main(String[] args) {
        List<Musician> musicians = List.of(
                new Musician("Martin Garrix",
                        List.of(new Song("Animals", 1000000000),
                                new Song("Matrix", 1241242),
                                new Song("In the name of love", 186912L)), 26),
                new Musician("Roger Shah",
                        List.of(new Song("Stay", 9412),
                                new Song("Ibiza", 88124L),
                                new Song("Connected", 127400002L)), 49),
                new Musician("Tiesto",
                        List.of(new Song("Greedy", 1299L),
                                new Song("Business", 81244659L),
                                new Song("BOOM", 11112232L)), 51)
        );

    // У музыкантов, которым больше 40 лет - вывести названия треков отсортированных по количеству прослушиваний по убыванию,
    // при условии, что количество прослушиваний больше 10_000_000

    // Отдельно вывести самый популярный трек
    }

    static class Musician {
        String name;
        List<Song> songs;
        int age;

        public Musician(String name, List<Song> songs, int age) {
            this.name = name;
            this.songs = songs;
            this.age = age;
        }
    }

    static class Song {
        String name;
        long countOfListening;

        public Song(String name, long countOfListening) {
            this.name = name;
            this.countOfListening = countOfListening;
        }
    }
}
