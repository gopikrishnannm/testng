package annotationtest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationTest1 {
	
  @Test
  public void fun1() {
	  System.out.println("method 1");
  }
  
  @Test
  public void fun2() {
	  System.out.println("method 2");
  }
  
  
//  @BeforeMethod
//  public void beforeMethod() {
//	  System.out.println("beforeMethod1");
//  }
//
//  @AfterMethod
//  public void afterMethod() {
//	  System.out.println("afterMethod1");
//  }

//  @BeforeClass
//  public void beforeClass1() {
//	  System.out.println("beforeClass1");
//  }
//
//  @AfterClass
//  public void afterClass1() {
//	  System.out.println("afterClass1");
//  }
  

  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforeTest1");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("afterTest1");
  }

//  @BeforeSuite
//  public void beforeSuite() {
//	  System.out.println("beforeSuite");
//  }
//
//  @AfterSuite
//  public void afterSuite() {
//	  System.out.println("afterSuite");
//  }

}
