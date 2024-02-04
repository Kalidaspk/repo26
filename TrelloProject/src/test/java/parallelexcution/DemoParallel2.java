package parallelexcution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoParallel2
{
	@Test
	public void createCustomer()
	{
		Reporter.log("customer created",true);
	}
	public void modifyCustomer()
	{
		Reporter.log("modify done",true);
	}
	public void deleteCustomer()
	{
		Reporter.log("delete sucussfully",true);
	}
	

}
