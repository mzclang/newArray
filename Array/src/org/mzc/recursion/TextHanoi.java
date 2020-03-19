package org.mzc.recursion;

public class TextHanoi {
	
	/**
	 * 
	 * @param n 共有N个盘子
	 * @param from 开始的柱子
	 * @param in 中间的柱子
	 * @param to 目标柱子
	 * 无论多少个盘子，都认为只要两个盘子，上面的所有盘子和下面的一个盘子
	 */
	public static void hanoi(int n,char from, char in,char to) {
		if(n==1) {
			System.out.println("第1个盘子，从"+from+"移到"+to);
		//无论多少个盘子，都认为只要两个盘子，上面的所有盘子和下面的一个盘子
		}else {
			//移动上面所有的盘子到中间位置
			hanoi(n-1,from,to,in);
			//移动下面的盘子
			System.out.println("第"+n+"个盘子，从"+from+"移到"+to);
			//把上面的所有盘子从中间位置移动到目标位置
			hanoi(n-1,in,from,to);
			
		}
	}

	public static void main(String[] args) {
		hanoi(5,'A','B','C');
	}
	
}
