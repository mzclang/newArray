package org.mzc.queue;

public class MyQueue {
	int[] elements;
	public MyQueue() {
		elements = new int[0];
	}
	//入列
	public void add(int element) {
		//创建一个新数组
		int[] newArry = new int[elements.length+1];
		//把原来数组中的元素复制到新的数组中
		for(int i = 0;i<elements.length;i++) {
			newArry[i] = elements[i];
		}
		//把添加的元素放入新数组中
		newArry[elements.length] = element;
		//使用新的数组替换旧的数组
		elements = newArry;
	}
	//出列
	public int poll() {
		//把数组中的第0个元素取出来
		int element = elements[0];
		//创建一个新的数组
		int[] newArry = new int[elements.length-1];
		//复制原数组中的元素到新的数组中
		for(int i = 0;i<newArry.length;i++) {
			newArry[i] = elements[i+1];
		}
		//替换数组
		elements = newArry;
		return element;
	}
	
	
	//判断队列是否为空
	public boolean isEmpty() {
		return elements.length==0;
	}
	
	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		System.out.println(queue.poll());
		
	}
	
	
	
}
