package com.chapter1.arrayandstring;

public class Q9_StringRotation {

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
		String x = "";
		String y = "";
		int i = 0;
		int j = 0;
		for(i = 0 ; i < s1.length(); i++){
			x = s1.substring(0, i);
			y = s1.substring(i, s1.length());
			String first = x.concat(y);
			String second = y.concat(x);
			
			if(first.equals(s2)||second.equals(s2)){
				return true;
			}
		}
		
		
		
		return false;
	}

}
