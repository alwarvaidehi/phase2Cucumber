package stepsAmazon;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksTagStepsAmazon {
	@Before(order=0)
	public void openBrowser()
	{
		System.out.println("opening the amazon website");
		
	}
	@Before(order=1)
	public void creatingaccount()
	{
		System.out.println("creating account in  the amazon website");
		
	}
   @After(order=1)
   public void searcg()
   {
	   System.out.println("Successfully searched in the amazon website");
   }
   @After(order=0)
   public void CloseBrowser()
   {
	   System.out.println("closing the browser");
   }
}
