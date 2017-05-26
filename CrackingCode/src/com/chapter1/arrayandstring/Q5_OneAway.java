package com.chapter1.arrayandstring;

public class Q5_OneAway {

	public static void main(String[] args) {
		String s1 = "palec";
		String s2 = "paled";
		if(OneAway(s1, s2)){
			System.out.println("True");
		}
		else{
			System.out.println("False");
		}

	}

	private static boolean OneAway(String s1, String s2) {
		int length1 = s1.length();
		int length2 = s2.length();
		if( Math.abs(length1 - length2) > 1){
			System.out.println("inside false");
			return false;
		}
		if(s1.equals(s2)){
			return true;
		}
		if(length1 != length2){
			return remove(s1,s2);
		}
		else{
			return replace(s1,s2);
		}
	}

	private static boolean replace(String s1, String s2) {
		// TODO Auto-generated method stub
		String temp = "";
		int i = 0;
		int j = 0;
		int length1 = s1.length();
		for(i = 0; i< length1; i++){
			temp = "";
			temp = s1.replaceFirst(s1.substring(i, i+1), s2.substring(i, i+1));
			//System.out.println("replace"+temp);
			if(temp.equals(s2)){
				return true;
			}
		}
		
		return false;
	}

	private static boolean remove(String s1, String s2) {
		if(s1.length() > s2.length()){
			int length1 = s1.length();
			int i = 0;
			String temp ="";
			System.out.println(s1.charAt(0));
			for(i = 0; i < length1;i++){
				temp = "";
				for(int j = 0; j < length1;j++){
					if(i != j){
						temp = temp.concat(s1.substring(j, j+1));
					}
				}
				System.out.println("temp="+temp);
				if(temp.equals(s2)){
					return true;
				}
			}
			
		}
		else{
			int length2 = s2.length();
			int i = 0;
			String temp ="";
			System.out.println(s1.charAt(0));
			for(i = 0; i < length2;i++){
				temp = "";
				for(int j = 0; j < length2;j++){
					if(i != j){
						temp = temp.concat(s2.substring(j, j+1));
					}
				}
				System.out.println("temp="+temp);
				if(temp.equals(s1)){
					return true;
				}
			}
			
		}
		return false;
	}

}
