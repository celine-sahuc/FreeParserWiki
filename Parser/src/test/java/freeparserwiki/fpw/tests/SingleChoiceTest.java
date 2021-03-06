package freeparserwiki.fpw.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import freeparserwiki.fpw.parser.Type;
import freeparserwiki.fpw.questions.Question;
import freeparserwiki.fpw.questions.SingleResponse;
import freeparserwiki.fpw.reponse.Reponse;

public class SingleChoiceTest {
	/**
	 * @throws java.lang.Exception
	 */
	protected ArrayList<Reponse> reponses;
	protected Question question;
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
		//Initialisation de la question avec les r�ponses
		question = new SingleResponse("une question");
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
	public void testQuestion() {
		assertEquals(question.getQuestion(), "une question");
	}
	
	@Test
	public void testGetListeReponse() {
		assertNotNull(question.getListeReponses());
	}
	
	@Test
	public void testNbReponsesCorrects() {
		assertEquals(question.getNbReponsesCorrects(),0);
		Reponse r = new Reponse();
		r.setCorrect(true);
		question.addResponse(r);
		assertEquals(question.getNbReponsesCorrects(),1);
	}
	
	@Test
	public void testNbReponses() {
		assertEquals(question.getNbReponses(),0);
	}

	@Test
	public void testAjouterReponseFausse(){
		Reponse r = new Reponse();
		r.setCorrect(false);
		int nombreReponse = question.getNbReponses(); 
		int nombreReponsesCorrects = question.getNbReponsesCorrects();
		question.addResponse(r);
		assertEquals(question.getNbReponses(),nombreReponse + 1);
		assertEquals(question.getNbReponsesCorrects(),nombreReponsesCorrects);
	}
	
	@Test
	public void testAjouterReponseCorrecte(){
		Reponse r = new Reponse();
		r.setCorrect(true);
		int nombreReponse = question.getNbReponses(); 
		question.addResponse(r);
		assertEquals(question.getNbReponses(),nombreReponse + 1);
		assertEquals(question.getNbReponsesCorrects(),1);		
	}
	
	@Test
	public void testQuestionValide() {
		Reponse r = new Reponse();
		r.setCorrect(true);
		question.addResponse(r);		
		assertTrue(question.isValide());
	}
	
	@Test
	public void testQuestionInvalideAvecReponse() {
		Reponse r = new Reponse();
		r.setCorrect(false);
		question.addResponse(r);		
		assertFalse(question.isValide());
	}
	
	@Test
	public void testQuestionInvalideSansReponse() {
		assertFalse(question.isValide());
	}	
}
