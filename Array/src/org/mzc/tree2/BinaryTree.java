package org.mzc.tree2;

public class BinaryTree {
	ThreadedNode root;
	//������ʱ��ȡǰ���ڵ�
	ThreadedNode pre = null;
	
	//��������������
	public void threadIterate() {
		//������ʱ�洢��ǰ�����Ľڵ�
		ThreadedNode node = root;
		while(node!=null) {
			//ѭ���ҵ��ʼ�Ľڵ�
			while(node.leftType==0) {
				node = node.leftNode;
			}
			//��ӡ��ǰ�ڵ��ֵ
			System.out.println(node.value);
			//�����ǰ�ڵ����ָ��ָ����Ǻ�̽ڵ㣬���ܺ�̽ڵ㻹�к�̽ڵ�
			while(node.rightType==1) {
				node = node.rightNode;
				System.out.println(node.value);
			}
			
			//�滻�����Ľڵ�
			node = node.rightNode;
			
		}
	}
	
	
	//���ø��ڵ�
	public void setRoot(ThreadedNode root) {
		this.root = root;
	}
	//����������������
	public void threadedNodes() {
		threadNodes(root);
	}
	
	public void threadNodes(ThreadedNode node) {
		//��ǰ�ڵ����Ϊnull,ֱ�ӷ���
		if(node==null) {
			return;
		}
		
		//����������
		threadNodes(node.leftNode);
		//����ǰ���ڵ�
		if(node.leftNode==null) {
			//�õ�ǰ�ڵ����ָ��ָ��ǰ���ڵ�
			node.leftNode = pre;
			//�ı䵱ǰ�ڵ���ָ�������
			node.leftType=1;
		}
		//����ǰ������ָ�롣���ǰ���ڵ����ָ����null(û��ָ��������)
		if(pre!=null&&pre.rightNode==null) {
			//��ǰ���ڵ����ָ��ָ��ǰ�ڵ�
			pre.rightNode = node;
			//�ı�ǰ���ڵ����ָ������
			pre.rightType = 1;
			
		}
		
		//ÿ����һ���ڵ㣬��ǰ�ڵ�����һ���ڵ��ǰ���ڵ�
		pre = node;
		
		//����������
		threadNodes(node.rightNode);
	}
	
	
	//��ȡ���ڵ�
	public ThreadedNode getRoot(){
		return root;
	}
	//ǰ�����
	public void frontShow() {
		if(root!=null) {
			root.frontShow();
		}
	}
	//�������
	public void midShow() {
		if(root!=null) {
			root.midShow();
		}
	}
	//�������
	public void afterShow() {
		if(root!=null) {
			root.afterShow();
		}
	}
	//ǰ�����
	public ThreadedNode frontSearch(int i) {
		return root.frontSearch(i);
	}
	//�������
	public ThreadedNode midSearch(int i) {
		return root.midSearch(i);
	}
	//�������
	public ThreadedNode afterSearch(int i) {
		return root.afterSearch(i);
	}
	public void delete(int i) {
		if(root.value==i) {
			root=null;
		}else {
			root.delete(i);
		}
	}
	
}
