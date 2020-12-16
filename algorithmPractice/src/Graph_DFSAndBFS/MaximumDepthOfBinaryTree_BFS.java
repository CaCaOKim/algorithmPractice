package Graph_DFSAndBFS;

import java.util.LinkedList;
import java.util.Queue;

//class TreeNode{
//	int val;
//	TreeNode left, right;
//	TreeNode(int x){
//		this.val=x;
//	}//TreeNode() END
//}//TreeNode END   //MaximumDepthOfBinaryTree에서 이미 정의함 

public class MaximumDepthOfBinaryTree_BFS {

	public static void main(String[] args) {
		MaximumDepthOfBinaryTree_BFS a = new MaximumDepthOfBinaryTree_BFS();
//		TreeNode node = new TreeNode(1);
//		node.left = new TreeNode(2);
//		node.right = new TreeNode(3);
//		node.left.left = new TreeNode(4);
//		node.left.right = new TreeNode(5);
//		//target: 3
		
		TreeNode node = new TreeNode(3);
		node.left = new TreeNode(7);
		node.right = new TreeNode(4);
		node.left.left = new TreeNode(8);
		node.left.right = new TreeNode(1);
		node.right.left = new TreeNode(9);
		node.right.right = new TreeNode(6);
		node.right.left.right = new TreeNode(5);
		node.right.left.right.left = new TreeNode(2);
		//target: 5
		
		System.out.println("val: "+a.solve(node));
	}//main()END

	private int solve(TreeNode node) {
		int result = 0;
		if(node==null) {return result;}//if END
		
		Queue<TreeNode> que = new LinkedList<TreeNode>();
		que.offer(node);
		
		while(!que.isEmpty()) {
			int size = que.size();
			
			for(int i=0; i<size; ++i) {
				TreeNode TN = que.poll();
				if(TN.left!=null) {
					que.offer(TN.left);
				}//if END
				if(TN.right!=null) {
					que.offer(TN.right);
				}//if END
			}//for END
			
			++result;
		}//while END
		
		return result;
	}//solve() END

}//MaximumDepthOfBinaryTree_BFS END
