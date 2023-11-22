package com.FileHandling.java;

import java.io.File;
import java.util.Scanner;

public class RenameFile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter old File: ");
		String oldFile = sc.nextLine();
		
		System.out.println("Enter new File: ");
		String newFile = sc.nextLine();
		
		renameName(oldFile, newFile);
		
		sc.close();
		
	}
		public static void renameName(String oldFile, String newFile) {
			
			File of = new File("C:\\Users\\Charan\\OneDrive\\Desktop\\"+oldFile); 
			
			File nf = new File("C:\\Users\\Charan\\OneDrive\\Desktop\\"+newFile); 
			
			if(of.renameTo(nf)) {
				System.out.println("File Rename Success");
			}
			else {
				System.out.println("Failed to Rename");
			}
			
			
		}

	

}
