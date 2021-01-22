package trees.trie;

import lombok.ToString;

/**
 * Notice unlike other tree nodes, we dont store data explicitly in a Trie node.
 * This is because it is mainly used for lookup and for a particular alphabet set,
 * Hence, each node can be any of the alphabet and
 * Trie tree is essentially treated as an alphabet-ary tree like for n-ary tree, here n = alphabet size.
 */
@ToString
public class TrieNode {

	public static final int ALPHABET_SIZE = 26;
	TrieNode[] children;
	boolean isEndNode;

	TrieNode(){
		children = new TrieNode[ALPHABET_SIZE];
		isEndNode = false;
	}
}
