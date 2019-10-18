package SamplePackage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ValidatiDropdown extends MenuCheck{


	
	@Test
	  public void ValidateDropdown0(){
		
		  driver.findElement(By.linkText("Admin")).click();
		  driver.findElement(By.id("menu_admin_UserManagement")).click();
	      System.out.println("Selected User Management");
	      driver.findElement(By.id("menu_admin_viewSystemUsers")).click();
	      System.out.println("Selected Users");
	      
	      driver.findElement(By.id("menu_admin_Job")).click();
	      System.out.println("Selected Job");
	      driver.findElement(By.id("menu_admin_viewJobTitleList")).click();
	      System.out.println("Selected Job Titles");
	      
	      driver.findElement(By.id("menu_admin_Job")).click();
	      System.out.println("Selected Job");
	      driver.findElement(By.id("menu_admin_viewPayGrades")).click();
	      System.out.println("Selected Pay Grades");
	      
	      driver.findElement(By.id("menu_admin_Job")).click();
	      System.out.println("Selected Job");
	      driver.findElement(By.id("menu_admin_employmentStatus")).click();
	      System.out.println("Selected Employment Status");
	      
	      driver.findElement(By.id("menu_admin_Job")).click();
	      System.out.println("Selected Job");
	      driver.findElement(By.id("menu_admin_jobCategory")).click();
	      System.out.println("Selected Job Categories");
	      
	      driver.findElement(By.id("menu_admin_Job")).click();
	      System.out.println("Selected Job");
	      driver.findElement(By.id("menu_admin_workShift")).click();
	      System.out.println("Selected Work Shifts");
	      
	}

}
