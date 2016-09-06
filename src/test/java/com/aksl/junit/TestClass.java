package com.aksl.junit;

import java.lang.reflect.Method;

public class TestClass {
	public static void main(String[] args) throws Throwable, SecurityException {
		/*****************自动装箱 /拆箱机制*****************/
//		Integer a = new Integer(3);
//        Integer b = 3;                  // 将3自动装箱成Integer类型
//        int c = 3;
//        System.out.println(a == b);     // false 两个引用没有引用同一对象
//        System.out.println(a == c);     // true a自动拆箱成int类型再和c比较
//		
//		Integer f1=100,f2=100,f3=150,f4=150;
//		System.out.println(f1==f2);
//		System.out.println(f3==f4);
//		System.out.println(f1.equals(f2));
//		System.out.println(f3.equals(f4));
//		LocalDateTime lt = LocalDateTime.now();
//		System.out.println(9<<3);
		
//		String str = "hello";
//        Method m = str.getClass().getMethod("toUpperCase");
////        System.out.println(m.invoke(str));  // HELLO
//        System.out.println(str.hashCode());
        
        
        
//		  int a=20,b=30;
//		  b=a*b;
//		  a=b/a;
//		  b=b/a;
//		  System.out.println("a:"+a+"/b:"+b);
		  
		  
		  int a=1,b=1;
		  System.out.println((a+"").hashCode());
		  System.out.println((b+"").hashCode());
	}
}
