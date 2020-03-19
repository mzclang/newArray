package org.mzc.tree;

public class TestBinaryTree {
	
	public static void main(String[] args) {
		//����һ����
		BinaryTree binTree = new BinaryTree();
		//����һ�����ڵ�
		TreeNode root = new TreeNode(1);
		//�Ѹ��ڵ㸳����
		binTree.setRoot(root);
		//����һ����ڵ�
		TreeNode rootL = new TreeNode(2);
		//���´����Ľڵ�����Ϊ���ڵ���ӽڵ�
		root.setleftNode(rootL);
		//����һ���ҽڵ�
		TreeNode rootR = new TreeNode(3);
		//���´����Ľڵ�����Ϊ���ڵ���ӽڵ�
		root.setrightNode(rootR);
		//Ϊ�ڶ������ڵ㴴�������ӽڵ�
		rootL.setleftNode(new TreeNode(4));
		rootL.setrightNode(new TreeNode(5));
		//Ϊ�ڶ�����ҽڵ㴴�������ӽڵ�
		rootR.setleftNode(new TreeNode(6));
		rootR.setrightNode(new TreeNode(7));
		//ǰ�������
		binTree.frontShow();
		System.out.println();
		//�������
		binTree.midShow();
		//�������
		System.out.println();
		binTree.afterShow();
		System.out.println("==============");
		//ǰ�����
		TreeNode result = binTree.frontSearch(5);
		System.out.println(result);
		//�������
		TreeNode result2 = binTree.midSearch(5);
		System.out.println(result2);
		//�������
		TreeNode result3 = binTree.afterSearch(5);
		System.out.println(result3);
		
		//ɾ��һ������
		binTree.delete(2);
		System.out.println("--------");
		binTree.frontShow();
		
	}
}
