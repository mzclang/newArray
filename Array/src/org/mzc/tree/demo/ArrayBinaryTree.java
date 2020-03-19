package org.mzc.tree.demo;
//˳��洢������
public class ArrayBinaryTree {
	int[] data;
	public ArrayBinaryTree(int[] data) {
		this.data = data;
	}
	
	public void frontShow() {
		frontShow(0);
	}
	//ǰ�����
	public void frontShow(int index) {
		if(data==null||data.length==0) {
			return;
		}
		//�ȱ����ڵ������
		System.out.println(data[index]);
		//2*index+1:����������
		if(2*index+1<data.length) {
			frontShow(2*index+1);
		}
		//2*index+2:����������
		if(2*index+2<data.length) {
			frontShow(2*index+2);
		}
	}
	
	public static void main(String[] args) {
		int[] data = new int[] {1,2,3,4,5,6,7};
		ArrayBinaryTree tree = new ArrayBinaryTree(data);
		//ǰ�����
		tree.frontShow();
	}
}
