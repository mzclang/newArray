package org.mzc.queue;
//双向循环链表
public class DoubleNode {
	//上一个节点
	DoubleNode pre = this;
	//下一个节点
	DoubleNode next = this;
	//节点的数据
	int data;
	
	public DoubleNode(int data) {
		this.data = data;
	}
	
	//增加节点
	public void after(DoubleNode node) {
		//原来的下一个节点
		DoubleNode nextNext = next;
		//把新的节点做为当前节点的下一个节点
		this.next = node ;
		//把当前节点做新节点的前一个节点
		node.pre =this;
		//让原来的下一个节点做新节点的下一个节点
		node.next = nextNext;
		//让原来的下一个节点的上一个节点为新节点
		nextNext.pre = node;
	}
	//上一个节点
		public DoubleNode pre() {
			return this.pre;
		}
	//下一个节点
	public DoubleNode next() {
		return this.next;
	}
	
	//获取数据
	public int getdata() {
		return this.data;
	}
	

	public static void main(String[] args) {
		//创建一个节点
		DoubleNode n1 = new DoubleNode(1);
		DoubleNode n2 = new DoubleNode(2);
		DoubleNode n3 = new DoubleNode(3);
		
		//追加节点
		n1.after(n2);
		n2.after(n3);
		

		
		//查看上一个，自己，下一个节点的内容
		System.out.println(n2.pre().getdata());
		System.out.println(n2.getdata());
		System.out.println(n2.next().getdata());
		System.out.println(n3.next().getdata());
		System.out.println(n1.pre().getdata());
		
	}

}
