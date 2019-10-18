package SamplePackage;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenuCheck extends Login{

	@Test
	  public void Menucheck0(){
	      String Text0 = driver.findElement(By.linkText("Dashboard")).getText();
	      String expectedname0 = "Dashboard";
	      Assert.assertEquals(Text0, expectedname0);
	      System.out.println("Title of current page:" + Text0);
	      	      
	}
	
	@Test
		  public void Menucheck1(){
	      driver.findElement(By.linkText("Admin")).click();
	      String Textadmin1 = driver.findElement(By.xpath("//div[contains(@class,'head')]/h1")).getText();
	      String expectedname1 = "System Users";
	      Assert.assertEquals(Textadmin1, expectedname1);
	      System.out.println("Title of current page:" + Textadmin1);
	     
	}      
	      
	@Test
		  public void Menucheck2(){
	      driver.findElement(By.linkText("PIM")).click();
	      String Textadmin2 = driver.findElement(By.xpath("//div[contains(@class,'head')]/h1")).getText();
	      String expectedname2 = "Employee Information";
	      Assert.assertEquals(Textadmin2, expectedname2);
	      System.out.println("Title of current page:" + Textadmin2);
	}    
	      
	@Test
		  public void Menucheck3(){
	      driver.findElement(By.linkText("Leave")).click();
	      String Textadmin3 = driver.findElement(By.xpath("//div[contains(@class,'head')]/h1")).getText();
	      String expectedname3 = "Leave List";
	      Assert.assertEquals(Textadmin3, expectedname3);
	      System.out.println("Title of current page:" + Textadmin3);
	}     
	      
	@Test
		  public void Menucheck4(){
	      driver.findElement(By.linkText("Time")).click();
	      String Textadmin4 = driver.findElement(By.xpath("//div[contains(@class,'head')]/h1")).getText();
	      String expectedname4 = "Select Employee";
	      Assert.assertEquals(Textadmin4, expectedname4);
	      System.out.println("Title of current page:" + Textadmin4);
	}      
	      
	@Test 
		  public void Menucheck5(){
	      driver.findElement(By.linkText("Recruitment")).click();
	      String Textadmin5 = driver.findElement(By.xpath("//div[contains(@class,'head')]/h1")).getText();
	      String expectedname5 = "Candidates";
	      Assert.assertEquals(Textadmin5, expectedname5);
	      System.out.println("Title of current page:" + Textadmin5);
	}     
	      
	@Test 
		  public void Menucheck6(){
	      driver.findElement(By.linkText("Performance")).click();
	      String Textadmin6 = driver.findElement(By.xpath("//div[contains(@class,'head')]/h1")).getText();
	      String expectedname6 = "Candidates";
	      Assert.assertEquals(Textadmin6, expectedname6);
	      System.out.println("Title of current page:" + Textadmin6);
	}      
	      
	@Test 
		  public void Menucheck7(){
	      driver.findElement(By.linkText("Directory")).click();
	      String Textadmin7 = driver.findElement(By.xpath("//div[contains(@class,'head')]/h1")).getText();
	      String expectedname7 = "Search Directory";
	      Assert.assertEquals(Textadmin7, expectedname7);
	      System.out.println("Title of current page:" + Textadmin7);
	}      
	      
	@Test 
		  public void Menucheck8(){
	      driver.findElement(By.linkText("Maintenance")).click();
	      String Textadmin8 = driver.findElement(By.xpath("//div[contains(@class,'head')]/h1")).getText();
	      String expectedname8 = "Purge Employee Records";
	      Assert.assertEquals(Textadmin8, expectedname8);
	      System.out.println("Title of current page:" + Textadmin8);
	}  
  }
	     
	

