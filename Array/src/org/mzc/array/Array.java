package org.mzc.array;

public class Array {
	
	//数组线性查找
	public static void arr() {
		int arr[] = new int[] {1,2,3,4,5,6,7,8,9};
		int target = 2;
		int index = -1;
		for(int i = 0;i<arr.length-1;i++) {
			if(target==arr[i]) {
				index = i;
				break;
			}
		}
		System.out.println("index:"+index);
		
	}
	
	
	//二分查找
	public static void  array() {
		//目标元素
		int[] arr = new int[] {1,2,3,4,5,6,7,8,9};
		//目标元素
		int target = 0;
		//记录开始位置
		int begin = 0;
		//记录结束位置
		int end = arr.length-1;
		//记录中间位置
		int mid = (begin+end)/2;
		//记录目标位置
		int index = -1;
		//循环查找
		while(true) {
			//什么情况下没有这个元素？
			//开始在结束位置之后，没有这个元素
			if(begin>end) {
				break;
			}
			
			//判断中间的这个元素是不是要查找的元素
			if(arr[mid]==target) {
				index = mid;
				break;
			}else {
				//判断中间这个元素是不是比目标元素大
				if(arr[mid]>target) {
					//把结果位置调整到中间位置的前一位置
					end = mid-1;
					//中间这个元素比目标元素要小
				}else {
					//把开始位置调整到中间位置的后一个位置
					begin = mid+1;
				}
				//取出新的中间位置
				mid = (begin+end)/2;
			}
		}
		System.out.println("该元素的位置是："+index);
	}
	
	
	
	public static void main(String[] args) {
//		Array arr = new Array();
//		arr.array();
		arr();
	}

}
