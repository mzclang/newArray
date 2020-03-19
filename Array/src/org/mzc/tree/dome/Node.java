package org.mzc.tree.dome;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//�շ���������ʵ��
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
	
	
	//�����շ�����
	public static Node createHuffmanTree(int [] arr) {
		//��ʹ�����������е�Ԫ�ش������ɸ�����������ֻ��һ���ڵ㣩
		List<Node> nodes = new ArrayList<>();
		for(int value : arr) {
			nodes.add(new Node(value));
		}
		//ѭ������
		while(nodes.size()>1) {
			//����
			Collections.sort(nodes);
			
			//ȡ����Ȩֵ��С������������
			//ȡ��Ȩֵ��С�Ķ�����
			Node left = nodes.get(nodes.size()-1);
			//ȡ��Ȩֵ��С�Ķ�����
			Node right = nodes.get(nodes.size()-2);
			//����һ���µĶ�����
			Node parent = new Node(left.value+right.value);
			//��ȥȡ���������������Ƴ�
			nodes.remove(left);
			nodes.remove(right);			
			//����ԭ���Ķ�����������
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
