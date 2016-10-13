package by.zhdanovich.air.test;
import java.util.ArrayList;
import java.util.List;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import by.zhdanovich.air.action.ActionAirCompany;
import by.zhdanovich.air.entity.AirCompany;
import by.zhdanovich.air.entity.Airliner;
import by.zhdanovich.air.entity.Freighter;
import by.zhdanovich.air.entity.Plane;

public class ActionAirCompanyTest {	
	public static ActionAirCompany action;
	public static AirCompany company;
	
	@BeforeClass	
	public static void init(){
	company = new AirCompany();
	{      
	company.addPlane(new Airliner(250, 1800, 2330, 22,1));	
    company.addPlane(new Freighter(88, 4000, 3000, 20,6));   	
    company.addPlane(new Airliner(333, 2860, 2800, 15,3));
    company.addPlane(new Airliner(231, 2300, 1800, 27,2));
    }
	action = new ActionAirCompany();
	}
	@AfterClass
	public static void clear(){
		company=null;
		action=null;
	}	
	@Test
	public void calculationOfCapacityTest(){
		int expected = 902;
		int actual = action.calculationOfCapacity(company);
		Assert.assertEquals(expected, actual, 0.01); 
	}
	@Test
	public void calculationOfCarryingTest(){
		int expected = 10960;
		int actual = action.calculationOfCarrying(company);
		Assert.assertEquals(expected, actual, 0.01); 
	}
	
	@Test
	public void searchPlaneTest(){
		List<Plane> expected = new ArrayList<Plane>();		
		expected.add(new Airliner(231, 2300, 1800, 27, 2));
		List<Plane> actual = action.searchPlane(company, 25, 30);
		Assert.assertEquals(expected, actual); 
	}
	@Test
	public void sortedPlaneTest(){
		AirCompany expectedComany = new AirCompany();	
		expectedComany.addPlane(new Airliner(231, 2300, 1800, 27,2));	
		expectedComany.addPlane(new Airliner(250, 1800, 2330, 22,1));		
	    expectedComany.addPlane(new Airliner(333, 2860, 2800, 15,3));
	    expectedComany.addPlane(new Freighter(88, 4000, 3000, 20,6));	    
		action.sortCompany(company);
		Assert.assertEquals(expectedComany.getPlanes(), company.getPlanes()); 
	}
	
}