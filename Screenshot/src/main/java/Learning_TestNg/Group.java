package Learning_TestNg;

import org.testng.annotations.Test;


@Test(groups= {"Total Testcases Testing"})   //Includes total Testcases
public class Group {

	@Test(groups={"Regression"})
	
	public void tc1() {

		System.out.println("This is TC1");
	}

	@Test(groups= {"Sanity","Regression"})
	public void tc2() {

		System.out.println("This is TC2");
	}

	@Test(groups= {"Performanace","Regression"})
	public void tc3() {

		System.out.println("This is TC3");
	}

	@Test(groups= {"Sanity"})
	public void tc4() {
		System.out.println("This is TC4");

	}

	@Test(groups= {"Performance"})
	public void tc5() {

		System.out.println("This is TC5");
	}

	@Test(groups= {"Sanity","Performance"})
	public void tc6() {
		System.out.println("This is TC6");

	}

}
