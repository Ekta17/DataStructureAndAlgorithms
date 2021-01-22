package trees.trie;

public class TrieTree {

	TrieNode root;

	TrieTree(){
		root = new TrieNode();
	}

	public void insert(String word) {
		TrieNode curr = root;
		for (char c : word.toCharArray()) {
			if (curr.children[c - 'a'] == null)
				curr.children[c - 'a'] = new TrieNode();

			curr = curr.children[c - 'a'];
		}
		curr.isEndNode = true;
	}

	public boolean containsWord(String word) {
		TrieNode curr = root;
		for (char c : word.toCharArray()) {
			curr = curr.children[c - 'a'];
			if (curr == null)
				return false;
		}
		if (curr.isEndNode)
			return true;
		return false;
	}

	public boolean containsPrefix(String prefix) {
		TrieNode curr = root;
		for (char c : prefix.toCharArray()) {
			curr = curr.children[c - 'a'];
			if (curr == null)
				return false;
		}

		return true;
	}

}
