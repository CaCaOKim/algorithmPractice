package QueueAndStack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode{
	int val;
	TreeNode left, right;
	TreeNode(int x){
		this.val=x;
	}//TreeNode() END
}//TreeNode END

public class LevelOrderOfBinaryTree {

	public static void main(String[] args) {
//		TreeNode root = new TreeNode(1);
//		root.left = new TreeNode(2);
//		root.right = new TreeNode(3);
//		root.left.left = new TreeNode(4);
//		root.left.right = new TreeNode(5);
//		//target: [[1], [2, 3], [4, 5]]
		
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(3);
		root.right = new TreeNode(4);
		root.left.right = new TreeNode(7);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(1);
		root.left.right.left = new TreeNode(9);
		root.right.left.left = new TreeNode(2);
		root.right.left.right = new TreeNode(8);
		//target: [[5], [3, 4], [7, 6, 1], [9, 2, 8]]
		
		System.out.println(solve(root));
	}//main() END

	private static List<List<Integer>> solve(TreeNode root) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		Queue<TreeNode> que = new LinkedList<TreeNode>();
		
		if(root==null) {return result;}
		
		que.offer(root);
		while(!que.isEmpty()) {
			List<Integer> list = new ArrayList<Integer>();
			int size = que.size();
			
			for(int i=0; i<size; ++i) {
				TreeNode node = que.poll();
				list.add(node.val);
				if(node.left!=null) {
					que.offer(node.left);
				}//if END
				if(node.right!=null) {
					que.offer(node.right);
				}//if END
			}//for END
			
			result.add(list);
		}//while END
		
		return result;
	}//solve() END

}//LevelOrderOfBinaryTree END
