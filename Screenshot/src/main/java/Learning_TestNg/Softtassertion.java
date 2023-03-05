package Learning_TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softtassertion {
	
	@Test
	public void b1()
	{
		SoftAssert S=new SoftAssert();
		int i=10; int j=20;	
		System.out.println("Sum is :" + (i+j));
		Assert.assertTrue(true);
		System.out.println("Hardssert cond fails");
		
		S.assertTrue(true);
		System.out.println("1st Condn");
		S.assertTrue(true);
		System.out.println("2nd Condn");
		
		Assert.assertTrue(true);
		System.out.println("Hardssert cond fails");
		S.assertTrue(true);
		System.out.println("3rd Condn");
		S.assertAll();
		
	}
	@Test
	public void b2()
	{
		SoftAssert S=new SoftAssert();	
		S.assertTrue(true);
		System.out.println("Condnjlk;klhhlk;l';';]");
		S.assertAll();
		
	}
}
