package org.mzc.tree;

public class TestBinaryTree {
	
	public static void main(String[] args) {
		//创建一棵树
		BinaryTree binTree = new BinaryTree();
		//创建一个根节点
		TreeNode root = new TreeNode(1);
		//把根节点赋给树
		binTree.setRoot(root);
		//创建一个左节点
		TreeNode rootL = new TreeNode(2);
		//把新创建的节点设置为根节点的子节点
		root.setleftNode(rootL);
		//创建一个右节点
		TreeNode rootR = new TreeNode(3);
		//把新创建的节点设置为根节点的子节点
		root.setrightNode(rootR);
		//为第二层的左节点创建两个子节点
		rootL.setleftNode(new TreeNode(4));
		rootL.setrightNode(new TreeNode(5));
		//为第二层的右节点创建两个子节点
		rootR.setleftNode(new TreeNode(6));
		rootR.setrightNode(new TreeNode(7));
		//前序遍历树
		binTree.frontShow();
		System.out.println();
		//中序遍历
		binTree.midShow();
		//后序遍历
		System.out.println();
		binTree.afterShow();
		System.out.println("==============");
		//前序查找
		TreeNode result = binTree.frontSearch(5);
		System.out.println(result);
		//中序查找
		TreeNode result2 = binTree.midSearch(5);
		System.out.println(result2);
		//后序查找
		TreeNode result3 = binTree.afterSearch(5);
		System.out.println(result3);
		
		//删除一个子树
		binTree.delete(2);
		System.out.println("--------");
		binTree.frontShow();
		
	}
}
