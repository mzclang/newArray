package org.mzc.queue;

//一个节点
public class LoopNode {
	//节点内容
	int data;
	//下一个节点
	LoopNode next = this;
	public LoopNode(int data) {
		this.data = data;
	}
	

	
	
	//获取下一个节点
	public LoopNode next() {
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
		LoopNode newNext = next.next;
		//把下下一个节点设置为当前节点的下一个节点
		this.next = newNext;
	}
	//插入一个节点做为当前节点的下一个节点
	public void after(LoopNode node) {
		//取出下一个节点，作为下下一个节点
		LoopNode nodeNext = next;
		//把新的节点作为当前节点的下一个节点
		this.next = node;
		//把下下一个节点做为新节点的下一个节点
		node.next = nodeNext;
		
	}
	
	
	
	//显示所有节点信息
	public void show() {
		LoopNode currentNode = this;
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
