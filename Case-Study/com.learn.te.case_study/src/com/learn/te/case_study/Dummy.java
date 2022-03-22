package com.learn.te.case_study;

public class Dummy {

	public static void main(String[] args) {
		
		String[] strArray3 = { "R", "S", "T" };
		boolean found = false;
		int index = 0;
		String s = "S";
		for (int i = 0; i < strArray3.length; i++) {
		if(s.equals(strArray3[i])) {
		index = i; found = true; break;
		}
		}
		if(found)
		System.out.println(s +" found at the index "+index);
		else
		System.out.println(s +" not found in the array");
		


	}

}
