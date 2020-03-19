package org.mzc.sort;

import java.util.Arrays;

import org.mzc.queue.MyQueue;
//使用队列的基数排列
public class RedixQueueSort2 {

	public static void readixSort(int[] arr) {
		//存储数组中的最大 的数字
		int max = Integer.MIN_VALUE;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		//计算最大数字是极为数
		int maxLength = (max+"").length();
		//用于临时存储数据的队列的数组
		MyQueue[] temp = new MyQueue[10];
		//为队列数组赋值
		for(int i  = 0;i<temp.length;i++) {
			temp[i]  = new MyQueue();
		}
		
		//用于记录在temp中相应的数组中存放的数字的数量
		int[] counts = new int[10];
		
		//根据最大长度的数决定比较的次数
		for(int i = 0,n = 1;i<maxLength;i++,n*=10) {
			//把每一个数字分别计算余数
			for(int j = 0;j<arr.length;j++ ) {
				//计算余数
				int ys = arr[j]/n%10;
				//把当前遍历的数据放入指定的队列中
				temp[ys].add(arr[j]);
			}
			//记录取出的元素需要存放 的位置
			int index= 0;
			//把所有队列中的数字取出来
			for(int k = 0;k<temp.length;k++) {
				//循环取出元素
				while(!temp[k].isEmpty()) {
					//取出元素
					arr[index] = temp[k].poll();

					//记录下一个位置
					index++;
		
					//把数量置为0
					counts[k] = 0;
				}
			}
		}
		
	}

	public static void main(String[] args) {
		int[] arr = new int[] {2,22,222,5,52,520,89,69,34,1,9,7};
		readixSort(arr);
		System.out.println(Arrays.toString(arr));
	
	}

}
