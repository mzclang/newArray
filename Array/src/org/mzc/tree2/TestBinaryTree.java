package org.mzc.tree2;

public class TestBinaryTree {
	
	public static void main(String[] args) {
		//创建一棵树
		BinaryTree binTree = new BinaryTree();
		//创建一个根节点
		ThreadedNode root = new ThreadedNode(1);
		//把根节点赋给树
		binTree.setRoot(root);
		//创建一个左节点
		ThreadedNode rootL = new ThreadedNode(2);
		//把新创建的节点设置为根节点的子节点
		root.setleftNode(rootL);
		//创建一个右节点
		ThreadedNode rootR = new ThreadedNode(3);
		//把新创建的节点设置为根节点的子节点
		root.setrightNode(rootR);
		//为第二层的左节点创建两个子节点
		rootL.setleftNode(new ThreadedNode(4));
		ThreadedNode fiveNode =new ThreadedNode(5);
		rootL.setrightNode(fiveNode);
		//为第二层的右节点创建两个子节点
		rootR.setleftNode(new ThreadedNode(6));
		rootR.setrightNode(new ThreadedNode(7));
		//中序遍历
		binTree.midShow();		
		//中前线索化二叉树
		System.out.println();
		System.out.println("----------------");
		binTree.threadedNodes();
		binTree.threadIterate();
		
		
	}
}
