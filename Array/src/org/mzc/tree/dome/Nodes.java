package org.mzc.tree.dome;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//赫夫曼树编码
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
			//进行赫夫曼编码
			byte[] b = huffmanZip(bytess);
	}


	/**
	 * 进行赫夫曼编码压缩的方法
	 * @param bytess
	 * @return
	 */
	private static byte[] huffmanZip(byte[] bytess) {
		//先统计每一个byte出现的次数，并放入一个集合中
		List<Nodes> nodes = getNodes(bytess);
		//创建一个赫夫曼树
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
	 * 创建赫夫曼树
	 * @param nodes
	 * @return
	 */
	private static Nodes createHuffmanTree(List<Nodes> nodes) {
		while(nodes.size()>1) {
			//排序
			Collections.sort(nodes);
			//取出连个权值最低的二叉树
			Nodes left = nodes.get(nodes.size()-1);
			Nodes right = nodes.get(nodes.size()-2);
			//创建一棵新的二叉树
			Nodes parent = new Nodes(null,left.weight+right.weight);
			parent.left = left;
			parent.right = right;
			//把前面取出来的两棵二叉树删除
			nodes.remove(left);
			nodes.remove(right);
			//把创建的二叉树放入集合中
			nodes.add(parent);
		}
		return nodes.get(0);
	}


/**
 * 把byte 数组转换为node集合
 * @param bytess
 * @return
 */
	private static List<Nodes> getNodes(byte[] bytess) {
		List<Nodes> nodes = new ArrayList<>();
		//存储每一个byte出现了多少次
		Map<Byte,Integer> counts = new HashMap<>();
		//统计每一个byte出现的次数
		for(byte b:bytess) {
			Integer count = counts.get(b);
			if(count == null) {
				counts.put(b,1);
			}else {
				counts.put(b,count+1);
			}
		}
		//把每一个键值对转为一个node对象
		for(Map.Entry<Byte,Integer> entry:counts.entrySet()) {
			nodes.add( new Nodes(entry.getKey(),entry.getValue()));
		}
		
		return nodes;
	}




}
