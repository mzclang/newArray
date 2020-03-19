package org.mzc.tree2;

public class ThreadedNode {
	//节点的权
	int value;
	//左儿子
	ThreadedNode leftNode;
	//右节点
	ThreadedNode rightNode;
	//标识指针类型
	int leftType;
	int rightType;
	
	
	
	public ThreadedNode(int value) {
		this.value = value;
	}
	//设置左儿子
	public void setleftNode(ThreadedNode leftNode) {
		this.leftNode = leftNode;
	}
	//设置右儿子
	public void setrightNode(ThreadedNode rightNode) {
		this.rightNode = rightNode;
	}
	
	//前序遍历
	public void frontShow() {
		//先遍历当前节点的内容
		System.out.print(value+" ");
		//左节点
		if(leftNode!=null) {
			leftNode.frontShow();
		}
		//右节点
		if(rightNode!=null) {
			rightNode.frontShow();
		}
	}
	//中序遍历
	public void midShow() {
		if(leftNode!=null) {
			leftNode.midShow();
		}
		System.out.print(value+" ");
		if(rightNode!=null) {
			rightNode.midShow();
		}
	}
	//后序遍历
	public void afterShow() {
		if(leftNode!=null) {
			leftNode.afterShow();
		}
		if(rightNode!=null) {
			rightNode.afterShow();
		}
		System.out.print(value+" ");
	}
	//前序查找
	public ThreadedNode frontSearch(int i) {
		ThreadedNode target = null;
		//当前节点的值
		if(this.value == i) {
			return this;
		//当前节点的值不是要查找的节点
		}else {
			//查找左儿子
			if(leftNode!=null) {
				//有可能可以查找到，也可能查找不到，查找不到的话。target还是一个null
				target = leftNode.frontSearch(i);
			}
			//如果不为空，说明在左儿子中已经找到
			if(target!=null) {
				return target;
			}
			//查找右儿子
			if(rightNode != null) {
				target = rightNode.frontSearch(i);
			}
		}
		
		
		return target;
	}
	//中序查找
	public ThreadedNode midSearch(int i) {
		ThreadedNode target =  null;
		if(leftNode!=null) {
			 target = leftNode.midSearch(i);
		}
		if(this.value == i) {
			return this;
		}
		
		if(target!=null) {
			return target;
		}
		
		if(rightNode!=null) {
			target =  rightNode.midSearch(i);
		}
			
		
		return target;
	}
	public ThreadedNode afterSearch(int i) {
		ThreadedNode target = null;
		if(rightNode!=null) {
			target  = rightNode.afterSearch(i);
		}
		
		if(target !=null) {
			return target;
		}
		
		if(leftNode!=null) {
			target = leftNode.afterSearch(i);
		}
		
		if(this.value == i) {
			return this;
		}
		return target;
	}
	//删除一个子树
	public void delete(int i) {
		ThreadedNode parent = this;
		//判断左儿子
		if(parent.leftNode!=null&&parent.leftNode.value==i) {
			parent.leftNode=null;
			return;
		}
		//判断右儿子
		if(parent.rightNode!=null&&parent.rightNode.value==i) {
			parent.rightNode=null;
			return;
		}
		
		//递归检查并删除左儿子
		parent = leftNode;
		if(parent!=null) {
			parent.delete(i);
		}
		//递归检查并删除右儿子
		parent = rightNode;
		if(parent!=null) {
			parent.delete(i);
		}
		
		
	}
}
