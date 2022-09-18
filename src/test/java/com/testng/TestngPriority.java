package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngPriority {
//	@Test(priority=6)
//    public void c_method(){
//    System.out.println("I'm in method C");
//    }
//    @Test(priority=9)
//    public void b_method(){
//    System.out.println("I'm in method B");
//    }
//    @Test(priority=1)
//    public void a_method(){
//    System.out.println("I'm in method A");
//    }
//    @Test(priority=0)
//    public void e_method(){
//    System.out.println("I'm in method E");
//    }
//    @Test(priority=3)
//    public void d_method(){
//    System.out.println("I'm in method D");
//    }
	
	@Test(priority = 1)
	public void addTest() {
		int a = 100;
		int b = 200;
		int c = a + b;
		System.out.println(c);
		Assert.assertEquals(c, 300);
	}
	@Test(priority = 2)
	public void subTest() {
		int a = 100;
		int b = 200;
		int c = b - a;
		System.out.println(c);
		Assert.assertEquals(c, 100);
	}
	@Test(priority = 3)
	public void mulTest() {
		int a = 10;
		int b = 20;
		int c = a * b;
		System.out.println(c);
		Assert.assertEquals(c, 200);
	}
}
