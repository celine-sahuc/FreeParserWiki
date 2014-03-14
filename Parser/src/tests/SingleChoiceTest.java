package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import parser.Type;
import questions.SingleResponse;
import reponse.Reponse;

public class SingleChoiceTest {
	/**
	 * @throws java.lang.Exception
	 */
	protected Reponse[] reponses;
	protected SingleResponse question;
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
		reponses = new Reponse[4];
		for(int i = 0; i < 4; i++) {
			reponses[i] = new Reponse();
			reponses[i].setCorrect(false);
			reponses[i].setFeedback("Feedback");
			reponses[i].setReponse(i + "");
		}
		reponses[0].setCorrect(true);		
		question = new SingleResponse(reponses);
	}


	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetType() {
		assertEquals(question.getType(),Type.SINGLE);
	}

	@Test
	public void testNbReponsesCorrects() {
		assertEquals(question.getNbReponsesCorrects(),1);
	}
	
	@Test
	public void testNbReponses() {
		assertEquals(question.getNbReponses(),4);
	}

}
