package org.mzc.queue;
//˫��ѭ������
public class DoubleNode {
	//��һ���ڵ�
	DoubleNode pre = this;
	//��һ���ڵ�
	DoubleNode next = this;
	//�ڵ������
	int data;
	
	public DoubleNode(int data) {
		this.data = data;
	}
	
	//���ӽڵ�
	public void after(DoubleNode node) {
		//ԭ������һ���ڵ�
		DoubleNode nextNext = next;
		//���µĽڵ���Ϊ��ǰ�ڵ����һ���ڵ�
		this.next = node ;
		//�ѵ�ǰ�ڵ����½ڵ��ǰһ���ڵ�
		node.pre =this;
		//��ԭ������һ���ڵ����½ڵ����һ���ڵ�
		node.next = nextNext;
		//��ԭ������һ���ڵ����һ���ڵ�Ϊ�½ڵ�
		nextNext.pre = node;
	}
	//��һ���ڵ�
		public DoubleNode pre() {
			return this.pre;
		}
	//��һ���ڵ�
	public DoubleNode next() {
		return this.next;
	}
	
	//��ȡ����
	public int getdata() {
		return this.data;
	}
	

	public static void main(String[] args) {
		//����һ���ڵ�
		DoubleNode n1 = new DoubleNode(1);
		DoubleNode n2 = new DoubleNode(2);
		DoubleNode n3 = new DoubleNode(3);
		
		//׷�ӽڵ�
		n1.after(n2);
		n2.after(n3);
		

		
		//�鿴��һ�����Լ�����һ���ڵ������
		System.out.println(n2.pre().getdata());
		System.out.println(n2.getdata());
		System.out.println(n2.next().getdata());
		System.out.println(n3.next().getdata());
		System.out.println(n1.pre().getdata());
		
	}

}
