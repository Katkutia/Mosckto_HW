
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.MovieManager;


class MovieManagerTest {
    MovieManager manager = new MovieManager();


    String movie1 = "Бладшот";
    String movie2 = "Вперед";
    String movie3 = "Отель Белград";
    String movie4 = "Джентельмены";
    String movie5 = "Человек-Невидимка";
    String movie6 = "Тролли.Мировой тур";
    String movie7 = "Номер один";

    @Test
    public void valueEmptyTest() {
        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void valueFiveTest() {
        MovieManager manager = new MovieManager();
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);

        String[] expected = {movie1, movie2, movie3, movie4, movie5};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void valueSevenTest() {
        MovieManager manager = new MovieManager();
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);

        String[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void valueSixTest() {
        MovieManager manager = new MovieManager();
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);

        String[] expected = {movie1, movie2, movie3, movie4, movie5, movie6};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void valueForTest() {
        MovieManager manager = new MovieManager();
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);

        String[] expected = {movie1, movie2, movie3, movie4};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void valueThreeTest() {
        MovieManager manager = new MovieManager();
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);

        String[] expected = {movie1, movie2, movie3};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void value2Test() {
        MovieManager manager = new MovieManager();
        manager.add(movie4);
        manager.add(movie5);

        String[] expected = {movie4, movie5};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void valueOneTest() {
        MovieManager manager = new MovieManager();
        manager.add(movie2);

        String[] expected = {movie2};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void findLastTest() {
        MovieManager manager = new MovieManager();
        String[] expected = {};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void valueFiveCountTest() {
        MovieManager manager = new MovieManager();
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);

        String[] expected = {movie5, movie4, movie3, movie2, movie1};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void value4CountTest() {
        MovieManager manager = new MovieManager();
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);

        String[] expected = {movie4, movie3, movie2, movie1};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void value3CountTest() {
        MovieManager manager = new MovieManager();
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);

        String[] expected = {movie4, movie3, movie2};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void value2CountTest() {
        MovieManager manager = new MovieManager();
        manager.add(movie2);
        manager.add(movie3);

        String[] expected = {movie3, movie2};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void valueOneCountTest() {
        MovieManager manager = new MovieManager();
        manager.add(movie3);

        String[] expected = {movie3};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldEqualDefaultLimit() {
        MovieManager manager = new MovieManager();

        manager.add("movie 1");
        manager.add("movie 2");
        manager.add("movie 3");
        manager.add("movie 4");
        manager.add("movie 5");
        manager.add("movie 6");
        manager.add("movie 7");
        manager.add("movie 8");
        manager.add("movie 9");
        manager.add("movie 10");

        String[] expected = {"movie 10", "movie 9", "movie 8", "movie 7", "movie 6", "movie 5", "movie 4", "movie 3", "movie 2", "movie 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldEqualDefaultLimitmin() {
        MovieManager manager = new MovieManager();

        manager.add("movie 0");


        String[] expected = {"movie 0"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
