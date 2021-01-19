package random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeastRecentlyUsedTest {

	private static LeastRecentlyUsedCache leastRecentlyUsedCache;

	@Test
	public void testLRUCache(){
		leastRecentlyUsedCache = new LeastRecentlyUsedCache(3);
		assertEquals(-1, leastRecentlyUsedCache.get(5));

		leastRecentlyUsedCache.put(1, 1);
		assertEquals(1, leastRecentlyUsedCache.get(1));

		leastRecentlyUsedCache.put(2, 2);
		leastRecentlyUsedCache.put(3, 3);
		assertEquals(1, leastRecentlyUsedCache.get(1));
		assertEquals(2, leastRecentlyUsedCache.get(2));
		assertEquals(3, leastRecentlyUsedCache.get(3));

		leastRecentlyUsedCache.put(4, 4);
		assertEquals(4, leastRecentlyUsedCache.get(4));
		assertEquals(-1, leastRecentlyUsedCache.get(1));
		assertEquals(2, leastRecentlyUsedCache.get(2));
		assertEquals(3, leastRecentlyUsedCache.get(3));
	}

}