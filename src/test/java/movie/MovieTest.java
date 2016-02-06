package movie;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * 무비 테스트
 * Created by kdo on 16. 2. 6.
 */
public class MovieTest {

    private Movie movie;

    @Before
    public void setUp() throws Exception {
        movie = new Movie();
    }

    @Test
    public void 무비가_처음_만들어졌을때는_0이_나와야함(){
        assertThat(movie.averageRate(),is(0));
    }

    @Test
    public void 무비에_레이팅을_1_설정하면_평균은_1이_나와야한다(){
        movie.rate(1);
        assertThat(movie.averageRate(),is(1));
    }

    @Test
    public void 무비에_레이팅2와4를_설정하면_3이나와야_한다(){
        movie.rate(2);
        movie.rate(4);
        assertThat(movie.averageRate(),is(3));
    }
}
