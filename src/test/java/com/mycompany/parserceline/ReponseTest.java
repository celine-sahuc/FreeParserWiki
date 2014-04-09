package com.mycompany.parserceline;
import static org.junit.Assert.assertEquals;
import mycompany.parserceline.Reponse;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 
 */

/**
 * @author 20900325
 *
 */
public class ReponseTest {
	protected Reponse op;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		op = new Reponse("une réponse", false);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSetReponse() {
		Reponse testObject = new Reponse("une réponse", false, "Désolé, mauvaise réponse");
		testObject.setReponse("Un animal");
		assertEquals("Un animal", testObject.getReponse());
	}

	@Test
	public void testSetFeedback() {
		Reponse testObject = new Reponse("une réponse", false);
		testObject.setFeedback("Je me suis tromp�");
		assertEquals("Je me suis tromp�", testObject.getFeedback());
	}
	
	@Test
	public void testSetCorrect() {
		Reponse testObject = new Reponse("une réponse", false);
		testObject.setCorrect(true);
		assertEquals(true, testObject.isCorrect());
	}
} 