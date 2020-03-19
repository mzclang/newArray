package org.mzc.tree2;

public class ThreadedNode {
	//�ڵ��Ȩ
	int value;
	//�����
	ThreadedNode leftNode;
	//�ҽڵ�
	ThreadedNode rightNode;
	//��ʶָ������
	int leftType;
	int rightType;
	
	
	
	public ThreadedNode(int value) {
		this.value = value;
	}
	//���������
	public void setleftNode(ThreadedNode leftNode) {
		this.leftNode = leftNode;
	}
	//�����Ҷ���
	public void setrightNode(ThreadedNode rightNode) {
		this.rightNode = rightNode;
	}
	
	//ǰ�����
	public void frontShow() {
		//�ȱ�����ǰ�ڵ������
		System.out.print(value+" ");
		//��ڵ�
		if(leftNode!=null) {
			leftNode.frontShow();
		}
		//�ҽڵ�
		if(rightNode!=null) {
			rightNode.frontShow();
		}
	}
	//�������
	public void midShow() {
		if(leftNode!=null) {
			leftNode.midShow();
		}
		System.out.print(value+" ");
		if(rightNode!=null) {
			rightNode.midShow();
		}
	}
	//�������
	public void afterShow() {
		if(leftNode!=null) {
			leftNode.afterShow();
		}
		if(rightNode!=null) {
			rightNode.afterShow();
		}
		System.out.print(value+" ");
	}
	//ǰ�����
	public ThreadedNode frontSearch(int i) {
		ThreadedNode target = null;
		//��ǰ�ڵ��ֵ
		if(this.value == i) {
			return this;
		//��ǰ�ڵ��ֵ����Ҫ���ҵĽڵ�
		}else {
			//���������
			if(leftNode!=null) {
				//�п��ܿ��Բ��ҵ���Ҳ���ܲ��Ҳ��������Ҳ����Ļ���target����һ��null
				target = leftNode.frontSearch(i);
			}
			//�����Ϊ�գ�˵������������Ѿ��ҵ�
			if(target!=null) {
				return target;
			}
			//�����Ҷ���
			if(rightNode != null) {
				target = rightNode.frontSearch(i);
			}
		}
		
		
		return target;
	}
	//�������
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
	//ɾ��һ������
	public void delete(int i) {
		ThreadedNode parent = this;
		//�ж������
		if(parent.leftNode!=null&&parent.leftNode.value==i) {
			parent.leftNode=null;
			return;
		}
		//�ж��Ҷ���
		if(parent.rightNode!=null&&parent.rightNode.value==i) {
			parent.rightNode=null;
			return;
		}
		
		//�ݹ��鲢ɾ�������
		parent = leftNode;
		if(parent!=null) {
			parent.delete(i);
		}
		//�ݹ��鲢ɾ���Ҷ���
		parent = rightNode;
		if(parent!=null) {
			parent.delete(i);
		}
		
		
	}
}
