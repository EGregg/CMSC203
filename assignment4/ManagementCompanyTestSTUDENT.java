

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ManagementCompanyTestSTUDENT {
	ManagementCompany m;
	
	@Before
	public void setUp() throws Exception {
		//student create a management company
		m = new ManagementCompany("Buggle", "10000",2);
		
		//student add three properties, with plots, to mgmt co
	    m.addProperty("Rockville", "Maryland", 1, "Edward Gregg",3,2,3,3);
        m.addProperty("Leeson Heights", "Arlington", 2, "Stephanie Gregg",5,2,1,1);
        m.addProperty("Sunday Plains", "Virgina Beach", 3, "Luciana Gregg",7,2,3,3);
		
	}

	@After
	public void tearDown() {
		//student set mgmt co to null 
		m = null;
	}

	@Test
	public void testAddPropertyDefaultPlot() {
		//student should add property with 4 args & default plot (0,0,1,1)
		assertEquals(m.addProperty("Detroit", "Rock City", 20, "Michigan"),0,1);
		//student should add property with 8 args
		assertEquals(m.addProperty("Xaviers", "Massachusettes", 30, "Beast", 8, 9, 3, 3), 2,4);
		//student should add property that exceeds the size of the mgmt co array and can not be added, add property should return -1
		assertEquals(m.addProperty("National", "Zoo", 40, "DC", 6,3,3,3), -1, 0);
	}
 
	@Test
	public void testMaxRentProp() {
		//student should test if maxRentProp contains the maximum rent of properties
	    String maxRentPropString = m.MaxRentProperty().split("\n")[3];
	    assertTrue(maxRentPropString.contains("40.0"));
		
	}

	@Test
	public void testTotalRent() {
		//student should test if totalRent returns the total rent of properties
		assertEquals(m.totalRent(),96,0);
	}

 }
