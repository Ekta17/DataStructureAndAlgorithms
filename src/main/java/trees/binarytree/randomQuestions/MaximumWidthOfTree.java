package trees.binarytree.randomQuestions;

import trees.binarytree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumWidthOfTree {

	public int getMaxWidth(TreeNode root){
		if(root==null)
			return 0;
		Queue<TreeNode> queue=new LinkedList<>();
		queue.add(root);
		int maxWidth = 1;
		while(queue.isEmpty()== false){
			int sizeOfQueue= queue.size();
			for(int i = 0 ; i<sizeOfQueue; i++){
				TreeNode n = queue.poll();
				if(n.left!=null)
					queue.add(n.left);
				if(n.right!=null)
					queue.add(n.right);
			}
			maxWidth = sizeOfQueue > maxWidth ? sizeOfQueue : maxWidth;
		}

		return maxWidth;
	}
}
