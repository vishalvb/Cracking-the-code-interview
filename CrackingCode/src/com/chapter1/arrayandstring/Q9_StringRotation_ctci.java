package com.chapter1.arrayandstring;

public class Q9_StringRotation_ctci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "waterbottle";
		String s2 = "erbottlewat";
		System.out.println(stringRotate(s1,s2));
	}

	private static boolean stringRotate(String s1, String s2) {
		// TODO Auto-generated method stub
		if(s1.length() != s2.length()){
			return false;
		}
		String x = s1+s1;
		return x.contains(s2);
	}

}
