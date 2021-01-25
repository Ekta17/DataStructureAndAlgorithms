package graph.randomquestions;

import graph.Graph;
import graph.TestHelper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DetectCycleInGraphTest implements TestHelper {
	private static DetectCycleInGraph detectCycleInGraph;

	@BeforeAll
	public static void init(){
		detectCycleInGraph = new DetectCycleInGraph();
	}

	@Test
	void testIsGraphCyclicWhenCyclic() {
		Graph g = createUndirectedCyclicGraph();
		assertTrue(detectCycleInGraph.isGraphCyclic(g));
	}

	@Test
	void testIsGraphCyclicWhenNotCyclic() {
		Graph g = createUndirectedAcyclicGraph();
		assertFalse(detectCycleInGraph.isGraphCyclic(g));
	}
}