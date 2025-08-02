import java.util.*;

class Solution {
    public int nthUglyNumber(int n) {
        if (n <= 0) return 0;

        Set<Long> seen = new HashSet<>();
        PriorityQueue<Long> heap = new PriorityQueue<>();

        long[] primes = {2, 3, 5};
        heap.offer(1L);
        seen.add(1L);

        long current = 1;

        for (int i = 0; i < n; i++) {
            current = heap.poll();

            for (long prime : primes) {
                long next = current * prime;
                if (!seen.contains(next)) {
                    seen.add(next);
                    heap.offer(next);
                }
            }
        }

        return (int) current;
    }
}