package TestComplexTasks.Task4;

import ComplexTasks.Task4.Rating;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AddRatingMovieTest extends Precondition {
    //Позитивные кейсы:
    // Добавление 1 оценки в диапазоне от 1 до 10
    // Добавление 2 оценок в диапазоне от 1 до 10
    // Негативные кейсы:
    // Оценка меньше 1
    // Оценка больше 10
    // Оценка null
    // Фильм null

    @Test
    void addRatingToMovie_CanAddRatingToMovie() {
        assertTrue(targetClass.getMovies().isEmpty());

        targetClass.addRatingToMovie(m1, r1);

        assertEquals(1, targetClass.getMovies().size());
        assertEquals(1, targetClass.getMovies().get(m1).size());

        assertTrue(targetClass.getMovies().containsKey(m1));
        assertEquals(r1, targetClass.getMovies().get(m1).getFirst());

        Thread t1 = new Thread(() -> {
            targetClass.addRatingToMovie(m1, r3);
        });

        Thread t2 = new Thread(() -> {
            targetClass.addRatingToMovie(m1, r8);
        });

        Thread t3 = new Thread(() -> {
            targetClass.addRatingToMovie(m2, r1);
        });

        t1.start();
        t2.start();
        t3.start();
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        assertEquals(2, targetClass.getMovies().size());
        assertEquals(3, targetClass.getMovies().get(m1).size());
        assertEquals(1, targetClass.getMovies().get(m2).size());
    }

    @Test
    void addRatingToMovie_ReturnsException_WhenRatingLowerBy1() {
        assertThrows(IllegalArgumentException.class, () -> targetClass.addRatingToMovie(m1, new Rating<>(0)));
    }

    @Test
    void addRatingToMovie_ReturnsException_WhenRatingMoreBy10() {
        assertThrows(IllegalArgumentException.class, () -> targetClass.addRatingToMovie(m1, new Rating<>(11)));
    }

    @Test
    void addRatingToMovie_ReturnsException_WhenMovieIsNull() {
        assertThrows(IllegalArgumentException.class, () -> targetClass.addRatingToMovie(null, r1));
    }

    @Test
    void addRatingToMovie_ReturnsException_WhenRatingIsNull() {
        assertThrows(IllegalArgumentException.class, () -> targetClass.addRatingToMovie(m1, null));
    }

}
