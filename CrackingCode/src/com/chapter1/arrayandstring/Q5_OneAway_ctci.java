package com.chapter1.arrayandstring;

public class Q5_OneAway_ctci {

	public static void main(String args[]){
		String s1 = "pale";
		String s2 = "ple";
		System.out.println(oneAway(s1,s2));
	}

	private static boolean oneAway(String s1, String s2) {
		if(Math.abs(s1.length() - s2.length()) > 1){
			return false;
		}
		if(s1.length() == s2.length()){
			return replace(s1,s2);
		}
		String shorter = s1.length() < s2.length() ? s1 : s2;
		String longer = s1.length() < s2.length() ? s2 : s1;
		
		return insertRemove(shorter, longer);
		
		
	}

	private static boolean insertRemove(String shorter, String longer) {
		int check = 0;
		int index1 = 0;
		int index2 = 0;
		while(index2 < longer.length() && index1 < shorter.length()){
			if(shorter.charAt(index1) != longer.charAt(index2)){
				check++;
				if(check > 1){
					return false;
				}
				if(shorter.length() == longer.length()){
					index1++;
				}
			}
			else{
				index1++;
			}
			index2++;
			
		}
		return true;
	}

	private static boolean replace(String s1, String s2) {
		// TODO Auto-generated method stub
		int check = 0;
		int length1 = s1.length();
		for(int i = 0 ; i < length1; i++){
			if(s1.charAt(i)!=s2.charAt(i)){
				check++;
				if(check > 1){
					return false;
				}
			}
		}
		return true;
	}
}
