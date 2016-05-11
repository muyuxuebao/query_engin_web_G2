import com.query_engin.bean.Pair;
import org.junit.Test;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

/**
 * Created by yinliang on 2016/5/9.
 */
public class TestCase {
    @Test
    public void test() {
        Pair pair = new Pair(1, 1);
        Pair pair1 = new Pair(1, 1);

        Set<Pair> pairs = new HashSet<Pair>();


        pairs.add(pair);

        pairs.add(pair1);

        System.out.println(pairs.size());
    }
}
