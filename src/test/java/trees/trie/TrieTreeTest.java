package trees.trie;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrieTreeTest {

	private static TrieTree trieTree;

	@BeforeAll
	public static void init(){
		trieTree = new TrieTree();
	}

	@Test
	void testTrieTree() {
		trieTree.insert("many");
		trieTree.insert("man");
		trieTree.insert("mouse");
		trieTree.insert("apple");
		trieTree.insert("ape");
		trieTree.insert("cat");

		assertTrue(trieTree.containsWord("many"));
		assertTrue(trieTree.containsWord("mouse"));
		assertTrue(trieTree.containsWord("apple"));
		assertTrue(trieTree.containsWord("ape"));
		assertTrue(trieTree.containsWord("cat"));

		assertTrue(trieTree.containsPrefix("m"));
		assertTrue(trieTree.containsPrefix("ap"));
		assertTrue(trieTree.containsPrefix("man"));
	}

}