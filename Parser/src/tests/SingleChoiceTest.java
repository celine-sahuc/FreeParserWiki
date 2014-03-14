package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

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
	protected ArrayList<Reponse> reponses;
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
		//Initialisation des réponses
		reponses = new ArrayList<Reponse>();
		Reponse r1 = new Reponse();
		r1.setCorrect(false);
		r1.setFeedback("Feedback");
		r1.setReponse("r1");
		r1.setCorrect(true);
		Reponse r2 = new Reponse();
		r2.setCorrect(false);
		r2.setFeedback("Feedback");
		r2.setReponse("r1");
		r2.setCorrect(true);
		Reponse r3 = new Reponse();
		r3.setCorrect(false);
		r3.setFeedback("Feedback");
		r3.setReponse("r1");
		r3.setCorrect(true);
		Reponse r4 = new Reponse();	
		r4.setCorrect(false);
		r4.setFeedback("Feedback");
		r4.setReponse("r1");
		r4.setCorrect(true);
		//Ajout des réponses à la liste
		reponses.add(r1);
		reponses.add(r2);
		reponses.add(r3);
		reponses.add(r4);
		//Initialisation de la question avec les réponses
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

	@Test
	public void testAjouterReponseFausse(){
		Reponse r = new Reponse();
		r.setCorrect(false);
		int nombreReponse = question.getNbReponses(); 
		question.addResponse(r);
		assertEquals(question.getNbReponses(),nombreReponse + 1);
		assertEquals(question.getNbReponsesCorrects(),1);
	}
}
