package org.mzc.tree.dome;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//�շ���������
public class Nodes implements Comparable<Nodes> {
	Byte data;
	int weight;
	Nodes left;
	Nodes right;
	public Nodes(Byte data,int weight) {
		this.data = data;
		this.weight = weight;
	}
	
	
	public static void main(String[] args) {
			String msg ="can you can a can as a can canner can a can ";
			byte[] bytess = msg.getBytes();
			//���кշ�������
			byte[] b = huffmanZip(bytess);
	}


	/**
	 * ���кշ�������ѹ���ķ���
	 * @param bytess
	 * @return
	 */
	private static byte[] huffmanZip(byte[] bytess) {
		//��ͳ��ÿһ��byte���ֵĴ�����������һ��������
		List<Nodes> nodes = getNodes(bytess);
		//����һ���շ�����
		Nodes tree = createHuffmanTree(nodes);
		System.out.println(tree);
		System.out.println(tree.left);
		System.out.println(tree.right);
		return null;
	}

	
	@Override
	public int compareTo(Nodes o) {
		return o.weight-this.weight;
	}
	
	@Override
	public String toString() {
		return "Node[data="+data+",weight="+weight+"]";
	}
	/**
	 * �����շ�����
	 * @param nodes
	 * @return
	 */
	private static Nodes createHuffmanTree(List<Nodes> nodes) {
		while(nodes.size()>1) {
			//����
			Collections.sort(nodes);
			//ȡ������Ȩֵ��͵Ķ�����
			Nodes left = nodes.get(nodes.size()-1);
			Nodes right = nodes.get(nodes.size()-2);
			//����һ���µĶ�����
			Nodes parent = new Nodes(null,left.weight+right.weight);
			parent.left = left;
			parent.right = right;
			//��ǰ��ȡ���������ö�����ɾ��
			nodes.remove(left);
			nodes.remove(right);
			//�Ѵ����Ķ��������뼯����
			nodes.add(parent);
		}
		return nodes.get(0);
	}


/**
 * ��byte ����ת��Ϊnode����
 * @param bytess
 * @return
 */
	private static List<Nodes> getNodes(byte[] bytess) {
		List<Nodes> nodes = new ArrayList<>();
		//�洢ÿһ��byte�����˶��ٴ�
		Map<Byte,Integer> counts = new HashMap<>();
		//ͳ��ÿһ��byte���ֵĴ���
		for(byte b:bytess) {
			Integer count = counts.get(b);
			if(count == null) {
				counts.put(b,1);
			}else {
				counts.put(b,count+1);
			}
		}
		//��ÿһ����ֵ��תΪһ��node����
		for(Map.Entry<Byte,Integer> entry:counts.entrySet()) {
			nodes.add( new Nodes(entry.getKey(),entry.getValue()));
		}
		
		return nodes;
	}




}
