package org.mzc.recursion;

public class TextHanoi {
	
	/**
	 * 
	 * @param n ����N������
	 * @param from ��ʼ������
	 * @param in �м������
	 * @param to Ŀ������
	 * ���۶��ٸ����ӣ�����ΪֻҪ�������ӣ�������������Ӻ������һ������
	 */
	public static void hanoi(int n,char from, char in,char to) {
		if(n==1) {
			System.out.println("��1�����ӣ���"+from+"�Ƶ�"+to);
		//���۶��ٸ����ӣ�����ΪֻҪ�������ӣ�������������Ӻ������һ������
		}else {
			//�ƶ��������е����ӵ��м�λ��
			hanoi(n-1,from,to,in);
			//�ƶ����������
			System.out.println("��"+n+"�����ӣ���"+from+"�Ƶ�"+to);
			//��������������Ӵ��м�λ���ƶ���Ŀ��λ��
			hanoi(n-1,in,from,to);
			
		}
	}

	public static void main(String[] args) {
		hanoi(5,'A','B','C');
	}
	
}
