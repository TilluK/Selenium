package Learning_TestNg;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
	
	
	@Test(priority=3, enabled=true, alwaysRun=true)
	public void a1() {
		String act="Snehal";
		String dup="Snehl";
		String act1="Mayur";
		String dup1="Mayur";
	//	Assert.assertEquals(act, dup);  //1st Cond
		Assert.assertEquals(act1, dup1); //2nd Cond
		Assert.fail("Deliberately Failing");
	// Assert.assertEquals(act, dup, null);	 //3rd Cond
		//In HardAssert , if 1st cond failed then it will not execute next cond in same TC's & switch to next TC
	}
	@Test(priority=2, enabled=true)
	public void a2() {
		String act="Snehal";
		String dup="Snehl";
		String act1="Mayur";
		String dup1="Mayur";
		Assert.assertEquals(act1, dup1);
		
	}
	@Test(priority=1, enabled=true)
	public void a3() {
		String act="Snehal";
		String dup="Snehl";
		String act1="Mayur";
		String dup1="Mayur";
		Assert.assertEquals(act1, dup1);

	}}
