package com.biubiu.collection;

import java.util.ArrayList;
import java.util.Collection;

import com.biubiu.bean.Student;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class Demo2_Collection {
	
	
	public static void main(String[] args) {
		//demo1();
		Collection c = new ArrayList();
		c.add(new Student("张三", 23));
		c.add(new Student("李四", 24));
		c.add(new Student("王五", 25));
		c.add(new Student("赵六", 26));
		
		System.out.println(c);
		
		Object[] arr = c.toArray();
		for (int i = 0; i < arr.length; i++) {
			Student s = (Student)arr[i];
			System.out.println(s.getName() + "..." + s.getAge());
		}
	}

	public static void demo1() {
		Collection c = new ArrayList();
		boolean b1 = c.add("abc");
		boolean b2 = c.add(true);
		boolean b3 = c.add(100);
		boolean b4 = c.add(new Student("张三", 23));
		boolean b5 = c.add("abc");
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
		
		System.out.println(c);
		System.out.println(c.isEmpty());
		
		c.clear();
		System.out.println(c);
		System.out.println(c.isEmpty());
	}

}
