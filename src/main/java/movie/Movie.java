package movie;

import java.util.ArrayList;
import java.util.List;

/**
 * 무비
 * Created by kdo on 16. 2. 6.
 */
class Movie {
    private final List<Integer> someOfRates = new ArrayList<>();

    public int averageRate() {
        if (someOfRates.size() == 0) return 0;
        return someOfRates.stream().mapToInt(rate -> rate).sum() / someOfRates.size();
    }

    public void rate(int rate) {
        this.someOfRates.add(rate);
    }
}
