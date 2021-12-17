import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        System.out.println(climbStairs(1));
        System.out.println(climbStairs(2));
        System.out.println(climbStairs(5));
        System.out.println(climbStairs(10));
    }

    private static Map<Integer, Integer> cache = new HashMap<>();

    public static long climbStairs(int steps){
        if(steps <= 1){
            return 1;
        }
        if(cache.containsKey(steps)){
            return cache.get(steps);
        }

        int ans = (int) (climbStairs(steps - 1) + climbStairs(steps - 2));
        cache.put(steps, ans);

        return ans;
    }

}
