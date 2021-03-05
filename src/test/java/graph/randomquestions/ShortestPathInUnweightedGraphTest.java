package graph.randomquestions;

import graph.Graph;
import graph.TestHelper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShortestPathInUnweightedGraphTest implements TestHelper {

	private static ShortestPathInUnweightedGraph shortestPathInUnweightedGraph;

	@BeforeAll
	public static void init(){
		shortestPathInUnweightedGraph = new ShortestPathInUnweightedGraph();
	}

	@Test
	public void testShortedPath(){
		Graph graph = createUndirectedAcyclicGraph();
		Optional<AbstractMap.SimpleEntry<Integer, List<Integer>>> actualPath =
				shortestPathInUnweightedGraph
						.getShortestPathFromSource(graph, graph.nodes.get(0), graph.nodes.get(graph.nodes.size()-1));

		assertEquals(4, actualPath.get().getKey());
		assertEquals(Arrays.asList(4,3,2,1),actualPath.get().getValue());
	}

}