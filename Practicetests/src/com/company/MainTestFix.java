package com.company;

import org.junit.Before;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class MainTestFix {



	@Test
	void getWrong(){
		Main t = new Main("robert","west Jordan","black",34);
		assertFalse("Is this wrong but right?",t.getAge() < 12);

	}
	@Test
	void getRight(){
		Main t = new Main("robert","west Jordan","black",34);
		assertTrue("Is this wrong but right?",t.getAge() > 12);

	}
	@Test
	void getEquals(){
		Main t = new Main("danny","west Jordan","blue",74);
		assertEquals("west Jordan", t.getCity());

	}

	@Test
	void getNotNull(){
		Main t = new Main("","","",0);
assertNotNull("This is just seeing if there is nothing in the first part of the object",t.getName());
	}

	@Test
	@Before
	void getNull(){
		Main x = new Main("","","",null);
		assertNull(x);	}
	@Test
	void assertTest(){
		Main t = new Main("danny","west Jordan","blue",74);
		Main x = new Main("danny","west Jordan","blue",74);
		assertSame("This is the same object twice",x,x);

	}
	@Test
	void assertTest2(){
		Main t = new Main("danny","west Jordan","blue",74);
		Main x = new Main("danny","west Jordan","blue",74);
		assertNotSame("This is two different object names so its different",x,t);

	}


	@Test
	void assertArrayEqualTestWorks(){
		assertArrayEquals(new int[]{6,2,3},new int[]{6,2,3});
	}




}
