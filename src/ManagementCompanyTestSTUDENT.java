import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ManagementCompanyTestSTUDENT {
	ManagementCompany n;
	
	@Before
	public void setUp() throws Exception {
		//student create a management company
		n= new ManagementCompany("Alliance", "1235",6);
		
		//student add three properties, with plots, to mgmt co
		n.addProperty("Crosstie Drive", "Germantown", 1300.30, "Stan Smith",1,2,3,4);
		n.addProperty("Royal Farms", "Baltimore", 2450, "Anna Taylor",4,2,1,2);
		n.addProperty("Marriot", "Rockville", 1850, "Stevens Steel",5,5,6,4);
	}

	@After
	public void tearDown() {
		//student set mgmt co to null  
		n = null;
	}

	@Test
	public void testAddPropertyDefaultPlot() {
		fail("STUDENT test not implemented yet");
		//student should add property with 4 args & default plot
		assertEquals(n.addProperty("Ramory Palace", "Wheaton", 2000, "Christina McDaniel"),3,0); //should create property with 4 args & default plot (0,0,1,1)
		assertEquals(n.addProperty("Cabin Branch", "Clarksburg", 3000, "Alex Radcliff",3,4,2,2),4,0); //should create property with 8 args
		assertEquals(n.addProperty("Needwood", "Gaitherburg", 2400, "Jim Bo",2,5,1,1),-2,-1);//student should add property that exceeds the size of the mgmt co array and can not be added, add property should return -1	
	}
 
	@Test
	public void testMaxPropertyRent() {
		fail("STUDENT test not implemented yet");
		String maxPropRentArray = n.maxPropertyRent().split("\n")[3];
		//student should test if maxPropertyRent contains the maximum rent of properties
		assertTrue(maxPropRentArray.contains("2150.0"));
	}

	@Test
	public void testTotalRent() {
		fail("STUDENT test not implemented yet");
		//student should test if totalRent returns the total rent of properties
		assertEquals(n.totalRent(),5400.45,0);
	}

 }
