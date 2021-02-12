package trees.binarytree.randomQuestions;

import trees.binarytree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//Print the left most element at each level of the tree
//This is similar to level order traversal
public class LeftViewOfTree {

	public List<Integer> getLeftMostElementAtEachLevel(TreeNode root){
		List<Integer> leftMostLevelNodes = new ArrayList<>();
		if(root == null)
			return leftMostLevelNodes;

		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);

		while(queue.isEmpty()==false){
			int sizeOfQueue = queue.size();
			for(int i = 0; i< sizeOfQueue; i++){
				TreeNode n = queue.poll();
				if(i==0)
					leftMostLevelNodes.add(n.val);
				if(n.left!=null)
					queue.add(n.left);
				if(n.right!=null)
					queue.add(n.right);
			}
		}

		return leftMostLevelNodes;
	}
}
