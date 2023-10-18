package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTrees {
	
	public static class Node{
		int data;
		Node left;
		Node right;
		Node(int data)
		{
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	public static class BuildBinaryTrees {
		
		static int idx = -1;
	
		public static Node buildTree(int nodes[])
		{
			idx++;
//			System.out.println("entered"+ idx);
			if(nodes[idx] == -1) {
//				System.out.println("null");
				return null;
			}
			
			Node newNode = new Node(nodes[idx]);
			
			newNode.left = buildTree(nodes);	
			
//			System.out.println("left comp");
			
			newNode.right = buildTree(nodes);	
			
//			System.out.println("Right comp "  + newNode.data);
			return newNode;
		}
	
	
	
	}
	
	public static void preorderBuild(Node root)
	{
		if(root == null)
		{
			
			return;
		}
		System.out.print(root.data);
		preorderBuild(root.left); //left subtree
		preorderBuild(root.right);	//right subtree
		
//			recursive:
	}	
	
	public static void inorder(Node root)
	{
		if(root == null)
		{
			return;
		}
		
		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
	}
	
	public static void postorder(Node root)
	{
		if(root ==  null)
		{
			return;
		}
		
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data);
	}
	
	
	public static void levelOrder(Node root)
	{
		
		if(root == null)
		{
			return;
		}
		
		Queue <Node> q = new LinkedList<>();
		q.add(root);
		q.add(null);
		
		while (!q.isEmpty())
		{
			Node currNode = q.remove();
			if(currNode == null)
			{
				System.out.println();
				
				if(q.isEmpty())
					break;
				else {
					q.add(null);
				}
			}
			else {
				System.out.print(currNode.data + " ");
				if(currNode.left != null)
				{
					q.add(currNode.left);
				}
				
				if(currNode.right != null)
				{
					q.add(currNode.right);
				}
			}
		}
		
		
	}
	
	
	public static int countOfNodes(Node root)
	{
		if(root == null)
		{
			return 0;
		}
		
		int leftSubtreeCount = countOfNodes(root.left);
		int rightSubtreeCount = countOfNodes(root.right);
		
		return leftSubtreeCount + rightSubtreeCount + 1;
	}
	
	public static int sumOfNodes(Node root)
	{
		if(root == null)
		{
			return 0;
		}
		
		
		//first traversing in dfs fashion till the leaf node.
		int sumOfLeftSubtree = sumOfNodes(root.left);
		int sumOfRightSubtree = sumOfNodes(root.right);
//		System.out.print( sumOfRightSubtree);
//		System.out.println();
		
//		System.out.println(root.data +sumOfLeftSubtree + sumOfRightSubtree );
		return  sumOfLeftSubtree+sumOfRightSubtree + root.data;
	}
	
	public static int height(Node root)
	{
		//base case
		if(root == null)
		{
			return 0;
		}
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		
		return (leftHeight > rightHeight) ? leftHeight + 1 : rightHeight + 1;
	}
	
	
	public static int diameter(Node root)
	{
		
		//O(N^2) app
		if(root == null)
		{
			return 0;
		}
		
		int diam1 = diameter(root.left);
		int diam2 = diameter(root.right);
		int diam3root = height(root.left) + height(root.right)  + 1;
		
		return Math.max(Math.max(diam1, diam2), diam3root);
	}
	
	//App 2 for diameter
	
	static class TreeInfo {
		int ht;
		int diam;
		
		TreeInfo(int ht, int diam)
		{
			this.ht = ht;
			this.diam = diam;
		}
	}
	
	public static TreeInfo diameter2(Node root){
		
		if(root == null)
		{
			return new TreeInfo(0,0);
		}
	
		
		TreeInfo left = diameter2(root.left);
		TreeInfo right = diameter2(root.right);
		
		int myHeight = Math.max(left.ht, right.ht) + 1;
		
		int diam1 = left.diam;
		int diam2 = right.diam;
		int diam3 = left.ht + right.ht + 1;
		
		int myDiam = Math.max(Math.max(diam1, diam2), diam3);
		
		TreeInfo myInfo = new TreeInfo(myHeight, myDiam);
		return myInfo;
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		
		BuildBinaryTrees tree = new BuildBinaryTrees();
		Node root = tree.buildTree(nodes);
		
//		postorder(root);
//		levelOrder(root);
		int countOfNodes = countOfNodes(root);
		
		System.out.println(diameter2(root).diam);
		
	}
}
