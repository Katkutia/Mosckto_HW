
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.MovieManager;

class MovieManagerTest {
    MovieManager manager = new MovieManager();

    String movie1 = "Бладшот";
    String movie2 = "Вперед";
    String movie3 = "Отель Белград";
    String movie4 = "Джентельмены";
    String movie5 = "Невидимка";
    String movie6 = "Тролли";
    String movie7 = "Номер 1";


    @Test
    public void valueEmptyTest() {
        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void valueFiveTest() {
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
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);

        String[] expected = {movie1, movie2, movie3};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void value2Test() {
        manager.add(movie4);
        manager.add(movie5);

        String[] expected = {movie4, movie5};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void valueOneTest() {
        manager.add(movie2);

        String[] expected = {movie2};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void findLastTest() {
        String[] expected = {};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void valueFiveCountTest() {
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
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);

        String[] expected = {movie4, movie3, movie2};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void value2CountTest() {
        manager.add(movie2);
        manager.add(movie3);

        String[] expected = {movie3, movie2};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void valueOneCountTest() {
        manager.add(movie3);

        String[] expected = {movie3};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


}