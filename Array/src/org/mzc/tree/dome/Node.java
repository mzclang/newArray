package org.mzc.tree.dome;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//赫夫曼树代码实现
public class Node implements Comparable<Node> {
	int value;
	Node left;
	Node right;
	public Node(int value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "Node[value="+value+"]";
	}
	
	@Override
	public int compareTo(Node o) {
		return -(this.value-o.value);
	}
	
	
	//创建赫夫曼树
	public static Node createHuffmanTree(int [] arr) {
		//先使用数组中所有的元素创建若干个二叉树，（只有一个节点）
		List<Node> nodes = new ArrayList<>();
		for(int value : arr) {
			nodes.add(new Node(value));
		}
		//循环处理
		while(nodes.size()>1) {
			//排序
			Collections.sort(nodes);
			
			//取出来权值最小的两个二叉树
			//取出权值最小的二叉树
			Node left = nodes.get(nodes.size()-1);
			//取出权值次小的二叉树
			Node right = nodes.get(nodes.size()-2);
			//创建一棵新的二叉树
			Node parent = new Node(left.value+right.value);
			//把去取出的两个二叉树移除
			nodes.remove(left);
			nodes.remove(right);			
			//放入原来的二叉树集合中
			nodes.add(parent);
		}
		
		return nodes.get(0);
	}

	public static void main(String[] args) {
		int [] arr = {3,7,2,56,140,56,1,64,5,52,13,};
		Node node = createHuffmanTree(arr);
		System.out.println(node);
	}



	
}
