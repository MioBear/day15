package com.biubiu.collection;

import com.biubiu.bean.Student;

public class Demo1_Array {
	public static void main(String args[]) {
		Student[] arr = new Student[5];
		arr[0] = new Student("张三", 23);
		arr[1] = new Student("李四", 24);
		arr[2] = new Student("王五", 25);
		
		

		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
	
}
