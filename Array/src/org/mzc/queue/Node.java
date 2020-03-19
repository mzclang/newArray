package org.mzc.queue;

//一个节点
public class Node {
	//节点内容
	int data;
	//下一个节点
	Node next;
	public Node(int data) {
		this.data = data;
	}
	
	//为节点追回节点
	public Node append(Node node) {
			//当前节点
		Node currentNode = this;
		//循环向后找
		while(true) {
			//取出下一个节点
			Node nextNode = currentNode.next;
			//如果下一个节点为null，当前节点已经是最后一个节点
			if(nextNode==null) {
				break;
			}
			//赋给当前节点
			currentNode = nextNode;
		}
		//把需要追回的节点追加为找到的当前节点的下一个节点
		currentNode.next = node;
		return this;
	}
	
	
	//获取下一个节点
	public Node next() {
		return this.next;
	}
	//获取节点中的数据
	public int getData() {
		return this.data;
	}
	//当前节点是否是最后一个节点
	public boolean isLast() {
		return next == null;
	}
	
	
	//删除下一个节点
	public void removeNext() {
		//取出下下一个节点
		Node newNext = next.next;
		//把下下一个节点设置为当前节点的下一个节点
		this.next = newNext;
	}
	//插入一个节点做为当前节点的下一个节点
	public void after(Node node) {
		//取出下一个节点，作为下下一个节点
		Node nodeNext = next;
		//把新的节点作为当前节点的下一个节点
		this.next = node;
		//把下下一个节点做为新节点的下一个节点
		node.next = nodeNext;
		
	}
	
	
	
	//显示所有节点信息
	public void show() {
		Node currentNode = this;
		while(true) {
			System.out.print(currentNode.data+" ");
			//取出下一个节点
			currentNode = currentNode.next();
			//如果是最后一个节点
			if(currentNode==null) {
				break;
			}
		}
		System.out.println();
		
	}
	public static void main(String[] args) {
		//创建节点
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		//追加节点
		n1.append(n2).append(n3).append(n4);
		//取出下一个节点的数据
//		System.out.println(n1.next().getData());

		n1.show();
//		n1.next.removeNext();
//		n1.show();
		
		//插入一个新的节点
		Node node = new Node(5);
		n1.next.next.after(node);
		n1.show();
	}
}
