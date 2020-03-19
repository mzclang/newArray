package org.mzc.string;

public class Char {
	public void Solution2(char[] a,int offset) {
		char[] d = new  char[a.length];
		int b = a.length-offset;
		for(int i = 0;i<offset;i++) {
			d[i] = a[b];
			b++;
		}
		int f = 0;
		for(int i = offset;i<a.length;i++) {
			d[i] = a[f];
			f++;
		}
		for(int i = 0;i<d.length;i++) {
			System.out.print(d[i]);
		}
	}
	
	
	
	public void Solution(String a,int offset) {
			String b = "";
			String c = "";
			c = a.substring(a.length()-offset);
			b = a.substring(0,a.length()-offset);
			System.out.println(c+b);
		
	}
	public static void main(String[] args) {
		Char c = new Char();
//		c.Solution("abcdefg", 3);
		char[] as = {'a','b','c','d','e','f','g'};
		c.Solution2(as, 3);
	}
}
