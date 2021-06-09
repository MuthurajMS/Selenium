package org.stepdef;

import org.Base.Baseclass;
import org.junit.After;
import org.junit.Before;

public class Hook extends Baseclass {
@Before
public void starting() {
	Browserlaunch();
	
}

@After
public void end() {
	driver.close();
}
}
