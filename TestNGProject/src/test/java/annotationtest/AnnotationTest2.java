package annotationtest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationTest2 {

	@Test
	public void fun3() {
		System.out.println("method 3");
	}

	@Test
	public void fun4() {
		System.out.println("method 4");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest2");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("afterTest2");
	}
//
//	@BeforeMethod
//	public void beforeMethod() {
//		System.out.println("beforeMethod2");
//	}
//
//	@AfterMethod
//	public void afterMethod() {
//		System.out.println("afterMethod2");
//	}
//	@BeforeClass
//	public void beforeClass2() {
//		System.out.println("beforeClass2");
//	}
//
//	@AfterClass
//	public void afterClass2() {
//		System.out.println("afterClass2");
//	}
}
