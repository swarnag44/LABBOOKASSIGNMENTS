package com.cg.lbd.ui;

public class Lab3Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		int line, word, ch;
		line =1; 
		word = ch = 1;
		System.out.print("\nEnter File name: ");
		String str="im swarna rekha.hpy to see u \n "
				+ "and im the new analyst herei know java very well\n" +"im here to help u";
		
		for(int i=0;i<str.length(); i++){
			if(str.charAt(i)=='\n'){
				line++;
				word++;
			}else{
				if(str.charAt(i)==' '||str.charAt(i)=='\t'){
					word++;
					ch++;
				}else {
					ch++;
				}
			}
		}

		System.out.println("\nNumber of lines : "+line);
		System.out.println("\nNumber of words : "+word);
		System.out.println("\nNumber of characters : "+ch);

	}

}
