package TestComplexTasks.Task4;

import ComplexTasks.Task4.Movie;
import ComplexTasks.Task4.MovieService;
import ComplexTasks.Task4.Rating;
import org.junit.jupiter.api.BeforeEach;

public class Precondition {
        protected MovieService<Integer> targetClass;
        protected Movie m1;
        protected Movie m2;
        protected Rating<Integer> r1;
        protected Rating<Integer> r3;
        protected Rating<Integer> r5;
        protected Rating<Integer> r8;
        protected Rating<Integer> r10;

        @BeforeEach
        void getPreconditions() {
            this.targetClass = new MovieService<>();
            this.m1 = new Movie("Titanik");
            this.m2 = new Movie("Bimbo");
            this.r1 = new Rating<>(1);
            this.r3 = new Rating<>(3);
            this.r5 = new Rating<>(5);
            this.r8 = new Rating<>(8);
            this.r10 = new Rating<>(10);
        }
}
