package org.mzc.queue;

//һ���ڵ�
public class LoopNode {
	//�ڵ�����
	int data;
	//��һ���ڵ�
	LoopNode next = this;
	public LoopNode(int data) {
		this.data = data;
	}
	

	
	
	//��ȡ��һ���ڵ�
	public LoopNode next() {
		return this.next;
	}
	//��ȡ�ڵ��е�����
	public int getData() {
		return this.data;
	}
	//��ǰ�ڵ��Ƿ������һ���ڵ�
	public boolean isLast() {
		return next == null;
	}
	
	
	//ɾ����һ���ڵ�
	public void removeNext() {
		//ȡ������һ���ڵ�
		LoopNode newNext = next.next;
		//������һ���ڵ�����Ϊ��ǰ�ڵ����һ���ڵ�
		this.next = newNext;
	}
	//����һ���ڵ���Ϊ��ǰ�ڵ����һ���ڵ�
	public void after(LoopNode node) {
		//ȡ����һ���ڵ㣬��Ϊ����һ���ڵ�
		LoopNode nodeNext = next;
		//���µĽڵ���Ϊ��ǰ�ڵ����һ���ڵ�
		this.next = node;
		//������һ���ڵ���Ϊ�½ڵ����һ���ڵ�
		node.next = nodeNext;
		
	}
	
	
	
	//��ʾ���нڵ���Ϣ
	public void show() {
		LoopNode currentNode = this;
		while(true) {
			System.out.print(currentNode.data+" ");
			//ȡ����һ���ڵ�
			currentNode = currentNode.next();
			//��������һ���ڵ�
			if(currentNode==null) {
				break;
			}
		}
		System.out.println();
		
	}
	public static void main(String[] args) {
		//�����ڵ�
		LoopNode n1 = new LoopNode(1);
		LoopNode n2 = new LoopNode(2);
		LoopNode n3 = new LoopNode(3);
		LoopNode n4 = new LoopNode(4);
		n1.after(n2);
		n2.after(n3);
		n3.after(n4);
		System.out.println(n1.next().getData());
		System.out.println(n2.next().getData());
		System.out.println(n3.next().getData());
		System.out.println(n4.next().getData());
	}
}
