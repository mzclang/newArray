package org.mzc.tree2;

public class TestBinaryTree {
	
	public static void main(String[] args) {
		//����һ����
		BinaryTree binTree = new BinaryTree();
		//����һ�����ڵ�
		ThreadedNode root = new ThreadedNode(1);
		//�Ѹ��ڵ㸳����
		binTree.setRoot(root);
		//����һ����ڵ�
		ThreadedNode rootL = new ThreadedNode(2);
		//���´����Ľڵ�����Ϊ���ڵ���ӽڵ�
		root.setleftNode(rootL);
		//����һ���ҽڵ�
		ThreadedNode rootR = new ThreadedNode(3);
		//���´����Ľڵ�����Ϊ���ڵ���ӽڵ�
		root.setrightNode(rootR);
		//Ϊ�ڶ������ڵ㴴�������ӽڵ�
		rootL.setleftNode(new ThreadedNode(4));
		ThreadedNode fiveNode =new ThreadedNode(5);
		rootL.setrightNode(fiveNode);
		//Ϊ�ڶ�����ҽڵ㴴�������ӽڵ�
		rootR.setleftNode(new ThreadedNode(6));
		rootR.setrightNode(new ThreadedNode(7));
		//�������
		binTree.midShow();		
		//��ǰ������������
		System.out.println();
		System.out.println("----------------");
		binTree.threadedNodes();
		binTree.threadIterate();
		
		
	}
}
