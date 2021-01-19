package random;

import java.util.LinkedHashMap;

public class LeastRecentlyUsedCache {

	private int capacity;
	private LinkedHashMap<Integer, Integer> cache;

	public LeastRecentlyUsedCache(int capacity){
		this.capacity = capacity;
		cache = new LinkedHashMap<>(this.capacity);
	}

	public int get(int key){
		int value = -1;
		if(cache.containsKey(key)) {
			value = cache.get(key);
			cache.remove(key);
			cache.put(key, value);
		}
		return value;
	}

	public void put(int key, int value){
		if(cache.containsKey(key))
			cache.remove(key);
		if(cache.size() == capacity)
			cache.remove(cache.keySet().iterator().next()); //remove the first element
		cache.put(key, value);
	}
}
