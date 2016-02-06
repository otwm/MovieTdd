package movie;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by kdo on 16. 2. 6.
 */
public class MovieTest {
    @Test
    public void foo(){

    }

    @Test
    public void should_return_0_movie_just_created(){
        Movie movie = new Movie();
        assertThat(movie.averateRating(),is(0));
    }

    @Test
    public void should_return_1_when_1_was_rated(){
        Movie movie = new Movie();
        movie.rate(1);
        assertThat(movie.averateRating(),is(0));
    }
}
