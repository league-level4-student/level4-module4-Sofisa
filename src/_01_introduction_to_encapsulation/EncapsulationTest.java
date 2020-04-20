package _01_introduction_to_encapsulation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class EncapsulationTest {
	@Test
	void testItemsReceived(){
		EncapsulateTheData encapsulate = new EncapsulateTheData();
		encapsulate.setItemsReceived(4);
		assertEquals(4, encapsulate.getItemsReceived());
		encapsulate.setItemsReceived(-1);
		assertEquals(0, encapsulate.getItemsReceived());
	}
	@Test
	void testDegreesTurned(){
		EncapsulateTheData encapsulate = new EncapsulateTheData();
		encapsulate.setDegreesTurned(120);
		assertEquals(120,encapsulate.getDegreesTurned());
		encapsulate.setDegreesTurned(550);
		assertEquals(360,encapsulate.getDegreesTurned());
	}
	@Test
	void testNomenclature() {
		EncapsulateTheData encapsulate = new EncapsulateTheData();
		encapsulate.setNomenclature("Wow");
		assertEquals("Wow", encapsulate.getNomenclature());
		encapsulate.setNomenclature("");
		assertEquals(" ", encapsulate.getNomenclature());
		
	}
	
	@Test
	void testMemberObj() {
		EncapsulateTheData encapsulate = new EncapsulateTheData();
		encapsulate.setMemberObj(5);
		assertEquals(5,encapsulate.getMemberObj());
		//encapsulate.setMemberObj("hello");
		//assertFalse(encapsulate.getMemberObj() instanceof String);
		
	}
	
	
}
