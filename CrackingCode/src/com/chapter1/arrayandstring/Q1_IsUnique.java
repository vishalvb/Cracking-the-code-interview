package com.chapter1.arrayandstring;

import java.util.Hashtable;

public class Q1_IsUnique {

	public static void main(String []args){
		StringBuilder word = new StringBuilder();
		String words = "abcdef";
		word = getStringBuilder(words);
		Hashtable<String, Integer> hash = new Hashtable<>();
		int size = word.length();
		for(int i = 0; i < size; i++){
			String key = word.substring(i, i + 1);
			int value = key.hashCode() % size;
			hash.put(key, value);
		}
		if(size == hash.values().size()){
			System.out.println("All the charaters in the String are unique");
		}
		else{
			System.out.println("All the characters in the String are not unique");
		}
	}

	private static StringBuilder getStringBuilder(String words) {
		// TODO Auto-generated method stub
		StringBuilder sentence = new StringBuilder();
		int size = words.length();
		for(int i = 0 ; i < size ; i++){
			sentence.append(words.substring(i, i+1));
		}
		return sentence;
	}
}
