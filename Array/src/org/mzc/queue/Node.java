package org.mzc.queue;

//һ���ڵ�
public class Node {
	//�ڵ�����
	int data;
	//��һ���ڵ�
	Node next;
	public Node(int data) {
		this.data = data;
	}
	
	//Ϊ�ڵ�׷�ؽڵ�
	public Node append(Node node) {
			//��ǰ�ڵ�
		Node currentNode = this;
		//ѭ�������
		while(true) {
			//ȡ����һ���ڵ�
			Node nextNode = currentNode.next;
			//�����һ���ڵ�Ϊnull����ǰ�ڵ��Ѿ������һ���ڵ�
			if(nextNode==null) {
				break;
			}
			//������ǰ�ڵ�
			currentNode = nextNode;
		}
		//����Ҫ׷�صĽڵ�׷��Ϊ�ҵ��ĵ�ǰ�ڵ����һ���ڵ�
		currentNode.next = node;
		return this;
	}
	
	
	//��ȡ��һ���ڵ�
	public Node next() {
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
		Node newNext = next.next;
		//������һ���ڵ�����Ϊ��ǰ�ڵ����һ���ڵ�
		this.next = newNext;
	}
	//����һ���ڵ���Ϊ��ǰ�ڵ����һ���ڵ�
	public void after(Node node) {
		//ȡ����һ���ڵ㣬��Ϊ����һ���ڵ�
		Node nodeNext = next;
		//���µĽڵ���Ϊ��ǰ�ڵ����һ���ڵ�
		this.next = node;
		//������һ���ڵ���Ϊ�½ڵ����һ���ڵ�
		node.next = nodeNext;
		
	}
	
	
	
	//��ʾ���нڵ���Ϣ
	public void show() {
		Node currentNode = this;
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
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		//׷�ӽڵ�
		n1.append(n2).append(n3).append(n4);
		//ȡ����һ���ڵ������
//		System.out.println(n1.next().getData());

		n1.show();
//		n1.next.removeNext();
//		n1.show();
		
		//����һ���µĽڵ�
		Node node = new Node(5);
		n1.next.next.after(node);
		n1.show();
	}
}
