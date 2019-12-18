package mstr.utility;

import mstr.config.Config;

public class CloseBrowser {

	public void closeBrowser()
	{
		Config.driver.close();
	}
}
