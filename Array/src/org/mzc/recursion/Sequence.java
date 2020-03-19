package org.mzc.recursion;

public class Sequence {
	public int Peboracci(int i) {
		if(i==1||i==2) {
			return 1;
		}else {
			return Peboracci(i-1)+Peboracci(i-2);
		}
	}
	

	public static void main(String[] args) {
		Sequence s = new Sequence();
		System.out.println(s.Peboracci(6));
	}

}
