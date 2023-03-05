package Learning_TestNg;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class Icontext {

	@Test
	public void c1(ITestContext it) {
		System.out.println("This is setup of our laptop");
		it.setAttribute("Windows", "ASUS");

	}

	@Test
	public void c2(ITestContext it) {
		String Config = (String) it.getAttribute("Windows");
		System.out.println("The Setup of laptop is :" + Config);
		it.setAttribute("Complex", "Devops + Agile");
	}

	@Test
	public void c3(ITestContext it) {
		String Config1 = (String) it.getAttribute("Complex");
		String Config = (String) it.getAttribute("Windows");
      System.out.println("Setup is  :" + Config1);
      System.out.println("Setup is " + Config);
	}

	@Test
	public void c4() {

	}

}
