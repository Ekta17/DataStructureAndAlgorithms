package graph.sorting;

import graph.Graph;
import graph.Node;
import graph.TestHelper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TopologicalSortTest implements TestHelper {

	private static TopologicalSort topologicalSort;

	@BeforeAll
	public static void init() {
		topologicalSort = new TopologicalSort();
	}

	@Test
	void testTopologicalSortForDAG() {
		Graph g = createDirectedAcyclicGraph();
		List<Node> actualOrdering = topologicalSort.sort(g);
		List<Integer> dataFromActualOrdering = actualOrdering.stream().map( x -> x.data).collect(Collectors.toList());
		assertEquals(Arrays.asList(5, 4, 2, 3, 1, 0), dataFromActualOrdering);
	}
}